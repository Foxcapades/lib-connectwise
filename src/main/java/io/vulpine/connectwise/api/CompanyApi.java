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
import io.vulpine.connectwise.api.common.ConnectwiseSubApi;
import io.vulpine.connectwise.api.company.*;
import io.vulpine.connectwise.api.common.Credentials;

public class CompanyApi extends ConnectwiseSubApi
{
  /**
   * "Add" Endpoints Container
   * <p>
   * Instantiated On Demand
   */
  private CompanyApi_Add add = null;

  /**
   * "Add or Update" Endpoints Container
   * <p>
   * Instantiated On Demand
   */
  private CompanyApi_AddOrUpdate addOrUpdate = null;

  /**
   * "Delete" Endpoints Container
   * <p>
   * Instantiated On Demand
   */
  private CompanyApi_Delete delete = null;

  /**
   * "Find" Endpoints Container
   * <p>
   * Instantiated On Demand
   */
  private CompanyApi_Find find = null;

  /**
   * "Get" Endpoints Container
   * <p>
   * Instantiated On Demand
   */
  private CompanyApi_Get get = null;

  /**
   * "Get All" Endpoints Container
   * <p>
   * Instantiated On Demand
   */
  private CompanyApi_GetAll getAll = null;

  /**
   * "Load" Endpoints Container
   * <p>
   * Instantiated On Demand
   */
  private CompanyApi_Load load = null;

  /**
   * "Set" Endpoints Container
   * <p>
   * Instantiated On Demand
   */
  private CompanyApi_Set set = null;

  /**
   * "Update" Endpoints Container
   * <p>
   * Instantiated On Demand
   */
  private CompanyApi_Update update = null;

  public CompanyApi(
    final ConnectwiseApi connectwiseApi,
    final Credentials credentials,
    final XmlMapper xmlMapper,
    final String endpoint
  )
  {
    super(connectwiseApi, credentials, xmlMapper, endpoint + "CompanyApi.asmx");
  }

  public CompanyApi_Add add()
  {
    if (null == add)
      add = new CompanyApi_Add(credentials, xmlMapper, this);

    return add;
  }

  public CompanyApi_AddOrUpdate addOrUpdate()
  {
    if (null == addOrUpdate)
      addOrUpdate = new CompanyApi_AddOrUpdate(credentials, xmlMapper, this);

    return addOrUpdate;
  }

  public CompanyApi_Delete delete()
  {
    if (null == delete)
      delete = new CompanyApi_Delete(credentials, xmlMapper, this);

    return delete;
  }

  public CompanyApi_Find find()
  {
    if (null == find)
      find = new CompanyApi_Find(credentials, xmlMapper, this);

    return find;
  }

  public CompanyApi_Get get()
  {
    if (null == get)
      get = new CompanyApi_Get(credentials, xmlMapper, this);

    return get;
  }

  public CompanyApi_GetAll getAll()
  {
    if (null == getAll)
      getAll = new CompanyApi_GetAll(credentials, xmlMapper, this);

    return getAll;
  }

  public CompanyApi_Load load()
  {
    if (null == load)
      load = new CompanyApi_Load(credentials, xmlMapper, this);

    return load;
  }

  public CompanyApi_Set set()
  {
    if (null == set)
      set = new CompanyApi_Set(credentials, xmlMapper, this);

    return set;
  }

  public CompanyApi_Update update()
  {
    if (null == update)
      update = new CompanyApi_Update(credentials, xmlMapper, this);

    return update;
  }
}
