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

import java.util.Date;

public interface AgreementFindResult extends
  XmlSerializable,
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
  HasBoardId,
  HasUpdatedBy,
  HasLastUpdate,
  HasTopComment
{
  String customerPo();

  AgreementFindResult customerPo( final String s );

  Boolean restrictLocation();

  AgreementFindResult restrictLocation( final Boolean b );

  Boolean restrictDepartment();

  AgreementFindResult restrictDepartment( final Boolean b );

  Boolean noEndingDate();

  AgreementFindResult noEndingDate( final Boolean b );

  Integer opportunityId();

  AgreementFindResult opportunityId( final Integer i );

  Boolean cancelled();

  AgreementFindResult cancelled( final Boolean b );

  Date dateCancelled();

  AgreementFindResult dateCancelled( final Date d );

  String reasonCancelled();

  AgreementFindResult reasonCancelled( final String s );

  Integer slaId();

  AgreementFindResult slaId( final Integer i );

  Integer subContractCompanyId();

  AgreementFindResult subContractCompanyId( final Integer i );

  Integer subContractContactId();

  AgreementFindResult subContractContactId( final Integer i );

  String workOrder();

  AgreementFindResult workOrder( final String s );

  Double applicationLimit();

  AgreementFindResult applicationLimit( final Double d );

  Boolean applicationUnlimited();

  AgreementFindResult applicationUnlimited( final Boolean b );

  Boolean oneTime();

  AgreementFindResult oneTime( final Boolean b );

  Boolean coverAgreementTime();

  AgreementFindResult coverAgreementTime( final Boolean b );

  Boolean coverAgreementProduct();

  AgreementFindResult coverAgreementProduct( final Boolean b );

  Boolean coverAgreementExpense();

  AgreementFindResult coverAgreementExpense( final Boolean b );

  Boolean coverSalesTax();

  AgreementFindResult coverSalesTax( final Boolean b );

  Boolean carryOverUnused();

  AgreementFindResult carryOverUnused( final Boolean b );

  Boolean allowOverruns();

  AgreementFindResult allowOverruns( final Boolean b );

  Integer expiredDays();

  AgreementFindResult expiredDays( final Integer i );

  Integer limit();

  AgreementFindResult limit( final Integer i );

  Boolean chargeToFirm();

  AgreementFindResult chargeToFirm( final Boolean b );

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

  Date billStartDate();

  AgreementFindResult billStartDate( final Date d );

  Integer taxCodeId();

  AgreementFindResult taxCodeId( final Integer i );

  Boolean restrictDownPayment();

  AgreementFindResult restrictDownPayment( final Boolean b );

  String invoiceDescription();

  AgreementFindResult invoiceDescription( final String s );

  Boolean bottomComment();

  AgreementFindResult bottomComment( final Boolean b );

  Integer projectTypeId();

  AgreementFindResult projectTypeId( final Integer i );

  Integer invoiceTemplateId();

  AgreementFindResult invoiceTemplateId( final Integer i );

  Boolean billableTimeInvoice();

  AgreementFindResult billableTimeInvoice( final Boolean b );

  Boolean billableExpenseInvoice();

  AgreementFindResult billableExpenseInvoice( final Boolean b );

  Boolean billableProductInvoice();

  AgreementFindResult billableProductInvoice( final Boolean b );

  Boolean boardDefault();

  AgreementFindResult boardDefault( final Boolean b );

  Integer serviceTypeId();

  AgreementFindResult serviceTypeId( final Integer i );
}
