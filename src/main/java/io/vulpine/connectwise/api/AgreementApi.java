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
import io.vulpine.connectwise.api.agreement.AgreementApi_AddOrUpdate;
import io.vulpine.connectwise.api.agreement.AgreementApi_Delete;
import io.vulpine.connectwise.api.agreement.AgreementApi_Find;
import io.vulpine.connectwise.api.agreement.AgreementApi_Get;
import io.vulpine.connectwise.api.common.ConnectwiseSubApi;
import io.vulpine.connectwise.api.common.Credentials;
import io.vulpine.connectwise.api.common.request.ConnectwiseRequest;
import io.vulpine.connectwise.api.def.SubApiInterface;

import java.io.IOException;

public class AgreementApi extends ConnectwiseSubApi implements SubApiInterface
{
  public final AgreementApi_AddOrUpdate addOrUpdate;

  public final AgreementApi_Delete delete;

  public final AgreementApi_Find find;

  public final AgreementApi_Get get;

  public AgreementApi(
    final ConnectwiseApi connectwiseApi,
    final Credentials credentials,
    final XmlMapper xmlMapper,
    final String endpoint
  )
  {
    super(connectwiseApi, credentials, xmlMapper, endpoint + "AgreementApi.asmx");

    this.addOrUpdate = new AgreementApi_AddOrUpdate(credentials, xmlMapper, this);
    this.delete = new AgreementApi_Delete(credentials, xmlMapper, this);
    this.find = new AgreementApi_Find(credentials, xmlMapper, this);
    this.get = new AgreementApi_Get(credentials, xmlMapper, this);
  }

  @Override
  public String send( final ConnectwiseRequest r ) throws IOException
  {
    return super.send(r).replaceAll("Overrruns", "Overruns");
  }
}
