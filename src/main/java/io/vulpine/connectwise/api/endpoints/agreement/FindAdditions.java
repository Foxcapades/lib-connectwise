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
package io.vulpine.connectwise.api.endpoints.agreement;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.vulpine.connectwise.api.common.Credentials;
import io.vulpine.connectwise.api.def.SubApiInterface;
import io.vulpine.connectwise.type.agreement.addition.SimpleFoundAddition;

import java.io.IOException;
import java.util.List;

@JacksonXmlRootElement( localName = "FindAgreementAdditions" )
public class FindAdditions extends _FindCommon < List < SimpleFoundAddition > >
{
  @JacksonXmlProperty( localName = "isOpen" )
  protected Boolean open = null;

  public FindAdditions(
    final Credentials credentials,
    final XmlMapper xmlMapper,
    final SubApiInterface subApi
  )
  {
    super(credentials, xmlMapper, subApi);
  }

  @Override
  public List < SimpleFoundAddition > submit() throws IOException
  {
    this.logger.trace(this.getClass());
    final FindAdditionsResponse r = getXmlMapper().readerFor(FindAdditionsResponse.class).readValue(
      getApi().send(this));
    return r.getResults();
  }

  public Boolean isOpen()
  {
    this.logger.trace(this.getClass());
    return open;
  }

  public FindAdditions setOpen( final Boolean open )
  {
    this.logger.trace(this.getClass(), open);
    this.open = open;
    return this;
  }
}
