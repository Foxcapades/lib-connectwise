package io.vulpine.connectwise.data.company;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import io.vulpine.connectwise.data.CwObject;

import java.util.List;

public class Company extends CwObject
{
  @JacksonXmlProperty( localName = "CompanyName" )
  protected String companyName;

  @JacksonXmlProperty( localName = "CompanyIdentifier" )
  protected String companyIdentifier;

  @JacksonXmlProperty( localName = "DefaultAddress" )
  protected Address defaultAddress;

  @JacksonXmlProperty( localName = "Addresses" )
  protected List < Address > addresses;

  @JacksonXmlProperty( localName = "PhoneNumber" )
  protected String phoneNumber;

  @JacksonXmlProperty( localName = "FaxNumber" )
  protected String faxNumber;

  @JacksonXmlProperty( localName = "WebSite" )
  protected String webSite;

  @JacksonXmlProperty( localName = "Territory" )
  protected String territory;

  @JacksonXmlProperty( localName = "Market" )
  protected String market;

  @JacksonXmlProperty( localName = "Type" )
  protected String type;

  @JacksonXmlProperty( localName = "Status" )
  protected String status;

  @JacksonXmlProperty( localName = "AccountNumber" )
  protected String accountNumber;

  @JacksonXmlProperty( localName = "DefaultContactId" )
  protected int defaultContactId;

  @JacksonXmlProperty( localName = "DefaultBillingContactId" )
  protected int defaultBillingContactId;

  public String getCompanyName ()
  {
    return companyName;
  }

  public void setCompanyName ( String companyName )
  {
    this.companyName = companyName;
  }

  public String getCompanyIdentifier ()
  {
    return companyIdentifier;
  }

  public void setCompanyIdentifier ( String companyIdentifier )
  {
    this.companyIdentifier = companyIdentifier;
  }

  public Address getDefaultAddress ()
  {
    return defaultAddress;
  }

  public void setDefaultAddress ( Address defaultAddress )
  {
    this.defaultAddress = defaultAddress;
  }

  public List < Address > getAddresses ()
  {
    return addresses;
  }

  public void setAddresses ( List < Address > addresses )
  {
    this.addresses = addresses;
  }

  public String getPhoneNumber ()
  {
    return phoneNumber;
  }

  public void setPhoneNumber ( String phoneNumber )
  {
    this.phoneNumber = phoneNumber;
  }

  public String getFaxNumber ()
  {
    return faxNumber;
  }

  public void setFaxNumber ( String faxNumber )
  {
    this.faxNumber = faxNumber;
  }

  public String getWebSite ()
  {
    return webSite;
  }

  public void setWebSite ( String webSite )
  {
    this.webSite = webSite;
  }

  public String getTerritory ()
  {
    return territory;
  }

  public void setTerritory ( String territory )
  {
    this.territory = territory;
  }

  public String getMarket ()
  {
    return market;
  }

  public void setMarket ( String market )
  {
    this.market = market;
  }

  public String getType ()
  {
    return type;
  }

  public void setType ( String type )
  {
    this.type = type;
  }

  public String getStatus ()
  {
    return status;
  }

  public void setStatus ( String status )
  {
    this.status = status;
  }

  public String getAccountNumber ()
  {
    return accountNumber;
  }

  public void setAccountNumber ( String accountNumber )
  {
    this.accountNumber = accountNumber;
  }

  public int getDefaultContactId ()
  {
    return defaultContactId;
  }

  public void setDefaultContactId ( int defaultContactId )
  {
    this.defaultContactId = defaultContactId;
  }

  public int getDefaultBillingContactId ()
  {
    return defaultBillingContactId;
  }

  public void setDefaultBillingContactId ( int defaultBillingContactId )
  {
    this.defaultBillingContactId = defaultBillingContactId;
  }
}
