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
import io.vulpine.connectwise.api.company.get.GetCompany;
import io.vulpine.connectwise.api.company.get.GetCompanyNote;
import io.vulpine.connectwise.api.company.get.GetCompanyProfile;
import io.vulpine.connectwise.api.company.get.GetCompanyTeam;
import io.vulpine.connectwise.api.common.Credentials;

public class CompanyApi_Get extends ApiDivision
{
  public CompanyApi_Get( Credentials credentials, XmlMapper mapper, SubApiInterface api )
  {
    super(credentials, mapper, api);
  }

  /**
   * Initialize A Get Company Request
   *
   * @param id Company ID
   *
   * @return a new get company request object.
   */
  public GetCompany company ( final int id )
  {
    this.logger.trace(this.getClass(), id);
    return new GetCompany(credentials, mapper, api, id);
  }

  public GetCompanyProfile profile()
  {
    this.logger.trace(this.getClass());
    return new GetCompanyProfile();
  }

  public GetCompanyNote note()
  {
    this.logger.trace(this.getClass());
    return new GetCompanyNote();
  }

  public GetCompanyTeam team()
  {
    this.logger.trace(this.getClass());
    return new GetCompanyTeam();
  }
}
