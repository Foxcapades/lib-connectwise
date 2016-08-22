package io.vulpine.connectwise.type.agreement.addition;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.vulpine.connectwise.api.agreement.find.FindAgreementAdditionsResponse;

@JacksonXmlRootElement( namespace = "Soap", localName = "Body" )
public class FindAdditionBody
{
  protected final FindAgreementAdditionsResponse response;

  @JsonCreator
  public FindAdditionBody ( @JsonProperty("FindAgreementAdditionsResponse") final FindAgreementAdditionsResponse response )
  {
    this.response = response;
  }

  public FindAgreementAdditionsResponse getResponse ()
  {
    return response;
  }
}
