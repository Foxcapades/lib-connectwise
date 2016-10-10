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

import io.vulpine.connectwise.type.def.XmlSerializable;
import io.vulpine.connectwise.util.Field;

import java.util.Date;

/**
 * = Agreement
 *
 * @since 0.1.0
 * @version 1.0.0
 */
public interface FieldAgreement extends Agreement
{

  @Override
  default String agreementName()
  {
    return agreementNameField().get();
  }

  Field< String > agreementNameField();

  Field < Integer > agreementTypeIdField();

  Field < Boolean > allowOverrunsField();

  Field < String > applicationCycleField();

  Field < Double > applicationLimitField();

  Field < String > applicationUnitsField();

  Field < Boolean > applicationUnlimitedField();

  Field < Double > billAmountField();

  Field < Integer > billCycleIdField();

  Field < String > billExpensesField();

  Field < Boolean > billOneTimeField();

  Field < String > billProductsField();

  Field < Date > billStartDateField();

  Field < Integer > billTermsIdField();

  Field < String > billTimeField();

  Field < Integer > billToAddressIdField();

  Field < Integer > billToCompanyIdField();

  Field < Boolean > billableExpenseInvoiceField();

  Field < Boolean > billableProductInvoiceField();

  Field < Boolean > billableTimeInvoiceField();

  Field < Boolean > boardDefaultField();

  @Override
  default Integer boardId()
  {
    return boardIdField().get();
  }

  Field < Integer > boardIdField();

  Field < Boolean > bottomCommentField();

  Field < Boolean > cancelledField();

  Field < Boolean > carryOverUnusedField();

  Field < Boolean > chargeToFirmField();

  Field < Double > compHourlyRateField();

  Field < Double > compLimitAmountField();

  @Override
  default Integer companyId()
  {
    return companyIdField().get();
  }

  Field< Integer > companyIdField();

  @Override
  default Integer contactId()
  {
    return contactIdField().get();
  }

  Field < Integer > contactIdField();

  Field < Boolean > coverAgreementExpenseField();

  Field < Boolean > coverAgreementProductField();

  Field < Boolean > coverAgreementTimeField();

  Field < Boolean > coverSalesTaxField();

  Field < String > customerPoField();

  Field < Date > dateCancelledField();

  @Override
  default Integer departmentId()
  {
    return departmentIdField().get();
  }

  Field< Integer > departmentIdField();

  Field < String > employeeCompNotExceedField();

  Field < String > employeeCompRateField();

  @Override
  default Date endDate()
  {
    return endDateField().get();
  }

  Field< Date > endDateField();

  Field < Boolean > expireWhenZeroField();

  Field < Integer > expiredDaysField();

  @Override
  default Integer id()
  {
    return idField().get();
  }

  Field< Integer > idField();

  Field < String > internalNotesField();

  Field < String > invoiceDescriptionField();

  Field < Integer > invoiceTemplateIdField();

  Field < String > invoicingCycleField();

  @Override
  default Date lastUpdate() { return lastUpdateField().get(); }

  Field < Date > lastUpdateField();

  Field < Integer > limitField();

  @Override
  default Integer locationId()
  {
    return locationIdField().get();
  }

  Field< Integer > locationIdField();

  Field < Boolean > noEndingDateField();

  Field < Boolean > oneTimeField();

  Field < Integer > opportunityIdField();

  Field < Integer > parentAgreementIdField();

  Field < String > periodTypeField();

  Field < Integer > projectTypeIdField();

  Field < Double > prorateFirstBillField();

  Field < String > reasonCancelledField();

  Field < Boolean > restrictDepartmentField();

  Field < Boolean > restrictDownPaymentField();

  Field < Boolean > restrictLocationField();

  @Override
  default Integer serviceTypeId()
  {
    return serviceTypeIdField().get();
  }

  Field< Integer > serviceTypeIdField();

  Field < Integer > slaIdField();

  @Override
  default Date startDate()
  {
    return startDateField().get();
  }

  Field< Date > startDateField();

  Field < Integer > subContractCompanyIdField();

  Field < Integer > subContractContactIdField();

  Field < Integer > taxCodeIdField();

  @Override
  default Boolean taxable()
  {
    return taxableField().get();
  }

  Field < Boolean > taxableField();

  Field < Boolean > topCommentField();

  @Override
  default String updatedBy()
  {
    return updatedByField().get();
  }

  Field< String > updatedByField();

  Field < String > workOrderField();

  @Override
  default Integer agreementTypeId()
  {
    return agreementTypeIdField().get();
  }

  @Override
  default FieldAgreement agreementTypeId( final Integer i )
  {
    agreementTypeIdField().set(i);
    return this;
  }

  @Override
  default String applicationCycle()
  {
    return applicationCycleField().get();
  }

  @Override
  default FieldAgreement applicationCycle( final String s )
  {
    applicationCycleField().set(s);
    return this;
  }

  @Override
  default Double applicationLimit()
  {
    return applicationLimitField().get();
  }

  @Override
  default FieldAgreement applicationLimit( final Double d )
  {
    applicationLimitField().set(d);
    return this;
  }

  @Override
  default String applicationUnits()
  {
    return applicationUnitsField().get();
  }

  @Override
  default FieldAgreement applicationUnits( final String s )
  {
    applicationUnitsField().set(s);
    return this;
  }

  @Override
  default Double billAmount()
  {
    return billAmountField().get();
  }

  @Override
  default FieldAgreement billAmount( final Double d )
  {
    billAmountField().set(d);
    return this;
  }

  @Override
  default Integer billCycleId()
  {
    return billCycleIdField().get();
  }

  @Override
  default FieldAgreement billCycleId( final Integer i )
  {
    billCycleIdField().set(i);
    return this;
  }

  @Override
  default String billExpenses()
  {
    return billExpensesField().get();
  }

  @Override
  default FieldAgreement billExpenses( final String s )
  {
    billExpensesField().set(s);
    return this;
  }

  @Override
  default String billProducts()
  {
    return billProductsField().get();
  }

  @Override
  default FieldAgreement billProducts( final String s )
  {
    billProductsField().set(s);
    return this;
  }

  @Override
  default Date billStartDate()
  {
    return billStartDateField().get();
  }

  @Override
  default FieldAgreement billStartDate( final Date d )
  {
    billStartDateField().set(d);
    return this;
  }

  @Override
  default Integer billTermsId()
  {
    return billTermsIdField().get();
  }

  @Override
  default FieldAgreement billTermsId( final Integer i )
  {
    billTermsIdField().set(i);
    return this;
  }

  @Override
  default String billTime()
  {
    return billTimeField().get();
  }

  @Override
  default FieldAgreement billTime( final String s )
  {
    billTimeField().set(s);
    return this;
  }

  @Override
  default Integer billToAddressId()
  {
    return billToAddressIdField().get();
  }

  @Override
  default FieldAgreement billToAddressId( final Integer i )
  {
    billToAddressIdField().set(i);
    return this;
  }

  @Override
  default Integer billToCompanyId()
  {
    return billToCompanyIdField().get();
  }

  @Override
  default FieldAgreement billToCompanyId( final Integer i )
  {
    billToCompanyIdField().set(i);
    return this;
  }

  @Override
  default Double compHourlyRate()
  {
    return compHourlyRateField().get();
  }

  @Override
  default FieldAgreement compHourlyRate( final Double d )
  {
    compHourlyRateField().set(d);
    return this;
  }

  @Override
  default Double compLimitAmount()
  {
    return compLimitAmountField().get();
  }

  @Override
  default FieldAgreement compLimitAmount( final Double d )
  {
    compLimitAmountField().set(d);
    return this;
  }

  @Override
  default String customerPo()
  {
    return customerPoField().get();
  }

  @Override
  default FieldAgreement customerPo( final String s )
  {
    customerPoField().set(s);
    return this;
  }

  @Override
  default Date dateCancelled()
  {
    return dateCancelledField().get();
  }

  @Override
  default FieldAgreement dateCancelled( final Date d )
  {
    dateCancelledField().set(d);
    return this;
  }

  @Override
  default String employeeCompNotExceed()
  {
    return employeeCompNotExceedField().get();
  }

  @Override
  default FieldAgreement employeeCompNotExceed( final String s )
  {
    employeeCompNotExceedField().set(s);
    return this;
  }

  @Override
  default String employeeCompRate()
  {
    return employeeCompRateField().get();
  }

  @Override
  default FieldAgreement employeeCompRate( final String s )
  {
    employeeCompRateField().set(s);
    return this;
  }

  @Override
  default Integer expiredDays()
  {
    return expiredDaysField().get();
  }

  @Override
  default FieldAgreement expiredDays( final Integer d )
  {
    expiredDaysField().set(d);
    return this;
  }

  @Override
  default String internalNotes()
  {
    return internalNotesField().get();
  }

  @Override
  default FieldAgreement internalNotes( final String s )
  {
    internalNotesField().set(s);
    return this;
  }

  @Override
  default String invoiceDescription()
  {
    return invoiceDescriptionField().get();
  }

  @Override
  default FieldAgreement invoiceDescription( final String s )
  {
    invoiceDescriptionField().set(s);
    return this;
  }

  @Override
  default Integer invoiceTemplateId()
  {
    return invoiceTemplateIdField().get();
  }

  @Override
  default FieldAgreement invoiceTemplateId( final Integer i )
  {
    invoiceTemplateIdField().set(i);
    return this;
  }

  @Override
  default String invoicingCycle()
  {
    return invoicingCycleField().get();
  }

  @Override
  default FieldAgreement invoicingCycle( final String s )
  {
    invoicingCycleField().set(s);
    return this;
  }

  @Override
  default Integer limit()
  {
    return limitField().get();
  }

  @Override
  default FieldAgreement limit( final Integer l )
  {
    limitField().set(l);
    return this;
  }

  @Override
  default Integer opportunityId()
  {
    return opportunityIdField().get();
  }

  @Override
  default FieldAgreement opportunityId( final Integer i )
  {
    opportunityIdField().set(i);
    return this;
  }

  @Override
  default Integer parentAgreementId()
  {
    return parentAgreementIdField().get();
  }

  @Override
  default FieldAgreement parentAgreementId( final Integer i )
  {
    parentAgreementIdField().set(i);
    return this;
  }

  @Override
  default String periodType()
  {
    return periodTypeField().get();
  }

  @Override
  default FieldAgreement periodType( final String s )
  {
    periodTypeField().set(s);
    return this;
  }

  @Override
  default Integer projectTypeId()
  {
    return projectTypeIdField().get();
  }

  @Override
  default FieldAgreement projectTypeId( final Integer i )
  {
    projectTypeIdField().set(i);
    return this;
  }

  @Override
  default Double prorateFirstBill()
  {
    return prorateFirstBillField().get();
  }

  @Override
  default FieldAgreement prorateFirstBill( final Double d )
  {
    prorateFirstBillField().set(d);
    return this;
  }

  @Override
  default String reasonCancelled()
  {
    return reasonCancelledField().get();
  }

  @Override
  default FieldAgreement reasonCancelled( final String s )
  {
    reasonCancelledField().set(s);
    return this;
  }

  @Override
  default Integer slaId()
  {
    return slaIdField().get();
  }

  @Override
  default FieldAgreement slaId( final Integer i )
  {
    slaIdField().set(i);
    return this;
  }

  @Override
  default Integer subContractCompanyId()
  {
    return subContractCompanyIdField().get();
  }

  @Override
  default FieldAgreement subContractCompanyId( final Integer i )
  {
    subContractCompanyIdField().set(i);
    return this;
  }

  @Override
  default Integer subContractContactId()
  {
    return subContractContactIdField().get();
  }

  @Override
  default FieldAgreement subContractContactId( final Integer i )
  {
    subContractContactIdField().set(i);
    return this;
  }

  @Override
  default Integer taxCodeId()
  {
    return taxCodeIdField().get();
  }

  @Override
  default FieldAgreement taxCodeId( final Integer i )
  {
    taxCodeIdField().set(i);
    return this;
  }

  @Override
  default String workOrder()
  {
    return workOrderField().get();
  }

  @Override
  default FieldAgreement workOrder( final String s )
  {
    workOrderField().set(s);
    return this;
  }

  @Override
  default Boolean allowOverruns()
  {
    return allowOverrunsField().get();
  }

  @Override
  default FieldAgreement allowOverruns( final Boolean b )
  {
    allowOverrunsField().set(b);
    return this;
  }

  @Override
  default Boolean applicationUnlimited()
  {
    return applicationUnlimitedField().get();
  }

  @Override
  default FieldAgreement applicationUnlimited( final Boolean b )
  {
    applicationUnlimitedField().set(b);
    return this;
  }

  @Override
  default Boolean billOneTime()
  {
    return billOneTimeField().get();
  }

  @Override
  default FieldAgreement billOneTime( final Boolean b )
  {
    billOneTimeField().set(b);
    return this;
  }

  @Override
  default Boolean billableExpenseInvoice()
  {
    return billableExpenseInvoiceField().get();
  }

  @Override
  default FieldAgreement billableExpenseInvoice( final Boolean b )
  {
    billableExpenseInvoiceField().set(b);
    return this;
  }

  @Override
  default Boolean billableProductInvoice()
  {
    return billableProductInvoiceField().get();
  }

  @Override
  default FieldAgreement billableProductInvoice( final Boolean b )
  {
    billableProductInvoiceField().set(b);
    return this;
  }

  @Override
  default Boolean billableTimeInvoice()
  {
    return billableTimeInvoiceField().get();
  }

  @Override
  default FieldAgreement billableTimeInvoice( final Boolean b )
  {
    billableTimeInvoiceField().set(b);
    return this;
  }

  @Override
  default Boolean bottomComment()
  {
    return bottomCommentField().get();
  }

  @Override
  default FieldAgreement bottomComment( final Boolean b )
  {
    bottomCommentField().set(b);
    return this;
  }

  @Override
  default Boolean cancelled()
  {
    return cancelledField().get();
  }

  @Override
  default FieldAgreement cancelled( final Boolean b )
  {
    cancelledField().set(b);
    return this;
  }

  @Override
  default Boolean carryOverUnused()
  {
    return carryOverUnusedField().get();
  }

  @Override
  default FieldAgreement carryOverUnused( final Boolean b )
  {
    carryOverUnusedField().set(b);
    return this;
  }

  @Override
  default Boolean chargeToFirm()
  {
    return chargeToFirmField().get();
  }

  @Override
  default FieldAgreement chargeToFirm( final Boolean b )
  {
    chargeToFirmField().set(b);
    return this;
  }

  @Override
  default Boolean coverAgreementExpense()
  {
    return coverAgreementExpenseField().get();
  }

  @Override
  default FieldAgreement coverAgreementExpense( final Boolean b )
  {
    coverAgreementExpenseField().set(b);
    return this;
  }

  @Override
  default Boolean coverAgreementProduct()
  {
    return coverAgreementProductField().get();
  }

  @Override
  default FieldAgreement coverAgreementProduct( final Boolean b )
  {
    coverAgreementProductField().set(b);
    return this;
  }

  @Override
  default Boolean coverAgreementTime()
  {
    return coverAgreementTimeField().get();
  }

  @Override
  default FieldAgreement coverAgreementTime( final Boolean b )
  {
    coverAgreementTimeField().set(b);
    return this;
  }

  @Override
  default Boolean coverSalesTax()
  {
    return coverSalesTaxField().get();
  }

  @Override
  default FieldAgreement coverSalesTax( final Boolean b )
  {
    coverSalesTaxField().set(b);
    return this;
  }

  @Override
  default Boolean expireWhenZero()
  {
    return expireWhenZeroField().get();
  }

  @Override
  default FieldAgreement expireWhenZero( final Boolean b )
  {
    expireWhenZeroField().set(b);
    return this;
  }

  @Override
  default Boolean noEndingDate()
  {
    return noEndingDateField().get();
  }

  @Override
  default FieldAgreement noEndingDate( final Boolean b )
  {
    noEndingDateField().set(b);
    return this;
  }

  @Override
  default Boolean oneTime()
  {
    return oneTimeField().get();
  }

  @Override
  default FieldAgreement oneTime( final Boolean b )
  {
    oneTimeField().set(b);
    return this;
  }

  @Override
  default Boolean restrictDepartment()
  {
    return restrictDepartmentField().get();
  }

  @Override
  default FieldAgreement restrictDepartment( final Boolean b )
  {
    restrictDepartmentField().set(b);
    return this;
  }

  @Override
  default Boolean restrictDownPayment()
  {
    return restrictDownPaymentField().get();
  }

  @Override
  default FieldAgreement restrictDownPayment( final Boolean b )
  {
    restrictDownPaymentField().set(b);
    return this;
  }

  @Override
  default Boolean restrictLocation()
  {
    return restrictLocationField().get();
  }

  @Override
  default FieldAgreement restrictLocation( final Boolean b )
  {
    restrictLocationField().set(b);
    return this;
  }

  @Override
  default Boolean topComment()
  {
    return topCommentField().get();
  }

  @Override
  default FieldAgreement topComment( final Boolean b )
  {
    topCommentField().set(b);
    return this;
  }

  @Override
  default Boolean boardDefault()
  {
    return boardDefaultField().get();
  }

  @Override
  default FieldAgreement boardDefault( final Boolean b )
  {
    boardDefaultField().set(b);
    return this;
  }

  /*

  INHERITED DEFAULTS

   */

  @Override
  default FieldAgreement boardId( final Integer i )
  {
    boardIdField().set(i);
    return this;
  }

  @Override
  default FieldAgreement companyId( final Integer i )
  {
    companyIdField().set(i);
    return this;
  }

  @Override
  default FieldAgreement contactId( final Integer i )
  {
    contactIdField().set(i);
    return this;
  }

  @Override
  default FieldAgreement departmentId( final Integer i )
  {
    departmentIdField().set(i);
    return this;
  }

  @Override
  default FieldAgreement endDate( final Date d )
  {
    endDateField().set(d);
    return this;
  }

  @Override
  default FieldAgreement id( final Integer i )
  {
    idField().set(i);
    return this;
  }

  @Override
  default FieldAgreement lastUpdate( final Date d )
  {
    lastUpdateField().set(d);
    return this;
  }

  @Override
  default FieldAgreement locationId( final Integer i )
  {
    locationIdField().set(i);
    return this;
  }

  @Override
  default FieldAgreement serviceTypeId( final Integer i )
  {
    serviceTypeIdField().set(i);
    return this;
  }

  @Override
  default FieldAgreement startDate( final Date d )
  {
    startDateField().set(d);
    return this;
  }

  @Override
  default FieldAgreement taxable( final Boolean b )
  {
    taxableField().set(b);

    return this;
  }

  @Override
  default FieldAgreement updatedBy( final String s )
  {
    updatedByField().set(s);
    return this;
  }

  @Override
  default FieldAgreement workRoleId( final Integer i )
  {
    workRoleIdField().set(i);
    return this;
  }

  @Override
  default Integer workRoleId() { return workRoleIdField().get(); }

  Field< Integer > workRoleIdField();

  @Override
  default FieldAgreement workTypeId( final Integer i )
  {
    workTypeIdField().set(i);
    return this;
  }

  @Override
  default Integer workTypeId()
  {
    return workTypeIdField().get();
  }

  Field < Integer > workTypeIdField();
}
