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
import io.vulpine.connectwise.api.common.Credentials;
import io.vulpine.connectwise.api.configuration.*;

public class ConfigurationApi extends ConnectwiseSubApi
{
  /**
   * API Container
   * <p>
   * Instantiated on demand.
   */
  private ConfigurationApi_Add add = null;

  /**
   * API Container
   * <p>
   * Instantiated on demand.
   */
  private ConfigurationApi_AddOrUpdate addOrUpdate = null;

  /**
   * API Container
   * <p>
   * Instantiated on demand.
   */
  private ConfigurationApi_Delete delete = null;

  /**
   * API Container
   * <p>
   * Instantiated on demand.
   */
  private ConfigurationApi_Find find = null;

  /**
   * API Container
   * <p>
   * Instantiated on demand.
   */
  private ConfigurationApi_Get get = null;

  /**
   * API Container
   * <p>
   * Instantiated on demand.
   */
  private ConfigurationApi_Load load = null;

  /**
   * API Container
   * <p>
   * Instantiated on demand.
   */
  private ConfigurationApi_Update update = null;

  public ConfigurationApi(
    final ConnectwiseApi api,
    final Credentials credentials,
    final XmlMapper xmlMapper,
    final String endpoint
  )
  {
    super(api, credentials, xmlMapper, endpoint + "ConfigurationApi.asmx");
  }

  public ConfigurationApi_Add add()
  {
    if (null == add) {
      add = new ConfigurationApi_Add(credentials, xmlMapper, this);
    }
    return add;
  }

  public ConfigurationApi_AddOrUpdate addOrUpdate()
  {
    if (null == addOrUpdate) {
      addOrUpdate = new ConfigurationApi_AddOrUpdate(credentials, xmlMapper, this);
    }
    return addOrUpdate;
  }

  public ConfigurationApi_Delete delete()
  {
    if (null == delete) {
      delete = new ConfigurationApi_Delete(credentials, xmlMapper, this);
    }
    return delete;
  }

  public ConfigurationApi_Find find()
  {
    if (null == find) {
      find = new ConfigurationApi_Find(credentials, xmlMapper, this);
    }
    return find;
  }

  public ConfigurationApi_Get get()
  {
    if (null == get) {
      get = new ConfigurationApi_Get(credentials, xmlMapper, this);
    }
    return get;
  }

  public ConfigurationApi_Load load()
  {
    if (null == load) {
      load = new ConfigurationApi_Load(credentials, xmlMapper, this);
    }
    return load;
  }

  public ConfigurationApi_Update update()
  {
    if (null == update) {
      update = new ConfigurationApi_Update(credentials, xmlMapper, this);
    }
    return update;
  }
}
