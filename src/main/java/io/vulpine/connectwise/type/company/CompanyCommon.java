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

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.vulpine.connectwise.type.ConnectwiseCommon;

public class CompanyCommon extends ConnectwiseCommon
{
  @JacksonXmlProperty( localName = "CompanyName" )
  protected String companyName;

  @JacksonXmlProperty( localName = "CompanyIdentifier" )
  protected String companyIdentifier;

  @JacksonXmlProperty( localName = "PhoneNumber" )
  protected String phoneNumber;

  @JacksonXmlProperty( localName = "FaxNumber" )
  protected String faxNumber;

  @JacksonXmlProperty( localName = "Territory" )
  protected String territory;

  @JacksonXmlProperty( localName = "Market" )
  protected String market;

  @JacksonXmlProperty( localName = "Type" )
  protected String type;

  @JacksonXmlProperty( localName = "Status" )
  protected String status;

  @JacksonXmlProperty( localName = "DefaultContactId" )
  protected int defaultContactId;

  @JacksonXmlProperty( localName = "DefaultBillingContactId" )
  protected int defaultBillingContactId;

  public String getCompanyName()
  {
    this.logger.trace(this.getClass());
    return companyName;
  }

  public void setCompanyName( String companyName )
  {
    this.logger.trace(this.getClass(), companyName);
    this.companyName = companyName;
  }

  public String getCompanyIdentifier()
  {
    this.logger.trace(this.getClass());
    return companyIdentifier;
  }

  public void setCompanyIdentifier( String companyIdentifier )
  {
    this.logger.trace(this.getClass(), companyIdentifier);
    this.companyIdentifier = companyIdentifier;
  }

  public String getPhoneNumber()
  {
    this.logger.trace(this.getClass());
    return phoneNumber;
  }

  public void setPhoneNumber( String phoneNumber )
  {
    this.logger.trace(this.getClass(), phoneNumber);
    this.phoneNumber = phoneNumber;
  }

  public String getFaxNumber()
  {
    this.logger.trace(this.getClass());
    return faxNumber;
  }

  public void setFaxNumber( String faxNumber )
  {
    this.logger.trace(this.getClass(), faxNumber);
    this.faxNumber = faxNumber;
  }

  public String getTerritory()
  {
    this.logger.trace(this.getClass());
    return territory;
  }

  public void setTerritory( String territory )
  {
    this.logger.trace(this.getClass(), territory);
    this.territory = territory;
  }

  public String getMarket()
  {
    this.logger.trace(this.getClass());
    return market;
  }

  public void setMarket( String market )
  {
    this.logger.trace(this.getClass(), market);
    this.market = market;
  }

  public String getType()
  {
    this.logger.trace(this.getClass());
    return type;
  }

  public void setType( String type )
  {
    this.logger.trace(this.getClass(), type);
    this.type = type;
  }

  public String getStatus()
  {
    this.logger.trace(this.getClass());
    return status;
  }

  public void setStatus( String status )
  {
    this.logger.trace(this.getClass(), status);
    this.status = status;
  }

  public int getDefaultContactId()
  {
    this.logger.trace(this.getClass());
    return defaultContactId;
  }

  public void setDefaultContactId( int defaultContactId )
  {
    this.logger.trace(this.getClass(), defaultContactId);
    this.defaultContactId = defaultContactId;
  }

  public int getDefaultBillingContactId()
  {
    this.logger.trace(this.getClass());
    return defaultBillingContactId;
  }

  public void setDefaultBillingContactId( int defaultBillingContactId )
  {
    this.logger.trace(this.getClass(), defaultBillingContactId);
    this.defaultBillingContactId = defaultBillingContactId;
  }
}
