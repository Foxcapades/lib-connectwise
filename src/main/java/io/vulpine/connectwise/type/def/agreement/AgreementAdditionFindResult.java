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

public interface AgreementAdditionFindResult
  extends
  XmlSerializable,
  HasId,
  HasAgreementId,
  HasProductId,
  HasQuantity,
  HasUnitPrice,
  HasUnitCost,
  HasEffectiveDate,
  HasCancelledDate,
  HasTaxable,
  HasDescription,
  HasUpdatedBy,
  HasLastUpdate
{
  Double lessIncluded();

  AgreementAdditionFindResult lessIncluded( final Double d );

  String serialNumber();

  AgreementAdditionFindResult serialNumber( final String s );

  String invoiceDescription();

  AgreementAdditionFindResult invoiceDescription( final String s );

  Double extPrice();

  AgreementAdditionFindResult extPrice( final Double d );

  Double extCost();

  AgreementAdditionFindResult extCost( final Double d );

  Double margin();

  AgreementAdditionFindResult margin( final Double d );

  Boolean purchaseItemFlag();

  AgreementAdditionFindResult purchaseItemFlag( final Boolean b );

  Boolean specialOrderFlag();

  AgreementAdditionFindResult specialOrderFlag( final Boolean b );

  Double billedQuantity();

  AgreementAdditionFindResult billedQuantity( final Double d );
}
