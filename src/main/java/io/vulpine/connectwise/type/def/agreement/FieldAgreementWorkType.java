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

import io.vulpine.connectwise.type.agreement.BillableOption;
import io.vulpine.connectwise.type.agreement.RateType;
import io.vulpine.connectwise.util.DateField;
import io.vulpine.connectwise.util.Field;
import io.vulpine.connectwise.util.NumberField;
import io.vulpine.connectwise.util.StringField;

import java.util.Date;

public interface FieldAgreementWorkType extends AgreementWorkType
{
  NumberField < Integer > idField();
  NumberField < Integer > workTypeIdField();
  NumberField < Integer > agreementIdField();
  NumberField < Integer > locationIdField();
  Field < RateType > rateTypeField();
  NumberField < Double > rateField();
  DateField effectiveDateField();
  DateField endDateField();
  Field < BillableOption > billTimeField();
  NumberField < Double > hoursMinField();
  NumberField < Double > hoursMaxField();
  NumberField < Integer > addressIdField();
  DateField lastUpdateField();
  StringField updatedByField();

  @Override
  default Integer id()
  {
    return idField().get();
  }

  @Override
  default FieldAgreementWorkType id( final Integer i )
  {
    idField().set(i);

    return this;
  }

  @Override
  default Integer workTypeId()
  {
    return workTypeIdField().get();
  }

  @Override
  default FieldAgreementWorkType workTypeId( final Integer i )
  {
    workTypeIdField().set(i);

    return this;
  }

  @Override
  default Integer agreementId()
  {
    return agreementIdField().get();
  }

  @Override
  default FieldAgreementWorkType agreementId( final Integer i )
  {
    agreementIdField().set(i);

    return this;
  }

  @Override
  default Integer locationId()
  {
    return locationIdField().get();
  }

  @Override
  default FieldAgreementWorkType locationId( final Integer i )
  {
    locationIdField().set(i);

    return this;
  }

  @Override
  default RateType rateType()
  {
    return rateTypeField().get();
  }

  @Override
  default FieldAgreementWorkType rateType( final RateType r )
  {
    rateTypeField().set(r);

    return this;
  }

  @Override
  default Double rate()
  {
    return rateField().get();
  }

  @Override
  default FieldAgreementWorkType rate( final Double d )
  {
    rateField().set(d);

    return this;
  }

  @Override
  default Date effectiveDate()
  {
    return effectiveDateField().get();
  }

  @Override
  default FieldAgreementWorkType effectiveDate( final Date d )
  {
    effectiveDateField().set(d);

    return this;
  }

  @Override
  default Date endDate()
  {
    return endDateField().get();
  }

  @Override
  default FieldAgreementWorkType endDate( final Date d )
  {
    endDateField().set(d);

    return this;
  }

  @Override
  default BillableOption billTime()
  {
    return billTimeField().get();
  }

  @Override
  default FieldAgreementWorkType billTime( final BillableOption b )
  {
    billTimeField().set(b);

    return this;
  }

  @Override
  default Double hoursMin()
  {
    return hoursMinField().get();
  }

  @Override
  default FieldAgreementWorkType hoursMin( final Double d )
  {
    hoursMinField().set(d);

    return this;
  }

  @Override
  default Double hoursMax()
  {
    return hoursMaxField().get();
  }

  @Override
  default FieldAgreementWorkType hoursMax( final Double d )
  {
    hoursMaxField().set(d);

    return this;
  }

  @Override
  default Integer addressId()
  {
    return addressIdField().get();
  }

  @Override
  default FieldAgreementWorkType addressId( final Integer i )
  {
    addressIdField().set(i);

    return this;
  }

  @Override
  default Date lastUpdate()
  {
    return lastUpdateField().get();
  }

  @Override
  default FieldAgreementWorkType lastUpdate( final Date d )
  {
    lastUpdateField().set(d);

    return this;
  }

  @Override
  default String updatedBy()
  {
    return updatedByField().get();
  }

  @Override
  default FieldAgreementWorkType updatedBy( final String s )
  {
    updatedByField().set(s);

    return this;
  }

  @Override
  default String toXml( String rootName )
  {
    return "<" + rootName + ">"
      + idField().toXml()
      + workTypeIdField().toXml()
      + agreementIdField().toXml()
      + locationIdField().toXml()
      + rateTypeField().toXml()
      + rateField().toXml()
      + effectiveDateField().toXml()
      + endDateField().toXml()
      + billTimeField().toXml()
      + hoursMinField().toXml()
      + hoursMaxField().toXml()
      + addressIdField().toXml()
      + lastUpdateField().toXml()
      + updatedByField().toXml()
      + "</" + rootName + ">";
  }
}
