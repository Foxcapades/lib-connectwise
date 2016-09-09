/*
 * Copyright 2016 Elizabeth Harper
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package io.vulpine.connectwise.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.EmptyFilter;
import io.vulpine.connectwise.api.common.Credentials;
import io.vulpine.connectwise.api.common.request.ConnectwiseRequest;
import io.vulpine.connectwise.api.common.request.SoapEnvelope;
import io.vulpine.connectwise.api.def.ConnectwiseInterface;
import io.vulpine.http.HttpRequest;
import io.vulpine.http.HttpResponse;
import io.vulpine.http.HttpResponseType;
import io.vulpine.logging.Logger;
import io.vulpine.logging.LoggerManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

/**
 * Fluent API Wrapper for the Connectwise SOAP API v2.0
 */
public final class ConnectwiseApi implements ConnectwiseInterface
{
  public static int BAD_RESPONSE_RETRIES = 5;

  public final Add add;

  public final AddOrUpdate addOrUpdate;

  public final Authenticate authenticate;

  public final Check check;

  public final Create create;

  public final Delete delete;

  public final Find find;

  public final Get get;

  public final Is is;

  public final Load load;

  public final Record record;

  public final Remove remove;

  public final Set set;

  public final Update update;

  // Jackson-DataFormat-XML v2.7.5 has issues parsing xsi:nil on primitives.
  // This is to filter those elements out of the responses.
  private final static Pattern NIL_FILTER = Pattern.compile("<[\\w \\-]+xsi:nil=\"true\"[\\w \\-]+/>");

  private final Credentials credentials;

  private final XmlMapper xmlMapper;

  private final Logger logger;

  private final String apiPath;

  public ConnectwiseApi( final String company, final String username, final String password, final String apiPath )
  {
    this.xmlMapper = new XmlMapper();
    this.credentials = new Credentials()
      .setCompanyId(company)
      .setIntegratorLoginId(username)
      .setIntegratorPassword(password);
    this.apiPath = apiPath + (apiPath.endsWith("/") ? "v4_6_release/apis/2.0/" : "/v4_6_release/apis/2.0/");

    this.xmlMapper.setFilterProvider(new SimpleFilterProvider().addFilter("filter-empty", new EmptyFilter()));

    this.logger = LoggerManager.getLogger("lib-connectwise");


    this.add = new AddImpl(this, credentials, xmlMapper);
    this.addOrUpdate = new AddOrUpdateImpl(this, credentials, xmlMapper);
    this.authenticate = new AuthenticateImpl(this, credentials, xmlMapper);
    this.check = new CheckImpl(this, credentials, xmlMapper);
    this.create = new CreateImpl(this, credentials, xmlMapper);
    this.delete = new DeleteImpl(this, credentials, xmlMapper);
    this.find = new FindImpl(this, credentials, xmlMapper);
    this.get = new GetImpl(this, credentials, xmlMapper);
    this.is = new IsImpl(this, credentials, xmlMapper);
    this.load = new LoadImpl(this, credentials, xmlMapper);
    this.record = new RecordImpl(this, credentials, xmlMapper);
    this.remove = new RemoveImpl(this, credentials, xmlMapper);
    this.set = new SetImpl(this, credentials, xmlMapper);
    this.update = new UpdateImpl(this, credentials, xmlMapper);
  }


  @Override
  public final String send( final String url, final String xml ) throws IOException
  {
    final Logger       log = this.logger;
    final String       response;

    log.trace(ConnectwiseApi.class, url, xml);
    log.debug(String.format("Connectwise Request: %s", xml));

    for ( int tries = 0; tries < BAD_RESPONSE_RETRIES; tries++ ) {
      final HttpResponse res = HttpRequest.post(apiPath + url)
        .setHeader("Content-Type", "text/xml", "charset=utf-8")
        .setHeader("Content-Length", String.valueOf(xml.getBytes("UTF-8").length))
        .appendToBody(xml)
        .addErrorHandler(( request, exception ) -> {
          final BufferedReader read = new BufferedReader(new InputStreamReader(request.getConnection().getErrorStream()));
          String               line;
          try {
            while ( null != (line = read.readLine()) ) {
              logger.warn(line);
            }
          } catch ( IOException e ) {
            e.printStackTrace();
          }
        })
        .send();

      if (res == null || res.getType() != HttpResponseType.OK) {
        continue;
      }

      response = res.getBody();
      log.debug(String.format("Connectwise Response: %s", response));

      return NIL_FILTER.matcher(response).replaceAll("");
    }

    throw new IOException("All retries failed, could not get valid response from Connectwise");
  }

  public String generateSoapXml( final ConnectwiseRequest request ) throws JsonProcessingException
  {
    return xmlMapper.writeValueAsString(new SoapEnvelope(request));
  }
}
