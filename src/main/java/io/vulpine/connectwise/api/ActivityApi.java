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
import io.vulpine.connectwise.api.activity.*;
import io.vulpine.connectwise.api.common.ConnectwiseSubApi;
import io.vulpine.connectwise.api.common.Credentials;

public class ActivityApi extends ConnectwiseSubApi
{
  /**
   * API Container
   * <p>
   * Instantiated on demand.
   */
  private ActivityApi_Add add;

  /**
   * API Container
   * <p>
   * Instantiated on demand.
   */
  private ActivityApi_AddOrUpdate addOrUpdate;

  /**
   * API Container
   * <p>
   * Instantiated on demand.
   */
  private ActivityApi_Delete delete;

  /**
   * API Container
   * <p>
   * Instantiated on demand.
   */
  private ActivityApi_Find find;

  /**
   * API Container
   * <p>
   * Instantiated on demand.
   */
  private ActivityApi_Get get;

  /**
   * API Container
   * <p>
   * Instantiated on demand.
   */
  private ActivityApi_Load load;

  /**
   * API Container
   * <p>
   * Instantiated on demand.
   */
  private ActivityApi_Update update;

  public ActivityApi(
    final ConnectwiseApi api,
    final Credentials credentials,
    final XmlMapper xmlMapper,
    final String endpoint
  )
  {
    super(api, credentials, xmlMapper, endpoint + "ActivityApi.asmx");
  }

  /**
   * API Container
   * <p>
   * Instantiated on demand.
   *
   * @return "Add" options on the Activity API.
   */
  public ActivityApi_Add add()
  {
    if (null == add) {
      add = new ActivityApi_Add(credentials, xmlMapper, this);
    }
    return add;
  }

  /**
   * API Container
   * <p>
   * Instantiated on demand.
   *
   * @return "AddOrUpdate" options on the Activity API.
   */
  public ActivityApi_AddOrUpdate addOrUpdate()
  {
    if (null == addOrUpdate) {
      addOrUpdate = new ActivityApi_AddOrUpdate(credentials, xmlMapper, this);
    }
    return addOrUpdate;
  }

  /**
   * API Container
   * <p>
   * Instantiated on demand.
   *
   * @return "Delete" options on the Activity API.
   */
  public ActivityApi_Delete delete()
  {
    if (null == delete) {
      delete = new ActivityApi_Delete(credentials, xmlMapper, this);
    }
    return delete;
  }

  /**
   * API Container
   * <p>
   * Instantiated on demand.
   *
   * @return "Find" options on the Activity API.
   */
  public ActivityApi_Find find()
  {
    if (null == find) {
      find = new ActivityApi_Find(credentials, xmlMapper, this);
    }
    return find;
  }

  /**
   * API Container
   * <p>
   * Instantiated on demand.
   *
   * @return "Get" options on the Activity API.
   */
  public ActivityApi_Get get()
  {
    if (null == get) {
      get = new ActivityApi_Get(credentials, xmlMapper, this);
    }
    return get;
  }

  /**
   * API Container
   * <p>
   * Instantiated on demand.
   *
   * @return "Load" options on the Activity API.
   */
  public ActivityApi_Load load()
  {
    if (null == load) {
      load = new ActivityApi_Load(credentials, xmlMapper, this);
    }
    return load;
  }

  /**
   * API Container
   * <p>
   * Instantiated on demand.
   *
   * @return "Update" options on the Activity API.
   */
  public ActivityApi_Update update()
  {
    if (null == update) {
      update = new ActivityApi_Update(credentials, xmlMapper, this);
    }
    return update;
  }
}
