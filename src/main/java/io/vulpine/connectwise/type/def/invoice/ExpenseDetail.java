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

import io.vulpine.connectwise.type.def.XmlSerializable;
import io.vulpine.connectwise.type.def.gen.*;
import io.vulpine.connectwise.util.Field;

import java.util.Date;

public interface ExpenseDetail
extends
  HasAgreementName,
  HasAgreementType,
  HasAgreementAmount,
  HasBillable,
  HasBusinessUnit,
  HasChargeTo,
  HasDate,
  HasInvoiceAmount,
  HasLocation,
  HasPhaseName,
  HasProjectName,
  HasProjectNumber,
  HasTicketNumber,
  HasTicketSummary,
  XmlSerializable
{

  default ExpenseDetail reimbursable( final Boolean v )
  {
    reimbursableField().set(v);

    return this;
  }

  Field < Boolean > reimbursableField();

  default Boolean reimbursable()
  {
    return reimbursableField().get();
  }

default ExpenseDetail actualAmount( final Double v )
  {
    actualAmountField().set(v);

    return this;
  }

  Field < Double > actualAmountField();

  default Double actualAmount()
  {
    return actualAmountField().get();
  }

  default ExpenseDetail odometerStart( final Double v )
  {
    odometerStartField().set(v);

    return this;
  }

  Field < Double > odometerStartField();

  default Double odometerStart()
  {
    return odometerStartField().get();
  }

  default ExpenseDetail odometerEnd( final Double v )
  {
    odometerEndField().set(v);

    return this;
  }

  Field < Double > odometerEndField();

  default Double odometerEnd()
  {
    return odometerEndField().get();
  }

  default ExpenseDetail expenseClass( final String v )
  {
    expenseClassField().set(v);

    return this;
  }

  Field < String > expenseClassField();

  default String expenseClass()
  {
    return expenseClassField().get();
  }

  default ExpenseDetail expenseType( final String v )
  {
    expenseTypeField().set(v);

    return this;
  }

  Field < String > expenseTypeField();

  default String expenseType()
  {
    return expenseTypeField().get();
  }

  default ExpenseDetail memberIdentifier( final String v )
  {
    memberIdentifierField().set(v);

    return this;
  }

  Field < String > memberIdentifierField();

  default String memberIdentifier()
  {
    return memberIdentifierField().get();
  }

  default ExpenseDetail memberName( final String v )
  {
    memberNameField().set(v);

    return this;
  }

  Field < String > memberNameField();

  default String memberName()
  {
    return memberNameField().get();
  }

  default ExpenseDetail note( final String v )
  {
    noteField().set(v);

    return this;
  }

  Field < String > noteField();

  default String note()
  {
    return noteField().get();
  }

  default ExpenseDetail paymentMethod( final String v )
  {
    paymentMethodField().set(v);

    return this;
  }

  Field < String > paymentMethodField();

  default String paymentMethod()
  {
    return paymentMethodField().get();
  }

  /*
  |*| INHERITED DEFAULTS
   */

  @Override ExpenseDetail agreementAmount( final Double v );
  @Override ExpenseDetail billable( final Boolean v );
  @Override ExpenseDetail businessUnit( final String s );
  @Override ExpenseDetail chargeTo( final String s );
  @Override ExpenseDetail date( final Date v );
  @Override ExpenseDetail invoiceAmount( final Double v );
  @Override ExpenseDetail location( final String s );
  @Override ExpenseDetail phaseName( final String s );
  @Override ExpenseDetail projectName( final String s );
  @Override ExpenseDetail projectNumber( final Integer i );
  @Override ExpenseDetail ticketNumber( final Integer i );
  @Override ExpenseDetail ticketSummary( final String s );
}
