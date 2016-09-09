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
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;

@JsonRootName( "CompanyFindResult" )
public class FoundCompany extends CompanyCommon
{
  private String
    addressLine1,
    addressLine2,
    city,
    state,
    zip,
    country,
    website;

  @JsonGetter( "AddressLine1" )
  public String addressLine1 ()
  {
    return addressLine1;
  }

  @JsonSetter( "AddressLine1" )
  public void addressLine1 ( String addressLine1 )
  {
    this.addressLine1 = addressLine1;
  }

  @JsonGetter( "AddressLine2" )
  public String addressLine2 ()
  {
    return addressLine2;
  }

  @JsonSetter( "AddressLine2" )
  public void addressLine2 ( String addressLine2 )
  {
    this.addressLine2 = addressLine2;
  }

  @JsonGetter( "City" )
  public String city ()
  {
    return city;
  }

  @JsonSetter( "City" )
  public void city ( String city )
  {
    this.city = city;
  }

  @JsonGetter( "State" )
  public String state ()
  {
    return state;
  }

  @JsonSetter( "State" )
  public void state ( String state )
  {
    this.state = state;
  }

  @JsonGetter( "Zip" )
  public String zip ()
  {
    return zip;
  }

  @JsonSetter( "Zip" )
  public void zip ( String zip )
  {
    this.zip = zip;
  }

  @JsonGetter( "Country" )
  public String country ()
  {
    return country;
  }

  @JsonSetter( "Country" )
  public void country ( String country )
  {
    this.country = country;
  }

  @JsonGetter( "Website" )
  public String website ()
  {
    return website;
  }

  @JsonSetter( "Website" )
  public void website ( String website )
  {
    this.website = website;
  }
}
