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
  public final ConfigurationApi_Add add;

  public final ConfigurationApi_AddOrUpdate addOrUpdate;

  public final ConfigurationApi_Delete delete;

  public final ConfigurationApi_Find find;

  public final ConfigurationApi_Get get;

  public final ConfigurationApi_Load load;

  public final ConfigurationApi_Update update;

  public ConfigurationApi(
    final ConnectwiseApi api,
    final Credentials credentials,
    final XmlMapper xmlMapper,
    final String endpoint
  )
  {
    super(api, credentials, xmlMapper, endpoint + "ConfigurationApi.asmx");
    this.add = new ConfigurationApi_Add(credentials, xmlMapper, this);
    this.addOrUpdate = new ConfigurationApi_AddOrUpdate(credentials, xmlMapper, this);
    this.delete = new ConfigurationApi_Delete(credentials, xmlMapper, this);
    this.find = new ConfigurationApi_Find(credentials, xmlMapper, this);
    this.get = new ConfigurationApi_Get(credentials, xmlMapper, this);
    this.load = new ConfigurationApi_Load(credentials, xmlMapper, this);
    this.update = new ConfigurationApi_Update(credentials, xmlMapper, this);
  }
}
