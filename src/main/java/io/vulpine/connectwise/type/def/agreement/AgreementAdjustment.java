/*
 * Copyright 2016 Elizabeth Harper
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.vulpine.connectwise.type.def.agreement;

import io.vulpine.connectwise.type.def.XmlSerializable;
import io.vulpine.connectwise.type.def.gen.*;
import io.vulpine.connectwise.util.Field;

import java.util.Date;

public interface AgreementAdjustment extends HasDescription, HasEffectiveDate, SubAgreement, XmlSerializable
{
  Field< Double > adjustmentAmountField();

  default Double adjustmentAmount() { return adjustmentAmountField().get(); }
  default AgreementAdjustment adjustmentAmount( final Double d ) { adjustmentAmountField().set(d); return this;}

  default Integer agreementId() { return agreementIdField().get(); }

  @Override default AgreementAdjustment description( final String s ) { descriptionField().set(s); return this; }
  @Override default AgreementAdjustment effectiveDate( final Date d ) { effectiveDateField().set(d); return this; }
  default AgreementAdjustment id( final Integer i ) { idField().set(i); return this; }

  default Integer id()
  {
    return idField().get();
  }

  default Date lastUpdate() { return lastUpdateField().get(); }

  default AgreementAdjustment updatedBy( final String s ) { updatedByField().set(s); return this; }
  default AgreementAdjustment lastUpdate( final Date d ) { lastUpdateField().set(d); return this; }
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

  default String updatedBy()
  {
    return updatedByField().get();
  }
}
