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
package io.vulpine.connectwise.api.endpoints.company.add;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.vulpine.connectwise.api.common.Credentials;
import io.vulpine.connectwise.api.common.request.AddRequest;
import io.vulpine.connectwise.api.def.SubApiInterface;
import io.vulpine.connectwise.api.endpoints.Endpoint;
import io.vulpine.connectwise.type.company.Address;
import io.vulpine.connectwise.type.company.Company;

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
    super(credentials, xmlMapper, subApi, Endpoint.COMPANY, new Company());
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

  public String companyName()
  {
    this.logger.trace(this.getClass());
    return data.getCompanyName();
  }

  public AddCompany companyName( String companyName )
  {
    this.logger.trace(this.getClass(), companyName);
    data.setCompanyName(companyName);
    return this;
  }

  public String companyIdentifier()
  {
    this.logger.trace(this.getClass());
    return data.getCompanyIdentifier();
  }

  public AddCompany companyIdentifier( String companyIdentifier )
  {
    this.logger.trace(this.getClass(), companyIdentifier);
    data.setCompanyIdentifier(companyIdentifier);
    return this;
  }

  public Address defaultAddress()
  {
    this.logger.trace(this.getClass());
    return data.getDefaultAddress();
  }

  public AddCompany defaultAddress( Address defaultAddress )
  {
    this.logger.trace(this.getClass(), defaultAddress);
    data.setDefaultAddress(defaultAddress);
    return this;
  }

  public List < Address > addresses()
  {
    this.logger.trace(this.getClass());
    return data.getAddresses();
  }

  public AddCompany addresses( List < Address > addresses )
  {
    this.logger.trace(this.getClass(), addresses);
    data.setAddresses(addresses);
    return this;
  }

  public String phoneNumber()
  {
    this.logger.trace(this.getClass());
    return data.getPhoneNumber();
  }

  public AddCompany phoneNumber( String phoneNumber )
  {
    this.logger.trace(this.getClass(), phoneNumber);
    data.setPhoneNumber(phoneNumber);
    return this;
  }

  public String faxNumber()
  {
    this.logger.trace(this.getClass());
    return data.getFaxNumber();
  }

  public AddCompany faxNumber( String faxNumber )
  {
    this.logger.trace(this.getClass(), faxNumber);
    data.setFaxNumber(faxNumber);
    return this;
  }

  public String webSite()
  {
    this.logger.trace(this.getClass());
    return data.getWebSite();
  }

  public AddCompany webSite( String webSite )
  {
    this.logger.trace(this.getClass(), webSite);
    data.setWebSite(webSite);
    return this;
  }

  public String territory()
  {
    this.logger.trace(this.getClass());
    return data.getTerritory();
  }

  public AddCompany territory( String territory )
  {
    this.logger.trace(this.getClass(), territory);
    data.setTerritory(territory);
    return this;
  }

  public String market()
  {
    this.logger.trace(this.getClass());
    return data.getMarket();
  }

  public AddCompany market( String market )
  {
    this.logger.trace(this.getClass(), market);
    data.setMarket(market);
    return this;
  }

  public String type()
  {
    this.logger.trace(this.getClass());
    return data.getType();
  }

  public AddCompany type( String type )
  {
    this.logger.trace(this.getClass(), type);
    data.setType(type);
    return this;
  }

  public String status()
  {
    this.logger.trace(this.getClass());
    return data.getStatus();
  }

  public AddCompany status( String status )
  {
    this.logger.trace(this.getClass(), status);
    data.setStatus(status);
    return this;
  }

  public String accountNumber()
  {
    this.logger.trace(this.getClass());
    return data.getAccountNumber();
  }

  public AddCompany accountNumber( String accountNumber )
  {
    this.logger.trace(this.getClass(), accountNumber);
    data.setAccountNumber(accountNumber);
    return this;
  }

  public int defaultContactId()
  {
    this.logger.trace(this.getClass());
    return data.getDefaultContactId();
  }

  public AddCompany defaultContactId( int defaultContactId )
  {
    this.logger.trace(this.getClass(), defaultContactId);
    data.setDefaultContactId(defaultContactId);
    return this;
  }

  public int defaultBillingContactId()
  {
    this.logger.trace(this.getClass());
    return data.getDefaultBillingContactId();
  }

  public AddCompany defaultBillingContactId( int defaultBillingContactId )
  {
    this.logger.trace(this.getClass(), defaultBillingContactId);
    data.setDefaultBillingContactId(defaultBillingContactId);
    return this;
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
