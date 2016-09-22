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
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import io.vulpine.connectwise.type.ConnectwiseCommon;

import java.util.List;

@JsonFilter( "filter-empty" )
@JsonRootName( "Address" )
public class Address extends ConnectwiseCommon
{
  private Boolean defaultFlag = null;
  private Boolean inactiveFlag = null;
  private Boolean defaultBillFlag = null;
  private Boolean defaultShipFlag = null;

  private Integer companyId = null;

  private String siteName = null;
  private String city = null;
  private String state = null;
  private String zip = null;
  private String country = null;

  private List < String > streetLines = null;

  @JsonGetter( "City" )
  public String city()
  {
    return city;
  }

  @JsonSetter( "City" )
  public void city( final String city )
  {
    this.city = city;
  }

  @JsonGetter( "CompanyId" )
  public Integer companyId()
  {
    return companyId;
  }

   @JsonSetter( "CompanyId" )
  public void companyId( final Integer companyId )
  {
    this.companyId = companyId;
  }

  @JsonGetter( "Country" )
  public String country()
  {
    return country;
  }

   @JsonSetter( "Country" )
  public void country( final String country )
  {
    this.country = country;
  }

  @JsonGetter( "SiteName" )
  public String siteName()
  {
    return siteName;
  }

   @JsonSetter( "SiteName" )
  public void siteName( final String siteName )
  {
    this.siteName = siteName;
  }

  @JsonGetter( "State" )
  public String state()
  {
    return state;
  }

  @JsonSetter( "State" )
  public void state( final String state )
  {
    this.state = state;
  }

  @JsonGetter( "string" )
  @JacksonXmlElementWrapper( localName = "StreetLines" )
  public List < String > streetLines()
  {
    return streetLines;
  }

  @JsonSetter( "string" )
  @JacksonXmlElementWrapper( localName = "StreetLines" )
  public void streetLines( final List < String > streetLines )
  {
    this.streetLines = streetLines;
  }

  @JsonGetter( "Zip" )
  public String zip()
  {
    return zip;
  }

  @JsonSetter( "Zip" )
  public void zip( final String zip )
  {
    this.zip = zip;
  }

  @JsonGetter( "DefaultBillFlag" )
  public Boolean defaultBillFlag()
  {
    return defaultBillFlag;
  }

  @JsonSetter( "DefaultBillFlag" )
  public void defaultBillFlag( final Boolean defaultBillFlag )
  {
    this.defaultBillFlag = defaultBillFlag;
  }

  @JsonGetter( "DefaultFlag" )
  public Boolean defaultFlag()
  {
    return defaultFlag;
  }

  @JsonSetter( "DefaultFlag" )
  public void defaultFlag( final Boolean defaultFlag )
  {
    this.defaultFlag = defaultFlag;
  }

  @JsonGetter( "DefaultShipFlag" )
  public Boolean defaultShipFlag()
  {
    return defaultShipFlag;
  }

  @JsonSetter( "DefaultShipFlag" )
  public void defaultShipFlag( final Boolean defaultShipFlag )
  {
    this.defaultShipFlag = defaultShipFlag;
  }

  @JsonGetter( "InactiveFlag" )
  public Boolean inactiveFlag()
  {
    return inactiveFlag;
  }

  @JsonSetter( "InactiveFlag" )
  public void inactiveFlag( final Boolean inactiveFlag )
  {
    this.inactiveFlag = inactiveFlag;
  }
}
