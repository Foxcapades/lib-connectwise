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
import io.vulpine.connectwise.api.product.*;
import io.vulpine.connectwise.api.common.Credentials;

public class ProductApi extends ConnectwiseSubApi
{
  /**
   * "Add" Endpoints Container
   * <p>
   * Instantiated On Demand
   */
  private ProductApi_Add add = null;

  /**
   * "Delete" Endpoints Container
   * <p>
   * Instantiated On Demand
   */
  private ProductApi_Delete delete = null;

  /**
   * "Add or Update" Endpoints Container
   * <p>
   * Instantiated On Demand
   */
  private ProductApi_AddOrUpdate addOrUpdate = null;

  /**
   * "Update" Endpoints Container
   * <p>
   * Instantiated On Demand
   */
  private ProductApi_Update update = null;

  /**
   * "Set" Endpoints Container
   * <p>
   * Instantiated On Demand
   */
  private ProductApi_Set set = null;

  /**
   * "Remove" Endpoints Container
   * <p>
   * Instantiated On Demand
   */
  private ProductApi_Remove remove = null;

  /**
   * "Load" Endpoints Container
   * <p>
   * Instantiated On Demand
   */
  private ProductApi_Load load = null;

  /**
   * "Get" Endpoints Container
   * <p>
   * Instantiated On Demand
   */
  private ProductApi_Get get = null;

  /**
   * "Find" Endpoints Container
   * <p>
   * Instantiated On Demand
   */
  private ProductApi_Find find = null;

  public ProductApi(
    final ConnectwiseApi connectwiseApi,
    final Credentials credentials,
    final XmlMapper xmlMapper,
    final String endpoint
  )
  {
    super(connectwiseApi, credentials, xmlMapper, endpoint + "ProductApi.asmx");
  }

  public ProductApi_Add add()
  {
    if (null == add)
      add = new ProductApi_Add(credentials, xmlMapper, this);

    return add;
  }

  public ProductApi_AddOrUpdate addOrUpdate()
  {
    if (null == addOrUpdate)
      addOrUpdate = new ProductApi_AddOrUpdate(credentials, xmlMapper, this);

    return addOrUpdate;
  }

  public ProductApi_Delete delete()
  {
    if (null == delete)
      delete = new ProductApi_Delete(credentials, xmlMapper, this);

    return delete;
  }

  public ProductApi_Find find()
  {
    if (null == find)
      find = new ProductApi_Find(credentials, xmlMapper, this);

    return find;
  }

  public ProductApi_Get get()
  {
    if (null == get)
      get = new ProductApi_Get(credentials, xmlMapper, this);

    return get;
  }

  public ProductApi_Load load()
  {
    if (null == load)
      load = new ProductApi_Load(credentials, xmlMapper, this);

    return load;
  }

  public ProductApi_Remove remove()
  {
    if (null == remove)
      remove = new ProductApi_Remove(credentials, xmlMapper, this);

    return remove;
  }

  public ProductApi_Set set()
  {
    if (null == set)
      set = new ProductApi_Set(credentials, xmlMapper, this);

    return set;
  }

  public ProductApi_Update update()
  {
    if (null == update)
      update = new ProductApi_Update(credentials, xmlMapper, this);

    return update;
  }
}
