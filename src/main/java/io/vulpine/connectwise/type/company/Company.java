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

package io.vulpine.connectwise.type.company;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.List;

@JsonFilter( "filter-empty" )
public class Company extends CompanyCommon
{
  private Address defaultAddress;

  private List < Address > addresses;

  private String accountNumber;

  private String webSite;

  @JsonGetter( "DefaultAddress" )
  public Address getDefaultAddress ()
  {
    return defaultAddress;
  }

  @JsonSetter( "DefaultAddress" )
  public void setDefaultAddress ( Address defaultAddress )
  {
    this.defaultAddress = defaultAddress;
  }

  @JsonGetter( "Addresses" )
  public List < Address > getAddresses ()
  {
    return addresses;
  }

  @JsonSetter( "Addresses" )
  public void setAddresses ( List < Address > addresses )
  {
    this.addresses = addresses;
  }

  @JsonGetter( "AccountNumber" )
  public String getAccountNumber ()
  {
    return accountNumber;
  }

  @JsonSetter( "AccountNumber" )
  public void setAccountNumber ( String accountNumber )
  {
    this.accountNumber = accountNumber;
  }

  @JsonGetter( "WebSite" )
  public String getWebSite ()
  {
    return webSite;
  }

  @JsonSetter( "WebSite" )
  public void setWebSite ( String webSite )
  {
    this.webSite = webSite;
  }
}
