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
import io.vulpine.connectwise.api.def.ConnectwiseSubApiInterface;
import io.vulpine.connectwise.api.company.addOrUpdate.AddOrUpdateCompany;
import io.vulpine.connectwise.api.company.addOrUpdate.AddOrUpdateCompanyCustomField;
import io.vulpine.connectwise.api.company.addOrUpdate.AddOrUpdateCompanyNote;
import io.vulpine.connectwise.api.company.addOrUpdate.AddOrUpdateCompanyTeam;
import io.vulpine.connectwise.api.request.Credentials;

public class AddOrUpdate extends ApiDivision
{
  public AddOrUpdate ( final Credentials credentials, final XmlMapper mapper, final ConnectwiseSubApiInterface api )
  {
    super(credentials, mapper, api);
  }

  /**
   * Initialize A Get Company Request
   *
   * @return a new get company request object.
   */
  public AddOrUpdateCompany company ()
  {
    return new AddOrUpdateCompany();
  }

  /**
   * Create a new Add Or Update Company Note request.
   *
   * @return new company request object.
   */
  public AddOrUpdateCompanyNote note()
  {
    return new AddOrUpdateCompanyNote();
  }

  /**
   * Create a new Add Or Update Company Note request.
   *
   * @return new company request object.
   */
  public AddOrUpdateCompanyCustomField customField()
  {
    return new AddOrUpdateCompanyCustomField();
  }

  /**
   * Create a new Add Or Update Company Note request.
   *
   * @return new company request object.
   */
  public AddOrUpdateCompanyTeam team()
  {
    return new AddOrUpdateCompanyTeam();
  }
}
