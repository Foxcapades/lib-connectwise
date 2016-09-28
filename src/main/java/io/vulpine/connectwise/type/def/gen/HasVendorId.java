package io.vulpine.connectwise.type.def.gen;

import io.vulpine.connectwise.type.def.XmlSerializable;
import io.vulpine.connectwise.util.Field;

public interface HasVendorId extends XmlSerializable
{
  Field< Integer > vendorIdField();

  default Integer vendorId()
  {
    return vendorIdField().get();
  }

  HasVendorId vendorId( final Integer i );
}
