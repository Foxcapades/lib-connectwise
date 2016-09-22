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
package io.vulpine.connectwise.type.agreement.site;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.vulpine.connectwise.type.agreement.AbstractSubAgreement;

@SuppressWarnings( "unused" )
@JacksonXmlRootElement( localName = "GetAgreementSiteResult" )
public class Site extends AbstractSubAgreement
{
  @JacksonXmlProperty( localName = "CompanyId" )
  private Integer companyId;

  @JacksonXmlProperty( localName = "AddressId" )
  private Integer addressId;

  public Integer getCompanyId()
  {
    return companyId;
  }

  public void setCompanyId( Integer companyId )
  {
    this.companyId = companyId;
  }

  public Integer getAddressId()
  {
    return addressId;
  }

  public void setAddressId( Integer addressId )
  {
    this.addressId = addressId;
  }
}
