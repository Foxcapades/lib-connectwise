package io.vulpine.connectwise.type.def;

import io.vulpine.connectwise.type.def.gen.HasLastUpdate;
import io.vulpine.connectwise.type.def.gen.HasUpdatedBy;
import io.vulpine.connectwise.type.def.gen.HasWorkTypeId;
import io.vulpine.connectwise.util.Field;

import java.util.Date;

public interface AgreementWorkTypeExclusion extends HasWorkTypeId, SubAgreement, XmlSerializable
{
  Field < Boolean > addAllWorkTypesField();

  Field < Boolean > removeAllWorkTypesField();

  default Boolean addAllWorkTypes()
  {
    return addAllWorkTypesField().get();
  }

  default AgreementWorkTypeExclusion addAllWorkTypes( final Boolean b )
  {
    addAllWorkTypesField().set(b);

    return this;
  }

  default Boolean removeAllWorkTypes()
  {
    return removeAllWorkTypesField().get();
  }

  default AgreementWorkTypeExclusion removeAllWorkTypes( final Boolean b )
  {
    removeAllWorkTypesField().get();

    return this;
  }

  @Override
  default AgreementWorkTypeExclusion id( final Integer i )
  {
    idField().set(i);

    return this;
  }

  @Override
  default AgreementWorkTypeExclusion agreementId( final Integer i )
  {
    agreementIdField().set(i);

    return this;
  }

  @Override
  default AgreementWorkTypeExclusion workTypeId( final Integer i )
  {
    workTypeIdField().set(i);

    return this;
  }

  @Override
  default HasUpdatedBy updatedBy( final String s )
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
  default String toXml( String rootName )
  {
    return "<" + rootName + ">"
      + idField().toXml()
      + agreementIdField().toXml()
      + workTypeIdField().toXml()
      + addAllWorkTypesField().toXml()
      + removeAllWorkTypesField().toXml()
      + updatedByField().toXml()
      + lastUpdateField().toXml()
      + "</" + rootName + ">";
  }
}
