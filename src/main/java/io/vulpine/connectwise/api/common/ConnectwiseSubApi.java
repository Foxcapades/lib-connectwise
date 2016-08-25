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

package io.vulpine.connectwise.api.common;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.ConnectwiseApi;
import io.vulpine.connectwise.api.def.SubApiInterface;
import io.vulpine.connectwise.api.request.Credentials;
import io.vulpine.connectwise.api.request.CwRequest;
import io.vulpine.connectwise.api.request.SoapEnvelope;

import java.io.IOException;
import java.util.regex.Pattern;

public class ConnectwiseSubApi implements SubApiInterface
{
  private static final Pattern soap = Pattern.compile("</?soap:(Envelope|Body)[^>]*>");

  protected final ConnectwiseApi api;
  protected final Credentials    credentials;
  protected final XmlMapper      xmlMapper;
  protected final String         endpoint;

  public ConnectwiseSubApi (
    final ConnectwiseApi api,
    final Credentials credentials,
    final XmlMapper xmlMapper,
    final String endpoint
  )
  {
    this.api = api;
    this.credentials = credentials;
    this.xmlMapper = xmlMapper;
    this.endpoint = endpoint;
  }

  @Override
  public String send ( CwRequest r ) throws IOException
  {
    final String out = xmlMapper.writeValueAsString(new SoapEnvelope(r));
    if ("ALL".equals(System.getProperty("javax.net.debug", "off").toUpperCase())) { System.out.println(out); }
    return soap.matcher(api.send(endpoint, out)).replaceAll("");
  }
}
