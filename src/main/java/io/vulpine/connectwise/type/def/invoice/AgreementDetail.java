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
import io.vulpine.connectwise.type.def.gen.HasAgreementName;
import io.vulpine.connectwise.type.def.gen.HasAgreementType;

public interface AgreementDetail extends HasAgreementName, HasAgreementType
{
  @JsonGetter( "Hours" )
  Double hours();

  @JsonSetter( "Hours" )
  AgreementDetail hours( final Double d );

  @JsonGetter( "TimeAmount" )
  Double timeAmount();

  @JsonSetter( "TimeAmount" )
  AgreementDetail timeAmount( final Double d );

  @JsonGetter( "ExpenseAmount" )
  Double expenseAmount();

  @JsonSetter( "ExpenseAmount" )
  AgreementDetail expenseAmount( final Double d );

  @JsonGetter( "ProductAmount" )
  Double productAmount();

  @JsonSetter( "ProductAmount" )
  AgreementDetail productAmount( final Double d );

  @JsonGetter( "SalesTaxAmount" )
  Double salesTaxAmount();

  @JsonSetter( "SalesTaxAmount" )
  AgreementDetail salesTaxAmount( final Double d );

  @JsonGetter( "FixedFeeAmount" )
  Double fixedFeeAmount();

  @JsonSetter( "FixedFeeAmount" )
  AgreementDetail fixedFeeAmount( final Double d );

  @JsonGetter( "DetailType" )
  String detailType();

  @JsonSetter( "DetailType" )
  AgreementDetail detailType( final String s );

  @JsonGetter( "BillingAmount" )
  Double billingAmount();

  @JsonSetter( "BillingAmount" )
  AgreementDetail billingAmount( final String s );
}
