package io.vulpine.connectwise.data.company;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "FindCompaniesResponse")
public class FindCompanyResponse
{
  protected final CompanyFindResult[] results;

  @JsonCreator
  public FindCompanyResponse (
    @JacksonXmlProperty(localName = "FindCompaniesResult") final CompanyFindResult[] results
  )
  {
    this.results = results;
  }

  public CompanyFindResult[] getResults ()
  {
    return results;
  }
}
