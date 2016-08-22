package io.vulpine.connectwise.type.company;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.vulpine.connectwise.type.ConnectwiseCommon;

class _Common extends ConnectwiseCommon
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
    return companyName;
  }

  public void setCompanyName( String companyName )
  {
    this.companyName = companyName;
  }

  public String getCompanyIdentifier()
  {
    return companyIdentifier;
  }

  public void setCompanyIdentifier( String companyIdentifier )
  {
    this.companyIdentifier = companyIdentifier;
  }

  public String getPhoneNumber()
  {
    return phoneNumber;
  }

  public void setPhoneNumber( String phoneNumber )
  {
    this.phoneNumber = phoneNumber;
  }

  public String getFaxNumber()
  {
    return faxNumber;
  }

  public void setFaxNumber( String faxNumber )
  {
    this.faxNumber = faxNumber;
  }

  public String getTerritory()
  {
    return territory;
  }

  public void setTerritory( String territory )
  {
    this.territory = territory;
  }

  public String getMarket()
  {
    return market;
  }

  public void setMarket( String market )
  {
    this.market = market;
  }

  public String getType()
  {
    return type;
  }

  public void setType( String type )
  {
    this.type = type;
  }

  public String getStatus()
  {
    return status;
  }

  public void setStatus( String status )
  {
    this.status = status;
  }

  public int getDefaultContactId()
  {
    return defaultContactId;
  }

  public void setDefaultContactId( int defaultContactId )
  {
    this.defaultContactId = defaultContactId;
  }

  public int getDefaultBillingContactId()
  {
    return defaultBillingContactId;
  }

  public void setDefaultBillingContactId( int defaultBillingContactId )
  {
    this.defaultBillingContactId = defaultBillingContactId;
  }
}
