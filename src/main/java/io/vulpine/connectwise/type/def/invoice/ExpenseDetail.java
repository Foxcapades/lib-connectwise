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

import io.vulpine.connectwise.type.def.gen.*;

public interface ExpenseDetail
extends
  HasBillable,
  HasDate,
  HasAgreementAmount,
  HasAgreementName,
  HasAgreementType,
  HasBusinessUnit,
  HasChargeTo,
  HasLocation,
  HasNotes,
  HasProjectName,
  HasProjectNumber,
  HasPhaseName,
  HasTicketNumber,
  HasTicketSummary,
  HasInvoicedAmount,
  HasMemberName,
  HasMemberIdentifier
{
  Boolean reimbursable();

  ExpenseDetail reimbursable( final Boolean b );

  Double actualAmount();

  ExpenseDetail actualAmount( final Double d );

  Double odometerStart();

  ExpenseDetail odometerStart( final Double d );

  Double odometerEnd();

  ExpenseDetail odometerEnd( final Double d );

  String expenseClass();

  ExpenseDetail expenseClass( final String s );

  String expenseType();

  ExpenseDetail expenseType( final String s );

  String paymentMethod();

  ExpenseDetail paymentMethod( final String s );
}
