package io.vulpine.connectwise.data.agreement.worktype;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.vulpine.connectwise.data.agreement.AbstractSubAgreement;

abstract class AbstractWorkType extends AbstractSubAgreement
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
