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
package io.vulpine.connectwise.type.def.agreement;

import io.vulpine.connectwise.type.def.XmlSerializable;
import io.vulpine.connectwise.type.def.gen.*;
import io.vulpine.connectwise.util.Field;

import java.util.Date;

public interface AgreementWorkRoleExclusion extends HasWorkRoleId, SubAgreement, XmlSerializable
{
  Field < Boolean > addAllWorkRolesField();

  default Integer agreementId() { return agreementIdField().get(); }

  default Integer id()
  {
    return idField().get();
  }

  default Date lastUpdate() { return lastUpdateField().get(); }

  Field < Boolean > removeAllWorkRolesField();

  default Boolean addAllWorkRoles()
  {
    return addAllWorkRolesField().get();
  }

  default AgreementWorkRoleExclusion addAllWorkRoles( final Boolean b )
  {
    addAllWorkRolesField().set(b);

    return this;
  }

  default Boolean removeAllWorkRoles()
  {
    return removeAllWorkRolesField().get();
  }

  default AgreementWorkRoleExclusion removeAllWorkRoles( final Boolean b )
  {
    removeAllWorkRolesField().set(b);

    return this;
  }

  default String updatedBy()
  {
    return updatedByField().get();
  }

  default AgreementWorkRoleExclusion workRoleId( final Integer i )
  {
    workRoleIdField().set(i);

    return this;
  }

  default AgreementWorkRoleExclusion id( final Integer i )
  {
    idField().set(i);

    return this;
  }

  default AgreementWorkRoleExclusion updatedBy( final String s )
  {
    updatedByField().set(s);

    return this;
  }

  default HasLastUpdate lastUpdate( final Date d )
  {
    lastUpdateField().set(d);

    return this;
  }

  @Override
  default HasAgreementId agreementId( final Integer i )
  {
    agreementIdField().set(i);

    return this;
  }

  @Override
  default String toXml( String rootName )
  {
    return "<" + rootName + ">"
      + idField().toXml()
      + agreementIdField().toXml()
      + workRoleIdField().toXml()
      + addAllWorkRolesField().toXml()
      + removeAllWorkRolesField().toXml()
      + updatedByField().toXml()
      + lastUpdateField().toXml()
      + "</" + rootName + ">";
  }

  default Integer workRoleId() { return workRoleIdField().get(); }

  Field< Integer > workRoleIdField();
}
