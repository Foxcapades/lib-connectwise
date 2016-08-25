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
import io.vulpine.connectwise.api.def.ConnectwiseSubApiInterface;
import io.vulpine.connectwise.api.agreement.delete.*;
import io.vulpine.connectwise.api.request.Credentials;

public class Delete extends ApiDivision
{
  public Delete ( Credentials credentials, XmlMapper mapper, ConnectwiseSubApiInterface api )
  {
    super(credentials, mapper, api);
  }

  public DeleteAgreementAdjustment adjustment()
  {
    return new DeleteAgreementAdjustment(credentials, mapper, api);
  }

  public DeleteAgreementSite site()
  {
    return new DeleteAgreementSite(credentials, mapper, api);
  }

  public DeleteAgreementWorkRole workRole()
  {
    return new DeleteAgreementWorkRole(credentials, mapper, api);
  }

  public DeleteAgreementWorkType workType()
  {
    return new DeleteAgreementWorkType(credentials, mapper, api);
  }

  public DeleteAgreement agreement()
  {
    return new DeleteAgreement(credentials, mapper, api);
  }

  public DeleteAgreementAddition addition()
  {
    return new DeleteAgreementAddition(credentials, mapper, api);
  }

  public DeleteAgreementBoardDefault boardDefault()
  {
    return new DeleteAgreementBoardDefault(credentials, mapper, api);
  }
}
