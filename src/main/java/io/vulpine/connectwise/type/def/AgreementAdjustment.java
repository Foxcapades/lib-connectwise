package io.vulpine.connectwise.type.def;

import io.vulpine.connectwise.type.def.gen.*;
import io.vulpine.connectwise.util.Field;

import java.util.Date;

public interface AgreementAdjustment extends HasDescription, HasEffectiveDate, SubAgreement, XmlSerializable
{
  Field< Double > adjustmentAmountField();

  default Double adjustmentAmount() { return adjustmentAmountField().get(); }
  default AgreementAdjustment adjustmentAmount( final Double d ) { adjustmentAmountField().set(d); return this;}

  @Override default AgreementAdjustment description( final String s ) { descriptionField().set(s); return this; }
  @Override default AgreementAdjustment effectiveDate( final Date d ) { effectiveDateField().set(d); return this; }
  @Override default AgreementAdjustment id( final Integer i ) { idField().set(i); return this; }
  @Override default AgreementAdjustment updatedBy( final String s ) { updatedByField().set(s); return this; }
  @Override default AgreementAdjustment lastUpdate( final Date d ) { lastUpdateField().set(d); return this; }
  @Override default AgreementAdjustment agreementId( final Integer i ) { agreementIdField().set(i); return this; }

  @Override
  default String toXml( final String rootName )
  {
    return "<" + rootName + ">"
      + idField().toXml()
      + agreementIdField().toXml()
      + adjustmentAmountField().toXml()
      + effectiveDateField().toXml()
      + descriptionField().toXml()
      + lastUpdateField().toXml()
      + updatedByField().toXml()
      + "</" + rootName + ">";
  }
}
