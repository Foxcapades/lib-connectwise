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
package io.vulpine.connectwise.type.purchasing;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class VendorCompanyAddress
{
  @JacksonXmlProperty(localName = "ContactName")
  protected String ContactName;

  @JacksonXmlProperty(localName = "POPhone")
  protected String POPhone;

  @JacksonXmlProperty(localName = "PhoneExt")
  protected String PhoneExt;

  @JacksonXmlProperty(localName = "SiteName")
  protected String SiteName;

  @JacksonXmlProperty(localName = "StreetLine1")
  protected String StreetLine1;

  @JacksonXmlProperty(localName = "StreetLine2")
  protected String StreetLine2;

  @JacksonXmlProperty(localName = "City")
  protected String City;

  @JacksonXmlProperty(localName = "Country")
  protected String Country;

  @JacksonXmlProperty(localName = "State")
  protected String State;

  @JacksonXmlProperty(localName = "Zip")
  protected String Zip;

  public String getContactName ()
  {
    return ContactName;
  }

  public void setContactName ( final String contactName )
  {
    ContactName = contactName;
  }

  public String getPOPhone ()
  {
    return POPhone;
  }

  public void setPOPhone ( final String POPhone )
  {
    this.POPhone = POPhone;
  }

  public String getPhoneExt ()
  {
    return PhoneExt;
  }

  public void setPhoneExt ( final String phoneExt )
  {
    PhoneExt = phoneExt;
  }

  public String getSiteName ()
  {
    return SiteName;
  }

  public void setSiteName ( final String siteName )
  {
    SiteName = siteName;
  }

  public String getStreetLine1 ()
  {
    return StreetLine1;
  }

  public void setStreetLine1 ( final String streetLine1 )
  {
    StreetLine1 = streetLine1;
  }

  public String getStreetLine2 ()
  {
    return StreetLine2;
  }

  public void setStreetLine2 ( final String streetLine2 )
  {
    StreetLine2 = streetLine2;
  }

  public String getCity ()
  {
    return City;
  }

  public void setCity ( final String city )
  {
    City = city;
  }

  public String getCountry ()
  {
    return Country;
  }

  public void setCountry ( final String country )
  {
    Country = country;
  }

  public String getState ()
  {
    return State;
  }

  public void setState ( final String state )
  {
    State = state;
  }

  public String getZip ()
  {
    return Zip;
  }

  public void setZip ( final String zip )
  {
    Zip = zip;
  }
}
