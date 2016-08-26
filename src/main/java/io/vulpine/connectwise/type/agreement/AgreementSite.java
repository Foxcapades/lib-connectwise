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
 *
 */

package io.vulpine.connectwise.type.agreement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement( localName = "AgreementSite" )
public class AgreementSite extends AbstractSubAgreement
{
  @JacksonXmlProperty ( localName = "CompanyId" )
  protected int companyId;

  @JacksonXmlProperty ( localName = "AddressId" )
  protected int addressId;

  public int getCompanyId ()
  {
    return companyId;
  }

  public void setCompanyId ( int companyId )
  {
    this.companyId = companyId;
  }

  public int getAddressId ()
  {
    return addressId;
  }

  public void setAddressId ( int addressId )
  {
    this.addressId = addressId;
  }
}
