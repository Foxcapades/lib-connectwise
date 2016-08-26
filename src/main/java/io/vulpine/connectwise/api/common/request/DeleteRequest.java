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

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import io.vulpine.connectwise.api.common.Credentials;
import io.vulpine.connectwise.api.def.SubApiInterface;

import java.io.IOException;

public abstract class DeleteRequest extends ConnectwiseRequest< Void >
{
  @JacksonXmlProperty(localName = "id")
  protected final int id;


  public DeleteRequest (
    final Credentials credentials,
    final XmlMapper xmlMapper,
    final SubApiInterface subApiInterface,
    final int id
  )
  {
    super(credentials, xmlMapper, subApiInterface);
    this.id = id;
  }

  public int getId ()
  {
    return id;
  }

  @Override
  public Void submit() throws IOException
  {
    getApi().send(this);
    return null;
  }
}
