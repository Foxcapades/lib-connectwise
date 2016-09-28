package io.vulpine.connectwise.type.def;

import io.vulpine.connectwise.type.def.gen.HasBoardId;
import io.vulpine.connectwise.type.def.gen.HasDefaultFlag;
import io.vulpine.connectwise.type.def.gen.HasServiceTypeId;

import java.util.Date;

public interface AgreementBoardDefault
extends
  HasBoardId,
  HasDefaultFlag,
  HasServiceTypeId,
  SubAgreement,
  XmlSerializable
{
  @Override
  default AgreementBoardDefault agreementId( final Integer i )
  {
    agreementIdField().set(i);
    return this;
  }

  @Override
  default AgreementBoardDefault id( final Integer i )
  {
    idField().set(i);
    return this;
  }

  @Override
  default AgreementBoardDefault updatedBy( final String s )
  {
    updatedByField().set(s);
    return this;
  }

  @Override
  default AgreementBoardDefault lastUpdate( final Date d )
  {
    lastUpdateField().set(d);
    return this;
  }

  @Override
  default AgreementBoardDefault serviceTypeId( final Integer i )
  {
    serviceTypeIdField().set(i);
    return this;
  }

  @Override
  default AgreementBoardDefault boardId( final Integer i )
  {
    boardIdField().set(i);
    return this;
  }

  @Override
  default AgreementBoardDefault defaultFlag( final Boolean b )
  {
    defaultFlagField().set(b);
    return this;
  }

  @Override
  default String toXml( String rootName )
  {
    return "<" + rootName + ">"
      + idField().toXml()
      + boardIdField().toXml()
      + agreementIdField().toXml()
      + serviceTypeIdField().toXml()
      + defaultFlagField().toXml()
      + updatedByField().toXml()
      + lastUpdateField().toXml()
      + "</" + rootName + ">";
  }
}
