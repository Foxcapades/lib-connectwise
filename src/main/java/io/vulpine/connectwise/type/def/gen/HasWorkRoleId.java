package io.vulpine.connectwise.type.def.gen;

import io.vulpine.connectwise.type.def.XmlSerializable;
import io.vulpine.connectwise.util.Field;

public interface HasWorkRoleId extends XmlSerializable
{
  default Integer workRoleId() { return workRoleIdField().get(); }

  Field< Integer > workRoleIdField();

  HasWorkRoleId workRoleId( final Integer i );
}
