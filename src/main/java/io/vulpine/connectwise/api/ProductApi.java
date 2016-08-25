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
import io.vulpine.connectwise.api.request.Credentials;

public class ProductApi extends ConnectwiseSubApi
{
  /**
   * "Add" Endpoints Container
   * <p>
   * Instantiated On Demand
   */
  private Add add = null;

  /**
   * "Delete" Endpoints Container
   * <p>
   * Instantiated On Demand
   */
  private Delete delete = null;

  /**
   * "Add or Update" Endpoints Container
   * <p>
   * Instantiated On Demand
   */
  private AddOrUpdate addOrUpdate = null;

  /**
   * "Update" Endpoints Container
   * <p>
   * Instantiated On Demand
   */
  private Update update = null;

  /**
   * "Set" Endpoints Container
   * <p>
   * Instantiated On Demand
   */
  private Set set = null;

  /**
   * "Remove" Endpoints Container
   * <p>
   * Instantiated On Demand
   */
  private Remove remove = null;

  /**
   * "Load" Endpoints Container
   * <p>
   * Instantiated On Demand
   */
  private Load load = null;

  /**
   * "Get" Endpoints Container
   * <p>
   * Instantiated On Demand
   */
  private Get get = null;

  /**
   * "Find" Endpoints Container
   * <p>
   * Instantiated On Demand
   */
  private Find find = null;

  public ProductApi(
    final ConnectwiseApi connectwiseApi,
    final Credentials credentials,
    final XmlMapper xmlMapper,
    final String endpoint
  )
  {
    super(connectwiseApi, credentials, xmlMapper, endpoint + "ProductApi.asmx");
  }

  public Add add()
  {
    if (null == add)
      add = new Add(credentials, xmlMapper, this);

    return add;
  }

  public AddOrUpdate addOrUpdate()
  {
    if (null == addOrUpdate)
      addOrUpdate = new AddOrUpdate(credentials, xmlMapper, this);

    return addOrUpdate;
  }

  public Delete delete()
  {
    if (null == delete)
      delete = new Delete(credentials, xmlMapper, this);

    return delete;
  }

  public Find find()
  {
    if (null == find)
      find = new Find(credentials, xmlMapper, this);

    return find;
  }

  public Get get()
  {
    if (null == get)
      get = new Get(credentials, xmlMapper, this);

    return get;
  }

  public Load load()
  {
    if (null == load)
      load = new Load(credentials, xmlMapper, this);

    return load;
  }

  public Remove remove()
  {
    if (null == remove)
      remove = new Remove(credentials, xmlMapper, this);

    return remove;
  }

  public Set set()
  {
    if (null == set)
      set = new Set(credentials, xmlMapper, this);

    return set;
  }

  public Update update()
  {
    if (null == update)
      update = new Update(credentials, xmlMapper, this);

    return update;
  }
}
