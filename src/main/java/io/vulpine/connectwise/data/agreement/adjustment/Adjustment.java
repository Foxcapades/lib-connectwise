package io.vulpine.connectwise.data.agreement.adjustment;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.vulpine.connectwise.data.agreement.AbstractSubAgreement;

import java.util.Date;

public class Adjustment extends AbstractSubAgreement
{
  @JacksonXmlProperty( localName = "AdjustmentAmount" )
  protected double adjustmentAmount;

  @JacksonXmlProperty( localName = "EffectiveDate" )
  protected Date effectiveDate;

  public double getAdjustmentAmount ()
  {
    return adjustmentAmount;
  }

  public void setAdjustmentAmount ( double adjustmentAmount )
  {
    this.adjustmentAmount = adjustmentAmount;
  }

  public Date getEffectiveDate ()
  {
    return effectiveDate;
  }

  public void setEffectiveDate ( Date effectiveDate )
  {
    this.effectiveDate = effectiveDate;
  }
}
