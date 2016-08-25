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

package io.vulpine.connectwise.type.company;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

@JsonFilter( "filter-empty" )
public class Company extends CompanyCommon
{

  @JacksonXmlProperty( localName = "DefaultAddress" )
  protected Address defaultAddress;

  @JacksonXmlProperty( localName = "Addresses" )
  protected List < Address > addresses;

  @JacksonXmlProperty( localName = "AccountNumber" )
  protected String accountNumber;

  @JacksonXmlProperty( localName = "WebSite" )
  protected String webSite;

  public Address getDefaultAddress ()
  {
    return defaultAddress;
  }

  public void setDefaultAddress ( Address defaultAddress )
  {
    this.defaultAddress = defaultAddress;
  }

  public List < Address > getAddresses ()
  {
    return addresses;
  }

  public void setAddresses ( List < Address > addresses )
  {
    this.addresses = addresses;
  }

  public String getAccountNumber ()
  {
    return accountNumber;
  }

  public void setAccountNumber ( String accountNumber )
  {
    this.accountNumber = accountNumber;
  }

  public String getWebSite ()
  {
    return webSite;
  }

  public void setWebSite ( String webSite )
  {
    this.webSite = webSite;
  }
}
