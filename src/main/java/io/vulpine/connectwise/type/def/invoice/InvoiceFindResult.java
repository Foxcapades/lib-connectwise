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
package io.vulpine.connectwise.type.def.invoice;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.vulpine.connectwise.type.def.gen.*;

import java.util.Date;

public interface InvoiceFindResult
extends
  HasId,
  HasAgreementName,
  HasAgreementType,
  HasInvoiceType,
  HasBusinessUnit,
  HasLocation,
  HasCompanyName,
  HasTicketNumber,
  HasTicketSummary,
  HasStatus,
  HasProjectName,
  HasPhaseName,
  HasTerritory,
  HasInvoiceAmount,
  HasContactId,
  HasCompanyId,
  HasAgreementId,
  HasUpdatedBy,
  HasDueDate,
  HasInvoiceDate,
  HasLastUpdated,
  HasGlPosted,
  HasBillingDelivery,
  HasInvoiceNumber,
  HasProjectId,
  HasRoutedMemberIdentifier,
  HasRoutedMemberName
{

  @JsonGetter( "BillingTypeIdentifier" )
  String billingTypeIdentifier();

  @JsonSetter( "BillingTypeIdentifier" )
  InvoiceFindResult billingTypeIdentifier( final String s );

  @JsonGetter( "Closed" )
  Boolean closed();

  @JsonSetter( "Closed" )
  InvoiceFindResult closed( final Boolean b );

  @JsonGetter( "Email" )
  Boolean email();

  @JsonSetter( "Email" )
  InvoiceFindResult email( final Boolean b );

  @JsonGetter( "GlBatchIdentifier" )
  String glBatchIdentifier();

  @JsonSetter( "GlBatchIdentifier" )
  InvoiceFindResult glBatchIdentifier( final String s );

  @JsonGetter( "StatusId" )
  Integer statusId();

  @JsonSetter( "StatusId" )
  InvoiceFindResult statusId( final Integer i );

  @JsonGetter( "PaidAmount" )
  Double paidAmount();

  @JsonSetter( "PaidAmount" )
  InvoiceFindResult paidAmount( final Double d );

  @JsonGetter( "PaidDate" )
  Date paidDate();

  @JsonSetter( "PaidDate" )
  InvoiceFindResult paidDate( final Date d );
}
