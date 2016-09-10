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

import io.vulpine.connectwise.api.endpoints.agreement.FindAdditions;
import io.vulpine.connectwise.api.endpoints.agreement.FindAgreements;
import io.vulpine.connectwise.api.endpoints.company.FindCompanies;
import io.vulpine.connectwise.api.endpoints.contact.FindContacts;
import io.vulpine.connectwise.api.def.SubApiInterface;
import io.vulpine.connectwise.api.endpoints.product.FindProducts;

public interface Find extends SubApiInterface
{
  FindAdditions additions();

  FindAgreements agreements();

  FindCompanies companies();

  FindContacts contacts();

  FindProducts products();
}
