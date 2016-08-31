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
import io.vulpine.connectwise.api.contact.*;

public class ContactApi extends ConnectwiseSubApi
{
  public final ContactApi_Add add;

  public final ContactApi_AddOrUpdate addOrUpdate;

  public final ContactApi_Authenticate authenticate;

  public final ContactApi_Delete delete;

  public final ContactApi_Find find;

  public final ContactApi_Get get;

  public final ContactApi_GetAll getAll;

  public final ContactApi_Load load;

  public final ContactApi_Remove remove;

  public final ContactApi_Request request;

  public final ContactApi_Set set;

  public final ContactApi_Update update;

  public ContactApi(
    final ConnectwiseApi api,
    final Credentials credentials,
    final XmlMapper xmlMapper,
    final String endpoint
  )
  {
    super(api, credentials, xmlMapper, endpoint + "ContactApi.asmx");
    this.add = new ContactApi_Add(credentials, xmlMapper, this);
    this.addOrUpdate = new ContactApi_AddOrUpdate(credentials, xmlMapper, this);
    this.authenticate = new ContactApi_Authenticate(credentials, xmlMapper, this);
    this.delete = new ContactApi_Delete(credentials, xmlMapper, this);
    this.find = new ContactApi_Find(credentials, xmlMapper, this);
    this.get = new ContactApi_Get(credentials, xmlMapper, this);
    this.getAll = new ContactApi_GetAll(credentials, xmlMapper, this);
    this.load = new ContactApi_Load(credentials, xmlMapper, this);
    this.remove = new ContactApi_Remove(credentials, xmlMapper, this);
    this.request = new ContactApi_Request(credentials, xmlMapper, this);
    this.set = new ContactApi_Set(credentials, xmlMapper, this);
    this.update = new ContactApi_Update(credentials, xmlMapper, this);
  }
}
