package io.vulpine.connectwise.type.def.gen;

import io.vulpine.connectwise.type.def.XmlSerializable;
import io.vulpine.connectwise.util.Field;

public interface HasAccountNumber extends XmlSerializable
{
  default String accountNumber() { return accountNumberField().get(); }

  Field< String > accountNumberField();

  HasAccountNumber accountNumber( String s );
}
