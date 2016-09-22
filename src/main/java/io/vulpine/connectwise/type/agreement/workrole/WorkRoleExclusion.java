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
package io.vulpine.connectwise.type.agreement.workrole;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@SuppressWarnings( "unused" )
@JacksonXmlRootElement( localName = "GetAgreementWorkRoleExclusionResult" )
public class WorkRoleExclusion extends WorkRoleCommon
{
  @JacksonXmlProperty( localName = "AddAllWorkRoles" )
  protected Boolean addAllWorkRoles;

  @JacksonXmlProperty( localName = "RemoveAllWorkRoles" )
  protected Boolean removeAllWorkRoles;

  public Boolean isAddAllWorkRoles()
  {
    return addAllWorkRoles;
  }

  public void setAddAllWorkRoles( Boolean addAllWorkRoles )
  {
    this.addAllWorkRoles = addAllWorkRoles;
  }

  public Boolean isRemoveAllWorkRoles()
  {
    return removeAllWorkRoles;
  }

  public void setRemoveAllWorkRoles( Boolean removeAllWorkRoles )
  {
    this.removeAllWorkRoles = removeAllWorkRoles;
  }
}
