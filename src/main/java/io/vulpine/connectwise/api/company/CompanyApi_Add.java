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
import io.vulpine.connectwise.api.common.ConnectwiseSubApi;
import io.vulpine.connectwise.api.company.add.AddCompany;
import io.vulpine.connectwise.api.common.Credentials;

public class CompanyApi_Add extends ApiDivision
{
  public CompanyApi_Add( Credentials credentials, XmlMapper xmlMapper, ConnectwiseSubApi api )
  {
    super(credentials, xmlMapper, api);
  }

  /**
   * Initialize Add Company Request
   *
   * @param name       new Company name
   * @param identifier new Company identifier
   *
   * @return a new Add Company request object.
   */
  public AddCompany company ( final String name, final String identifier )
  {
    this.logger.trace(CompanyApi_Add.class, name, identifier);
    return new AddCompany(credentials, mapper, api).companyName(name).companyIdentifier(identifier);
  }
}
