package io.vulpine.connectwise.api.company;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.vulpine.connectwise.api.ConnectwiseSubApiInterface;
import io.vulpine.connectwise.api.request.AddRequest;
import io.vulpine.connectwise.api.request.Credentials;
import io.vulpine.connectwise.data.company.Address;
import io.vulpine.connectwise.data.company.Company;

import java.io.IOException;
import java.util.List;

public class AddCompanyRequest extends AddRequest< Company >
{
  public AddCompanyRequest (
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

  public AddCompanyRequest companyName ( String companyName )
  {
    data.setCompanyName(companyName);
    return this;
  }

  public String companyIdentifier ()
  {
    return data.getCompanyIdentifier();
  }

  public AddCompanyRequest companyIdentifier ( String companyIdentifier )
  {
    data.setCompanyIdentifier(companyIdentifier);
    return this;
  }

  public Address defaultAddress ()
  {
    return data.getDefaultAddress();
  }

  public AddCompanyRequest defaultAddress ( Address defaultAddress )
  {
    data.setDefaultAddress(defaultAddress);
    return this;
  }

  public List< Address > addresses ()
  {
    return data.getAddresses();
  }

  public AddCompanyRequest addresses ( List < Address > addresses )
  {
    data.setAddresses(addresses);
    return this;
  }

  public String phoneNumber ()
  {
    return data.getPhoneNumber();
  }

  public AddCompanyRequest phoneNumber ( String phoneNumber )
  {
    data.setPhoneNumber(phoneNumber);
    return this;
  }

  public String faxNumber ()
  {
    return data.getFaxNumber();
  }

  public AddCompanyRequest faxNumber ( String faxNumber )
  {
    data.setFaxNumber(faxNumber);
    return this;
  }

  public String webSite ()
  {
    return data.getWebSite();
  }

  public AddCompanyRequest webSite ( String webSite )
  {
    data.setWebSite(webSite);
    return this;
  }

  public String territory ()
  {
    return data.getTerritory();
  }

  public AddCompanyRequest territory ( String territory )
  {
    data.setTerritory(territory);
    return this;
  }

  public String market ()
  {
    return data.getMarket();
  }

  public AddCompanyRequest market ( String market )
  {
    data.setMarket(market);
    return this;
  }

  public String type ()
  {
    return data.getType();
  }

  public AddCompanyRequest type ( String type )
  {
    data.setType(type);
    return this;
  }

  public String status ()
  {
    return data.getStatus();
  }

  public AddCompanyRequest status ( String status )
  {
    data.setStatus(status);
    return this;
  }

  public String accountNumber ()
  {
    return data.getAccountNumber();
  }

  public AddCompanyRequest accountNumber ( String accountNumber )
  {
    data.setAccountNumber(accountNumber);
    return this;
  }

  public int defaultContactId ()
  {
    return data.getDefaultContactId();
  }

  public AddCompanyRequest defaultContactId ( int defaultContactId )
  {
    data.setDefaultContactId(defaultContactId);
    return this;
  }

  public int defaultBillingContactId ()
  {
    return data.getDefaultBillingContactId();
  }

  public AddCompanyRequest defaultBillingContactId ( int defaultBillingContactId )
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
  public Company getRequestData ()
  {
    return data;
  }
}
