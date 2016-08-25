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

package io.vulpine.connectwise.api.agreement.find;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import io.vulpine.connectwise.api.def.SubApiInterface;
import io.vulpine.connectwise.api.request.Credentials;
import io.vulpine.connectwise.api.request.FindRequest;
import io.vulpine.connectwise.type.agreement.addition.FoundAddition;

import java.io.IOException;
import java.util.List;

@JacksonXmlRootElement( localName = "FindAgreementAdditions" )
public class FindAgreementAdditions extends FindRequest < List < FoundAddition > >
{
  @JacksonXmlProperty( localName = "isOpen" )
  protected Boolean open = null;

  public FindAgreementAdditions(
    final Credentials credentials,
    final XmlMapper x,
    final SubApiInterface i
  )
  {
    super(credentials, x, i);
  }

  @Override
  public List < FoundAddition > submit() throws IOException
  {
    final FindAgreementAdditionsResponse r = xmlMapper.readerFor(FindAgreementAdditionsResponse.class).readValue(api.send(this));
    return r.getResults();
  }

  public Boolean isOpen()
  {
    return open;
  }

  public FindAgreementAdditions setOpen( final Boolean open )
  {
    this.open = open;
    return this;
  }
}
