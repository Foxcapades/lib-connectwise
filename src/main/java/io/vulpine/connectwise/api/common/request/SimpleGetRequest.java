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
import io.vulpine.connectwise.api.common.ResponseData;
import io.vulpine.connectwise.api.def.SubApiInterface;
import io.vulpine.connectwise.api.endpoints.Endpoint;

import java.io.IOException;

public class SimpleGetRequest < T > extends GetRequest < T >
{
  private final Class < ? extends ResponseData < T > > response;

  public SimpleGetRequest(
    final Credentials credentials,
    final XmlMapper xmlMapper,
    final SubApiInterface api,
    final Endpoint endpoint,
    final int id,
    final Class < ? extends ResponseData < T > > response
  )
  {
    super(credentials, xmlMapper, api, endpoint, id);
    this.response = response;
  }

  @Override
  public T submit() throws IOException
  {
    return submit(response);
  }
}
