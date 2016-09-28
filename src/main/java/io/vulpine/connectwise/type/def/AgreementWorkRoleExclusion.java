package io.vulpine.connectwise.type.def;

import io.vulpine.connectwise.type.def.gen.*;
import io.vulpine.connectwise.util.Field;

import java.util.Date;

public interface AgreementWorkRoleExclusion extends HasWorkRoleId, SubAgreement, XmlSerializable
{
  Field < Boolean > addAllWorkRolesField();

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

  @Override
  default AgreementWorkRoleExclusion workRoleId( final Integer i )
  {
    workRoleIdField().set(i);

    return this;
  }

  @Override
  default AgreementWorkRoleExclusion id( final Integer i )
  {
    idField().set(i);

    return this;
  }

  @Override
  default AgreementWorkRoleExclusion updatedBy( final String s )
  {
    updatedByField().set(s);

    return this;
  }

  @Override
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
}
