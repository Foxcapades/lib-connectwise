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

package io.vulpine.connectwise.api.company;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.common.ApiDivision;
import io.vulpine.connectwise.api.def.SubApiInterface;
import io.vulpine.connectwise.api.company.delete.DeleteCompany;
import io.vulpine.connectwise.api.company.delete.DeleteCompanyNote;
import io.vulpine.connectwise.api.company.delete.DeleteCompanyTeam;
import io.vulpine.connectwise.api.common.Credentials;

public class CompanyApi_Delete extends ApiDivision
{
  public CompanyApi_Delete( final Credentials credentials, final XmlMapper mapper, final SubApiInterface api )
  {
    super(credentials, mapper, api);
  }

  /**
   * Initialize Delete Company Request
   *
   * @param companyId Company ID
   *
   * @return a new Delete Company request object.
   */
  public DeleteCompany company ( final int companyId )
  {
    return new DeleteCompany(credentials, mapper, api, companyId);
  }

  public DeleteCompanyNote note( final int id )
  {
    return new DeleteCompanyNote(credentials, mapper, api, id);
  }

  public DeleteCompanyTeam team( final int id )
  {
    return new DeleteCompanyTeam(credentials, mapper, api, id);
  }

}
