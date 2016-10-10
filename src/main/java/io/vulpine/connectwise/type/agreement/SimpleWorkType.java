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
package io.vulpine.connectwise.type.agreement;

import io.vulpine.connectwise.type.ConnectwiseCommon;
import io.vulpine.connectwise.type.def.agreement.FieldAgreementWorkType;
import io.vulpine.connectwise.util.*;

class SimpleWorkType extends ConnectwiseCommon implements FieldAgreementWorkType
{
  private final NumberField < Integer >  workTypeId    = new SimpleIntegerField("WorkTypeId");
  private final NumberField < Integer >  agreementId   = new SimpleIntegerField("AgreementId");
  private final NumberField < Integer >  locationId    = new SimpleIntegerField("LocationId");
  private final Field < RateType >       rateType      = new SimpleObjectField <>("RateType");
  private final NumberField < Double >   rate          = new SimpleDoubleField("Rate");
  private final DateField                effectiveDate = new SimpleDateField("EffectiveDate");
  private final DateField                endingDate    = new SimpleDateField("EndingDate");
  private final Field < BillableOption > billTime      = new SimpleObjectField <>("BillTime");
  private final NumberField < Double >   hoursMin      = new SimpleDoubleField("HoursMin");
  private final NumberField < Double >   hoursMax      = new SimpleDoubleField("HoursMax");
  private final NumberField < Integer >  addressId     = new SimpleIntegerField("AddressId");

  @Override
  public NumberField < Integer > workTypeIdField()
  {
    return workTypeId;
  }

  @Override
  public NumberField < Integer > agreementIdField()
  {
    return agreementId;
  }

  @Override
  public NumberField < Integer > locationIdField()
  {
    return locationId;
  }

  @Override
  public Field < RateType > rateTypeField()
  {
    return rateType;
  }

  @Override
  public NumberField < Double > rateField()
  {
    return rate;
  }

  @Override
  public DateField effectiveDateField()
  {
    return effectiveDate;
  }

  @Override
  public DateField endDateField()
  {
    return endingDate;
  }

  @Override
  public Field < BillableOption > billTimeField()
  {
    return billTime;
  }

  @Override
  public NumberField < Double > hoursMinField()
  {
    return hoursMin;
  }

  @Override
  public NumberField < Double > hoursMaxField()
  {
    return hoursMax;
  }

  @Override
  public NumberField < Integer > addressIdField()
  {
    return addressId;
  }
}
