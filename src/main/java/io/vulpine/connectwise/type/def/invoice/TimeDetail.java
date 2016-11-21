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
package io.vulpine.connectwise.type.def.invoice;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.vulpine.connectwise.type.def.gen.*;

import java.util.Date;

public interface TimeDetail
  extends
  HasBillable,
  HasDate,
  HasAgreementAmount,
  HasHourlyRate,
  HasInvoicedAmount,
  HasAgreementName,
  HasAgreementType,
  HasBusinessUnit,
  HasChargeTo,
  HasInternalNotes,
  HasLocation,
  HasMemberIdentifier,
  HasMemberName,
  HasNotes,
  HasProjectName,
  HasProjectNumber,
  HasPhaseName,
  HasTicketNumber,
  HasTicketSummary
{
  @JsonGetter( "EndTime" )
  Date endTime();

  @JsonSetter( "EndTime" )
  TimeDetail endTime( final Date d );

  @JsonGetter( "StartTime" )
  Date startTime();

  @JsonSetter( "StartTime" )
  TimeDetail startTime( final Date d );

  @JsonGetter( "ActualHours" )
  Double actualHours();

  @JsonSetter( "ActualHours" )
  TimeDetail actualHours( final Double d );

  @JsonGetter( "Adjustment" )
  Double adjustment();

  @JsonSetter( "Adjustment" )
  TimeDetail adjustment( final Double d );

  @JsonGetter( "AgreementAdjustment" )
  Double agreementAdjustment();

  @JsonSetter( "AgreementAdjustment" )
  TimeDetail agreementAdjustment( final Double d );

  @JsonGetter( "AgreementHours" )
  Double agreementHours();

  @JsonSetter( "AgreementHours" )
  TimeDetail agreementHours( final Double d );

  @JsonGetter( "HourlyCost" )
  Double hourlyCost();

  @JsonSetter( "HourlyCost" )
  TimeDetail hourlyCost( final Double d );

  @JsonGetter( "InvoicedHours" )
  Double invoicedHours();

  @JsonSetter( "InvoicedHours" )
  TimeDetail invoicedHours( final Double d );

  @JsonGetter( "WorkRole" )
  String workRole();

  @JsonSetter( "WorkRole" )
  TimeDetail workRole( final String s );

  @JsonGetter( "WorkType" )
  String workType();

  @JsonSetter( "WorkType" )
  TimeDetail workType( final String s );
}
