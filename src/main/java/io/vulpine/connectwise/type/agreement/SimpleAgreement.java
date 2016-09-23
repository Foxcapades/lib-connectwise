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
    boardDefault           = new SimpleField < Boolean >("BoardDefaultFlag");

  private Field < Date >
    billStartDate = new SimpleField < Date >("BillStartDate"),
    dateCancelled = new SimpleField < Date >("DateCancelled"),
    endDate       = new SimpleField < Date >("EndDate"),
    startDate     = new SimpleField < Date >("StartDate"),
    lastUpdate    = new SimpleField < Date >("LastUpdate");

  private Field < Double >
    applicationLimit = new SimpleField < Double >("ApplicationLimit"),
    billAmount       = new SimpleField < Double >("BillAmount"),
    compHourlyRate   = new SimpleField < Double >("CompHourlyRate"),
    compLimitAmount  = new SimpleField < Double >("CompLimitAmount"),
    prorateFirstBill = new SimpleField < Double >("ProrateFirstBill");

  private Field < Integer >
    id                   = new SimpleField < Integer >("Id"),
    agreementTypeId      = new SimpleField < Integer >("AgreementTypeId"),
    billCycleId          = new SimpleField < Integer >("BillCycleId"),
    billTermsId          = new SimpleField < Integer >("BillTermsId"),
    billToAddressId      = new SimpleField < Integer >("BillToAddressId"),
    billToCompanyId      = new SimpleField < Integer >("BillToCompanyId"),
    contactId            = new SimpleField < Integer >("ContactId"),
    companyId            = new SimpleField < Integer >("CompanyId"),
    departmentId         = new SimpleField < Integer >("DepartmentId"),
    expiredDays          = new SimpleField < Integer >("ExpiredDays"),
    invoiceTemplateId    = new SimpleField < Integer >("InvoiceTemplateId"),
    limit                = new SimpleField < Integer >("Limit"),
    locationId           = new SimpleField < Integer >("LocationId"),
    opportunityId        = new SimpleField < Integer >("OpportunityId"),
    parentAgreementId    = new SimpleField < Integer >("ParentAgreementId"),
    projectTypeId        = new SimpleField < Integer >("ProjectTypeId"),
    slaId                = new SimpleField < Integer >("SlaId"),
    subContractCompanyId = new SimpleField < Integer >("SubContractCompanyId"),
    subContractContactId = new SimpleField < Integer >("SubContractContactId"),
    taxCodeId            = new SimpleField < Integer >("TaxCodeId"),
    workRoleId           = new SimpleField < Integer >("WorkRoleId"),
    workTypeId           = new SimpleField < Integer >("WorkTypeId"),
    boardId              = new SimpleField < Integer >("BoardId"),
    serviceTypeId        = new SimpleField < Integer >("ServiceTypeId");

  private Field < String >
    agreementName         = new SimpleField < String >("AgreementName"),
    applicationCycle      = new SimpleField < String >("ApplicationCycle"),
    applicationUnits      = new SimpleField < String >("ApplicationUnits"),
    billExpenses          = new SimpleField < String >("BillExpenses"),
    billProducts          = new SimpleField < String >("BillProducts"),
    billTime              = new SimpleField < String >("BillTime"),
    customerPo            = new SimpleField < String >("CustomerPO"),
    employeeCompNotExceed = new SimpleField < String >("EmployeeCompNotExceed"),
    employeeCompRate      = new SimpleField < String >("EmployeeCompRate"),
    invoiceDescription    = new SimpleField < String >("InvoiceDescription"),
    invoicingCycle        = new SimpleField < String >("InvoicingCycle"),
    internalNotes         = new SimpleField < String >("InternalNotes"),
    periodType            = new SimpleField < String >("PeriodType"),
    reasonCancelled       = new SimpleField < String >("ReasonCancelled"),
    workOrder             = new SimpleField < String >("WorkOrder"),
    updatedBy             = new SimpleField < String >("UpdatedBy");

  @Override
  public Integer id()
  {
    return id.get();
  }

  @Override
  public Field < Integer > idField()
  {
    return id;
  }

  @Override
  public Agreement id( final Integer i )
  {
    id.set(i);
    return this;
  }

  @Override
  public String agreementName()
  {
    return agreementName.get();
  }

  @Override
  public Field < String > agreementNameField()
  {
    return agreementName;
  }

  @Override
  public Agreement agreementName( final String s )
  {
    agreementName.set(s);

    return this;
  }

  @Override
  public Integer agreementTypeId()
  {
    return agreementTypeId.get();
  }

  @Override
  public Field < Integer > agreementTypeIdField()
  {
    return agreementTypeId;
  }

  @Override
  public Agreement agreementTypeId( final Integer i )
  {
    agreementTypeId.set(i);
    return this;
  }

  @Override
  public String applicationCycle()
  {
    return applicationCycle.get();
  }

  @Override
  public Field < String > applicationCycleField()
  {
    return applicationCycle;
  }

  @Override
  public Agreement applicationCycle( final String s )
  {
    applicationCycle.set(s);

    return this;
  }

  @Override
  public Double applicationLimit()
  {
    return applicationLimit.get();
  }

  @Override
  public Field < Double > applicationLimitField()
  {
    return applicationLimit;
  }

  @Override
  public Agreement applicationLimit( final Double d )
  {
    applicationLimit.set(d);

    return this;
  }

  @Override
  public String applicationUnits()
  {
    return applicationUnits.get();
  }

  @Override
  public Field < String > applicationUnitsField()
  {
    return applicationUnits;
  }

  @Override
  public Agreement applicationUnits( final String s )
  {
    applicationUnits.set(s);

    return this;
  }

  @Override
  public Double billAmount()
  {
    return billAmount.get();
  }

  @Override
  public Field < Double > billAmountField()
  {
    return billAmount;
  }

  @Override
  public Agreement billAmount( final Double d )
  {
    billAmount.set(d);

    return this;
  }

  @Override
  public Integer billCycleId()
  {
    return billCycleId.get();
  }

  @Override
  public Field < Integer > billCycleIdField()
  {
    return billCycleId;
  }

  @Override
  public Agreement billCycleId( final Integer i )
  {
    billCycleId.set(i);

    return this;
  }

  @Override
  public String billExpenses()
  {
    return billExpenses.get();
  }

  @Override
  public Field < String > billExpensesField()
  {
    return billExpenses;
  }

  @Override
  public Agreement billExpenses( final String s )
  {
    billExpenses.set(s);

    return this;
  }

  @Override
  public String billProducts()
  {
    return billProducts.get();
  }

  @Override
  public Field < String > billProductsField()
  {
    return billProducts;
  }

  @Override
  public Agreement billProducts( final String s )
  {
    billProducts.set(s);

    return this;
  }

  @Override
  public Date billStartDate()
  {
    return billStartDate.get();
  }

  @Override
  public Field < Date > billStartDateField()
  {
    return billStartDate;
  }

  @Override
  public Agreement billStartDate( final Date d )
  {
    billStartDate.set(d);

    return this;
  }

  @Override
  public Integer billTermsId()
  {
    return billTermsId.get();
  }

  @Override
  public Field < Integer > billTermsIdField()
  {
    return billTermsId;
  }

  @Override
  public Agreement billTermsId( final Integer i )
  {
    billTermsId.set(i);

    return this;
  }

  @Override
  public String billTime()
  {
    return billTime.get();
  }

  @Override
  public Field < String > billTimeField()
  {
    return billTime;
  }

  @Override
  public Agreement billTime( final String s )
  {
    billTime.set(s);

    return this;
  }

  @Override
  public Integer billToAddressId()
  {
    return billToAddressId.get();
  }

  @Override
  public Field < Integer > billToAddressIdField()
  {
    return billToAddressId;
  }

  @Override
  public Agreement billToAddressId( final Integer i )
  {
    billToAddressId.set(i);

    return this;
  }

  @Override
  public Integer billToCompanyId()
  {
    return billToCompanyId.get();
  }

  @Override
  public Field < Integer > billToCompanyIdField()
  {
    return billToCompanyId;
  }

  @Override
  public Agreement billToCompanyId( final Integer i )
  {
    billToCompanyId.set(i);

    return this;
  }

  @Override
  public Double compHourlyRate()
  {
    return compHourlyRate.get();
  }

  @Override
  public Field < Double > compHourlyRateField()
  {
    return compHourlyRate;
  }

  @Override
  public Agreement compHourlyRate( final Double d )
  {
    compHourlyRate.set(d);

    return this;
  }

  @Override
  public Double compLimitAmount()
  {
    return compLimitAmount.get();
  }

  @Override
  public Field < Double > compLimitAmountField()
  {
    return compLimitAmount;
  }

  @Override
  public Agreement compLimitAmount( final Double d )
  {
    compLimitAmount.set(d);

    return this;
  }

  @Override
  public Integer companyId()
  {
    return companyId.get();
  }

  @Override
  public Field < Integer > companyIdField()
  {
    return companyId;
  }

  @Override
  public Agreement companyId( final Integer i )
  {
    companyId.set(i);

    return this;
  }

  @Override
  public Integer contactId()
  {
    return contactId.get();
  }

  @Override
  public Field < Integer > contactIdField()
  {
    return contactId;
  }

  @Override
  public Agreement contactId( final Integer i )
  {
    contactId.set(i);

    return this;
  }

  @Override
  public String customerPo()
  {
    return customerPo.get();
  }

  @Override
  public Field < String > customerPoField()
  {
    return customerPo;
  }

  @Override
  public Agreement customerPo( final String s )
  {
    customerPo.set(s);

    return this;
  }

  @Override
  public Date dateCancelled()
  {
    return dateCancelled.get();
  }

  @Override
  public Field < Date > dateCancelledField()
  {
    return dateCancelled;
  }

  @Override
  public Agreement dateCancelled( final Date d )
  {
    dateCancelled.set(d);

    return this;
  }

  @Override
  public Integer departmentId()
  {
    return departmentId.get();
  }

  @Override
  public Field < Integer > departmentIdField()
  {
    return departmentId;
  }

  @Override
  public Agreement departmentId( final Integer i )
  {
    departmentId.set(i);

    return this;
  }

  @Override
  public String employeeCompNotExceed()
  {
    return employeeCompNotExceed.get();
  }

  @Override
  public Field < String > employeeCompNotExceedField()
  {
    return employeeCompNotExceed;
  }

  @Override
  public Agreement employeeCompNotExceed( final String s )
  {
    employeeCompNotExceed.set(s);

    return this;
  }

  @Override
  public String employeeCompRate()
  {
    return employeeCompRate.get();
  }

  @Override
  public Field < String > employeeCompRateField()
  {
    return employeeCompRate;
  }

  @Override
  public Agreement employeeCompRate( final String s )
  {
    employeeCompRate.set(s);

    return this;
  }

  @Override
  public Date endDate()
  {
    return endDate.get();
  }

  @Override
  public Field < Date > endDateField()
  {
    return endDate;
  }

  @Override
  public Agreement endDate( final Date d )
  {
    endDate.set(d);

    return this;
  }

  @Override
  public Integer expiredDays()
  {
    return expiredDays.get();
  }

  @Override
  public Field < Integer > expiredDaysField()
  {
    return expiredDays;
  }

  @Override
  public Agreement expiredDays( final Integer i )
  {
    expiredDays.set(i);

    return this;
  }

  @Override
  public String internalNotes()
  {
    return internalNotes.get();
  }

  @Override
  public Field < String > internalNotesField()
  {
    return internalNotes;
  }

  @Override
  public Agreement internalNotes( final String s )
  {
    internalNotes.set(s);

    return this;
  }

  @Override
  public String invoiceDescription()
  {
    return invoiceDescription.get();
  }

  @Override
  public Field < String > invoiceDescriptionField()
  {
    return invoiceDescription;
  }

  @Override
  public Agreement invoiceDescription( final String s )
  {
    invoiceDescription.set(s);

    return this;
  }

  @Override
  public Integer invoiceTemplateId()
  {
    return invoiceTemplateId.get();
  }

  @Override
  public Field < Integer > invoiceTemplateIdField()
  {
    return invoiceTemplateId;
  }

  @Override
  public Agreement invoiceTemplateId( final Integer i )
  {
    invoiceTemplateId.set(i);

    return this;
  }

  @Override
  public String invoicingCycle()
  {
    return invoicingCycle.get();
  }

  @Override
  public Field < String > invoicingCycleField()
  {
    return invoicingCycle;
  }

  @Override
  public Agreement invoicingCycle( final String s )
  {
    invoicingCycle.set(s);

    return this;
  }

  @Override
  public Integer limit()
  {
    return limit.get();
  }

  @Override
  public Field < Integer > limitField()
  {
    return limit;
  }

  @Override
  public Agreement limit( final Integer l )
  {
    limit.set(l);

    return this;
  }

  @Override
  public Integer locationId()
  {
    return locationId.get();
  }

  @Override
  public Field < Integer > locationIdField()
  {
    return locationId;
  }

  @Override
  public Agreement locationId( final Integer i )
  {
    locationId.set(i);

    return this;
  }

  @Override
  public Integer opportunityId()
  {
    return opportunityId.get();
  }

  @Override
  public Field < Integer > opportunityIdField()
  {
    return opportunityId;
  }

  @Override
  public Agreement opportunityId( final Integer i )
  {
    opportunityId.set(i);

    return this;
  }

  @Override
  public Integer parentAgreementId()
  {
    return parentAgreementId.get();
  }

  @Override
  public Field < Integer > parentAgreementIdField()
  {
    return parentAgreementId;
  }

  @Override
  public Agreement parentAgreementId( final Integer i )
  {
    parentAgreementId.set(i);

    return this;
  }

  @Override
  public String periodType()
  {
    return periodType.get();
  }

  @Override
  public Field < String > periodTypeField()
  {
    return periodType;
  }

  @Override
  public Agreement periodType( final String s )
  {
    periodType.set(s);

    return this;
  }

  @Override
  public Integer projectTypeId()
  {
    return projectTypeId.get();
  }

  @Override
  public Field < Integer > projectTypeIdField()
  {
    return projectTypeId;
  }

  @Override
  public Agreement projectTypeId( final Integer i )
  {
    projectTypeId.set(i);

    return this;
  }

  @Override
  public Double prorateFirstBill()
  {
    return prorateFirstBill.get();
  }

  @Override
  public Field < Double > prorateFirstBillField()
  {
    return prorateFirstBill;
  }

  @Override
  public Agreement prorateFirstBill( final Double d )
  {
    prorateFirstBill.set(d);

    return this;
  }

  @Override
  public String reasonCancelled()
  {
    return reasonCancelled.get();
  }

  @Override
  public Field < String > reasonCancelledField()
  {
    return reasonCancelled;
  }

  @Override
  public Agreement reasonCancelled( final String s )
  {
    reasonCancelled.set(s);

    return this;
  }

  @Override
  public Integer slaId()
  {
    return slaId.get();
  }

  @Override
  public Field < Integer > slaIdField()
  {
    return slaId;
  }

  @Override
  public Agreement slaId( final Integer i )
  {
    slaId.set(i);

    return this;
  }

  @Override
  public Date startDate()
  {
    return startDate.get();
  }

  @Override
  public Field < Date > startDateField()
  {
    return startDate;
  }

  @Override
  public Agreement startDate( final Date d )
  {
    startDate.set(d);

    return this;
  }

  @Override
  public Integer subContractCompanyId()
  {
    return subContractCompanyId.get();
  }

  @Override
  public Field < Integer > subContractCompanyIdField()
  {
    return subContractCompanyId;
  }

  @Override
  public Agreement subContractCompanyId( final Integer i )
  {
    subContractCompanyId.set(i);

    return this;
  }

  @Override
  public Integer subContractContactId()
  {
    return subContractContactId.get();
  }

  @Override
  public Field < Integer > subContractContactIdField()
  {
    return subContractContactId;
  }

  @Override
  public Agreement subContractContactId( final Integer i )
  {
    subContractContactId.set(i);

    return this;
  }

  @Override
  public Integer taxCodeId()
  {
    return taxCodeId.get();
  }

  @Override
  public Field < Integer > taxCodeIdField()
  {
    return taxCodeId;
  }

  @Override
  public Agreement taxCodeId( final Integer i )
  {
    taxCodeId.set(i);

    return this;
  }

  @Override
  public String workOrder()
  {
    return workOrder.get();
  }

  @Override
  public Field < String > workOrderField()
  {
    return workOrder;
  }

  @Override
  public Agreement workOrder( final String s )
  {
    workOrder.set(s);

    return this;
  }

  @Override
  public Integer workRoleId()
  {
    return workRoleId.get();
  }

  @Override
  public Field < Integer > workRoleIdField()
  {
    return workRoleId;
  }

  @Override
  public Agreement workRoleId( final Integer i )
  {
    workRoleId.set(i);

    return this;
  }

  @Override
  public Integer workTypeId()
  {
    return workTypeId.get();
  }

  @Override
  public Field < Integer > workTypeIdField()
  {
    return workTypeId;
  }

  @Override
  public Agreement workTypeId( final Integer i )
  {
    workTypeId.set(i);

    return this;
  }

  @Override
  public Boolean allowOverruns()
  {
    return allowOverruns.get();
  }

  @Override
  public Field < Boolean > allowOverrunsField()
  {
    return allowOverruns;
  }

  @Override
  public Agreement allowOverruns( final Boolean b )
  {
    allowOverruns.set(b);

    return this;
  }

  @Override
  public Boolean applicationUnlimited()
  {
    return applicationUnlimited.get();
  }

  @Override
  public Field < Boolean > applicationUnlimitedField()
  {
    return applicationUnlimited;
  }

  @Override
  public Agreement applicationUnlimited( final Boolean b )
  {
    applicationUnlimited.set(b);

    return this;
  }

  @Override
  public Boolean billOneTime()
  {
    return billOneTime.get();
  }

  @Override
  public Field < Boolean > billOneTimeField()
  {
    return billOneTime;
  }

  @Override
  public Agreement billOneTime( final Boolean b )
  {
    billOneTime.set(b);

    return this;
  }

  @Override
  public Boolean billableExpenseInvoice()
  {
    return billableExpenseInvoice.get();
  }

  @Override
  public Field < Boolean > billableExpenseInvoiceField()
  {
    return billableExpenseInvoice;
  }

  @Override
  public Agreement billableExpenseInvoice( final Boolean b )
  {
    billableExpenseInvoice.set(b);

    return this;
  }

  @Override
  public Boolean billableProductInvoice()
  {
    return billableProductInvoice.get();
  }

  @Override
  public Field < Boolean > billableProductInvoiceField()
  {
    return billableProductInvoice;
  }

  @Override
  public Agreement billableProductInvoice( final Boolean b )
  {
    billableProductInvoice.set(b);

    return this;
  }

  @Override
  public Boolean billableTimeInvoice()
  {
    return billableTimeInvoice.get();
  }

  @Override
  public Field < Boolean > billableTimeInvoiceField()
  {
    return billableTimeInvoice;
  }

  @Override
  public Agreement billableTimeInvoice( final Boolean b )
  {
    billableTimeInvoice.set(b);

    return this;
  }

  @Override
  public Boolean bottomComment()
  {
    return bottomComment.get();
  }

  @Override
  public Field < Boolean > bottomCommentField()
  {
    return bottomComment;
  }

  @Override
  public Agreement bottomComment( final Boolean b )
  {
    bottomComment.set(b);

    return this;
  }

  @Override
  public Boolean cancelled()
  {
    return cancelled.get();
  }

  @Override
  public Field < Boolean > cancelledField()
  {
    return cancelled;
  }

  @Override
  public Agreement cancelled( final Boolean b )
  {
    cancelled.set(b);

    return this;
  }

  @Override
  public Boolean carryOverUnused()
  {
    return carryOverUnused.get();
  }

  @Override
  public Field < Boolean > carryOverUnusedField()
  {
    return carryOverUnused;
  }

  @Override
  public Agreement carryOverUnused( final Boolean b )
  {
    carryOverUnused.set(b);

    return this;
  }

  @Override
  public Boolean chargeToFirm()
  {
    return chargeToFirm.get();
  }

  @Override
  public Field < Boolean > chargeToFirmField()
  {
    return chargeToFirm;
  }

  @Override
  public Agreement chargeToFirm( final Boolean b )
  {
    chargeToFirm.set(b);

    return this;
  }

  @Override
  public Boolean coverAgreementExpense()
  {
    return coverAgreementExpense.get();
  }

  @Override
  public Field < Boolean > coverAgreementExpenseField()
  {
    return coverAgreementExpense;
  }

  @Override
  public Agreement coverAgreementExpense( final Boolean b )
  {
    coverAgreementExpense.set(b);

    return this;
  }

  @Override
  public Boolean coverAgreementProduct()
  {
    return coverAgreementProduct.get();
  }

  @Override
  public Field < Boolean > coverAgreementProductField()
  {
    return coverAgreementProduct;
  }

  @Override
  public Agreement coverAgreementProduct( final Boolean b )
  {
    coverAgreementProduct.set(b);

    return this;
  }

  @Override
  public Boolean coverAgreementTime()
  {
    return coverAgreementTime.get();
  }

  @Override
  public Field < Boolean > coverAgreementTimeField()
  {
    return coverAgreementTime;
  }

  @Override
  public Agreement coverAgreementTime( final Boolean b )
  {
    coverAgreementTime.set(b);

    return this;
  }

  @Override
  public Boolean coverSalesTax()
  {
    return coverSalesTax.get();
  }

  @Override
  public Field < Boolean > coverSalesTaxField()
  {
    return coverSalesTax;
  }

  @Override
  public Agreement coverSalesTax( final Boolean b )
  {
    coverSalesTax.set(b);

    return this;
  }

  @Override
  public Boolean expireWhenZero()
  {
    return expireWhenZero.get();
  }

  @Override
  public Field < Boolean > expireWhenZeroField()
  {
    return expireWhenZero;
  }

  @Override
  public Agreement expireWhenZero( final Boolean b )
  {
    expireWhenZero.set(b);

    return this;
  }

  @Override
  public Boolean noEndingDate()
  {
    return noEndingDate.get();
  }

  @Override
  public Field < Boolean > noEndingDateField()
  {
    return noEndingDate;
  }

  @Override
  public Agreement noEndingDate( final Boolean b )
  {
    noEndingDate.set(b);

    return this;
  }

  @Override
  public Boolean oneTime()
  {
    return oneTime.get();
  }

  @Override
  public Field < Boolean > oneTimeField()
  {
    return oneTime;
  }

  @Override
  public Agreement oneTime( final Boolean b )
  {
    oneTime.set(b);

    return this;
  }

  @Override
  public Boolean restrictDepartment()
  {
    return restrictDepartment.get();
  }

  @Override
  public Field < Boolean > restrictDepartmentField()
  {
    return restrictDepartment;
  }

  @Override
  public Agreement restrictDepartment( final Boolean b )
  {
    restrictDepartment.set(b);

    return this;
  }

  @Override
  public Boolean restrictDownPayment()
  {
    return restrictDownPayment.get();
  }

  @Override
  public Field < Boolean > restrictDownPaymentField()
  {
    return restrictDownPayment;
  }

  @Override
  public Agreement restrictDownPayment( final Boolean b )
  {
    restrictDownPayment.set(b);

    return this;
  }

  @Override
  public Boolean restrictLocation()
  {
    return restrictLocation.get();
  }

  @Override
  public Field < Boolean > restrictLocationField()
  {
    return restrictLocation;
  }

  @Override
  public Agreement restrictLocation( final Boolean b )
  {
    restrictLocation.set(b);

    return this;
  }

  @Override
  public Boolean taxable()
  {
    return taxable.get();
  }

  @Override
  public Field < Boolean > taxableField()
  {
    return taxable;
  }

  @Override
  public Agreement taxable( final Boolean b )
  {
    taxable.set(b);

    return this;
  }

  @Override
  public Boolean topComment()
  {
    return topComment.get();
  }

  @Override
  public Field < Boolean > topCommentField()
  {
    return topComment;
  }

  @Override
  public Agreement topComment( final Boolean b )
  {
    topComment.set(b);

    return this;
  }

  @Override
  public Date lastUpdate()
  {
    return lastUpdate.get();
  }

  @Override
  public Field < Date > lastUpdateField()
  {
    return lastUpdate;
  }

  @Override
  public Agreement lastUpdate( final Date d )
  {
    lastUpdate.set(d);

    return this;
  }

  @Override
  public String updatedBy()
  {
    return updatedBy.get();
  }

  @Override
  public Field < String > updatedByField()
  {
    return updatedBy;
  }

  @Override
  public Agreement updatedBy( final String s )
  {
    updatedBy.set(s);

    return this;
  }

  @Override
  public Boolean boardDefault()
  {
    return boardDefault.get();
  }

  @Override
  public Field < Boolean > boardDefaultField()
  {
    return boardDefault;
  }

  @Override
  public Agreement boardDefault( final Boolean b )
  {
    boardDefault.set(b);

    return this;
  }

  @Override
  public Integer boardId()
  {
    return boardId.get();
  }

  @Override
  public Field < Integer > boardIdField()
  {
    return boardId;
  }

  @Override
  public Agreement boardId( final Integer i )
  {
    boardId.set(i);

    return this;
  }

  @Override
  public Integer serviceTypeId()
  {
    return serviceTypeId.get();
  }

  @Override
  public Field < Integer > serviceTypeIdField()
  {
    return serviceTypeId;
  }

  @Override
  public Agreement serviceTypeId( final Integer i )
  {
    serviceTypeId.set(i);
    return this;
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
}
