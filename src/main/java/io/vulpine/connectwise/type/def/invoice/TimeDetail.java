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

import io.vulpine.connectwise.type.def.XmlSerializable;
import io.vulpine.connectwise.type.def.gen.*;
import io.vulpine.connectwise.util.DateField;
import io.vulpine.connectwise.util.Field;
import io.vulpine.connectwise.util.NumberField;

import java.util.Date;

public interface TimeDetail
  extends
  HasAgreementName,
  HasAgreementType,
  HasAgreementAmount,
  HasBillable,
  HasBusinessUnit,
  HasChargeTo,
  HasDate,
  HasHourlyRate,
  HasInvoiceAmount,
  HasLocation,
  HasNotes,
  HasPhaseName,
  HasProjectName,
  HasProjectNumber,
  HasTicketNumber,
  HasTicketSummary,
  XmlSerializable
{
  default String agreementName()
  {
    return agreementNameField().get();
  }

  Field< String > agreementNameField();

  DateField startTimeField();

  DateField endTimeField();

  NumberField < Double > actualHoursField();

  NumberField < Double > agreementAdjustmentField();

  NumberField < Double > agreementHoursField();

  NumberField < Double > hourlyCostField();

  NumberField < Double > invoiceHoursField();

  Field < String > internalNotesField();

  default String internalNotes()
  {
    return internalNotesField().get();
  }

  default TimeDetail internalNotes( final String s )
  {
    internalNotesField().set(s);
    return this;
  }

  Field < String > memberIdentifierField();

  default String memberIdentifier()
  {
    return memberIdentifierField().get();
  }

  default TimeDetail memberIdentifier( final String s )
  {
    memberIdentifierField().set(s);
    return this;
  }

  Field < String > memberNameField();

  default String memberName()
  {
    return memberNameField().get();
  }

  default TimeDetail memberName( final String s )
  {
    memberNameField().set(s);
    return this;
  }

  Field < String > workRoleField();

  default String workRole()
  {
    return workRoleField().get();
  }

  default TimeDetail workRole( final String s )
  {
    workRoleField().set(s);
    return this;
  }

  Field < String > workTypeField();

  default String workType()
  {
    return workTypeField().get();
  }

  default TimeDetail workType( final String s )
  {
    workTypeField().set(s);
    return this;
  }

  default Date startTime()
  {
    return startTimeField().get();
  }

  default TimeDetail startTime( final Date d )
  {
    startTimeField().set(d);
    return this;
  }

  default Date endTime()
  {
    return endTimeField().get();
  }

  default TimeDetail endTime( final Date d )
  {
    endTimeField().set(d);
    return this;
  }

  default Double actualHours()
  {
    return actualHoursField().get();
  }

  default TimeDetail actualHours( final Double d )
  {
    actualHoursField().set(d);
    return this;
  }

  default Double agreementAdjustment()
  {
    return agreementAdjustmentField().get();
  }

  default TimeDetail agreementAdjustment( final Double d )
  {
    agreementAdjustmentField().set(d);
    return this;
  }

  default Double agreementHours()
  {
    return agreementHoursField().get();
  }

  default TimeDetail agreementHours( final Double d )
  {
    agreementHoursField().set(d);
    return this;
  }

  default Double hourlyCost()
  {
    return hourlyCostField().get();
  }

  default TimeDetail hourlyCost( final Double d )
  {
    hourlyCostField().set(d);

    return this;
  }

  default Double invoiceHours()
  {
    return invoiceHoursField().get();
  }

  default TimeDetail invoiceHours( final Double d )
  {
    invoiceHoursField().set(d);

    return this;
  }

  /*
  |*| Inherited Overrides
   */

  default TimeDetail agreementName( final String v )
  {
    agreementNameField().set(v);

    return this;
  }

  @Override
  default TimeDetail agreementType( final String v )
  {
    agreementTypeField().set(v);

    return this;
  }

  @Override
  default TimeDetail agreementAmount( final Double d )
  {
    agreementAmountField().set(d);

    return this;
  }

  @Override
  default TimeDetail billable( final Boolean v )
  {
    billableField().set(v);

    return this;
  }

  @Override
  default TimeDetail businessUnit( final String s )
  {
    businessUnitField().set(s);

    return this;
  }

  @Override
  default TimeDetail chargeTo( final String s )
  {
    chargeToField().set(s);

    return this;
  }

  @Override
  default TimeDetail date( final Date d )
  {
    dateField().set(d);

    return this;
  }

  @Override
  default TimeDetail hourlyRate( final Double d )
  {
    hourlyRateField().set(d);

    return this;
  }

  @Override
  default TimeDetail invoiceAmount( final Double d )
  {
    invoiceAmountField().set(d);

    return this;
  }

  @Override
  default TimeDetail location( final String s )
  {
    locationField().set(s);

    return this;
  }

  @Override
  default TimeDetail notes( final String s )
  {
    notesField().set(s);

    return this;
  }

  @Override
  default TimeDetail phaseName( final String s )
  {
    phaseNameField().set(s);

    return this;
  }

  @Override
  default TimeDetail projectName( final String s )
  {
    projectNameField().set(s);

    return this;
  }

  @Override
  default TimeDetail projectNumber( final Integer i )
  {
    projectNumberField().set(i);

    return this;
  }

  @Override
  default TimeDetail ticketNumber( final Integer i )
  {
    ticketNumberField().set(i);

    return this;
  }

  @Override
  default TimeDetail ticketSummary( final String s )
  {
    ticketSummaryField().set(s);

    return this;
  }
}
