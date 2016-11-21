package io.vulpine.connectwise.type.def.agreement;

import io.vulpine.connectwise.type.def.XmlSerializable;
import io.vulpine.connectwise.type.def.gen.*;

import java.util.Date;

public interface Agreement
  extends
  HasId,
  HasParentAgreementId,
  HasAgreementTypeId,
  HasAgreementName,
  HasCompanyId,
  HasContactId,
  HasLocationId,
  HasDepartmentId,
  HasStartDate,
  HasEndDate,
  HasInternalNotes,
  HasTaxable,
  HasWorkRoleId,
  HasWorkTypeId,
  HasLastUpdate,
  HasTopComment,
  HasUpdatedBy,
  XmlSerializable
{

  String customerPo();

  Agreement customerPo( String s );

  Boolean restrictLocation();

  Agreement restrictLocation( Boolean b );

  Boolean restrictDepartment();

  Agreement restrictDepartment( Boolean b );

  Boolean noEndingDate();

  Agreement noEndingDate( Boolean b );

  Integer opportunityId();

  Agreement opportunityId( Integer i );

  Boolean cancelled();

  Agreement cancelled( Boolean b );

  Date dateCancelled();

  Agreement dateCancelled( Date d );

  String reasonCancelled();

  Agreement reasonCancelled( String s );

  Integer slaId();

  Agreement slaId( Integer i );

  Integer subContractCompanyId();

  Agreement subContractCompanyId( Integer i );

  Integer subContractContactId();

  Agreement subContractContactId( Integer i );

  String workOrder();

  Agreement workOrder( String s );

  String applicationUnits();

  Agreement applicationUnits( String s );

  Double applicationLimit();

  Agreement applicationLimit( Double d );

  String applicationCycle();

  Agreement applicationCycle( String s );

  String periodType();

  Agreement periodType( String s );

  Boolean applicationUnlimited();

  Agreement applicationUnlimited( Boolean b );

  Boolean oneTime();

  Agreement oneTime( Boolean b );

  Boolean coverAgreementTime();

  Agreement coverAgreementTime( Boolean b );

  Boolean coverAgreementProduct();

  Agreement coverAgreementProduct( Boolean b );

  Boolean coverAgreementExpense();

  Agreement coverAgreementExpense( Boolean b );

  Boolean coverSalesTax();

  Agreement coverSalesTax( Boolean b );

  Boolean carryOverUnused();

  Agreement carryOverUnused( Boolean b );

  Boolean allowOverruns();

  Agreement allowOverruns( Boolean b );

  Integer expiredDays();

  Agreement expiredDays( Integer d );

  Integer limit();

  Agreement limit( Integer l );

  Boolean expireWhenZero();

  Agreement expireWhenZero( Boolean b );

  Boolean chargeToFirm();

  Agreement chargeToFirm( Boolean b );

  String employeeCompRate();

  Agreement employeeCompRate( String s );

  String employeeCompNotExceed();

  Agreement employeeCompNotExceed( String s );

  Double compHourlyRate();

  Agreement compHourlyRate( Double d );

  Double compLimitAmount();

  Agreement compLimitAmount( Double d );

  Integer billCycleId();

  Agreement billCycleId( Integer i );

  Boolean billOneTime();

  Agreement billOneTime( Boolean b );

  Integer billTermsId();

  Agreement billTermsId( Integer i );

  String invoicingCycle();

  Agreement invoicingCycle( String s );

  Integer billToCompanyId();

  Agreement billToCompanyId( Integer i );

  Integer billToAddressId();

  Agreement billToAddressId( Integer i );

  Double billAmount();

  Agreement billAmount( Double d );

  Double prorateFirstBill();

  Agreement prorateFirstBill( Double d );

  Date billStartDate();

  Agreement billStartDate( Date d );

  Integer taxCodeId();

  Agreement taxCodeId( Integer i );

  Boolean restrictDownPayment();

  Agreement restrictDownPayment( Boolean b );

  String invoiceDescription();

  Agreement invoiceDescription( String s );

  Boolean bottomComment();

  Agreement bottomComment( Boolean b );

  Integer projectTypeId();

  Agreement projectTypeId( Integer i );

  Integer invoiceTemplateId();

  Agreement invoiceTemplateId( Integer i );

  String billTime();

  Agreement billTime( String s );

  String billExpenses();

  Agreement billExpenses( String s );

  String billProducts();

  Agreement billProducts( String s );

  Boolean billableTimeInvoice();

  Agreement billableTimeInvoice( Boolean b );

  Boolean billableExpenseInvoice();

  Agreement billableExpenseInvoice( Boolean b );

  Boolean billableProductInvoice();

  Agreement billableProductInvoice( Boolean b );
}
