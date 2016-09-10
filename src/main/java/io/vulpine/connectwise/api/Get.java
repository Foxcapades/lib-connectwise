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

import io.vulpine.connectwise.api.endpoints.agreement.GetAddition;
import io.vulpine.connectwise.api.endpoints.agreement.GetAdjustment;
import io.vulpine.connectwise.api.endpoints.agreement.GetAgreement;
import io.vulpine.connectwise.api.endpoints.agreement.GetBoardDefault;
import io.vulpine.connectwise.api.endpoints.company.GetCompany;
import io.vulpine.connectwise.api.def.SubApiInterface;
import io.vulpine.connectwise.api.endpoints.configuration.GetConfiguration;
import io.vulpine.connectwise.api.endpoints.configuration.GetConfigurationType;
import io.vulpine.connectwise.api.endpoints.contact.GetContact;
import io.vulpine.connectwise.api.endpoints.contact.GetContactNote;
import io.vulpine.connectwise.api.endpoints.product.GetProduct;
import io.vulpine.connectwise.api.endpoints.time.GetTimeEntry;

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

  GetAdjustment adjustment( int id );

  /**
   * Instantiate a new Get Agreement request.
   *
   * @param id Agreement ID
   *
   * @return new request to alter or submit.
   */
  GetAgreement agreement( int id );

  GetBoardDefault boardDefault( int id );

  /**
   * Instantiate a new Get Connectwise Company request.
   *
   * @param id Company ID
   *
   * @return new request to alter or submit.
   */
  GetCompany company( int id );

  /**
   * Instantiate a new Get Configuration request.
   *
   * @param id Configuration ID
   *
   * @return new request to alter or submit.
   */
  GetConfiguration configuration( int id );

  /**
   * Instantiate a new Get Configuration Type request.
   *
   * @param id Configuration Type ID
   *
   * @return new request to alter or submit.
   */
  GetConfigurationType configurationType( int id );

  /**
   * Instantiate a new Get Contact request.
   *
   * @param id Contact ID
   *
   * @return new request to alter or submit.
   */
  GetContact contact( int id );

  /**
   * Instantiate a new Get Contact Note request.
   *
   * @param id Contact Note ID
   *
   * @return new request to alter or submit.
   */
  GetContactNote contactNote( int id );

  /**
   * Instantiate a new Get Product request.
   *
   * @param id Product ID
   *
   * @return new request to alter or submit.
   */
  GetProduct product( int id );

  /**
   * Instantiate a new Get Time Entry request.
   *
   * @param id Time Entry ID
   *
   * @return new request to alter or submit.
   */
  GetTimeEntry timeEntry( int id );
}
