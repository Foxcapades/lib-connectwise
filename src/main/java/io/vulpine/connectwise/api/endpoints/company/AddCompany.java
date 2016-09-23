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
package io.vulpine.connectwise.api.endpoints.company;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.vulpine.connectwise.api.common.Credentials;
import io.vulpine.connectwise.api.common.request.AddRequest;
import io.vulpine.connectwise.api.def.SubApiInterface;
import io.vulpine.connectwise.api.endpoints.Endpoint;
import io.vulpine.connectwise.type.company.Address;
import io.vulpine.connectwise.type.def.Company;

import java.io.IOException;
import java.util.List;

@JsonFilter( "filter-empty" )
@JacksonXmlRootElement( localName = "AddCompany" )
public class AddCompany extends AddRequest < Company >
{
  public AddCompany(
    final Credentials credentials,
    final XmlMapper xmlMapper,
    final SubApiInterface subApi
  )
  {
    super(credentials, xmlMapper, subApi, Endpoint.COMPANY, new io.vulpine.connectwise.type.company.Company());
  }

  public AddCompany(
    final Credentials credentials,
    final XmlMapper xmlMapper,
    final SubApiInterface subApi,
    final Company company
  )
  {
    super(credentials, xmlMapper, subApi, Endpoint.COMPANY, company);
  }

  @Override
  public Company submit() throws IOException
  {
    this.logger.trace(this.getClass());
    final AddCompanyResponse company = getXmlMapper().readerFor(AddCompanyResponse.class)
      .readValue(getApi().send(this));
    return company.getResult();
  }

  @Override
  @JacksonXmlProperty( localName = "company" )
  @JsonFilter( "filter-empty" )
  public Company getRequestData()
  {
    this.logger.trace(this.getClass());
    return data;
  }
}
