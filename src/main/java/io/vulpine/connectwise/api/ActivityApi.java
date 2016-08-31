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
  public final ActivityApi_Add add;

  public final ActivityApi_AddOrUpdate addOrUpdate;

  public final ActivityApi_Delete delete;

  public final ActivityApi_Find find;

  public final ActivityApi_Get get;

  public final ActivityApi_Load load;

  public final ActivityApi_Update update;

  public ActivityApi(
    final ConnectwiseApi api,
    final Credentials credentials,
    final XmlMapper xmlMapper,
    final String endpoint
  )
  {
    super(api, credentials, xmlMapper, endpoint + "ActivityApi.asmx");

    this.add = new ActivityApi_Add(credentials, xmlMapper, this);
    this.addOrUpdate = new ActivityApi_AddOrUpdate(credentials, xmlMapper, this);
    this.delete = new ActivityApi_Delete(credentials, xmlMapper, this);
    this.find = new ActivityApi_Find(credentials, xmlMapper, this);
    this.get = new ActivityApi_Get(credentials, xmlMapper, this);
    this.load = new ActivityApi_Load(credentials, xmlMapper, this);
    this.update = new ActivityApi_Update(credentials, xmlMapper, this);
  }
}
