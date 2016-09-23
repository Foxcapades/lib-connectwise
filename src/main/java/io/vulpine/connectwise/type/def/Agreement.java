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
  default Agreement id( Integer id )
  {
    idField().set(id);

    return this;
  }

  default Agreement companyId( final Integer i )
  {
    companyIdField().set(i);

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

  String applicationCycle();

  Field < String > applicationCycleField();

  default Agreement applicationCycle( final String s )
  {
    applicationCycleField().set(s);

    return this;
  }

  Double applicationLimit();

  Field < Double > applicationLimitField();

  default Agreement applicationLimit( final Double d )
  {
    applicationLimitField().set(d);

    return this;
  }

  String applicationUnits();

  Field < String > applicationUnitsField();

  default Agreement applicationUnits( final String s )
  {
    applicationUnitsField().set(s);

    return this;
  }

  Double billAmount();

  Field < Double > billAmountField();

  default Agreement billAmount( final Double d )
  {
    billAmountField().set(d);

    return this;
  }

  Integer billCycleId();

  Field < Integer > billCycleIdField();

  default Agreement billCycleId( final Integer i )
  {
    billCycleIdField().set(i);

    return this;
  }

  String billExpenses();

  Field < String > billExpensesField();

  default Agreement billExpenses( final String s )
  {
    billExpensesField().set(s);

    return this;
  }

  String billProducts();

  Field < String > billProductsField();

  default Agreement billProducts( final String s )
  {
    billProductsField().set(s);

    return this;
  }

  Date billStartDate();

  Field < Date > billStartDateField();

  default Agreement billStartDate( final Date d )
  {
    billStartDateField().set(d);

    return this;
  }

  Integer billTermsId();

  Field < Integer > billTermsIdField();

  default Agreement billTermsId( final Integer i )
  {
    billTermsIdField().set(i);

    return this;
  }

  String billTime();

  Field < String > billTimeField();

  default Agreement billTime( final String s )
  {
    billTimeField().set(s);

    return this;
  }

  Integer billToAddressId();

  Field < Integer > billToAddressIdField();

  default Agreement billToAddressId( final Integer i )
  {
    billToAddressIdField().set(i);

    return this;
  }

  Integer billToCompanyId();

  Field < Integer > billToCompanyIdField();

  default Agreement billToCompanyId( final Integer i )
  {
    billToCompanyIdField().set(i);

    return this;
  }

  Double compHourlyRate();

  Field < Double > compHourlyRateField();

  default Agreement compHourlyRate( final Double d )
  {
    compHourlyRateField().set(d);

    return this;
  }

  Double compLimitAmount();

  Field < Double > compLimitAmountField();

  default Agreement compLimitAmount( final Double d )
  {
    compLimitAmountField().set(d);

    return this;
  }

  Integer contactId();

  Field < Integer > contactIdField();

  default Agreement contactId( final Integer i )
  {
    contactIdField().set(i);

    return this;
  }

  String customerPo();

  Field < String > customerPoField();

  default Agreement customerPo( final String s )
  {
    customerPoField().set(s);

    return this;
  }

  Date dateCancelled();

  Field < Date > dateCancelledField();

  default Agreement dateCancelled( final Date d )
  {
    dateCancelledField().set(d);

    return this;
  }

  Integer departmentId();

  Field < Integer > departmentIdField();

  default Agreement departmentId( final Integer i )
  {
    departmentIdField().set(i);

    return this;
  }

  String employeeCompNotExceed();

  Field < String > employeeCompNotExceedField();

  default Agreement employeeCompNotExceed( final String s )
  {
    employeeCompNotExceedField().set(s);

    return this;
  }

  String employeeCompRate();

  Field < String > employeeCompRateField();

  default Agreement employeeCompRate( final String s )
  {
    employeeCompRateField().set(s);

    return this;
  }

  Integer expiredDays();

  Field < Integer > expiredDaysField();

  default Agreement expiredDays( final Integer d )
  {
    expiredDaysField().set(d);

    return this;
  }

  String internalNotes();

  Field < String > internalNotesField();

  default Agreement internalNotes( final String s )
  {
    internalNotesField().set(s);

    return this;
  }

  String invoiceDescription();

  Field < String > invoiceDescriptionField();

  default Agreement invoiceDescription( final String s )
  {
    invoiceDescriptionField().set(s);

    return this;
  }

  Integer invoiceTemplateId();

  Field < Integer > invoiceTemplateIdField();

  default Agreement invoiceTemplateId( final Integer i )
  {
    invoiceTemplateIdField().set(i);

    return this;
  }

  String invoicingCycle();

  Field < String > invoicingCycleField();

  default Agreement invoicingCycle( final String s )
  {
    invoicingCycleField().set(s);

    return this;
  }

  Integer limit();

  Field < Integer > limitField();

  default Agreement limit( final Integer l )
  {
    limitField().set(l);

    return this;
  }

  Integer opportunityId();

  Field < Integer > opportunityIdField();

  default Agreement opportunityId( final Integer i )
  {
    opportunityIdField().set(i);

    return this;
  }

  Integer parentAgreementId();

  Field < Integer > parentAgreementIdField();

  default Agreement parentAgreementId( final Integer i )
  {
    parentAgreementIdField().set(i);

    return this;
  }

  String periodType();

  Field < String > periodTypeField();

  default Agreement periodType( final String s )
  {
    periodTypeField().set(s);

    return this;
  }

  Integer projectTypeId();

  Field < Integer > projectTypeIdField();

  default Agreement projectTypeId( final Integer i )
  {
    projectTypeIdField().set(i);

    return this;
  }

  Double prorateFirstBill();

  Field < Double > prorateFirstBillField();

  default Agreement prorateFirstBill( final Double d )
  {
    prorateFirstBillField().set(d);

    return this;
  }

  String reasonCancelled();

  Field < String > reasonCancelledField();

  default Agreement reasonCancelled( final String s )
  {
    reasonCancelledField().set(s);

    return this;
  }

  Integer slaId();

  Field < Integer > slaIdField();

  default Agreement slaId( final Integer i )
  {
    slaIdField().set(i);

    return this;
  }

  Integer subContractCompanyId();

  Field < Integer > subContractCompanyIdField();

  default Agreement subContractCompanyId( final Integer i )
  {
    subContractCompanyIdField().set(i);

    return this;
  }

  Integer subContractContactId();

  Field < Integer > subContractContactIdField();

  default Agreement subContractContactId( final Integer i )
  {
    subContractContactIdField().set(i);

    return this;
  }

  Integer taxCodeId();

  Field < Integer > taxCodeIdField();

  default Agreement taxCodeId( final Integer i )
  {
    taxCodeIdField().set(i);

    return this;
  }

  String workOrder();

  Field < String > workOrderField();

  default Agreement workOrder( final String s )
  {
    workOrderField().set(s);

    return this;
  }

  Integer workRoleId();

  Field < Integer > workRoleIdField();

  default Agreement workRoleId( final Integer i )
  {
    workRoleIdField().set(i);

    return this;
  }

  Integer workTypeId();

  Field < Integer > workTypeIdField();

  default Agreement workTypeId( final Integer i )
  {
    workTypeIdField().set(i);

    return this;
  }

  Boolean allowOverruns();

  Field < Boolean > allowOverrunsField();

  default Agreement allowOverruns( final Boolean b )
  {
    allowOverrunsField().set(b);

    return this;
  }

  Boolean applicationUnlimited();

  Field < Boolean > applicationUnlimitedField();

  default Agreement applicationUnlimited( final Boolean b )
  {
    applicationUnlimitedField().set(b);

    return this;
  }

  Boolean billOneTime();

  Field < Boolean > billOneTimeField();

  default Agreement billOneTime( final Boolean b )
  {
    billOneTimeField().set(b);

    return this;
  }

  Boolean billableExpenseInvoice();

  Field < Boolean > billableExpenseInvoiceField();

  default Agreement billableExpenseInvoice( final Boolean b )
  {
    billableExpenseInvoiceField().set(b);

    return this;
  }

  Boolean billableProductInvoice();

  Field < Boolean > billableProductInvoiceField();

  default Agreement billableProductInvoice( final Boolean b )
  {
    billableProductInvoiceField().set(b);

    return this;
  }

  Boolean billableTimeInvoice();

  Field < Boolean > billableTimeInvoiceField();

  default Agreement billableTimeInvoice( final Boolean b )
  {
    billableTimeInvoiceField().set(b);

    return this;
  }

  Boolean bottomComment();

  Field < Boolean > bottomCommentField();

  default Agreement bottomComment( final Boolean b )
  {
    bottomCommentField().set(b);

    return this;
  }

  Boolean cancelled();

  Field < Boolean > cancelledField();

  default Agreement cancelled( final Boolean b )
  {
    cancelledField().set(b);

    return this;
  }

  Boolean carryOverUnused();

  Field < Boolean > carryOverUnusedField();

  default Agreement carryOverUnused( final Boolean b )
  {
    carryOverUnusedField().set(b);

    return this;
  }

  Boolean chargeToFirm();

  Field < Boolean > chargeToFirmField();

  default Agreement chargeToFirm( final Boolean b )
  {
    chargeToFirmField().set(b);

    return this;
  }

  Boolean coverAgreementExpense();

  Field < Boolean > coverAgreementExpenseField();

  default Agreement coverAgreementExpense( final Boolean b )
  {
    coverAgreementExpenseField().set(b);

    return this;
  }

  Boolean coverAgreementProduct();

  Field < Boolean > coverAgreementProductField();

  default Agreement coverAgreementProduct( final Boolean b )
  {
    coverAgreementProductField().set(b);

    return this;
  }

  Boolean coverAgreementTime();

  Field < Boolean > coverAgreementTimeField();

  default Agreement coverAgreementTime( final Boolean b )
  {
    coverAgreementTimeField().set(b);

    return this;
  }

  Boolean coverSalesTax();

  Field < Boolean > coverSalesTaxField();

  default Agreement coverSalesTax( final Boolean b )
  {
    coverSalesTaxField().set(b);

    return this;
  }

  Boolean expireWhenZero();

  Field < Boolean > expireWhenZeroField();

  default Agreement expireWhenZero( final Boolean b )
  {
    expireWhenZeroField().set(b);

    return this;
  }

  Boolean noEndingDate();

  Field < Boolean > noEndingDateField();

  default Agreement noEndingDate( final Boolean b )
  {
    noEndingDateField().set(b);

    return this;
  }

  Boolean oneTime();

  Field < Boolean > oneTimeField();

  default Agreement oneTime( final Boolean b )
  {
    oneTimeField().set(b);

    return this;
  }

  Boolean restrictDepartment();

  Field < Boolean > restrictDepartmentField();

  default Agreement restrictDepartment( final Boolean b )
  {
    restrictDepartmentField().set(b);

    return this;
  }

  Boolean restrictDownPayment();

  Field < Boolean > restrictDownPaymentField();

  default Agreement restrictDownPayment( final Boolean b )
  {
    restrictDownPaymentField().set(b);

    return this;
  }

  Boolean restrictLocation();

  Field < Boolean > restrictLocationField();

  default Agreement restrictLocation( final Boolean b )
  {
    restrictLocationField().set(b);

    return this;
  }

  Boolean taxable();

  Field < Boolean > taxableField();

  default Agreement taxable( final Boolean b )
  {
    taxableField().set(b);

    return this;
  }

  Boolean topComment();

  Field < Boolean > topCommentField();

  default Agreement topComment( final Boolean b )
  {
    topCommentField().set(b);

    return this;
  }

  Integer boardId();

  Field < Integer > boardIdField();

  default Agreement boardId( final Integer i )
  {
    boardIdField().set(i);

    return this;
  }

  Boolean boardDefault();

  Field < Boolean > boardDefaultField();

  default Agreement boardDefault( final Boolean b )
  {
    boardDefaultField().set(b);

    return this;
  }

  Integer serviceTypeId();

  Field < Integer > serviceTypeIdField();

  default Agreement serviceTypeId( final Integer i )
  {
    serviceTypeIdField().set(i);

    return this;
  }
}
