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

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.vulpine.connectwise.type.ConnectwiseCommon;

public class CompanyCommon extends ConnectwiseCommon
{
  private String companyName;

  private String companyIdentifier;

  private String phoneNumber;

  private String faxNumber;

  private String territory;

  private String market;

  private String type;

  private String status;

  private Integer defaultContactId;

  private Integer defaultBillingContactId;

  @JsonGetter( "CompanyName" )
  public String getCompanyName()
  {
    return companyName;
  }

  @JsonSetter( "CompanyName" )
  public void setCompanyName( String companyName )
  {
    this.companyName = companyName;
  }

  @JsonGetter( "CompanyIdentifier" )
  public String getCompanyIdentifier()
  {
    return companyIdentifier;
  }

  @JsonSetter( "CompanyIdentifier" )
  public void setCompanyIdentifier( String companyIdentifier )
  {
    this.companyIdentifier = companyIdentifier;
  }

  @JsonGetter( "PhoneNumber" )
  public String getPhoneNumber()
  {
    return phoneNumber;
  }

  @JsonSetter( "PhoneNumber" )
  public void setPhoneNumber( String phoneNumber )
  {
    this.phoneNumber = phoneNumber;
  }

  @JsonGetter( "FaxNumber" )
  public String getFaxNumber()
  {
    return faxNumber;
  }

  @JsonSetter( "FaxNumber" )
  public void setFaxNumber( String faxNumber )
  {
    this.faxNumber = faxNumber;
  }

  @JsonGetter( "Territory" )
  public String getTerritory()
  {
    return territory;
  }

  @JsonSetter( "Territory" )
  public void setTerritory( String territory )
  {
    this.territory = territory;
  }

  @JsonGetter( "Market" )
  public String getMarket()
  {
    return market;
  }

  @JsonSetter( "Market" )
  public void setMarket( String market )
  {
    this.market = market;
  }

  @JsonGetter( "Type" )
  public String getType()
  {
    return type;
  }

  @JsonSetter( "Type" )
  public void setType( String type )
  {
    this.type = type;
  }

  @JsonGetter( "Status" )
  public String getStatus()
  {
    return status;
  }

  @JsonSetter( "Status" )
  public void setStatus( String status )
  {
    this.status = status;
  }

  @JsonGetter( "DefaultContactId" )
  public Integer getDefaultContactId()
  {
    return defaultContactId;
  }

  @JsonSetter( "DefaultContactId" )
  public void setDefaultContactId( Integer defaultContactId )
  {
    this.defaultContactId = defaultContactId;
  }

  @JsonGetter( "DefaultBillingContactId" )
  public Integer getDefaultBillingContactId()
  {
    return defaultBillingContactId;
  }

  @JsonSetter( "DefaultBillingContactId" )
  public void setDefaultBillingContactId( Integer defaultBillingContactId )
  {
    this.defaultBillingContactId = defaultBillingContactId;
  }
}
