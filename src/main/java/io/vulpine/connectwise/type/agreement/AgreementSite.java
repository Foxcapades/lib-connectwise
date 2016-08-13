package io.vulpine.connectwise.type.agreement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement( localName = "AgreementSite" )
public class AgreementSite extends AbstractSubAgreement
{
  @JacksonXmlProperty ( localName = "CompanyId" )
  protected int companyId;

  @JacksonXmlProperty ( localName = "AddressId" )
  protected int addressId;

  public int getCompanyId ()
  {
    return companyId;
  }

  public void setCompanyId ( int companyId )
  {
    this.companyId = companyId;
  }

  public int getAddressId ()
  {
    return addressId;
  }

  public void setAddressId ( int addressId )
  {
    this.addressId = addressId;
  }
}
