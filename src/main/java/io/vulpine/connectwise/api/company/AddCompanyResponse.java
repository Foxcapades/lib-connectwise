package io.vulpine.connectwise.api.company;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.vulpine.connectwise.type.company.Company;

@JacksonXmlRootElement ( localName = "AddCompanyResponse" )
public class AddCompanyResponse
{
  protected final Company result;


  public AddCompanyResponse (
    @JacksonXmlProperty( localName = "AddCompanyResult" ) final Company result
  )
  {
    this.result = result;
  }

  public Company getResult ()
  {
    return result;
  }
}
