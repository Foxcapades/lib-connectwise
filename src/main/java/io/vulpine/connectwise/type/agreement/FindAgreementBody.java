package io.vulpine.connectwise.type.agreement;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.vulpine.connectwise.api.agreement.find.FindAgreementsResponse;

@JacksonXmlRootElement (namespace = "soap", localName = "Body")
public class FindAgreementBody
{
  protected final FindAgreementsResponse response;

  @JsonCreator
  public FindAgreementBody (
    @JacksonXmlProperty( localName = "FindAgreementsResponse") final FindAgreementsResponse response
  )
  {
    this.response = response;
  }

  public FindAgreementsResponse getResponse ()
  {
    return response;
  }
}
