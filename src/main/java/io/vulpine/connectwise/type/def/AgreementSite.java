package io.vulpine.connectwise.type.def;

import io.vulpine.connectwise.type.def.gen.HasAddressId;
import io.vulpine.connectwise.type.def.gen.HasCompanyId;

import java.util.Date;

public interface AgreementSite extends HasAddressId, HasCompanyId, SubAgreement
{
  @Override
  default AgreementSite addressId( final Integer i )
  {
    addressIdField().set(i);
    return this;
  }

  @Override
  default AgreementSite agreementId( final Integer i )
  {
    agreementIdField().set(i);
    return this;
  }

  @Override
  default AgreementSite companyId( final Integer i )
  {
    companyIdField().set(i);
    return this;
  }

  @Override
  default AgreementSite id( final Integer i )
  {
    idField().set(i);
    return this;
  }

  @Override
  default AgreementSite lastUpdate( final Date d )
  {
    lastUpdateField().set(d);
    return this;
  }

  @Override
  default AgreementSite updatedBy( final String s )
  {
    updatedByField().set(s);
    return this;
  }

  @Override
  default String toXml( String rootName )
  {
    return "<" + rootName + ">"
      + idField().toXml()
      + agreementIdField().toXml()
      + companyIdField().toXml()
      + addressIdField().toXml()
      + lastUpdateField().toXml()
      + updatedByField().toXml()
      + "</" + rootName + ">";
  }
}
