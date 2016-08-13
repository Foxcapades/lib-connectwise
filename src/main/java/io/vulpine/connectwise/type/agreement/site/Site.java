package io.vulpine.connectwise.type.agreement.site;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.vulpine.connectwise.type.agreement.AbstractSubAgreement;

@SuppressWarnings( "unused" )
@JacksonXmlRootElement( localName = "GetAgreementSiteResult" )
public class Site extends AbstractSubAgreement
{
  @JacksonXmlProperty( localName = "CompanyId" )
  protected int CompanyId;

  @JacksonXmlProperty( localName = "AddressId" )
  protected int AddressId;

  public int getCompanyId ()
  {
    return CompanyId;
  }

  public void setCompanyId ( int companyId )
  {
    CompanyId = companyId;
  }

  public int getAddressId ()
  {
    return AddressId;
  }

  public void setAddressId ( int addressId )
  {
    AddressId = addressId;
  }
}
