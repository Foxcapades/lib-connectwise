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
package io.vulpine.connectwise.type.invoice;

import io.vulpine.connectwise.type.def.invoice.FieldInvoiceFindResult;
import io.vulpine.connectwise.util.*;

public class SimpleFoundInvoice implements FieldInvoiceFindResult
{
  public final NumberField < Integer > id = new SimpleIntegerField();

  public final NumberField < Integer > agreementId = new SimpleIntegerField();

  public final NumberField < Integer > ticketNumber = new SimpleIntegerField();

  public final NumberField < Integer > statusId = new SimpleIntegerField();

  public final NumberField < Integer > companyId = new SimpleIntegerField();

  public final NumberField < Integer > projectId = new SimpleIntegerField();

  public final NumberField < Integer > contactId = new SimpleIntegerField();

  public final StringField agreementName = new SimpleStringField();

  public final StringField agreementType = new SimpleStringField();

  public final StringField billingTypeIdentifier = new SimpleStringField();

  public final StringField businessUnit = new SimpleStringField();

  public final StringField ticketSummary = new SimpleStringField();

  public final StringField invoiceType = new SimpleStringField();

  public final StringField projectName = new SimpleStringField();

  public final StringField phaseName = new SimpleStringField();

  public final StringField location = new SimpleStringField();

  public final StringField territory = new SimpleStringField();

  public final StringField invoiceNumber = new SimpleStringField();

  public final StringField glBatchIdentifier = new SimpleStringField();

  public final StringField billingDelivery = new SimpleStringField();

  public final StringField routedMemberIdentifier = new SimpleStringField();

  public final StringField routedMemberName = new SimpleStringField();

  public final StringField updatedBy = new SimpleStringField();

  public final StringField companyName = new SimpleStringField();

  public final StringField status = new SimpleStringField();

  public final DateField invoiceDate = new SimpleDateField();

  public final DateField dueDate = new SimpleDateField();

  public final DateField paidDate = new SimpleDateField();

  public final DateField lastUpdated = new SimpleDateField();

  public final BooleanField closed = new BooleanField();

  public final BooleanField email = new BooleanField();

  public final BooleanField glPosted = new BooleanField();

  public final NumberField < Double > invoiceAmount = new SimpleDoubleField();

  public final NumberField < Double > paidAmount = new SimpleDoubleField();

  @Override
  public NumberField < Integer > agreementIdField()
  {
    return agreementId;
  }

  @Override
  public StringField agreementNameField()
  {
    return agreementName;
  }

  @Override
  public StringField agreementTypeField()
  {
    return agreementType;
  }

  @Override
  public StringField billingTypeIdentifierField()
  {
    return billingTypeIdentifier;
  }

  @Override
  public StringField businessUnitField()
  {
    return businessUnit;
  }

  @Override
  public NumberField < Integer > ticketNumberField()
  {
    return ticketNumber;
  }

  @Override
  public StringField ticketSummaryField()
  {
    return ticketSummary;
  }

  @Override
  public DateField invoiceDateField()
  {
    return invoiceDate;
  }

  @Override
  public DateField dueDateField()
  {
    return dueDate;
  }

  @Override
  public StringField invoiceTypeField()
  {
    return invoiceType;
  }

  @Override
  public StringField projectNameField()
  {
    return projectName;
  }

  @Override
  public StringField phaseNameField()
  {
    return phaseName;
  }

  @Override
  public BooleanField closedField()
  {
    return closed;
  }

  @Override
  public BooleanField emailField()
  {
    return email;
  }

  @Override
  public StringField invoiceNumberField()
  {
    return invoiceNumber;
  }

  @Override
  public BooleanField glPostedField()
  {
    return glPosted;
  }

  @Override
  public StringField glBatchIdentifierField()
  {
    return glBatchIdentifier;
  }

  @Override
  public StringField billingDeliveryField()
  {
    return billingDelivery;
  }

  @Override
  public StringField routedMemberIdentifierField()
  {
    return routedMemberIdentifier;
  }

  @Override
  public StringField routedMemberNameField()
  {
    return routedMemberName;
  }

  @Override
  public NumberField < Double > invoiceAmountField()
  {
    return invoiceAmount;
  }

  @Override
  public NumberField < Integer > statusIdField()
  {
    return statusId;
  }

  @Override
  public NumberField < Double > paidAmountField()
  {
    return paidAmount;
  }

  @Override
  public DateField paidDateField()
  {
    return paidDate;
  }

  @Override
  public NumberField < Integer > projectIdField()
  {
    return projectId;
  }

  @Override
  public NumberField < Integer > companyIdField()
  {
    return companyId;
  }

  @Override
  public StringField companyNameField()
  {
    return companyName;
  }

  @Override
  public NumberField < Integer > contactIdField()
  {
    return contactId;
  }

  @Override
  public NumberField < Integer > idField()
  {
    return id;
  }

  @Override
  public DateField lastUpdatedField()
  {
    return lastUpdated;
  }

  @Override
  public StringField locationField()
  {
    return location;
  }

  @Override
  public StringField statusField()
  {
    return status;
  }

  @Override
  public StringField territoryField()
  {
    return territory;
  }

  @Override
  public StringField updatedByField()
  {
    return updatedBy;
  }
}
