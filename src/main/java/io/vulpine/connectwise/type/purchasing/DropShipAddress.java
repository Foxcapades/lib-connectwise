package io.vulpine.connectwise.type.purchasing;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import io.vulpine.connectwise.type.ConnectwiseCommon;

@SuppressWarnings( "unused" )
public class DropShipAddress extends ConnectwiseCommon
{
  @JacksonXmlProperty( localName = "ContactName" )
  protected String contactName;

  @JacksonXmlProperty( localName = "POPhone" )
  protected String poPhone;

  @JacksonXmlProperty( localName = "PhoneExt" )
  protected String phoneExt;

  @JacksonXmlProperty( localName = "SiteName" )
  protected String siteName;

  @JacksonXmlProperty( localName = "StreetLine1" )
  protected String streetLine1;

  @JacksonXmlProperty( localName = "StreetLine2" )
  protected String streetLine2;

  @JacksonXmlProperty( localName = "City" )
  protected String city;

  @JacksonXmlProperty( localName = "Country" )
  protected String country;

  @JacksonXmlProperty( localName = "State" )
  protected String state;

  @JacksonXmlProperty( localName = "Zip" )
  protected String zip;

  public String getContactName()
  {
    return contactName;
  }

  public void setContactName( final String contactName )
  {
    this.contactName = contactName;
  }

  public String getPoPhone()
  {
    return poPhone;
  }

  public void setPoPhone( final String poPhone )
  {
    this.poPhone = poPhone;
  }

  public String getPhoneExt()
  {
    return phoneExt;
  }

  public void setPhoneExt( final String phoneExt )
  {
    this.phoneExt = phoneExt;
  }

  public String getSiteName()
  {
    return siteName;
  }

  public void setSiteName( final String siteName )
  {
    this.siteName = siteName;
  }

  public String getStreetLine1()
  {
    return streetLine1;
  }

  public void setStreetLine1( final String streetLine1 )
  {
    this.streetLine1 = streetLine1;
  }

  public String getStreetLine2()
  {
    return streetLine2;
  }

  public void setStreetLine2( final String streetLine2 )
  {
    this.streetLine2 = streetLine2;
  }

  public String getCity()
  {
    return city;
  }

  public void setCity( final String city )
  {
    this.city = city;
  }

  public String getCountry()
  {
    return country;
  }

  public void setCountry( final String country )
  {
    this.country = country;
  }

  public String getState()
  {
    return state;
  }

  public void setState( final String state )
  {
    this.state = state;
  }

  public String getZip()
  {
    return zip;
  }

  public void setZip( final String zip )
  {
    this.zip = zip;
  }
}
