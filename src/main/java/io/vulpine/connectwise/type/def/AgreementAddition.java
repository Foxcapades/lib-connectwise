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
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.vulpine.connectwise.type.agreement.BillCustomer;
import io.vulpine.connectwise.type.agreement.addition.Addition;
import io.vulpine.connectwise.type.agreement.addition.AdditionProduct;

import java.util.Date;

@JsonRootName( "AgreementAddition" )
public interface AgreementAddition
{
  @JsonGetter( "AdditionsProduct" )
  AdditionProduct additionProduct();

  @JsonSetter( "AdditionsProduct" )
  Addition additionProduct( AdditionProduct additionProduct );

  @JsonGetter( "BillCustomer" )
  BillCustomer billCustomer();

  @JsonSetter( "BillCustomer" )
  Addition billCustomer( BillCustomer billCustomer );

  @JsonGetter( "BilledQuantity" )
  Double billedQuantity();

  @JsonSetter( "BilledQuantity" )
  Addition billedQuantity( Double billedQuantity );

  @JsonGetter( "CancelledDate" )
  Date cancelledDate();

  @JsonSetter( "CancelledDate" )
  Addition cancelledDate( Date cancelledDate );

  @JsonGetter( "EffectiveDate" )
  Date effectiveDate();

  @JsonSetter( "EffectiveDate" )
  Addition effectiveDate( Date effectiveDate );

  @JsonGetter( "ExtCost" )
  Double extCost();

  @JsonSetter( "ExtCost" )
  Addition extCost( Double extCost );

  @JsonGetter( "ExtPrice" )
  Double extPrice();

  @JsonSetter( "ExtPrice" )
  Addition extPrice( Double extPrice );

  @JsonGetter( "InvoiceDescription" )
  String invoiceDescription();

  @JsonSetter( "InvoiceDescription" )
  Addition invoiceDescription( String invoiceDescription );

  @JsonGetter( "LessIncluded" )
  Double lessIncluded();

  @JsonSetter( "LessIncluded" )
  Addition lessIncluded( Double lessIncluded );

  @JsonGetter( "Margin" )
  Double margin();

  @JsonSetter( "Margin" )
  Addition margin( Double margin );

  @JsonGetter( "ProductId" )
  Integer productId();

  @JsonSetter( "ProductId" )
  Addition productId( Integer productId );

  @JsonGetter( "Quantity" )
  Double quantity();

  @JsonSetter( "Quantity" )
  Addition quantity( Double quantity );

  @JsonGetter( "SerialNumber" )
  String serialNumber();

  @JsonSetter( "SerialNumber" )
  Addition serialNumber( String serialNumber );

  @JsonGetter( "UnitCost" )
  Double unitCost();

  @JsonSetter( "UnitCost" )
  Addition unitCost( Double unitCost );

  @JsonGetter( "UnitPrice" )
  Double unitPrice();

  @JsonSetter( "UnitPrice" )
  Addition unitPrice( Double unitPrice );

  @JsonGetter( "UOM" )
  String uom();

  @JsonSetter( "UOM" )
  Addition uom( String uom );

  @JsonGetter( "PurchaseItemFlag" )
  Boolean purchaseItem();

  @JsonSetter( "PurchaseItemFlag" )
  Addition purchaseItem( Boolean purchaseItem );

  @JsonGetter( "SpecialOrderFlag" )
  Boolean specialOrder();

  @JsonSetter( "SpecialOrderFlag" )
  Addition specialOrder( Boolean specialOrder );

  @JsonGetter( "TaxableFlag" )
  Boolean taxable();

  @JsonSetter( "TaxableFlag" )
  Addition taxable( Boolean taxable );
}
