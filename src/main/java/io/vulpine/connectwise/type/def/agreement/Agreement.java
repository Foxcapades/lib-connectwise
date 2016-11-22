package io.vulpine.connectwise.type.def.agreement;

import io.vulpine.connectwise.type.def.agreement.gen.*;
import io.vulpine.connectwise.type.def.gen.*;

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
  HasTopComment < Boolean >,
  HasBottomComment < Boolean >,
  HasUpdatedBy,
  HasBillableProductInvoice,
  HasBillableExpenseInvoice,
  HasBillableTimeInvoice,
  HasOpportunityId,
  HasTaxCodeId,
  HasChargeToFirm,
  HasCustomerPo,
  HasSlaId,
  HasSubContractContactId,
  HasWorkOrder,
  HasSubContractCompanyId,
  HasBillStartDate,
  HasRestrictLocation,
  HasRestrictDepartment,
  HasNoEndingDate,
  HasCancelled,
  HasDateCancelled,
  HasReasonCancelled,
  HasApplicationLimit,
  HasApplicationUnlimited,
  HasOneTimeFlag,
  HasCoverAgreementTime,
  HasCoverAgreementProduct,
  HasCoverAgreementExpense,
  HasCoverSalesTax,
  HasCarryOverUnused,
  HasAllowOverruns,
  HasExpiredDays,
  HasLimit

{
  String applicationUnits();

  Agreement applicationUnits( String s );

  String applicationCycle();

  Agreement applicationCycle( String s );

  String periodType();

  Agreement periodType( String s );

  Boolean expireWhenZero();

  Agreement expireWhenZero( Boolean b );

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

  Boolean restrictDownPayment();

  Agreement restrictDownPayment( Boolean b );

  String invoiceDescription();

  Agreement invoiceDescription( String s );

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
}
