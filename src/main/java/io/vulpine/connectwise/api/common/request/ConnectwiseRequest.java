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
 */
package io.vulpine.connectwise.api.common.request;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.vulpine.connectwise.api.common.Request;
import io.vulpine.connectwise.api.common.Credentials;
import io.vulpine.connectwise.api.common.ResponseData;
import io.vulpine.connectwise.api.def.SubApiInterface;
import io.vulpine.connectwise.api.endpoints.Endpoint;
import io.vulpine.logging.Logger;
import io.vulpine.logging.LoggerManager;

import java.io.IOException;

abstract public class ConnectwiseRequest< R > implements Request < R >
{
  private final Credentials credentials;

  @JsonIgnore
  private final XmlMapper xmlMapper;

  @JsonIgnore
  private final SubApiInterface api;

  @JsonIgnore
  protected final Logger logger;

  @JsonIgnore
  private final Endpoint endpoint;

  public ConnectwiseRequest(
    final Credentials credentials,
    final XmlMapper xmlMapper,
    final SubApiInterface api,
    final Endpoint endpoint
  )
  {
    this.api = api;
    this.endpoint = endpoint;
    this.xmlMapper = xmlMapper;
    this.credentials = credentials;

    this.logger = LoggerManager.getLogger("lib-connectwise");
  }

  @Override
  public Endpoint getEndpoint()
  {
    return endpoint;
  }

  @Override
  public String getRootName()
  {
    return this.getClass().getAnnotation(JacksonXmlRootElement.class).localName();
  }

  @JsonGetter( "credentials" )
  public Credentials getCredentials()
  {
    this.logger.trace(this.getClass());
    return credentials;
  }

  @JacksonXmlProperty( localName = "xmlns", isAttribute = true )
  public String getXmlns()
  {
    this.logger.trace(this.getClass());
    return "http://connectwise.com";
  }

  protected SubApiInterface getApi()
  {
    this.logger.trace(this.getClass());
    return api;
  }

  protected XmlMapper getXmlMapper()
  {
    this.logger.trace(this.getClass());
    return xmlMapper;
  }

  protected R submit( final Class < ? extends ResponseData < R > > type ) throws IOException
  {
    this.logger.trace(this.getClass(), type);
    final ResponseData < R > res = getXmlMapper().readerFor(type).readValue(getApi().send(this));
    return res.getResult();
  }
}
