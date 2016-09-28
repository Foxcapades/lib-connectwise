/*
 * Copyright 2016 Elizabeth Harper
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.vulpine.connectwise.type.def.agreement;

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
