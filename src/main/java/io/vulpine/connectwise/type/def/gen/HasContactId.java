package io.vulpine.connectwise.type.def.gen;

import io.vulpine.connectwise.type.def.XmlSerializable;
import io.vulpine.connectwise.util.Field;

public interface HasContactId extends XmlSerializable
{
  default Integer contactId()
  {
    return contactIdField().get();
  }

  Field < Integer > contactIdField();

  HasContactId contactId( Integer i );
}
