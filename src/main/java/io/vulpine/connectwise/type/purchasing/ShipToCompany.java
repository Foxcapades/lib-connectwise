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
package io.vulpine.connectwise.type.purchasing;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import io.vulpine.connectwise.type.ConnectwiseCommon;

@SuppressWarnings( "unused" )
public class ShipToCompany extends ConnectwiseCommon
{
  @JacksonXmlProperty(localName = "CompanyIdentifier")
  protected String CompanyIdentifier;

  @JacksonXmlProperty(localName = "Name")
  protected String Name;

  public String getCompanyIdentifier ()
  {
    return CompanyIdentifier;
  }

  public void setCompanyIdentifier ( final String companyIdentifier )
  {
    CompanyIdentifier = companyIdentifier;
  }

  public String getName ()
  {
    return Name;
  }

  public void setName ( final String name )
  {
    Name = name;
  }
}
