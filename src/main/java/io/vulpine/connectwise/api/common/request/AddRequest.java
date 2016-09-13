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
 */
package io.vulpine.connectwise.api.common.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.common.Credentials;
import io.vulpine.connectwise.api.def.SubApiInterface;
import io.vulpine.connectwise.api.endpoints.Endpoint;
import io.vulpine.connectwise.type.ConnectwiseCommon;

import java.util.Date;

public abstract class AddRequest < T extends ConnectwiseCommon > extends ConnectwiseRequest< T >
{
  protected T data;

  public AddRequest (
    Credentials credentials,
    XmlMapper xmlMapper,
    SubApiInterface api,
    Endpoint endpoint,
    T data
  )
  {
    super(credentials, xmlMapper, api, endpoint);

    this.data = data;
  }

  @JsonIgnore
  public int getId ()
  {
    return data.id();
  }

  public AddRequest setId ( final int id )
  {
    data.id(id);
    return this;
  }

  @JsonIgnore
  public String getUpdatedBy ()
  {
    return data.updatedBy();
  }

  public AddRequest setUpdatedBy ( String updatedBy )
  {
    data.updatedBy(updatedBy);
    return this;
  }

  @JsonIgnore
  public Date getLastUpdate ()
  {
    return data.lastUpdate();
  }

  public AddRequest setLastUpdate ( Date lastUpdate )
  {
    data.lastUpdate(lastUpdate);
    return this;
  }

  @JsonIgnore
  public String getDescription ()
  {
    return data.description();
  }

  public AddRequest setDescription ( String description )
  {
    data.description(description);
    return this;
  }

  @JsonIgnore
  public Date getLastUpdated ()
  {
    return data.lastUpdated();
  }

  public AddRequest setLastUpdated ( Date lastUpdated )
  {
    data.lastUpdated(lastUpdated);
    return this;
  }

  public abstract T getRequestData();
}
