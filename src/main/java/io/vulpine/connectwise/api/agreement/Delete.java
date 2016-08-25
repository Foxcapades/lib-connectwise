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
import io.vulpine.connectwise.api.agreement.delete.*;
import io.vulpine.connectwise.api.common.ApiDivision;
import io.vulpine.connectwise.api.def.SubApiInterface;
import io.vulpine.connectwise.api.request.Credentials;

public class Delete extends ApiDivision
{
  public Delete( Credentials credentials, XmlMapper mapper, SubApiInterface api )
  {
    super(credentials, mapper, api);
  }

  public DeleteAgreementAdjustment adjustment( final int adjustmentId )
  {
    return new DeleteAgreementAdjustment(credentials, mapper, api, adjustmentId);
  }

  public DeleteAgreementSite site( final int siteId )
  {
    return new DeleteAgreementSite(credentials, mapper, api, siteId);
  }

  public DeleteAgreementWorkRole workRole( final int workRoleId )
  {
    return new DeleteAgreementWorkRole(credentials, mapper, api, workRoleId);
  }

  public DeleteAgreementWorkType workType( final int workTypeId )
  {
    return new DeleteAgreementWorkType(credentials, mapper, api, workTypeId);
  }

  public DeleteAgreement agreement( final int agreementId )
  {
    return new DeleteAgreement(credentials, mapper, api, agreementId);
  }

  public DeleteAgreementAddition addition( final int additionId )
  {
    return new DeleteAgreementAddition(credentials, mapper, api, additionId);
  }

  public DeleteAgreementBoardDefault boardDefault( final int boardDefaultId )
  {
    return new DeleteAgreementBoardDefault(credentials, mapper, api, boardDefaultId);
  }
}
