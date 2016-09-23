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

import com.fasterxml.jackson.annotation.JsonGetter;
import io.vulpine.connectwise.type.agreement.BillableOption;
import io.vulpine.connectwise.type.agreement.RateType;

import java.util.Date;

public interface AgreementWorkType
{
  @JsonGetter("Id")
  Integer id();

  @JsonGetter("Id")
  AgreementWorkType id( Integer id );

  @JsonGetter("WorkTypeId")
  Integer workTypeId();

  @JsonGetter("WorkTypeId")
  AgreementWorkType workTypeId( Integer workTypeId );

  @JsonGetter("AgreementId")
  Integer agreementId();

  @JsonGetter("AgreementId")
  AgreementWorkType agreementId( Integer agreementId );

  @JsonGetter("LocationId")
  Integer locationId();

  @JsonGetter("LocationId")
  AgreementWorkType locationId( Integer locationId );

  @JsonGetter("RateType")
  RateType rateType();

  @JsonGetter("RateType")
  AgreementWorkType rateType( RateType rateType );

  @JsonGetter("Rate")
  Double rate();

  @JsonGetter("Rate")
  AgreementWorkType rate( Double  rate );

  @JsonGetter("EffectiveDate")
  Date effectiveDate();

  @JsonGetter("EffectiveDate")
  AgreementWorkType effectiveDate( Date  Date );

  @JsonGetter("EndingDate")
  Date endingDate();

  @JsonGetter("EndingDate")
  AgreementWorkType endingDate( Date  Date );

  @JsonGetter("BillTime")
  BillableOption billTime();

  @JsonGetter("BillTime")
  AgreementWorkType billTime( BillableOption billTime );

  @JsonGetter("HoursMin")
  Double hoursMin();

  @JsonGetter("HoursMin")
  AgreementWorkType hoursMin( Double hoursMin );

  @JsonGetter("HoursMax")
  Double hoursMax();

  @JsonGetter("HoursMax")
  AgreementWorkType hoursMax( Double hoursMax );

  @JsonGetter("AddressId")
  Integer addressId();

  @JsonGetter("AddressId")
  AgreementWorkType addressId( Integer addressId );

  @JsonGetter("LastUpdate")
  Date lastUpdate();

  @JsonGetter("LastUpdate")
  AgreementWorkType lastUpdate( Date lastUpdate );

  @JsonGetter("UpdatedBy")
  String updatedBy();

  @JsonGetter("UpdatedBy")
  AgreementWorkType updatedBy( String updatedBy );
}
