package io.vulpine.connectwise.api.agreement.addOrUpdate;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.vulpine.connectwise.type.agreement.Agreement;

public class AddOrUpdateAgreementResponse
{
  @JacksonXmlProperty( localName = "AddOrUpdateAgreementResult" )
  protected Agreement updatedAgreement;

  public Agreement getUpdatedAgreement()
  {
    return updatedAgreement;
  }

  public void setUpdatedAgreement( final Agreement updatedAgreement )
  {
    this.updatedAgreement = updatedAgreement;
  }
}
