package io.vulpine.connectwise.type.def.gen;

import io.vulpine.connectwise.type.def.XmlSerializable;
import io.vulpine.connectwise.util.Field;

public interface HasDepartmentId extends XmlSerializable
{
  default Integer departmentId()
  {
    return departmentIdField().get();
  }

  Field< Integer > departmentIdField();

  HasDepartmentId departmentId( Integer i );
}
