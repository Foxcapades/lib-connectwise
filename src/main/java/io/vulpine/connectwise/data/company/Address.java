package io.vulpine.connectwise.data.company;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.vulpine.connectwise.data.CwObject;

import java.util.List;

@JsonFilter( "filter-empty" )
public class Address extends CwObject
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

  @JacksonXmlProperty( localName = "StreetLines" )
  protected List < String > streetLines;

  public boolean isDefaultFlag()
  {
    return defaultFlag;
  }

  public void setDefaultFlag( final boolean defaultFlag )
  {
    this.defaultFlag = defaultFlag;
  }

  public int getCompanyId()
  {
    return companyId;
  }

  public void setCompanyId( final int companyId )
  {
    this.companyId = companyId;
  }

  public String getSiteName()
  {
    return siteName;
  }

  public void setSiteName( final String siteName )
  {
    this.siteName = siteName;
  }

  public boolean isInactiveFlag()
  {
    return inactiveFlag;
  }

  public void setInactiveFlag( final boolean inactiveFlag )
  {
    this.inactiveFlag = inactiveFlag;
  }

  public boolean isDefaultBillFlag()
  {
    return defaultBillFlag;
  }

  public void setDefaultBillFlag( final boolean defaultBillFlag )
  {
    this.defaultBillFlag = defaultBillFlag;
  }

  public boolean isDefaultShipFlag()
  {
    return defaultShipFlag;
  }

  public void setDefaultShipFlag( final boolean defaultShipFlag )
  {
    this.defaultShipFlag = defaultShipFlag;
  }

  public String getCity()
  {
    return city;
  }

  public void setCity( final String city )
  {
    this.city = city;
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

  public String getCountry()
  {
    return country;
  }

  public void setCountry( final String country )
  {
    this.country = country;
  }

  public List < String > getStreetLines()
  {
    return streetLines;
  }

  public void setStreetLines( final List < String > streetLines )
  {
    this.streetLines = streetLines;
  }
}
