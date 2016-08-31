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
  public final ProductApi_Add add;

  public final ProductApi_Delete delete;

  public final ProductApi_AddOrUpdate addOrUpdate;

  public final ProductApi_Update update;

  public final ProductApi_Set set;

  public final ProductApi_Remove remove;

  public final ProductApi_Load load;

  public final ProductApi_Get get;

  public final ProductApi_Find find;

  public ProductApi(
    final ConnectwiseApi connectwiseApi,
    final Credentials credentials,
    final XmlMapper xmlMapper,
    final String endpoint
  )
  {
    super(connectwiseApi, credentials, xmlMapper, endpoint + "ProductApi.asmx");
    this.add = new ProductApi_Add(credentials, xmlMapper, this);
    this.addOrUpdate = new ProductApi_AddOrUpdate(credentials, xmlMapper, this);
    this.delete = new ProductApi_Delete(credentials, xmlMapper, this);
    this.find = new ProductApi_Find(credentials, xmlMapper, this);
    this.get = new ProductApi_Get(credentials, xmlMapper, this);
    this.load = new ProductApi_Load(credentials, xmlMapper, this);
    this.remove = new ProductApi_Remove(credentials, xmlMapper, this);
    this.set = new ProductApi_Set(credentials, xmlMapper, this);
    this.update = new ProductApi_Update(credentials, xmlMapper, this);
  }
}
