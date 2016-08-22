package io.vulpine.connectwise.type.agreement.worktype;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.vulpine.connectwise.type.agreement.AbstractSubAgreement;

class _Common extends AbstractSubAgreement
{
  @JacksonXmlProperty( localName = "WorkTypeId" )
  protected int WorkTypeId;

  public int getWorkTypeId ()
  {
    return WorkTypeId;
  }

  public void setWorkTypeId ( int workTypeId )
  {
    WorkTypeId = workTypeId;
  }
}
