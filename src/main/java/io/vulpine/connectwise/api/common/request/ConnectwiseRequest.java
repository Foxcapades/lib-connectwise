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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.vulpine.connectwise.api.common.Credentials;
import io.vulpine.connectwise.api.common.ResponseData;
import io.vulpine.connectwise.api.def.SubApiInterface;
import io.vulpine.connectwise.util.logging.LoggerInterface;
import io.vulpine.connectwise.util.logging.LoggerManager;

import java.io.IOException;

abstract public class ConnectwiseRequest< R >
{
  @JacksonXmlProperty( localName = "credentials" )
  private final Credentials credentials;

  @JsonIgnore
  private final XmlMapper xmlMapper;

  @JsonIgnore
  private final SubApiInterface api;

  @JsonIgnore
  protected final LoggerInterface logger;

  public ConnectwiseRequest(
    final Credentials credentials,
    final XmlMapper xmlMapper,
    final SubApiInterface api
  )
  {
    this.credentials = credentials;
    this.xmlMapper = xmlMapper;
    this.api = api;

    this.logger = LoggerManager.getLogger("lib-connectwise");
  }

  abstract public R submit() throws IOException;

  protected SubApiInterface getApi()
  {
    this.logger.trace(this.getClass());
    return api;
  }

  public Credentials getCredentials()
  {
    this.logger.trace(this.getClass());
    return credentials;
  }

  protected XmlMapper getXmlMapper()
  {
    this.logger.trace(this.getClass());
    return xmlMapper;
  }

  @JacksonXmlProperty( localName = "xmlns", isAttribute = true )
  public String getXmlns()
  {
    this.logger.trace(this.getClass());
    return "http://connectwise.com";
  }

  protected R submit( final Class < ? extends ResponseData < R > > type ) throws IOException
  {
    this.logger.trace(this.getClass(), type);
    final ResponseData < R > res = getXmlMapper().readerFor(type).readValue(getApi().send(this));
    return res.getResult();
  }
}
