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

import io.vulpine.connectwise.type.def.Agreement;
import io.vulpine.connectwise.util.BooleanField;
import io.vulpine.connectwise.util.Field;
import io.vulpine.connectwise.util.SimpleField;
import org.w3c.dom.Document;

import java.beans.XMLDecoder;
import java.util.Date;

public class SimpleAgreement implements Agreement
{
  private Field < Boolean >
    allowOverruns          = new BooleanField("AllowOverruns"),
    applicationUnlimited   = new BooleanField("ApplicationUnlimitedFlag"),
    billableExpenseInvoice = new BooleanField("BillableExpenseInvoice"),
    billableProductInvoice = new BooleanField("BillableProductInvoice"),
    billableTimeInvoice    = new BooleanField("BillableTimeInvoice"),
    billOneTime            = new BooleanField("BillOneTimeFlag"),
    bottomComment          = new BooleanField("BottomComment"),
    cancelled              = new BooleanField("CancelledFlag"),
    carryOverUnused        = new BooleanField("CarryOverUnused"),
    chargeToFirm           = new BooleanField("ChargeToFirm"),
    coverAgreementExpense  = new BooleanField("CoverAgreementExpense"),
    coverAgreementProduct  = new BooleanField("CoverAgreementProduct"),
    coverAgreementTime     = new BooleanField("CoverAgreementTime"),
    coverSalesTax          = new BooleanField("CoverSalesTax"),
    expireWhenZero         = new BooleanField("ExpireWhenZero"),
    noEndingDate           = new BooleanField("NoEndingDateFlag"),
    oneTime                = new BooleanField("OneTimeFlag"),
    restrictDepartment     = new BooleanField("RestrictDepartmentFlag"),
    restrictDownPayment    = new BooleanField("RestrictDownPayment"),
    restrictLocation       = new BooleanField("RestrictLocationFlag"),
    taxable                = new BooleanField("Taxable"),
    topComment             = new BooleanField("TopComment"),
    boardDefault           = new SimpleField <>("BoardDefaultFlag");

  private Field < Date >
    billStartDate = new SimpleField <>("BillStartDate"),
    dateCancelled = new SimpleField <>("DateCancelled"),
    endDate       = new SimpleField <>("EndDate"),
    startDate     = new SimpleField <>("StartDate"),
    lastUpdate    = new SimpleField <>("LastUpdate");

  private Field < Double >
    applicationLimit = new SimpleField <>("ApplicationLimit"),
    billAmount       = new SimpleField <>("BillAmount"),
    compHourlyRate   = new SimpleField <>("CompHourlyRate"),
    compLimitAmount  = new SimpleField <>("CompLimitAmount"),
    prorateFirstBill = new SimpleField <>("ProrateFirstBill");

  private Field < Integer >
    id                   = new SimpleField <>("Id"),
    agreementTypeId      = new SimpleField <>("AgreementTypeId"),
    billCycleId          = new SimpleField <>("BillCycleId"),
    billTermsId          = new SimpleField <>("BillTermsId"),
    billToAddressId      = new SimpleField <>("BillToAddressId"),
    billToCompanyId      = new SimpleField <>("BillToCompanyId"),
    contactId            = new SimpleField <>("ContactId"),
    companyId            = new SimpleField <>("CompanyId"),
    departmentId         = new SimpleField <>("DepartmentId"),
    expiredDays          = new SimpleField <>("ExpiredDays"),
    invoiceTemplateId    = new SimpleField <>("InvoiceTemplateId"),
    limit                = new SimpleField <>("Limit"),
    locationId           = new SimpleField <>("LocationId"),
    opportunityId        = new SimpleField <>("OpportunityId"),
    parentAgreementId    = new SimpleField <>("ParentAgreementId"),
    projectTypeId        = new SimpleField <>("ProjectTypeId"),
    slaId                = new SimpleField <>("SlaId"),
    subContractCompanyId = new SimpleField <>("SubContractCompanyId"),
    subContractContactId = new SimpleField <>("SubContractContactId"),
    taxCodeId            = new SimpleField <>("TaxCodeId"),
    workRoleId           = new SimpleField <>("WorkRoleId"),
    workTypeId           = new SimpleField <>("WorkTypeId"),
    boardId              = new SimpleField <>("BoardId"),
    serviceTypeId        = new SimpleField <>("ServiceTypeId");

  private Field < String >
    agreementName         = new SimpleField <>("AgreementName"),
    applicationCycle      = new SimpleField <>("ApplicationCycle"),
    applicationUnits      = new SimpleField <>("ApplicationUnits"),
    billExpenses          = new SimpleField <>("BillExpenses"),
    billProducts          = new SimpleField <>("BillProducts"),
    billTime              = new SimpleField <>("BillTime"),
    customerPo            = new SimpleField <>("CustomerPO"),
    employeeCompNotExceed = new SimpleField <>("EmployeeCompNotExceed"),
    employeeCompRate      = new SimpleField <>("EmployeeCompRate"),
    invoiceDescription    = new SimpleField <>("InvoiceDescription"),
    invoicingCycle        = new SimpleField <>("InvoicingCycle"),
    internalNotes         = new SimpleField <>("InternalNotes"),
    periodType            = new SimpleField <>("PeriodType"),
    reasonCancelled       = new SimpleField <>("ReasonCancelled"),
    workOrder             = new SimpleField <>("WorkOrder"),
    updatedBy             = new SimpleField <>("UpdatedBy");

  @Override
  public Field < Integer > idField()
  {
    return id;
  }

  @Override
  public Field < String > agreementNameField()
  {
    return agreementName;
  }

  @Override
  public Field < Integer > agreementTypeIdField()
  {
    return agreementTypeId;
  }

  @Override
  public Field < String > applicationCycleField()
  {
    return applicationCycle;
  }

  @Override
  public Field < Double > applicationLimitField()
  {
    return applicationLimit;
  }

  @Override
  public Field < String > applicationUnitsField()
  {
    return applicationUnits;
  }

  @Override
  public Field < Double > billAmountField()
  {
    return billAmount;
  }

  @Override
  public Field < Integer > billCycleIdField()
  {
    return billCycleId;
  }

  @Override
  public Field < String > billExpensesField()
  {
    return billExpenses;
  }

  @Override
  public Field < String > billProductsField()
  {
    return billProducts;
  }

  @Override
  public Field < Date > billStartDateField()
  {
    return billStartDate;
  }

  @Override
  public Field < Integer > billTermsIdField()
  {
    return billTermsId;
  }

  @Override
  public Field < String > billTimeField()
  {
    return billTime;
  }

  @Override
  public Field < Integer > billToAddressIdField()
  {
    return billToAddressId;
  }

  @Override
  public Field < Integer > billToCompanyIdField()
  {
    return billToCompanyId;
  }

  @Override
  public Field < Double > compHourlyRateField()
  {
    return compHourlyRate;
  }

  @Override
  public Field < Double > compLimitAmountField()
  {
    return compLimitAmount;
  }

  @Override
  public Field < Integer > companyIdField()
  {
    return companyId;
  }

  @Override
  public Field < Integer > contactIdField()
  {
    return contactId;
  }

  @Override
  public Field < String > customerPoField()
  {
    return customerPo;
  }

  @Override
  public Field < Date > dateCancelledField()
  {
    return dateCancelled;
  }

  @Override
  public Field < Integer > departmentIdField()
  {
    return departmentId;
  }

  @Override
  public Field < String > employeeCompNotExceedField()
  {
    return employeeCompNotExceed;
  }

  @Override
  public Field < String > employeeCompRateField()
  {
    return employeeCompRate;
  }

  @Override
  public Field < Date > endDateField()
  {
    return endDate;
  }

  @Override
  public Field < Integer > expiredDaysField()
  {
    return expiredDays;
  }

  @Override
  public Field < String > internalNotesField()
  {
    return internalNotes;
  }

  @Override
  public Field < String > invoiceDescriptionField()
  {
    return invoiceDescription;
  }

  @Override
  public Field < Integer > invoiceTemplateIdField()
  {
    return invoiceTemplateId;
  }

  @Override
  public Field < String > invoicingCycleField()
  {
    return invoicingCycle;
  }

  @Override
  public Field < Integer > limitField()
  {
    return limit;
  }

  @Override
  public Field < Integer > locationIdField()
  {
    return locationId;
  }

  @Override
  public Field < Integer > opportunityIdField()
  {
    return opportunityId;
  }

  @Override
  public Field < Integer > parentAgreementIdField()
  {
    return parentAgreementId;
  }

  @Override
  public Field < String > periodTypeField()
  {
    return periodType;
  }

  @Override
  public Field < Integer > projectTypeIdField()
  {
    return projectTypeId;
  }

  @Override
  public Field < Double > prorateFirstBillField()
  {
    return prorateFirstBill;
  }

  @Override
  public Field < String > reasonCancelledField()
  {
    return reasonCancelled;
  }

  @Override
  public Field < Integer > slaIdField()
  {
    return slaId;
  }

  @Override
  public Field < Date > startDateField()
  {
    return startDate;
  }

  @Override
  public Field < Integer > subContractCompanyIdField()
  {
    return subContractCompanyId;
  }

  @Override
  public Field < Integer > subContractContactIdField()
  {
    return subContractContactId;
  }

  @Override
  public Field < Integer > taxCodeIdField()
  {
    return taxCodeId;
  }

  @Override
  public Field < String > workOrderField()
  {
    return workOrder;
  }

  @Override
  public Field < Integer > workRoleIdField()
  {
    return workRoleId;
  }

  @Override
  public Field < Integer > workTypeIdField()
  {
    return workTypeId;
  }

  @Override
  public Field < Boolean > allowOverrunsField()
  {
    return allowOverruns;
  }

  @Override
  public Field < Boolean > applicationUnlimitedField()
  {
    return applicationUnlimited;
  }

  @Override
  public Field < Boolean > billOneTimeField()
  {
    return billOneTime;
  }

  @Override
  public Field < Boolean > billableExpenseInvoiceField()
  {
    return billableExpenseInvoice;
  }

  @Override
  public Field < Boolean > billableProductInvoiceField()
  {
    return billableProductInvoice;
  }

  @Override
  public Field < Boolean > billableTimeInvoiceField()
  {
    return billableTimeInvoice;
  }

  @Override
  public Field < Boolean > bottomCommentField()
  {
    return bottomComment;
  }

  @Override
  public Field < Boolean > cancelledField()
  {
    return cancelled;
  }

  @Override
  public Field < Boolean > carryOverUnusedField()
  {
    return carryOverUnused;
  }

  @Override
  public Field < Boolean > chargeToFirmField()
  {
    return chargeToFirm;
  }

  @Override
  public Field < Boolean > coverAgreementExpenseField()
  {
    return coverAgreementExpense;
  }

  @Override
  public Field < Boolean > coverAgreementProductField()
  {
    return coverAgreementProduct;
  }

  @Override
  public Field < Boolean > coverAgreementTimeField()
  {
    return coverAgreementTime;
  }

  @Override
  public Field < Boolean > coverSalesTaxField()
  {
    return coverSalesTax;
  }

  @Override
  public Field < Boolean > expireWhenZeroField()
  {
    return expireWhenZero;
  }

  @Override
  public Field < Boolean > noEndingDateField()
  {
    return noEndingDate;
  }

  @Override
  public Field < Boolean > oneTimeField()
  {
    return oneTime;
  }

  @Override
  public Field < Boolean > restrictDepartmentField()
  {
    return restrictDepartment;
  }

  @Override
  public Field < Boolean > restrictDownPaymentField()
  {
    return restrictDownPayment;
  }

  @Override
  public Field < Boolean > restrictLocationField()
  {
    return restrictLocation;
  }

  @Override
  public Field < Boolean > taxableField()
  {
    return taxable;
  }

  @Override
  public Field < Boolean > topCommentField()
  {
    return topComment;
  }

  @Override
  public Field < Date > lastUpdateField()
  {
    return lastUpdate;
  }

  @Override
  public Field < String > updatedByField()
  {
    return updatedBy;
  }

  @Override
  public Field < Boolean > boardDefaultField()
  {
    return boardDefault;
  }

  @Override
  public Field < Integer > boardIdField()
  {
    return boardId;
  }

  @Override
  public Field < Integer > serviceTypeIdField()
  {
    return serviceTypeId;
  }

  @Override
  public String toXml( final String s )
  {
    return "<" + s + ">"
      + id.toXml()
      + agreementTypeId.toXml()
      + agreementName.toXml()
      + parentAgreementId.toXml()
      + companyId.toXml()
      + contactId.toXml()
      + customerPo.toXml()
      + locationId.toXml()
      + departmentId.toXml()
      + restrictDepartment.toXml()
      + startDate.toXml()
      + endDate.toXml()
      + noEndingDate.toXml()
      + opportunityId.toXml()
      + cancelled.toXml()
      + dateCancelled.toXml()
      + reasonCancelled.toXml()
      + slaId.toXml()
      + subContractCompanyId.toXml()
      + subContractContactId.toXml()
      + workOrder.toXml()
      + internalNotes.toXml()
      + applicationLimit.toXml()
      + applicationUnlimited.toXml()
      + oneTime.toXml()
      + coverAgreementTime.toXml()
      + coverAgreementProduct.toXml()
      + coverAgreementExpense.toXml()
      + coverSalesTax.toXml()
      + carryOverUnused.toXml()
      + allowOverruns.toXml()
      + expiredDays.toXml()
      + limit.toXml()
      + chargeToFirm.toXml()
      + compHourlyRate.toXml()
      + compLimitAmount.toXml()
      + billCycleId.toXml()
      + billOneTime.toXml()
      + billTermsId.toXml()
      + billToCompanyId.toXml()
      + billToAddressId.toXml()
      + billAmount.toXml()
      + taxable.toXml()
      + prorateFirstBill.toXml()
      + billStartDate.toXml()
      + taxCodeId.toXml()
      + restrictDownPayment.toXml()
      + invoiceDescription.toXml()
      + topComment.toXml()
      + bottomComment.toXml()
      + workRoleId.toXml()
      + workTypeId.toXml()
      + projectTypeId.toXml()
      + invoiceTemplateId.toXml()
      + billableTimeInvoice.toXml()
      + billableExpenseInvoice.toXml()
      + billableProductInvoice.toXml()
      + boardId.toXml()
      + boardDefault.toXml()
      + serviceTypeId.toXml()
      + updatedBy.toXml()
      + lastUpdate.toXml()
      + "</" + s + ">";
  }

  @Override
  public Agreement fromXml( final Document document )
  {
    new XMLDecoder()
    document.get
  }
}
