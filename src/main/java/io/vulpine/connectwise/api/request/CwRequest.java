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

package io.vulpine.connectwise.api.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import io.vulpine.connectwise.api.def.SubApiInterface;

import java.io.IOException;

abstract public class CwRequest < R >
{
  @JacksonXmlProperty( localName = "xmlns", isAttribute = true )
  protected final String xmlns = "http://connectwise.com";

  @JacksonXmlProperty( localName = "credentials" )
  protected final Credentials credentials;

  @JsonIgnore
  protected final XmlMapper xmlMapper;

  @JsonIgnore
  protected final SubApiInterface api;

  public CwRequest (
    final Credentials credentials,
    final XmlMapper xmlMapper,
    final SubApiInterface api
  )
  {
    this.credentials = credentials;
    this.xmlMapper = xmlMapper;
    this.api = api;
  }

  public Credentials getCredentials ()
  {
    return credentials;
  }

  abstract public R submit () throws IOException;

  public String getXmlns ()
  {
    return xmlns;
  }
}
