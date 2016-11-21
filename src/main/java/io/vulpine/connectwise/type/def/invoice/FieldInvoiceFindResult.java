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

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.vulpine.connectwise.type.def.gen.*;
import io.vulpine.connectwise.type.def.gen.field.*;
import io.vulpine.connectwise.util.BooleanField;
import io.vulpine.connectwise.util.DateField;
import io.vulpine.connectwise.util.NumberField;
import io.vulpine.connectwise.util.StringField;

import java.util.Date;

public interface FieldInvoiceFindResult
extends
  InvoiceFindResult,
  HasIdField,
  HasCompanyIdField,
  HasAgreementNameField,
  HasAgreementTypeField,
  HasLocationField,
  HasCompanyNameField,
  HasStatusField,
  HasAgreementIdField,
  HasContactIdField,
  HasUpdatedByField,
  HasTerritoryField,
  HasDueDateField,
  HasInvoiceTypeField,
  HasInvoiceDateField,
  HasLastUpdatedField,
  HasGlPostedField,
  HasBillingDeliveryField,
  HasInvoiceNumberField,
  HasProjectIdField,
  HasRoutedMemberIdentifierField,
  HasRoutedMemberNameField
{
  @JsonIgnore
  StringField billingTypeIdentifierField();

  @JsonIgnore
  StringField businessUnitField();

  @JsonIgnore
  NumberField < Integer > ticketNumberField();

  @JsonIgnore
  StringField ticketSummaryField();

  @JsonIgnore
  StringField projectNameField();

  @JsonIgnore
  StringField phaseNameField();

  @JsonIgnore
  BooleanField closedField();

  @JsonIgnore
  BooleanField emailField();

  @JsonIgnore
  StringField glBatchIdentifierField();

  @JsonIgnore
  NumberField < Double > invoiceAmountField();

  @JsonIgnore
  NumberField < Integer > statusIdField();

  @JsonIgnore
  NumberField < Double > paidAmountField();

  @JsonIgnore
  DateField paidDateField();

  @Override
  default String billingTypeIdentifier()
  {
    return billingTypeIdentifierField().get();
  }

  @Override
  default FieldInvoiceFindResult billingTypeIdentifier( final String s )
  {
    billingTypeIdentifierField().set(s);

    return this;
  }

  @Override
  default FieldInvoiceFindResult agreementName( final String s )
  {
    agreementNameField().set(s);

    return this;
  }

  @Override
  default FieldInvoiceFindResult agreementType( final String s )
  {
    agreementTypeField().set(s);

    return this;
  }

  @Override
  default FieldInvoiceFindResult location( final String s )
  {
    locationField().set(s);

    return this;
  }

  @Override
  default HasContactId contactId( final Integer i )
  {
    contactIdField().set(i);

    return this;
  }

  @Override
  default String phaseName()
  {
    return phaseNameField().get();
  }

  @Override
  default String projectName()
  {
    return projectNameField().get();
  }

  @Override
  default Integer ticketNumber()
  {
    return ticketNumberField().get();
  }

  @Override
  default String ticketSummary()
  {
    return ticketSummaryField().get();
  }

  @Override
  default FieldInvoiceFindResult status( final String s )
  {
    statusField().set(s);

    return this;
  }

  @Override
  default FieldInvoiceFindResult phaseName( final String s )
  {
    phaseNameField().set(s);

    return this;
  }

  @Override
  default FieldInvoiceFindResult territory( final String t )
  {
    territoryField().set(t);

    return this;
  }

  @Override
  default FieldInvoiceFindResult updatedBy( final String s )
  {
    updatedByField().set(s);
    return this;
  }

  @Override
  default FieldInvoiceFindResult companyName( final String s )
  {
    companyNameField().set(s);

    return this;
  }

  @Override
  default FieldInvoiceFindResult projectName( final String s )
  {
    projectNameField().set(s);

    return this;
  }

  @Override
  default FieldInvoiceFindResult ticketNumber( final Integer i )
  {
    ticketNumberField().set(i);

    return this;
  }

  @Override
  default FieldInvoiceFindResult ticketSummary( final String s )
  {
    ticketSummaryField().set(s);
    return this;
  }

  @Override
  default String businessUnit()
  {
    return businessUnitField().get();
  }

  @Override
  default Double invoiceAmount()
  {
    return invoiceAmountField().get();
  }

  @Override
  default FieldInvoiceFindResult id( final Integer i )
  {
    idField().set(i);
    return this;
  }

  @Override
  default FieldInvoiceFindResult companyId( final Integer i )
  {
    companyIdField().set(i);
    return this;
  }

  @Override
  default FieldInvoiceFindResult agreementId( final Integer i )
  {
    agreementIdField().set(i);
    return this;
  }

  @Override
  default FieldInvoiceFindResult businessUnit( final String s )
  {
    businessUnitField().set(s);
    return this;
  }

  @Override
  default FieldInvoiceFindResult invoiceAmount( final Double d )
  {
    invoiceAmountField().set(d);
    return this;
  }

  @Override
  default FieldInvoiceFindResult lastUpdated( final Date d )
  {
    lastUpdatedField().set(d);
    return this;
  }

  @Override
  default FieldInvoiceFindResult invoiceDate( final Date d )
  {
    invoiceDateField().set(d);
    return this;
  }

  @Override
  default FieldInvoiceFindResult dueDate( final Date d )
  {
    dueDateField().set(d);
    return this;
  }

  @Override
  default FieldInvoiceFindResult invoiceType( final String s )
  {
    invoiceTypeField().set(s);
    return this;
  }

  @Override
  default Boolean closed()
  {
    return closedField().get();
  }

  @Override
  default FieldInvoiceFindResult closed( final Boolean b )
  {
    closedField().set(b);
    return this;
  }

  @Override
  default Boolean email()
  {
    return emailField().get();
  }

  @Override
  default FieldInvoiceFindResult email( final Boolean b )
  {
    emailField().set(b);
    return this;
  }

  @Override
  default FieldInvoiceFindResult invoiceNumber( final String s )
  {
    invoiceNumberField().set(s);
    return this;
  }

  @Override
  default FieldInvoiceFindResult glPosted( final Boolean b )
  {
    glPostedField().set(b);
    return this;
  }

  @Override
  default String glBatchIdentifier()
  {
    return glBatchIdentifierField().get();
  }

  @Override
  default FieldInvoiceFindResult glBatchIdentifier( final String s )
  {
    glBatchIdentifierField().set(s);
    return this;
  }

  @Override
  default FieldInvoiceFindResult billingDelivery( final String s )
  {
    billingDeliveryField().set(s);
    return this;
  }

  @Override
  default FieldInvoiceFindResult routedMemberIdentifier( final String s )
  {
    routedMemberIdentifierField().set(s);
    return this;
  }

  @Override
  default FieldInvoiceFindResult routedMemberName( final String s )
  {
    routedMemberNameField().set(s);
    return this;
  }

  @Override
  default Integer statusId()
  {
    return statusIdField().get();
  }

  @Override
  default FieldInvoiceFindResult statusId( final Integer i )
  {
    statusIdField().set(i);
    return this;
  }

  @Override
  default Double paidAmount()
  {
    return paidAmountField().get();
  }

  @Override
  default FieldInvoiceFindResult paidAmount( final Double d )
  {
    paidAmountField().set(d);
    return this;
  }

  @Override
  default Date paidDate()
  {
    return paidDateField().get();
  }

  @Override
  default FieldInvoiceFindResult paidDate( final Date d )
  {
    paidDateField().set(d);
    return this;
  }

  @Override
  default FieldInvoiceFindResult projectId( final Integer i )
  {
    projectIdField().set(i);
    return this;
  }
}
