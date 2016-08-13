package io.vulpine.connectwise.api.company.add;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.vulpine.connectwise.api.ConnectwiseSubApiInterface;
import io.vulpine.connectwise.api.request.AddRequest;
import io.vulpine.connectwise.api.request.Credentials;
import io.vulpine.connectwise.type.company.Address;
import io.vulpine.connectwise.type.company.Company;

import java.io.IOException;
import java.util.List;

@JsonFilter( "filter-empty" )
@JacksonXmlRootElement( localName = "AddCompany" )
public class AddCompany extends AddRequest< Company >
{
  public AddCompany (
    final Credentials credentials,
    final XmlMapper xmlMapper,
    final ConnectwiseSubApiInterface subApi
  )
  {
    super(credentials, xmlMapper, subApi, new Company());
  }

  public String companyName ()
  {
    return data.getCompanyName();
  }

  public AddCompany companyName ( String companyName )
  {
    data.setCompanyName(companyName);
    return this;
  }

  public String companyIdentifier ()
  {
    return data.getCompanyIdentifier();
  }

  public AddCompany companyIdentifier ( String companyIdentifier )
  {
    data.setCompanyIdentifier(companyIdentifier);
    return this;
  }

  public Address defaultAddress ()
  {
    return data.getDefaultAddress();
  }

  public AddCompany defaultAddress ( Address defaultAddress )
  {
    data.setDefaultAddress(defaultAddress);
    return this;
  }

  public List< Address > addresses ()
  {
    return data.getAddresses();
  }

  public AddCompany addresses ( List < Address > addresses )
  {
    data.setAddresses(addresses);
    return this;
  }

  public String phoneNumber ()
  {
    return data.getPhoneNumber();
  }

  public AddCompany phoneNumber ( String phoneNumber )
  {
    data.setPhoneNumber(phoneNumber);
    return this;
  }

  public String faxNumber ()
  {
    return data.getFaxNumber();
  }

  public AddCompany faxNumber ( String faxNumber )
  {
    data.setFaxNumber(faxNumber);
    return this;
  }

  public String webSite ()
  {
    return data.getWebSite();
  }

  public AddCompany webSite ( String webSite )
  {
    data.setWebSite(webSite);
    return this;
  }

  public String territory ()
  {
    return data.getTerritory();
  }

  public AddCompany territory ( String territory )
  {
    data.setTerritory(territory);
    return this;
  }

  public String market ()
  {
    return data.getMarket();
  }

  public AddCompany market ( String market )
  {
    data.setMarket(market);
    return this;
  }

  public String type ()
  {
    return data.getType();
  }

  public AddCompany type ( String type )
  {
    data.setType(type);
    return this;
  }

  public String status ()
  {
    return data.getStatus();
  }

  public AddCompany status ( String status )
  {
    data.setStatus(status);
    return this;
  }

  public String accountNumber ()
  {
    return data.getAccountNumber();
  }

  public AddCompany accountNumber ( String accountNumber )
  {
    data.setAccountNumber(accountNumber);
    return this;
  }

  public int defaultContactId ()
  {
    return data.getDefaultContactId();
  }

  public AddCompany defaultContactId ( int defaultContactId )
  {
    data.setDefaultContactId(defaultContactId);
    return this;
  }

  public int defaultBillingContactId ()
  {
    return data.getDefaultBillingContactId();
  }

  public AddCompany defaultBillingContactId ( int defaultBillingContactId )
  {
    data.setDefaultBillingContactId(defaultBillingContactId);
    return this;
  }


  @Override
  public Company submit () throws IOException
  {
    final AddCompanyResponse company = xmlMapper.readerFor(AddCompanyResponse.class).readValue(api.send(this));
    return company.getResult();
  }

  @Override
  @JacksonXmlProperty( localName = "company" )
  @JsonFilter( "filter-empty" )
  public Company getRequestData ()
  {
    return data;
  }
}
