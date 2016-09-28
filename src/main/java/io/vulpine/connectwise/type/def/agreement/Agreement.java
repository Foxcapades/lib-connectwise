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
import io.vulpine.connectwise.type.def.gen.*;
import io.vulpine.connectwise.util.Field;

import java.util.Date;

/**
 * = Agreement
 *
 * @since 0.1.0
 * @version 1.0.0
 */
public interface Agreement
extends
  HasAgreementName,
  HasBoardId,
  HasCompanyId,
  HasContactId,
  HasDepartmentId,
  HasEndDate,
  HasId,
  HasLastUpdate,
  HasLocationId,
  HasServiceTypeId,
  HasStartDate,
  HasTaxable,
  HasUpdatedBy,
  HasWorkRoleId,
  HasWorkTypeId,
  XmlSerializable
{

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

  Field < Boolean > bottomCommentField();

  Field < Boolean > cancelledField();

  Field < Boolean > carryOverUnusedField();

  Field < Boolean > chargeToFirmField();

  Field < Double > compHourlyRateField();

  Field < Double > compLimitAmountField();

  Field < Boolean > coverAgreementExpenseField();

  Field < Boolean > coverAgreementProductField();

  Field < Boolean > coverAgreementTimeField();

  Field < Boolean > coverSalesTaxField();

  Field < String > customerPoField();

  Field < Date > dateCancelledField();

  Field < String > employeeCompNotExceedField();

  Field < String > employeeCompRateField();

  Field < Boolean > expireWhenZeroField();

  Field < Integer > expiredDaysField();

  Field < String > internalNotesField();

  Field < String > invoiceDescriptionField();

  Field < Integer > invoiceTemplateIdField();

  Field < String > invoicingCycleField();

  Field < Integer > limitField();

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

  Field < Integer > slaIdField();

  Field < Integer > subContractCompanyIdField();

  Field < Integer > subContractContactIdField();

  Field < Integer > taxCodeIdField();

  Field < Boolean > topCommentField();

  Field < String > workOrderField();

  default Integer agreementTypeId()
  {
    return agreementTypeIdField().get();
  }

  default Agreement agreementTypeId( final Integer i )
  {
    agreementTypeIdField().set(i);
    return this;
  }

  default String applicationCycle()
  {
    return applicationCycleField().get();
  }

  default Agreement applicationCycle( final String s )
  {
    applicationCycleField().set(s);
    return this;
  }

  default Double applicationLimit()
  {
    return applicationLimitField().get();
  }

  default Agreement applicationLimit( final Double d )
  {
    applicationLimitField().set(d);
    return this;
  }

  default String applicationUnits()
  {
    return applicationUnitsField().get();
  }

  default Agreement applicationUnits( final String s )
  {
    applicationUnitsField().set(s);
    return this;
  }

  default Double billAmount()
  {
    return billAmountField().get();
  }

  default Agreement billAmount( final Double d )
  {
    billAmountField().set(d);
    return this;
  }

  default Integer billCycleId()
  {
    return billCycleIdField().get();
  }

  default Agreement billCycleId( final Integer i )
  {
    billCycleIdField().set(i);
    return this;
  }

  default String billExpenses()
  {
    return billExpensesField().get();
  }

  default Agreement billExpenses( final String s )
  {
    billExpensesField().set(s);
    return this;
  }

  default String billProducts()
  {
    return billProductsField().get();
  }

  default Agreement billProducts( final String s )
  {
    billProductsField().set(s);
    return this;
  }

  default Date billStartDate()
  {
    return billStartDateField().get();
  }

  default Agreement billStartDate( final Date d )
  {
    billStartDateField().set(d);
    return this;
  }

  default Integer billTermsId()
  {
    return billTermsIdField().get();
  }

  default Agreement billTermsId( final Integer i )
  {
    billTermsIdField().set(i);
    return this;
  }

  default String billTime()
  {
    return billTimeField().get();
  }

  default Agreement billTime( final String s )
  {
    billTimeField().set(s);
    return this;
  }

  default Integer billToAddressId()
  {
    return billToAddressIdField().get();
  }

  default Agreement billToAddressId( final Integer i )
  {
    billToAddressIdField().set(i);
    return this;
  }

  default Integer billToCompanyId()
  {
    return billToCompanyIdField().get();
  }

  default Agreement billToCompanyId( final Integer i )
  {
    billToCompanyIdField().set(i);
    return this;
  }

  default Double compHourlyRate()
  {
    return compHourlyRateField().get();
  }

  default Agreement compHourlyRate( final Double d )
  {
    compHourlyRateField().set(d);
    return this;
  }

  default Double compLimitAmount()
  {
    return compLimitAmountField().get();
  }

  default Agreement compLimitAmount( final Double d )
  {
    compLimitAmountField().set(d);
    return this;
  }

  default String customerPo()
  {
    return customerPoField().get();
  }

  default Agreement customerPo( final String s )
  {
    customerPoField().set(s);
    return this;
  }

  default Date dateCancelled()
  {
    return dateCancelledField().get();
  }

  default Agreement dateCancelled( final Date d )
  {
    dateCancelledField().set(d);
    return this;
  }

  default String employeeCompNotExceed()
  {
    return employeeCompNotExceedField().get();
  }

  default Agreement employeeCompNotExceed( final String s )
  {
    employeeCompNotExceedField().set(s);
    return this;
  }

  default String employeeCompRate()
  {
    return employeeCompRateField().get();
  }

  default Agreement employeeCompRate( final String s )
  {
    employeeCompRateField().set(s);
    return this;
  }

  default Integer expiredDays()
  {
    return expiredDaysField().get();
  }

  default Agreement expiredDays( final Integer d )
  {
    expiredDaysField().set(d);
    return this;
  }

  default String internalNotes()
  {
    return internalNotesField().get();
  }

  default Agreement internalNotes( final String s )
  {
    internalNotesField().set(s);
    return this;
  }

  default String invoiceDescription()
  {
    return invoiceDescriptionField().get();
  }

  default Agreement invoiceDescription( final String s )
  {
    invoiceDescriptionField().set(s);
    return this;
  }

  default Integer invoiceTemplateId()
  {
    return invoiceTemplateIdField().get();
  }

  default Agreement invoiceTemplateId( final Integer i )
  {
    invoiceTemplateIdField().set(i);
    return this;
  }

  default String invoicingCycle()
  {
    return invoicingCycleField().get();
  }

  default Agreement invoicingCycle( final String s )
  {
    invoicingCycleField().set(s);
    return this;
  }

  default Integer limit()
  {
    return limitField().get();
  }

  default Agreement limit( final Integer l )
  {
    limitField().set(l);
    return this;
  }

  default Integer opportunityId()
  {
    return opportunityIdField().get();
  }

  default Agreement opportunityId( final Integer i )
  {
    opportunityIdField().set(i);
    return this;
  }

  default Integer parentAgreementId()
  {
    return parentAgreementIdField().get();
  }

  default Agreement parentAgreementId( final Integer i )
  {
    parentAgreementIdField().set(i);
    return this;
  }

  default String periodType()
  {
    return periodTypeField().get();
  }

  default Agreement periodType( final String s )
  {
    periodTypeField().set(s);
    return this;
  }

  default Integer projectTypeId()
  {
    return projectTypeIdField().get();
  }

  default Agreement projectTypeId( final Integer i )
  {
    projectTypeIdField().set(i);
    return this;
  }

  default Double prorateFirstBill()
  {
    return prorateFirstBillField().get();
  }

  default Agreement prorateFirstBill( final Double d )
  {
    prorateFirstBillField().set(d);
    return this;
  }

  default String reasonCancelled()
  {
    return reasonCancelledField().get();
  }

  default Agreement reasonCancelled( final String s )
  {
    reasonCancelledField().set(s);
    return this;
  }

  default Integer slaId()
  {
    return slaIdField().get();
  }

  default Agreement slaId( final Integer i )
  {
    slaIdField().set(i);
    return this;
  }

  default Integer subContractCompanyId()
  {
    return subContractCompanyIdField().get();
  }

  default Agreement subContractCompanyId( final Integer i )
  {
    subContractCompanyIdField().set(i);
    return this;
  }

  default Integer subContractContactId()
  {
    return subContractContactIdField().get();
  }

  default Agreement subContractContactId( final Integer i )
  {
    subContractContactIdField().set(i);
    return this;
  }

  default Integer taxCodeId()
  {
    return taxCodeIdField().get();
  }

  default Agreement taxCodeId( final Integer i )
  {
    taxCodeIdField().set(i);
    return this;
  }

  default String workOrder()
  {
    return workOrderField().get();
  }

  default Agreement workOrder( final String s )
  {
    workOrderField().set(s);
    return this;
  }

  default Boolean allowOverruns()
  {
    return allowOverrunsField().get();
  }

  default Agreement allowOverruns( final Boolean b )
  {
    allowOverrunsField().set(b);
    return this;
  }

  default Boolean applicationUnlimited()
  {
    return applicationUnlimitedField().get();
  }

  default Agreement applicationUnlimited( final Boolean b )
  {
    applicationUnlimitedField().set(b);
    return this;
  }

  default Boolean billOneTime()
  {
    return billOneTimeField().get();
  }

  default Agreement billOneTime( final Boolean b )
  {
    billOneTimeField().set(b);
    return this;
  }

  default Boolean billableExpenseInvoice()
  {
    return billableExpenseInvoiceField().get();
  }

  default Agreement billableExpenseInvoice( final Boolean b )
  {
    billableExpenseInvoiceField().set(b);
    return this;
  }

  default Boolean billableProductInvoice()
  {
    return billableProductInvoiceField().get();
  }

  default Agreement billableProductInvoice( final Boolean b )
  {
    billableProductInvoiceField().set(b);
    return this;
  }

  default Boolean billableTimeInvoice()
  {
    return billableTimeInvoiceField().get();
  }

  default Agreement billableTimeInvoice( final Boolean b )
  {
    billableTimeInvoiceField().set(b);
    return this;
  }

  default Boolean bottomComment()
  {
    return bottomCommentField().get();
  }

  default Agreement bottomComment( final Boolean b )
  {
    bottomCommentField().set(b);
    return this;
  }

  default Boolean cancelled()
  {
    return cancelledField().get();
  }

  default Agreement cancelled( final Boolean b )
  {
    cancelledField().set(b);
    return this;
  }

  default Boolean carryOverUnused()
  {
    return carryOverUnusedField().get();
  }

  default Agreement carryOverUnused( final Boolean b )
  {
    carryOverUnusedField().set(b);
    return this;
  }

  default Boolean chargeToFirm()
  {
    return chargeToFirmField().get();
  }

  default Agreement chargeToFirm( final Boolean b )
  {
    chargeToFirmField().set(b);
    return this;
  }

  default Boolean coverAgreementExpense()
  {
    return coverAgreementExpenseField().get();
  }

  default Agreement coverAgreementExpense( final Boolean b )
  {
    coverAgreementExpenseField().set(b);
    return this;
  }

  default Boolean coverAgreementProduct()
  {
    return coverAgreementProductField().get();
  }

  default Agreement coverAgreementProduct( final Boolean b )
  {
    coverAgreementProductField().set(b);
    return this;
  }

  default Boolean coverAgreementTime()
  {
    return coverAgreementTimeField().get();
  }

  default Agreement coverAgreementTime( final Boolean b )
  {
    coverAgreementTimeField().set(b);
    return this;
  }

  default Boolean coverSalesTax()
  {
    return coverSalesTaxField().get();
  }

  default Agreement coverSalesTax( final Boolean b )
  {
    coverSalesTaxField().set(b);
    return this;
  }

  default Boolean expireWhenZero()
  {
    return expireWhenZeroField().get();
  }

  default Agreement expireWhenZero( final Boolean b )
  {
    expireWhenZeroField().set(b);
    return this;
  }

  default Boolean noEndingDate()
  {
    return noEndingDateField().get();
  }

  default Agreement noEndingDate( final Boolean b )
  {
    noEndingDateField().set(b);
    return this;
  }

  default Boolean oneTime()
  {
    return oneTimeField().get();
  }

  default Agreement oneTime( final Boolean b )
  {
    oneTimeField().set(b);
    return this;
  }

  default Boolean restrictDepartment()
  {
    return restrictDepartmentField().get();
  }

  default Agreement restrictDepartment( final Boolean b )
  {
    restrictDepartmentField().set(b);
    return this;
  }

  default Boolean restrictDownPayment()
  {
    return restrictDownPaymentField().get();
  }

  default Agreement restrictDownPayment( final Boolean b )
  {
    restrictDownPaymentField().set(b);
    return this;
  }

  default Boolean restrictLocation()
  {
    return restrictLocationField().get();
  }

  default Agreement restrictLocation( final Boolean b )
  {
    restrictLocationField().set(b);
    return this;
  }

  default Boolean topComment()
  {
    return topCommentField().get();
  }

  default Agreement topComment( final Boolean b )
  {
    topCommentField().set(b);
    return this;
  }

  default Boolean boardDefault()
  {
    return boardDefaultField().get();
  }

  default Agreement boardDefault( final Boolean b )
  {
    boardDefaultField().set(b);
    return this;
  }

  /*

  INHERITED DEFAULTS

   */

  @Override
  Agreement agreementName( final String s );

  @Override
  default Agreement boardId( final Integer i )
  {
    boardIdField().set(i);
    return this;
  }

  @Override
  default Agreement companyId( final Integer i )
  {
    companyIdField().set(i);
    return this;
  }

  @Override
  default Agreement contactId( final Integer i )
  {
    contactIdField().set(i);
    return this;
  }

  @Override
  default Agreement departmentId( final Integer i )
  {
    departmentIdField().set(i);
    return this;
  }

  @Override
  default Agreement endDate( final Date d )
  {
    endDateField().set(d);
    return this;
  }

  @Override
  default Agreement id( final Integer i )
  {
    idField().set(i);
    return this;
  }

  @Override
  default Agreement lastUpdate( final Date d )
  {
    lastUpdateField().set(d);
    return this;
  }

  @Override
  default Agreement locationId( final Integer i )
  {
    locationIdField().set(i);
    return this;
  }

  @Override
  default Agreement serviceTypeId( final Integer i )
  {
    serviceTypeIdField().set(i);
    return this;
  }

  @Override
  default Agreement startDate( final Date d )
  {
    startDateField().set(d);
    return this;
  }

  @Override Agreement taxable( final Boolean b );

  @Override
  default Agreement updatedBy( final String s )
  {
    updatedByField().set(s);
    return this;
  }

  @Override
  default Agreement workRoleId( final Integer i )
  {
    workRoleIdField().set(i);
    return this;
  }

  @Override
  default Agreement workTypeId( final Integer i )
  {
    workTypeIdField().set(i);
    return this;
  }
}
