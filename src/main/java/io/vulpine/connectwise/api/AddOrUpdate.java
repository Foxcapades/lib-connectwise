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
package io.vulpine.connectwise.api;

import io.vulpine.connectwise.api.endpoints.agreement.AddOrUpdateAgreement;
import io.vulpine.connectwise.api.endpoints.agreement.AddOrUpdateAddition;
import io.vulpine.connectwise.api.def.SubApiInterface;
import io.vulpine.connectwise.type.agreement.SimpleAgreement;
import io.vulpine.connectwise.type.agreement.SimpleAgreementAddition;

public interface AddOrUpdate extends SubApiInterface
{
  AddOrUpdateAddition addition();

  AddOrUpdateAddition addition( SimpleAgreementAddition addition );

  AddOrUpdateAgreement agreement();

  AddOrUpdateAgreement agreement( SimpleAgreement agreement );
}
