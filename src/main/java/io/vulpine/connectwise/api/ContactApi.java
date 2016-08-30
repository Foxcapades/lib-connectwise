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
  private ContactApi_Add add = null;

  private ContactApi_AddOrUpdate addOrUpdate = null;

  private ContactApi_Authenticate authenticate = null;

  private ContactApi_Delete delete = null;

  private ContactApi_Find find = null;

  private ContactApi_Get get = null;

  private ContactApi_GetAll getAll = null;

  private ContactApi_Load load = null;

  private ContactApi_Remove remove = null;

  private ContactApi_Request request = null;

  private ContactApi_Set set = null;

  private ContactApi_Update update = null;

  public ContactApi(
    final ConnectwiseApi api,
    final Credentials credentials,
    final XmlMapper xmlMapper,
    final String endpoint
  )
  {
    super(api, credentials, xmlMapper, endpoint + "ContactApi.asmx");
  }

  public ContactApi_Add add()
  {
    if (null == add) {
      add = new ContactApi_Add(credentials, xmlMapper, this);
    }
    return add;
  }

  public ContactApi_AddOrUpdate addOrUpdate()
  {
    if (null == addOrUpdate) {
      addOrUpdate = new ContactApi_AddOrUpdate(credentials, xmlMapper, this);
    }
    return addOrUpdate;
  }

  public ContactApi_Authenticate authenticate()
  {
    if (null == authenticate) {
      authenticate = new ContactApi_Authenticate(credentials, xmlMapper, this);
    }
    return authenticate;
  }

  public ContactApi_Delete delete()
  {
    if (null == delete) {
      delete = new ContactApi_Delete(credentials, xmlMapper, this);
    }
    return delete;
  }

  public ContactApi_Find find()
  {
    if (null == find) {
      find = new ContactApi_Find(credentials, xmlMapper, this);
    }
    return find;
  }

  public ContactApi_Get get()
  {
    if (null == get) {
      get = new ContactApi_Get(credentials, xmlMapper, this);
    }
    return get;
  }

  public ContactApi_GetAll getAll()
  {
    if (null == getAll) {
      getAll = new ContactApi_GetAll(credentials, xmlMapper, this);
    }
    return getAll;
  }

  public ContactApi_Load load()
  {
    if (null == load) {
      load = new ContactApi_Load(credentials, xmlMapper, this);
    }
    return load;
  }

  public ContactApi_Remove remove()
  {
    if (null == remove) {
      remove = new ContactApi_Remove(credentials, xmlMapper, this);
    }
    return remove;
  }

  public ContactApi_Request request()
  {
    if (null == request) {
      request = new ContactApi_Request(credentials, xmlMapper, this);
    }
    return request;
  }

  public ContactApi_Set set()
  {
    if (null == set) {
      set = new ContactApi_Set(credentials, xmlMapper, this);
    }
    return set;
  }

  public ContactApi_Update update()
  {
    if (null == update) {
      update = new ContactApi_Update(credentials, xmlMapper, this);
    }
    return update;
  }
}
