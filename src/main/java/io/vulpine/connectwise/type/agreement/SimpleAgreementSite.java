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
package io.vulpine.connectwise.type.agreement;

import io.vulpine.connectwise.type.ConnectwiseCommon;
import io.vulpine.connectwise.type.def.agreement.FieldAgreementSite;
import io.vulpine.connectwise.util.*;

class SimpleAgreementSite extends ConnectwiseCommon implements FieldAgreementSite
{
  private final NumberField < Integer > agreementId = new SimpleIntegerField("AgreementId");
  private final NumberField < Integer > companyId   = new SimpleIntegerField("CompanyId");
  private final NumberField < Integer > addressId   = new SimpleIntegerField("AddressId");


  @Override
  public NumberField < Integer > agreementIdField()
  {
    return agreementId;
  }

  @Override
  public NumberField < Integer > companyIdField()
  {
    return companyId;
  }

  @Override
  public NumberField < Integer > addressIdField()
  {
    return addressId;
  }
}
