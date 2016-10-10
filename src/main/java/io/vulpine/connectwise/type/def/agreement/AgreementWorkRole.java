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

import io.vulpine.connectwise.type.agreement.RateType;
import io.vulpine.connectwise.type.def.XmlSerializable;
import io.vulpine.connectwise.type.def.gen.*;
import io.vulpine.connectwise.util.Field;

import java.util.Date;

public interface AgreementWorkRole extends
  SubAgreement,
  HasLocationId,
  HasEffectiveDate,
  HasEndDate,
  HasRate,
  HasRateType,
  HasWorkRoleId,
  XmlSerializable
{
  default Integer agreementId() { return agreementIdField().get(); }

  default Date endDate()
  {
    return endDateField().get();
  }

  Field< Date > endDateField();

  default Integer id()
  {
    return idField().get();
  }

  default Date lastUpdate() { return lastUpdateField().get(); }

  Field < Double > limitToField();

  default Double limitTo()
  {
    return limitToField().get();
  }

  default AgreementWorkRole limitTo( final Double d )
  {
    limitToField().set(d);

    return this;
  }

  @Override
  default AgreementWorkRole agreementId( final Integer i )
  {
    agreementIdField().set(i);

    return this;
  }

  @Override
  default AgreementWorkRole effectiveDate( final Date d )
  {
    effectiveDateField().set(d);

    return this;
  }

  default AgreementWorkRole endDate( final Date d )
  {
    endDateField().set(d);

    return this;
  }

  default AgreementWorkRole id( final Integer i )
  {
    idField().set(i);

    return this;
  }

  default AgreementWorkRole locationId( final Integer i )
  {
    locationIdField().set(i);

    return this;
  }

  default AgreementWorkRole lastUpdate( final Date d )
  {
    lastUpdateField().set(d);

    return this;
  }

  default Integer locationId()
  {
    return locationIdField().get();
  }

  Field< Integer > locationIdField();

  @Override
  default AgreementWorkRole rate( final Double d )
  {
    rateField().set(d);

    return this;
  }

  @Override
  default AgreementWorkRole rateType( final RateType r )
  {
    rateTypeField().set(r);

    return this;
  }

  default AgreementWorkRole updatedBy( final String s )
  {
    updatedByField().set(s);

    return this;
  }

  @Override
  default String toXml( String rootName )
  {
    return "<" + rootName + ">"
      + idField().toXml()
      + workRoleIdField().toXml()
      + agreementIdField().toXml()
      + locationIdField().toXml()
      + rateTypeField().toXml()
      + rateField().toXml()
      + limitToField().toXml()
      + effectiveDateField().toXml()
      + endDateField().toXml()
      + lastUpdateField().toXml()
      + updatedByField().toXml()
      + "</" + rootName + ">";
  }

  default String updatedBy()
  {
    return updatedByField().get();
  }

  default Integer workRoleId() { return workRoleIdField().get(); }

  HasWorkRoleId workRoleId( final Integer i );

  Field< Integer > workRoleIdField();
}
