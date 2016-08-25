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

package io.vulpine.connectwise.api.agreement;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.common.ApiDivision;
import io.vulpine.connectwise.api.def.SubApiInterface;
import io.vulpine.connectwise.api.agreement.find.FindAgreementAdditions;
import io.vulpine.connectwise.api.agreement.find.FindAgreements;
import io.vulpine.connectwise.api.request.Credentials;

import java.io.IOException;

public class Find extends ApiDivision
{
  public Find ( Credentials credentials, XmlMapper mapper, SubApiInterface api )
  {
    super(credentials, mapper, api);
  }

  public FindAgreements agreements() throws IOException
  {
    return new FindAgreements(credentials, mapper, api);
  }

  public FindAgreementAdditions additions() throws IOException
  {
    return new FindAgreementAdditions(credentials, mapper, api);
  }
}
