package io.vulpine.connectwise.api.agreement.addOrUpdate;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.vulpine.connectwise.type.agreement.addition.Addition;

@JacksonXmlRootElement( localName = "AddOrUpdateAgreementAdditionResponse" )
public class AddOrUpdateAgreementAdditionResponse
{
  @JacksonXmlProperty ( localName = "AddOrUpdateAgreementAdditionResult" )
  protected Addition updatedAddition;

  public Addition getUpdatedAddition()
  {
    return updatedAddition;
  }

  public void setUpdatedAddition( final Addition updatedAddition )
  {
    this.updatedAddition = updatedAddition;
  }
}
