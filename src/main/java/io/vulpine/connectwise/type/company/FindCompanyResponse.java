package io.vulpine.connectwise.type.company;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

@JacksonXmlRootElement(localName = "FindCompaniesResponse")
public class FindCompanyResponse
{
  private final List< FoundCompany > results;

  @JsonCreator
  public FindCompanyResponse (
    @JacksonXmlProperty(localName = "FindCompaniesResult") final List < FoundCompany > results
  )
  {
    this.results = results;
  }

  public List < FoundCompany > getResults ()
  {
    return results;
  }
}
