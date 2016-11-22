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

import io.vulpine.connectwise.type.def.agreement.gen.*;
import io.vulpine.connectwise.type.def.gen.*;

public interface AgreementFindResult
  extends
  HasAgreementName,
  HasAgreementTypeId,
  HasAllowOverruns,
  HasApplicationLimit,
  HasApplicationUnlimited,
  HasBillableExpenseInvoice,
  HasBillableProductInvoice,
  HasBillableTimeInvoice,
  HasBillStartDate,
  HasBoardId,
  HasBottomComment < Boolean >,
  HasCancelled,
  HasCarryOverUnused,
  HasChargeToFirm,
  HasCompanyId,
  HasContactId,
  HasCoverAgreementExpense,
  HasCoverAgreementProduct,
  HasCoverAgreementTime,
  HasCoverSalesTax,
  HasCustomerPo,
  HasDateCancelled,
  HasDepartmentId,
  HasEndDate,
  HasExpiredDays,
  HasId,
  HasInternalNotes,
  HasLastUpdate,
  HasLimit,
  HasLocationId,
  HasNoEndingDate,
  HasOneTimeFlag,
  HasOpportunityId,
  HasParentAgreementId,
  HasReasonCancelled,
  HasRestrictDepartment,
  HasRestrictLocation,
  HasSlaId,
  HasStartDate,
  HasSubContractCompanyId,
  HasSubContractContactId,
  HasTaxable,
  HasTaxCodeId,
  HasTopComment < Boolean >,
  HasUpdatedBy,
  HasWorkOrder,
  HasWorkRoleId,
  HasWorkTypeId,

  HasCompHourlyRate,
  HasBillOneTime,
  HasBillCycleId,
  HasBillTermsId,
  HasBillToAddressId,
  HasBillAmount,
  HasRestrictDownPayment,
{
  Double compHourlyRate();

  AgreementFindResult compHourlyRate( final Double d );

  Double compHourlyAmount();

  AgreementFindResult compHourlyAmount( final Double d );

  Integer billCycleId();

  AgreementFindResult billCycleId( final Integer i );

  Boolean billOneTime();

  AgreementFindResult billOneTime( final Boolean b );

  Integer billTermsId();

  AgreementFindResult billTermsId( final Integer i );

  Integer billToCompanyId();

  AgreementFindResult billToCompanyId( final Integer i );

  Integer billToAddressId();

  AgreementFindResult billToAddressId( final Integer i );

  Double billAmount();

  AgreementFindResult billAmount( final Double d );

  Double prorateFirstBill();

  AgreementFindResult prorateFirstBill( final Double d );

  Boolean restrictDownPayment();

  AgreementFindResult restrictDownPayment( final Boolean b );

  String invoiceDescription();

  AgreementFindResult invoiceDescription( final String s );

  Integer projectTypeId();

  AgreementFindResult projectTypeId( final Integer i );

  Integer invoiceTemplateId();

  AgreementFindResult invoiceTemplateId( final Integer i );

  Boolean boardDefault();

  AgreementFindResult boardDefault( final Boolean b );

  Integer serviceTypeId();

  AgreementFindResult serviceTypeId( final Integer i );
}
