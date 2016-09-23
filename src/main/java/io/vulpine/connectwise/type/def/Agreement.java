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
package io.vulpine.connectwise.type.def;

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
  XmlSerializable,
  HasCompanyId < Agreement >,
  HasEndDate < Agreement >,
  HasId < Agreement >,
  HasLastUpdate < Agreement >,
  HasLocationId < Agreement >,
  HasStartDate < Agreement >,
  HasUpdatedBy < Agreement >
{
  /*

  INHERITED DEFAULTS

   */
  @Override
  default Agreement id( Integer id )
  {
    idField().set(id);

    return this;
  }

  @Override
  default Agreement companyId( final Integer i )
  {
    companyIdField().set(i);

    return this;
  }

  @Override
  default Agreement updatedBy( final String s )
  {
    updatedByField().set(s);

    return this;
  }

  @Override
  default Agreement startDate( final Date d )
  {
    startDateField().set(d);

    return this;
  }

  @Override
  default Agreement endDate( final Date d )
  {
    endDateField().set(d);

    return this;
  }

  @Override
  default Agreement locationId( final Integer i )
  {
    locationIdField().set(i);

    return this;
  }

  @Override
  default Agreement lastUpdate( final Date d )
  {
    lastUpdateField().set(d);

    return this;
  }

  default String agreementName()
  {
    return agreementNameField().get();
  }

  Field < String > agreementNameField();

  default Agreement agreementName( String s )
  {
    agreementNameField().set(s);

    return this;
  }

  default Integer agreementTypeId()
  {
    return agreementTypeIdField().get();
  }

  Field < Integer > agreementTypeIdField();

  default Agreement agreementTypeId( final Integer i )
  {
    agreementTypeIdField().set(i);

    return this;
  }

  default String applicationCycle()
  {
    return applicationCycleField().get();
  }

  Field < String > applicationCycleField();

  default Agreement applicationCycle( final String s )
  {
    applicationCycleField().set(s);

    return this;
  }

  default Double applicationLimit()
  {
    return applicationLimitField().get();
  }

  Field < Double > applicationLimitField();

  default Agreement applicationLimit( final Double d )
  {
    applicationLimitField().set(d);

    return this;
  }

  default String applicationUnits()
  {
    return applicationUnitsField().get();
  }

  Field < String > applicationUnitsField();

  default Agreement applicationUnits( final String s )
  {
    applicationUnitsField().set(s);

    return this;
  }

  default Double billAmount()
  {
    return billAmountField().get();
  }

  Field < Double > billAmountField();

  default Agreement billAmount( final Double d )
  {
    billAmountField().set(d);

    return this;
  }

  default Integer billCycleId()
  {
    return billCycleIdField().get();
  }

  Field < Integer > billCycleIdField();

  default Agreement billCycleId( final Integer i )
  {
    billCycleIdField().set(i);

    return this;
  }

  default String billExpenses()
  {
    return billExpensesField().get();
  }

  Field < String > billExpensesField();

  default Agreement billExpenses( final String s )
  {
    billExpensesField().set(s);

    return this;
  }

  default String billProducts()
  {
    return billProductsField().get();
  }

  Field < String > billProductsField();

  default Agreement billProducts( final String s )
  {
    billProductsField().set(s);

    return this;
  }

  default Date billStartDate()
  {
    return billStartDateField().get();
  }

  Field < Date > billStartDateField();

  default Agreement billStartDate( final Date d )
  {
    billStartDateField().set(d);

    return this;
  }

  default Integer billTermsId()
  {
    return billTermsIdField().get();
  }

  Field < Integer > billTermsIdField();

  default Agreement billTermsId( final Integer i )
  {
    billTermsIdField().set(i);

    return this;
  }

  default String billTime()
  {
    return billTimeField().get();
  }

  Field < String > billTimeField();

  default Agreement billTime( final String s )
  {
    billTimeField().set(s);

    return this;
  }

  default Integer billToAddressId()
  {
    return billToAddressIdField().get();
  }

  Field < Integer > billToAddressIdField();

  default Agreement billToAddressId( final Integer i )
  {
    billToAddressIdField().set(i);

    return this;
  }

  default Integer billToCompanyId()
  {
    return billToCompanyIdField().get();
  }

  Field < Integer > billToCompanyIdField();

  default Agreement billToCompanyId( final Integer i )
  {
    billToCompanyIdField().set(i);

    return this;
  }

  default Double compHourlyRate()
  {
    return compHourlyRateField().get();
  }

  Field < Double > compHourlyRateField();

  default Agreement compHourlyRate( final Double d )
  {
    compHourlyRateField().set(d);

    return this;
  }

  default Double compLimitAmount()
  {
    return compLimitAmountField().get();
  }

  Field < Double > compLimitAmountField();

  default Agreement compLimitAmount( final Double d )
  {
    compLimitAmountField().set(d);

    return this;
  }

  default Integer contactId()
  {
    return contactIdField().get();
  }

  Field < Integer > contactIdField();

  default Agreement contactId( final Integer i )
  {
    contactIdField().set(i);

    return this;
  }

  default String customerPo()
  {
    return customerPoField().get();
  }

  Field < String > customerPoField();

  default Agreement customerPo( final String s )
  {
    customerPoField().set(s);

    return this;
  }

  default Date dateCancelled()
  {
    return dateCancelledField().get();
  }

  Field < Date > dateCancelledField();

  default Agreement dateCancelled( final Date d )
  {
    dateCancelledField().set(d);

    return this;
  }

  default Integer departmentId()
  {
    return departmentIdField().get();
  }

  Field < Integer > departmentIdField();

  default Agreement departmentId( final Integer i )
  {
    departmentIdField().set(i);

    return this;
  }

  default String employeeCompNotExceed()
  {
    return employeeCompNotExceedField().get();
  }

  Field < String > employeeCompNotExceedField();

  default Agreement employeeCompNotExceed( final String s )
  {
    employeeCompNotExceedField().set(s);

    return this;
  }

  default String employeeCompRate()
  {
    return employeeCompRateField().get();
  }

  Field < String > employeeCompRateField();

  default Agreement employeeCompRate( final String s )
  {
    employeeCompRateField().set(s);

    return this;
  }

  default Integer expiredDays()
  {
    return expiredDaysField().get();
  }

  Field < Integer > expiredDaysField();

  default Agreement expiredDays( final Integer d )
  {
    expiredDaysField().set(d);

    return this;
  }

  default String internalNotes()
  {
    return internalNotesField().get();
  }

  Field < String > internalNotesField();

  default Agreement internalNotes( final String s )
  {
    internalNotesField().set(s);

    return this;
  }

  default String invoiceDescription()
  {
    return invoiceDescriptionField().get();
  }

  Field < String > invoiceDescriptionField();

  default Agreement invoiceDescription( final String s )
  {
    invoiceDescriptionField().set(s);

    return this;
  }

  default Integer invoiceTemplateId()
  {
    return invoiceTemplateIdField().get();
  }

  Field < Integer > invoiceTemplateIdField();

  default Agreement invoiceTemplateId( final Integer i )
  {
    invoiceTemplateIdField().set(i);

    return this;
  }

  default String invoicingCycle()
  {
    return invoicingCycleField().get();
  }

  Field < String > invoicingCycleField();

  default Agreement invoicingCycle( final String s )
  {
    invoicingCycleField().set(s);

    return this;
  }

  default Integer limit()
  {
    return limitField().get();
  }

  Field < Integer > limitField();

  default Agreement limit( final Integer l )
  {
    limitField().set(l);

    return this;
  }

  default Integer opportunityId()
  {
    return opportunityIdField().get();
  }

  Field < Integer > opportunityIdField();

  default Agreement opportunityId( final Integer i )
  {
    opportunityIdField().set(i);

    return this;
  }

  default Integer parentAgreementId()
  {
    return parentAgreementIdField().get();
  }

  Field < Integer > parentAgreementIdField();

  default Agreement parentAgreementId( final Integer i )
  {
    parentAgreementIdField().set(i);

    return this;
  }

  default String periodType()
  {
    return periodTypeField().get();
  }

  Field < String > periodTypeField();

  default Agreement periodType( final String s )
  {
    periodTypeField().set(s);

    return this;
  }

  default Integer projectTypeId()
  {
    return projectTypeIdField().get();
  }

  Field < Integer > projectTypeIdField();

  default Agreement projectTypeId( final Integer i )
  {
    projectTypeIdField().set(i);

    return this;
  }

  default Double prorateFirstBill()
  {
    return prorateFirstBillField().get();
  }

  Field < Double > prorateFirstBillField();

  default Agreement prorateFirstBill( final Double d )
  {
    prorateFirstBillField().set(d);

    return this;
  }

  default String reasonCancelled()
  {
    return reasonCancelledField().get();
  }

  Field < String > reasonCancelledField();

  default Agreement reasonCancelled( final String s )
  {
    reasonCancelledField().set(s);

    return this;
  }

  default Integer slaId()
  {
    return slaIdField().get();
  }

  Field < Integer > slaIdField();

  default Agreement slaId( final Integer i )
  {
    slaIdField().set(i);

    return this;
  }

  default Integer subContractCompanyId()
  {
    return subContractCompanyIdField().get();
  }

  Field < Integer > subContractCompanyIdField();

  default Agreement subContractCompanyId( final Integer i )
  {
    subContractCompanyIdField().set(i);

    return this;
  }

  default Integer subContractContactId()
  {
    return subContractContactIdField().get();
  }

  Field < Integer > subContractContactIdField();

  default Agreement subContractContactId( final Integer i )
  {
    subContractContactIdField().set(i);

    return this;
  }

  default Integer taxCodeId()
  {
    return taxCodeIdField().get();
  }

  Field < Integer > taxCodeIdField();

  default Agreement taxCodeId( final Integer i )
  {
    taxCodeIdField().set(i);

    return this;
  }

  default String workOrder()
  {
    return workOrderField().get();
  }

  Field < String > workOrderField();

  default Agreement workOrder( final String s )
  {
    workOrderField().set(s);

    return this;
  }

  default Integer workRoleId()
  {
    return workRoleIdField().get();
  }

  Field < Integer > workRoleIdField();

  default Agreement workRoleId( final Integer i )
  {
    workRoleIdField().set(i);

    return this;
  }

  default Integer workTypeId()
  {
    return workTypeIdField().get();
  }

  Field < Integer > workTypeIdField();

  default Agreement workTypeId( final Integer i )
  {
    workTypeIdField().set(i);

    return this;
  }

  default Boolean allowOverruns()
  {
    return allowOverrunsField().get();
  }

  Field < Boolean > allowOverrunsField();

  default Agreement allowOverruns( final Boolean b )
  {
    allowOverrunsField().set(b);

    return this;
  }

  default Boolean applicationUnlimited()
  {
    return applicationUnlimitedField().get();
  }

  Field < Boolean > applicationUnlimitedField();

  default Agreement applicationUnlimited( final Boolean b )
  {
    applicationUnlimitedField().set(b);

    return this;
  }

  default Boolean billOneTime()
  {
    return billOneTimeField().get();
  }

  Field < Boolean > billOneTimeField();

  default Agreement billOneTime( final Boolean b )
  {
    billOneTimeField().set(b);

    return this;
  }

  default Boolean billableExpenseInvoice()
  {
    return billableExpenseInvoiceField().get();
  }

  Field < Boolean > billableExpenseInvoiceField();

  default Agreement billableExpenseInvoice( final Boolean b )
  {
    billableExpenseInvoiceField().set(b);

    return this;
  }

  default Boolean billableProductInvoice()
  {
    return billableProductInvoiceField().get();
  }

  Field < Boolean > billableProductInvoiceField();

  default Agreement billableProductInvoice( final Boolean b )
  {
    billableProductInvoiceField().set(b);

    return this;
  }

  default Boolean billableTimeInvoice()
  {
    return billableTimeInvoiceField().get();
  }

  Field < Boolean > billableTimeInvoiceField();

  default Agreement billableTimeInvoice( final Boolean b )
  {
    billableTimeInvoiceField().set(b);

    return this;
  }

  default Boolean bottomComment()
  {
    return bottomCommentField().get();
  }

  Field < Boolean > bottomCommentField();

  default Agreement bottomComment( final Boolean b )
  {
    bottomCommentField().set(b);

    return this;
  }

  default Boolean cancelled()
  {
    return cancelledField().get();
  }

  Field < Boolean > cancelledField();

  default Agreement cancelled( final Boolean b )
  {
    cancelledField().set(b);

    return this;
  }

  default Boolean carryOverUnused()
  {
    return carryOverUnusedField().get();
  }

  Field < Boolean > carryOverUnusedField();

  default Agreement carryOverUnused( final Boolean b )
  {
    carryOverUnusedField().set(b);

    return this;
  }

  default Boolean chargeToFirm()
  {
    return chargeToFirmField().get();
  }

  Field < Boolean > chargeToFirmField();

  default Agreement chargeToFirm( final Boolean b )
  {
    chargeToFirmField().set(b);

    return this;
  }

  default Boolean coverAgreementExpense()
  {
    return coverAgreementExpenseField().get();
  }

  Field < Boolean > coverAgreementExpenseField();

  default Agreement coverAgreementExpense( final Boolean b )
  {
    coverAgreementExpenseField().set(b);

    return this;
  }

  default Boolean coverAgreementProduct()
  {
    return coverAgreementProductField().get();
  }

  Field < Boolean > coverAgreementProductField();

  default Agreement coverAgreementProduct( final Boolean b )
  {
    coverAgreementProductField().set(b);

    return this;
  }

  default Boolean coverAgreementTime()
  {
    return coverAgreementTimeField().get();
  }

  Field < Boolean > coverAgreementTimeField();

  default Agreement coverAgreementTime( final Boolean b )
  {
    coverAgreementTimeField().set(b);

    return this;
  }

  default Boolean coverSalesTax()
  {
    return coverSalesTaxField().get();
  }

  Field < Boolean > coverSalesTaxField();

  default Agreement coverSalesTax( final Boolean b )
  {
    coverSalesTaxField().set(b);

    return this;
  }

  default Boolean expireWhenZero()
  {
    return expireWhenZeroField().get();
  }

  Field < Boolean > expireWhenZeroField();

  default Agreement expireWhenZero( final Boolean b )
  {
    expireWhenZeroField().set(b);

    return this;
  }

  default Boolean noEndingDate()
  {
    return noEndingDateField().get();
  }

  Field < Boolean > noEndingDateField();

  default Agreement noEndingDate( final Boolean b )
  {
    noEndingDateField().set(b);

    return this;
  }

  default Boolean oneTime()
  {
    return oneTimeField().get();
  }

  Field < Boolean > oneTimeField();

  default Agreement oneTime( final Boolean b )
  {
    oneTimeField().set(b);

    return this;
  }

  default Boolean restrictDepartment()
  {
    return restrictDepartmentField().get();
  }

  Field < Boolean > restrictDepartmentField();

  default Agreement restrictDepartment( final Boolean b )
  {
    restrictDepartmentField().set(b);

    return this;
  }

  default Boolean restrictDownPayment()
  {
    return restrictDownPaymentField().get();
  }

  Field < Boolean > restrictDownPaymentField();

  default Agreement restrictDownPayment( final Boolean b )
  {
    restrictDownPaymentField().set(b);

    return this;
  }

  default Boolean restrictLocation()
  {
    return restrictLocationField().get();
  }

  Field < Boolean > restrictLocationField();

  default Agreement restrictLocation( final Boolean b )
  {
    restrictLocationField().set(b);

    return this;
  }

  default Boolean taxable()
  {
    return taxableField().get();
  }

  Field < Boolean > taxableField();

  default Agreement taxable( final Boolean b )
  {
    taxableField().set(b);

    return this;
  }

  default Boolean topComment()
  {
    return topCommentField().get();
  }

  Field < Boolean > topCommentField();

  default Agreement topComment( final Boolean b )
  {
    topCommentField().set(b);

    return this;
  }

  default Integer boardId()
  {
    return boardIdField().get();
  }

  Field < Integer > boardIdField();

  default Agreement boardId( final Integer i )
  {
    boardIdField().set(i);

    return this;
  }

  default Boolean boardDefault()
  {
    return boardDefaultField().get();
  }

  Field < Boolean > boardDefaultField();

  default Agreement boardDefault( final Boolean b )
  {
    boardDefaultField().set(b);

    return this;
  }

  default Integer serviceTypeId()
  {
    return serviceTypeIdField().get();
  }

  Field < Integer > serviceTypeIdField();

  default Agreement serviceTypeId( final Integer i )
  {
    serviceTypeIdField().set(i);

    return this;
  }
}
