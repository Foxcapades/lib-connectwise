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
 *
 */

package io.vulpine.connectwise.api;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import io.vulpine.connectwise.api.agreement.AgreementApi_AddOrUpdate;
import io.vulpine.connectwise.api.agreement.AgreementApi_Delete;
import io.vulpine.connectwise.api.agreement.AgreementApi_Find;
import io.vulpine.connectwise.api.agreement.AgreementApi_Get;
import io.vulpine.connectwise.api.common.ConnectwiseSubApi;
import io.vulpine.connectwise.api.def.SubApiInterface;
import io.vulpine.connectwise.api.common.Credentials;
import io.vulpine.connectwise.api.common.request.CwRequest;

import java.io.IOException;

public class AgreementApi extends ConnectwiseSubApi implements SubApiInterface
{
  /**
   * "Add or Update" Endpoints Container
   * <p>
   * Instantiated On Demand
   */
  private AgreementApi_AddOrUpdate addOrUpdate = null;

  /**
   * "Delete" Endpoints Container
   * <p>
   * Instantiated On Demand
   */
  private AgreementApi_Delete delete = null;

  /**
   * "Find" Endpoints Container
   * <p>
   * Instantiated On Demand
   */
  private AgreementApi_Find find = null;

  /**
   * "Get" Endpoints Container
   * <p>
   * Instantiated On Demand
   */
  private AgreementApi_Get get = null;

  public AgreementApi(
    final ConnectwiseApi connectwiseApi,
    final Credentials credentials,
    final XmlMapper xmlMapper,
    final String endpoint
  )
  {
    super(connectwiseApi, credentials, xmlMapper, endpoint + "AgreementApi.asmx");
  }

  public AgreementApi_AddOrUpdate addOrUpdate()
  {
    if (null == addOrUpdate) {
      addOrUpdate = new AgreementApi_AddOrUpdate(credentials, xmlMapper, this);
    }

    return addOrUpdate;
  }

  public AgreementApi_Delete delete()
  {
    if (null == delete) {
      delete = new AgreementApi_Delete(credentials, xmlMapper, this);
    }

    return delete;
  }

  public AgreementApi_Find find()
  {
    if (null == find) {
      find = new AgreementApi_Find(credentials, xmlMapper, this);
    }

    return find;
  }

  public AgreementApi_Get get()
  {
    if (null == get) {
      get = new AgreementApi_Get(credentials, xmlMapper, this);
    }

    return get;
  }

  @Override
  public String send( final CwRequest r ) throws IOException
  {
    return super.send(r).replaceAll("Overrruns", "Overruns");
  }
}
