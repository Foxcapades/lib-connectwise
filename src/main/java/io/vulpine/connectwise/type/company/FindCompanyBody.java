package io.vulpine.connectwise.type.company;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement( namespace = "soap", localName = "Body" )
public class FindCompanyBody
{
  protected final FindCompanyResponse result;

  @JsonCreator
  public FindCompanyBody(
    @JacksonXmlProperty( localName = "FindCompaniesResponse" ) final FindCompanyResponse result
  )
  {
    this.result = result;
  }

  public FindCompanyResponse getResponse()
  {
    return result;
  }
}
