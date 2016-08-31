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
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.vulpine.connectwise.type.ConnectwiseCommon;

import java.util.List;

@JsonFilter( "filter-empty" )
@JacksonXmlRootElement( localName = "Address" )
public class Address extends ConnectwiseCommon
{
  @JacksonXmlProperty( localName = "DefaultFlag" )
  protected boolean defaultFlag;

  @JacksonXmlProperty( localName = "CompanyId" )
  protected int companyId;

  @JacksonXmlProperty( localName = "SiteName" )
  protected String siteName;

  @JacksonXmlProperty( localName = "InactiveFlag" )
  protected boolean inactiveFlag;

  @JacksonXmlProperty( localName = "DefaultBillFlag" )
  protected boolean defaultBillFlag;

  @JacksonXmlProperty( localName = "DefaultShipFlag" )
  protected boolean defaultShipFlag;

  @JacksonXmlProperty( localName = "City" )
  protected String city;

  @JacksonXmlProperty( localName = "State" )
  protected String state;

  @JacksonXmlProperty( localName = "Zip" )
  protected String zip;

  @JacksonXmlProperty( localName = "Country" )
  protected String country;

  @JacksonXmlProperty( localName = "string" )
  @JacksonXmlElementWrapper( localName = "StreetLines" )
  protected List < String > streetLines;

  public boolean isDefaultFlag()
  {
    this.logger.trace(this.getClass());
    return defaultFlag;
  }

  public void setDefaultFlag( final boolean defaultFlag )
  {
    this.logger.trace(this.getClass(), defaultFlag);
    this.defaultFlag = defaultFlag;
  }

  public int getCompanyId()
  {
    this.logger.trace(this.getClass());
    return companyId;
  }

  public void setCompanyId( final int companyId )
  {
    this.logger.trace(this.getClass(), companyId);
    this.companyId = companyId;
  }

  public String getSiteName()
  {
    this.logger.trace(this.getClass());
    return siteName;
  }

  public void setSiteName( final String siteName )
  {
    this.logger.trace(this.getClass(), siteName);
    this.siteName = siteName;
  }

  public boolean isInactiveFlag()
  {
    this.logger.trace(this.getClass());
    return inactiveFlag;
  }

  public void setInactiveFlag( final boolean inactiveFlag )
  {
    this.logger.trace(this.getClass(), inactiveFlag);
    this.inactiveFlag = inactiveFlag;
  }

  public boolean isDefaultBillFlag()
  {
    this.logger.trace(this.getClass());
    return defaultBillFlag;
  }

  public void setDefaultBillFlag( final boolean defaultBillFlag )
  {
    this.logger.trace(this.getClass(), defaultBillFlag);
    this.defaultBillFlag = defaultBillFlag;
  }

  public boolean isDefaultShipFlag()
  {
    this.logger.trace(this.getClass());
    return defaultShipFlag;
  }

  public void setDefaultShipFlag( final boolean defaultShipFlag )
  {
    this.logger.trace(this.getClass(), defaultShipFlag);
    this.defaultShipFlag = defaultShipFlag;
  }

  public String getCity()
  {
    this.logger.trace(this.getClass());
    return city;
  }

  public void setCity( final String city )
  {
    this.logger.trace(this.getClass(), city);
    this.city = city;
  }

  public String getState()
  {
    this.logger.trace(this.getClass());
    return state;
  }

  public void setState( final String state )
  {
    this.logger.trace(this.getClass(), state);
    this.state = state;
  }

  public String getZip()
  {
    this.logger.trace(this.getClass());
    return zip;
  }

  public void setZip( final String zip )
  {
    this.logger.trace(this.getClass(), zip);
    this.zip = zip;
  }

  public String getCountry()
  {
    this.logger.trace(this.getClass());
    return country;
  }

  public void setCountry( final String country )
  {
    this.logger.trace(this.getClass(), country);
    this.country = country;
  }

  public List < String > getStreetLines()
  {
    this.logger.trace(this.getClass());
    return streetLines;
  }

  public void setStreetLines( final List < String > streetLines )
  {
    this.logger.trace(this.getClass(), streetLines);
    this.streetLines = streetLines;
  }
}
