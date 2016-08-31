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
import io.vulpine.connectwise.api.company.*;

public class CompanyApi extends ConnectwiseSubApi
{
  public final CompanyApi_Add add;

  public final CompanyApi_AddOrUpdate addOrUpdate;

  public final CompanyApi_Delete delete;

  public final CompanyApi_Find find;

  public final CompanyApi_Get get;

  public final CompanyApi_GetAll getAll;

  public final CompanyApi_Load load;

  public final CompanyApi_Set set;

  public final CompanyApi_Update update;

  public CompanyApi(
    final ConnectwiseApi connectwiseApi,
    final Credentials credentials,
    final XmlMapper xmlMapper,
    final String endpoint
  )
  {
    super(connectwiseApi, credentials, xmlMapper, endpoint + "CompanyApi.asmx");

    this.add = new CompanyApi_Add(credentials, xmlMapper, this);
    this.addOrUpdate = new CompanyApi_AddOrUpdate(credentials, xmlMapper, this);
    this.delete = new CompanyApi_Delete(credentials, xmlMapper, this);
    this.find = new CompanyApi_Find(credentials, xmlMapper, this);
    this.get = new CompanyApi_Get(credentials, xmlMapper, this);
    this.getAll = new CompanyApi_GetAll(credentials, xmlMapper, this);
    this.load = new CompanyApi_Load(credentials, xmlMapper, this);
    this.set = new CompanyApi_Set(credentials, xmlMapper, this);
    this.update = new CompanyApi_Update(credentials, xmlMapper, this);
  }
}
