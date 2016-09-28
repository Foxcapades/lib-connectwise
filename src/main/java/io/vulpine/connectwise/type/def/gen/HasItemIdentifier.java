package io.vulpine.connectwise.type.def.gen;

import io.vulpine.connectwise.type.def.XmlSerializable;
import io.vulpine.connectwise.util.Field;

public interface HasItemIdentifier extends XmlSerializable
{
  Field< String > itemIdentifierField();

  default String itemIdentifier()
  {
    return itemIdentifierField().get();
  }

  HasItemIdentifier itemIdentifier( final String s );
}
