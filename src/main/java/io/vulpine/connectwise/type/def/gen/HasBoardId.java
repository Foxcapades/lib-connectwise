package io.vulpine.connectwise.type.def.gen;

import io.vulpine.connectwise.type.def.XmlSerializable;
import io.vulpine.connectwise.util.Field;

public interface HasBoardId extends XmlSerializable
{
  default Integer boardId()
  {
    return boardIdField().get();
  }

  Field < Integer > boardIdField();

  HasBoardId boardId( final Integer i );
}
