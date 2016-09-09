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

package io.vulpine.connectwise.api.endpoints.agreement.addOrUpdate;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.vulpine.connectwise.api.def.SubApiInterface;
import io.vulpine.connectwise.api.common.request.AddOrUpdateRequest;
import io.vulpine.connectwise.api.common.Credentials;
import io.vulpine.connectwise.api.endpoints.Endpoint;
import io.vulpine.connectwise.type.agreement.addition.Addition;

import java.io.IOException;

@JsonFilter( "filter-empty" )
@JacksonXmlRootElement( localName = "AddOrUpdateAgreementAddition" )
public class AddOrUpdateAddition extends AddOrUpdateRequest < Addition >
{
  public AddOrUpdateAddition(
    final Credentials credentials,
    final XmlMapper xmlMapper,
    final SubApiInterface api,
    final Addition data
  )
  {
    super(credentials, xmlMapper, api, Endpoint.AGREEMENT, data);
  }

  @Override
  public Addition submit() throws IOException
  {
    final AddOrUpdateAdditionResponse response = getXmlMapper()
      .readerFor(AddOrUpdateAdditionResponse.class)
      .readValue(getApi().send(this));
    return response.getUpdatedAddition();
  }

  @Override
  @JsonFilter( "filter-empty" )
  @JacksonXmlProperty ( localName = "agreementAddition" )
  public Addition getRequestData()
  {
    return data;
  }
}
