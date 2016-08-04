package io.vulpine.connectwise.data.agreement;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

@JacksonXmlRootElement( localName = "FindAgreementsResponse" )
public class FindAgreementsResponse
{
  protected final List < FoundAgreement > results;

  @JsonCreator
  public FindAgreementsResponse (
    @JacksonXmlProperty( localName = "FindAgreementsResult" ) final List < FoundAgreement > results
  )
  {
    this.results = results;
  }

  public List< FoundAgreement > getResults ()
  {
    return results;
  }
}
