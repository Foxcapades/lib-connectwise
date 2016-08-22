package io.vulpine.connectwise.type.company;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

@JsonFilter( "filter-empty" )
public class Company extends _Common
{

  @JacksonXmlProperty( localName = "DefaultAddress" )
  protected Address defaultAddress;

  @JacksonXmlProperty( localName = "Addresses" )
  protected List < Address > addresses;

  @JacksonXmlProperty( localName = "AccountNumber" )
  protected String accountNumber;

  @JacksonXmlProperty( localName = "WebSite" )
  protected String webSite;

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

  public String getAccountNumber ()
  {
    return accountNumber;
  }

  public void setAccountNumber ( String accountNumber )
  {
    this.accountNumber = accountNumber;
  }

  public String getWebSite ()
  {
    return webSite;
  }

  public void setWebSite ( String webSite )
  {
    this.webSite = webSite;
  }
}
