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

import io.vulpine.connectwise.api.endpoints.agreement.get.GetAddition;
import io.vulpine.connectwise.api.endpoints.agreement.get.GetAgreement;
import io.vulpine.connectwise.api.endpoints.company.get.GetCompany;
import io.vulpine.connectwise.api.def.SubApiInterface;
import io.vulpine.connectwise.api.endpoints.product.get.GetProduct;

public interface Get extends SubApiInterface
{

  /**
   * Instantiate a new Get Agreement Addition request.
   *
   * @param id Addition ID
   *
   * @return new request to alter or submit.
   */
  GetAddition addition( int id );

  /**
   * Instantiate a new Get Agreement request.
   *
   * @param id Agreement ID
   *
   * @return new request to alter or submit.
   */
  GetAgreement agreement( int id );

  /**
   * Instantiate a new Get Connectwise Company request.
   *
   * @param id Company ID
   *
   * @return new request to alter or submit.
   */
  GetCompany company( int id );

  /**
   * Instantiate a new Get Product request.
   *
   * @param id Product ID
   *
   * @return new request to alter or submit.
   */
  GetProduct product( int id );
}
