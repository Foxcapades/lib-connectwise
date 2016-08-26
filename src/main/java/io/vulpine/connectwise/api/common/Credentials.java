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

package io.vulpine.connectwise.api.common;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Credentials
{
  @JacksonXmlProperty(localName = "CompanyId")
  protected String companyId;

  @JacksonXmlProperty(localName = "IntegratorLoginId")
  protected String integratorLoginId;

  @JacksonXmlProperty(localName = "IntegratorPassword")
  protected String integratorPassword;

  public String getCompanyId ()
  {
    return companyId;
  }

  public Credentials setCompanyId ( final String companyId )
  {
    this.companyId = companyId;
    return this;
  }

  public String getIntegratorLoginId ()
  {
    return integratorLoginId;
  }

  public Credentials setIntegratorLoginId ( final String integratorLoginId )
  {
    this.integratorLoginId = integratorLoginId;
    return this;
  }

  public String getIntegratorPassword ()
  {
    return integratorPassword;
  }

  public Credentials setIntegratorPassword ( final String integratorPassword )
  {
    this.integratorPassword = integratorPassword;
    return this;
  }
}
