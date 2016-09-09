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

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.common.Credentials;
import io.vulpine.connectwise.api.def.SubApiInterface;
import io.vulpine.connectwise.api.endpoints.Endpoint;
import io.vulpine.connectwise.type.ConnectwiseCommon;
import io.vulpine.connectwise.type.agreement.addition.Addition;

public abstract class AddOrUpdateRequest < T extends ConnectwiseCommon > extends ConnectwiseRequest< T >
{
  protected T data;

  public AddOrUpdateRequest(
    final Credentials credentials,
    final XmlMapper xmlMapper,
    final SubApiInterface api,
    final Endpoint endpoint,
    final T data
  )
  {
    super(credentials, xmlMapper, api, endpoint);

    this.data = data;
  }

  public abstract T getRequestData();
}
