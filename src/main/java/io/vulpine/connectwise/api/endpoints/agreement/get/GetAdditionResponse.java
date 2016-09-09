package io.vulpine.connectwise.api.endpoints.agreement.get;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.vulpine.connectwise.api.common.ResponseData;
import io.vulpine.connectwise.type.agreement.addition.Addition;

@JacksonXmlRootElement( localName = "GetAgreementAdditionResponse" )
public class GetAdditionResponse extends ResponseData < Addition >
{
  @JsonCreator
  public GetAdditionResponse( @JacksonXmlProperty( localName = "GetAgreementAdditionResult" ) final Addition result )
  {
    super(result);
  }
}
