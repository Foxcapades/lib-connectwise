package io.vulpine.connectwise.type.agreement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.vulpine.connectwise.type.ConnectwiseCommon;

public abstract class AbstractSubAgreement extends ConnectwiseCommon
{
  @JacksonXmlProperty( localName = "AgreementId" )
  protected int agreementId;

  public int getAgreementId ()
  {
    return agreementId;
  }

  public void setAgreementId ( int agreementId )
  {
    this.agreementId = agreementId;
  }

}
