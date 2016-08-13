package io.vulpine.connectwise.type.agreement.addition;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement( namespace = "Soap", localName = "Body" )
public class FindAdditionBody
{
  protected final FindAdditionsResponse response;

  @JsonCreator
  public FindAdditionBody ( @JsonProperty("FindAgreementAdditionsResponse") final FindAdditionsResponse response )
  {
    this.response = response;
  }

  public FindAdditionsResponse getResponse ()
  {
    return response;
  }
}
