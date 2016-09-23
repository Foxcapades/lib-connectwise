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

import io.vulpine.connectwise.type.def.agreement.HasLocationId;
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
  HasId < Agreement >,
  HasLastUpdate < Agreement >,
  HasUpdatedBy < Agreement >,
  HasLocationId < Agreement >
{
  String agreementName();

  Field < String > agreementNameField();

  Agreement agreementName( String s );

  Integer agreementTypeId();

  Field < Integer > agreementTypeIdField();

  Agreement agreementTypeId( Integer i );

  String applicationCycle();

  Field < String > applicationCycleField();

  Agreement applicationCycle( String s );

  Double applicationLimit();

  Field < Double > applicationLimitField();

  Agreement applicationLimit( Double d );

  String applicationUnits();

  Field < String > applicationUnitsField();

  Agreement applicationUnits( String s );

  Double billAmount();

  Field < Double > billAmountField();

  Agreement billAmount( Double d );

  Integer billCycleId();

  Field < Integer > billCycleIdField();

  Agreement billCycleId( Integer i );

  String billExpenses();

  Field < String > billExpensesField();

  Agreement billExpenses( String s );

  String billProducts();

  Field < String > billProductsField();

  Agreement billProducts( String s );

  Date billStartDate();

  Field < Date > billStartDateField();

  Agreement billStartDate( Date d );

  Integer billTermsId();

  Field < Integer > billTermsIdField();

  Agreement billTermsId( Integer i );

  String billTime();

  Field < String > billTimeField();

  Agreement billTime( String s );

  Integer billToAddressId();

  Field < Integer > billToAddressIdField();

  Agreement billToAddressId( Integer i );

  Integer billToCompanyId();

  Field < Integer > billToCompanyIdField();

  Agreement billToCompanyId( Integer i );

  Double compHourlyRate();

  Field < Double > compHourlyRateField();

  Agreement compHourlyRate( Double d );

  Double compLimitAmount();

  Field < Double > compLimitAmountField();

  Agreement compLimitAmount( Double d );

  Integer companyId();

  Field < Integer > companyIdField();

  Agreement companyId( Integer i );

  Integer contactId();

  Field < Integer > contactIdField();

  Agreement contactId( Integer i );

  String customerPo();

  Field < String > customerPoField();

  Agreement customerPo( String s );

  Date dateCancelled();

  Field < Date > dateCancelledField();

  Agreement dateCancelled( Date d );

  Integer departmentId();

  Field < Integer > departmentIdField();

  Agreement departmentId( Integer i );

  String employeeCompNotExceed();

  Field < String > employeeCompNotExceedField();

  Agreement employeeCompNotExceed( String s );

  String employeeCompRate();

  Field < String > employeeCompRateField();

  Agreement employeeCompRate( String s );

  Date endDate();

  Field < Date > endDateField();

  Agreement endDate( Date d );

  Integer expiredDays();

  Field < Integer > expiredDaysField();

  Agreement expiredDays( Integer d );

  String internalNotes();

  Field < String > internalNotesField();

  Agreement internalNotes( String s );

  String invoiceDescription();

  Field < String > invoiceDescriptionField();

  Agreement invoiceDescription( String s );

  Integer invoiceTemplateId();

  Field < Integer > invoiceTemplateIdField();

  Agreement invoiceTemplateId( Integer i );

  String invoicingCycle();

  Field < String > invoicingCycleField();

  Agreement invoicingCycle( String s );

  Integer limit();

  Field < Integer > limitField();

  Agreement limit( Integer l );

  Integer opportunityId();

  Field < Integer > opportunityIdField();

  Agreement opportunityId( Integer i );

  Integer parentAgreementId();

  Field < Integer > parentAgreementIdField();

  Agreement parentAgreementId( Integer i );

  String periodType();

  Field < String > periodTypeField();

  Agreement periodType( String s );

  Integer projectTypeId();

  Field < Integer > projectTypeIdField();

  Agreement projectTypeId( Integer i );

  Double prorateFirstBill();

  Field < Double > prorateFirstBillField();

  Agreement prorateFirstBill( Double d );

  String reasonCancelled();

  Field < String > reasonCancelledField();

  Agreement reasonCancelled( String s );

  Integer slaId();

  Field < Integer > slaIdField();

  Agreement slaId( Integer i );

  Date startDate();

  Field < Date > startDateField();

  Agreement startDate( Date d );

  Integer subContractCompanyId();

  Field < Integer > subContractCompanyIdField();

  Agreement subContractCompanyId( Integer i );

  Integer subContractContactId();

  Field < Integer > subContractContactIdField();

  Agreement subContractContactId( Integer i );

  Integer taxCodeId();

  Field < Integer > taxCodeIdField();

  Agreement taxCodeId( Integer i );

  String workOrder();

  Field < String > workOrderField();

  Agreement workOrder( String s );

  Integer workRoleId();

  Field < Integer > workRoleIdField();

  Agreement workRoleId( Integer i );

  Integer workTypeId();

  Field < Integer > workTypeIdField();

  Agreement workTypeId( Integer i );

  Boolean allowOverruns();

  Field < Boolean > allowOverrunsField();

  Agreement allowOverruns( Boolean b );

  Boolean applicationUnlimited();

  Field < Boolean > applicationUnlimitedField();

  Agreement applicationUnlimited( Boolean b );

  Boolean billOneTime();

  Field < Boolean > billOneTimeField();

  Agreement billOneTime( Boolean b );

  Boolean billableExpenseInvoice();

  Field < Boolean > billableExpenseInvoiceField();

  Agreement billableExpenseInvoice( Boolean b );

  Boolean billableProductInvoice();

  Field < Boolean > billableProductInvoiceField();

  Agreement billableProductInvoice( Boolean b );

  Boolean billableTimeInvoice();

  Field < Boolean > billableTimeInvoiceField();

  Agreement billableTimeInvoice( Boolean b );

  Boolean bottomComment();

  Field < Boolean > bottomCommentField();

  Agreement bottomComment( Boolean b );

  Boolean cancelled();

  Field < Boolean > cancelledField();

  Agreement cancelled( Boolean b );

  Boolean carryOverUnused();

  Field < Boolean > carryOverUnusedField();

  Agreement carryOverUnused( Boolean b );

  Boolean chargeToFirm();

  Field < Boolean > chargeToFirmField();

  Agreement chargeToFirm( Boolean b );

  Boolean coverAgreementExpense();

  Field < Boolean > coverAgreementExpenseField();

  Agreement coverAgreementExpense( Boolean b );

  Boolean coverAgreementProduct();

  Field < Boolean > coverAgreementProductField();

  Agreement coverAgreementProduct( Boolean b );

  Boolean coverAgreementTime();

  Field < Boolean > coverAgreementTimeField();

  Agreement coverAgreementTime( Boolean b );

  Boolean coverSalesTax();

  Field < Boolean > coverSalesTaxField();

  Agreement coverSalesTax( Boolean b );

  Boolean expireWhenZero();

  Field < Boolean > expireWhenZeroField();

  Agreement expireWhenZero( Boolean b );

  Boolean noEndingDate();

  Field < Boolean > noEndingDateField();

  Agreement noEndingDate( Boolean b );

  Boolean oneTime();

  Field < Boolean > oneTimeField();

  Agreement oneTime( Boolean b );

  Boolean restrictDepartment();

  Field < Boolean > restrictDepartmentField();

  Agreement restrictDepartment( Boolean b );

  Boolean restrictDownPayment();

  Field < Boolean > restrictDownPaymentField();

  Agreement restrictDownPayment( Boolean b );

  Boolean restrictLocation();

  Field < Boolean > restrictLocationField();

  Agreement restrictLocation( Boolean b );

  Boolean taxable();

  Field < Boolean > taxableField();

  Agreement taxable( Boolean b );

  Boolean topComment();

  Field < Boolean > topCommentField();

  Agreement topComment( Boolean b );

  Integer boardId();

  Field < Integer > boardIdField();

  Agreement boardId( Integer i );

  Boolean boardDefault();

  Field < Boolean > boardDefaultField();

  Field < Boolean > boardDefaultField();

  Agreement boardDefault( Boolean b );

  Integer serviceTypeId();

  Field < Integer > serviceTypeIdField();

  Agreement serviceTypeId( Integer i );
}
