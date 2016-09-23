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

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.Date;

public interface Agreement //extends Identified < Agreement >
{
  @JsonGetter( "AgreementName" )
  String agreementName();

  @JsonSetter( "AgreementName" )
  Agreement agreementName( String agreementName );

  @JsonGetter( "AgreementTypeId" )
  Integer agreementTypeId();

  @JsonSetter( "AgreementTypeId" )
  Agreement agreementTypeId( Integer agreementTypeId );

  @JsonGetter( "ApplicationCycle" )
  String applicationCycle();

  @JsonSetter( "ApplicationCycle" )
  Agreement applicationCycle( String applicationCycle );

  @JsonGetter( "ApplicationLimit" )
  Double applicationLimit();

  @JsonSetter( "ApplicationLimit" )
  Agreement applicationLimit( Double applicationLimit );

  @JsonGetter( "ApplicationUnits" )
  String applicationUnits();

  @JsonSetter( "ApplicationUnits" )
  Agreement applicationUnits( String applicationUnits );

  @JsonGetter( "BillAmount" )
  Double billAmount();

  @JsonSetter( "BillAmount" )
  Agreement billAmount( Double billAmount );

  @JsonGetter( "BillCycleId" )
  Integer billCycleId();

  @JsonSetter( "BillCycleId" )
  Agreement billCycleId( Integer billCycleId );

  @JsonGetter( "BillExpenses" )
  String billExpenses();

  @JsonSetter( "BillExpenses" )
  Agreement billExpenses( String billExpenses );

  @JsonGetter( "BillProducts" )
  String billProducts();

  @JsonSetter( "BillProducts" )
  Agreement billProducts( String billProducts );

  @JsonGetter( "BillStartDate" )
  Date billStartDate();

  @JsonSetter( "BillStartDate" )
  Agreement billStartDate( Date billStartDate );

  @JsonGetter( "BillTermsId" )
  Integer billTermsId();

  @JsonSetter( "BillTermsId" )
  Agreement billTermsId( Integer billTermsId );

  @JsonGetter( "BillTime" )
  String billTime();

  @JsonSetter( "BillTime" )
  Agreement billTime( String billTime );

  @JsonGetter( "BillToAddressId" )
  Integer billToAddressId();

  @JsonSetter( "BillToAddressId" )
  Agreement billToAddressId( Integer billToAddressId );

  @JsonGetter( "BillToCompanyId" )
  Integer billToCompanyId();

  @JsonSetter( "BillToCompanyId" )
  Agreement billToCompanyId( Integer billToCompanyId );

  @JsonGetter( "CompHourlyRate" )
  Double compHourlyRate();

  @JsonSetter( "CompHourlyRate" )
  Agreement compHourlyRate( Double compHourlyRate );

  @JsonGetter( "CompLimitAmount" )
  Double compLimitAmount();

  @JsonSetter( "CompLimitAmount" )
  Agreement compLimitAmount( Double compLimitAmount );

  @JsonGetter( "CompanyId" )
  Integer companyId();

  @JsonSetter( "CompanyId" )
  Agreement companyId( Integer companyId );

  @JsonGetter( "ContactId" )
  Integer contactId();

  @JsonSetter( "ContactId" )
  Agreement contactId( Integer contactId );

  @JsonGetter( "CustomerPO" )
  String customerPo();

  @JsonSetter( "CustomerPO" )
  Agreement customerPo( String customerPo );

  @JsonGetter( "DateCancelled" )
  Date dateCancelled();

  @JsonSetter( "DateCancelled" )
  Agreement dateCancelled( Date dateCancelled );

  @JsonGetter( "DepartmentId" )
  Integer departmentId();

  @JsonSetter( "DepartmentId" )
  Agreement departmentId( Integer departmentId );

  @JsonGetter( "EmployeeCompNotExceed" )
  String employeeCompNotExceed();

  @JsonSetter( "EmployeeCompNotExceed" )
  Agreement employeeCompNotExceed( String employeeCompNotExceed );

  @JsonGetter( "EmployeeCompRate" )
  String employeeCompRate();

  @JsonSetter( "EmployeeCompRate" )
  Agreement employeeCompRate( String employeeCompRate );

  @JsonGetter( "EndDate" )
  Date endDate();

  @JsonSetter( "EndDate" )
  Agreement endDate( Date endDate );

  @JsonGetter( "ExpiredDays" )
  Integer expiredDays();

  @JsonSetter( "ExpiredDays" )
  Agreement expiredDays( Integer expiredDays );

  @JsonGetter( "InternalNotes" )
  String internalNotes();

  @JsonSetter( "InternalNotes" )
  Agreement internalNotes( String internalNotes );

  @JsonGetter( "InvoiceDescription" )
  String invoiceDescription();

  @JsonSetter( "InvoiceDescription" )
  Agreement invoiceDescription( String invoiceDescription );

  @JsonGetter( "InvoiceTemplateId" )
  Integer invoiceTemplateId();

  @JsonSetter( "InvoiceTemplateId" )
  Agreement invoiceTemplateId( Integer invoiceTemplateId );

  @JsonGetter( "InvoicingCycle" )
  String invoicingCycle();

  @JsonSetter( "InvoicingCycle" )
  Agreement invoicingCycle( String invoicingCycle );

  @JsonGetter( "Limit" )
  Integer limit();

  @JsonSetter( "Limit" )
  Agreement limit( Integer limit );

  @JsonGetter( "LocationId" )
  Integer locationId();

  @JsonSetter( "LocationId" )
  Agreement locationId( Integer locationId );

  @JsonGetter( "OpportunityId" )
  Integer opportunityId();

  @JsonSetter( "OpportunityId" )
  Agreement opportunityId( Integer opportunityId );

  @JsonGetter( value = "ParentAgreementId" )
  Integer parentAgreementId();

  @JsonGetter( value = "ParentAgreementId" )
  Agreement parentAgreementId( Integer parentAgreementId );

  @JsonGetter( "PeriodType" )
  String periodType();

  @JsonSetter( "PeriodType" )
  Agreement periodType( String periodType );

  @JsonGetter( "ProjectTypeId" )
  Integer projectTypeId();

  @JsonSetter( "ProjectTypeId" )
  Agreement projectTypeId( Integer projectTypeId );

  @JsonGetter( "ProrateFirstBill" )
  Double prorateFirstBill();

  @JsonSetter( "ProrateFirstBill" )
  Agreement prorateFirstBill( Double prorateFirstBill );

  @JsonGetter( "ReasonCancelled" )
  String reasonCancelled();

  @JsonSetter( "ReasonCancelled" )
  Agreement reasonCancelled( String reasonCancelled );

  @JsonGetter( "SlaId" )
  Integer slaId();

  @JsonSetter( "SlaId" )
  Agreement slaId( Integer slaId );

  @JsonGetter( "StartDate" )
  Date startDate();

  @JsonSetter( "StartDate" )
  Agreement startDate( Date startDate );

  @JsonGetter( "SubContractCompanyId" )
  Integer subContractCompanyId();

  @JsonSetter( "SubContractCompanyId" )
  Agreement subContractCompanyId( Integer subContractCompanyId );

  @JsonGetter( "SubContractContactId" )
  Integer subContractContactId();

  @JsonSetter( "SubContractContactId" )
  Agreement subContractContactId( Integer subContractContactId );

  @JsonGetter( "TaxCodeId" )
  Integer taxCodeId();

  @JsonSetter( "TaxCodeId" )
  Agreement taxCodeId( Integer taxCodeId );

  @JsonGetter( "WorkOrder" )
  String workOrder();

  @JsonSetter( "WorkOrder" )
  Agreement workOrder( String workOrder );

  @JsonGetter( "WorkRoleId" )
  Integer workRoleId();

  @JsonSetter( "WorkRoleId" )
  Agreement workRoleId( Integer workRoleId );

  @JsonGetter( "WorkTypeId" )
  Integer workTypeId();

  @JsonSetter( "WorkTypeId" )
  Agreement workTypeId( Integer workTypeId );

  @JsonGetter( "AllowOverruns" )
  Boolean allowOverruns();

  @JsonSetter( "AllowOverruns" )
  Agreement allowOverruns( Boolean allowOverruns );

  @JsonGetter( "ApplicationUnlimitedFlag" )
  Boolean applicationUnlimited();

  @JsonSetter( "ApplicationUnlimitedFlag" )
  Agreement applicationUnlimited( Boolean applicationUnlimited );

  @JsonGetter( "BillOneTimeFlag" )
  Boolean billOneTime();

  @JsonSetter( "BillOneTimeFlag" )
  Agreement billOneTime( Boolean billOneTime );

  @JsonGetter( "BillableExpenseInvoice" )
  Boolean billableExpenseInvoice();

  @JsonSetter( "BillableExpenseInvoice" )
  Agreement billableExpenseInvoice( Boolean billableExpenseInvoice );

  @JsonGetter( "BillableProductInvoice" )
  Boolean billableProductInvoice();

  @JsonSetter( "BillableProductInvoice" )
  Agreement billableProductInvoice( Boolean billableProductInvoice );

  @JsonGetter( "BillableTimeInvoice" )
  Boolean billableTimeInvoice();

  @JsonSetter( "BillableTimeInvoice" )
  Agreement billableTimeInvoice( Boolean billableTimeInvoice );

  @JsonGetter( "BottomComment" )
  Boolean bottomComment();

  @JsonSetter( "BottomComment" )
  Agreement bottomComment( Boolean bottomComment );

  @JsonGetter( "CancelledFlag" )
  Boolean cancelled();

  @JsonSetter( "CancelledFlag" )
  Agreement cancelled( Boolean cancelled );

  @JsonGetter( "CarryOverUnused" )
  Boolean carryOverUnused();

  @JsonSetter( "CarryOverUnused" )
  Agreement carryOverUnused( Boolean carryOverUnused );

  @JsonGetter( "ChargeToFirm" )
  Boolean chargeToFirm();

  @JsonSetter( "ChargeToFirm" )
  Agreement chargeToFirm( Boolean chargeToFirm );

  @JsonGetter( "CoverAgreementExpense" )
  Boolean coverAgreementExpense();

  @JsonSetter( "CoverAgreementExpense" )
  Agreement coverAgreementExpense( Boolean coverAgreementExpense );

  @JsonGetter( "CoverAgreementProduct" )
  Boolean coverAgreementProduct();

  @JsonSetter( "CoverAgreementProduct" )
  Agreement coverAgreementProduct( Boolean coverAgreementProduct );

  @JsonGetter( "CoverAgreementTime" )
  Boolean coverAgreementTime();

  @JsonSetter( "CoverAgreementTime" )
  Agreement coverAgreementTime( Boolean coverAgreementTime );

  @JsonGetter( "CoverSalesTax" )
  Boolean coverSalesTax();

  @JsonSetter( "CoverSalesTax" )
  Agreement coverSalesTax( Boolean coverSalesTax );

  @JsonGetter( "ExpireWhenZero" )
  Boolean expireWhenZero();

  @JsonSetter( "ExpireWhenZero" )
  Agreement expireWhenZero( Boolean expireWhenZero );

  @JsonGetter( "NoEndingDateFlag" )
  Boolean noEndingDate();

  @JsonSetter( "NoEndingDateFlag" )
  Agreement noEndingDate( Boolean noEndingDate );

  @JsonGetter( "OneTimeFlag" )
  Boolean oneTime();

  @JsonSetter( "OneTimeFlag" )
  Agreement oneTime( Boolean oneTime );

  @JsonGetter( "RestrictDepartmentFlag" )
  Boolean restrictDepartment();

  @JsonSetter( "RestrictDepartmentFlag" )
  Agreement restrictDepartment( Boolean restrictDepartment );

  @JsonGetter( "RestrictDownPayment" )
  Boolean restrictDownPayment();

  @JsonSetter( "RestrictDownPayment" )
  Agreement restrictDownPayment( Boolean restrictDownPayment );

  @JsonGetter( "RestrictLocationFlag" )
  Boolean restrictLocation();

  @JsonSetter( "RestrictLocationFlag" )
  Agreement restrictLocation( Boolean restrictLocation );

  @JsonGetter( "Taxable" )
  Boolean taxable();

  @JsonSetter( "Taxable" )
  Agreement taxable( Boolean taxable );

  @JsonGetter( "TopComment" )
  Boolean topComment();

  @JsonSetter( "TopComment" )
  Agreement topComment( Boolean topComment );
}
