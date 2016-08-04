package io.vulpine.connectwise.data.agreement.addition;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement( localName = "FindAgreementAdditionsResult" )
public class FindAdditionResult
{
  @JacksonXmlElementWrapper( useWrapping = false )
  protected final FoundAddition[] additions;

  @JsonCreator
  public FindAdditionResult (
    @JacksonXmlProperty( localName = "AgreementAdditionFindResult" ) final FoundAddition[] additions
  )
  {
    this.additions = additions;
  }

  public FoundAddition[] getAdditions ()
  {
    return additions;
  }
}
