package io.vulpine.connectwise.type.def.agreement;

import io.vulpine.connectwise.type.def.XmlSerializable;
import io.vulpine.connectwise.type.def.gen.*;

/**
 * = Agreement Site
 *
 * [source,xml]
 * .AgreementApi WSDL Definition
 * ----
 * <s:complexType name="AgreementSite">
 *   <s:sequence>
 *     <s:element minOccurs="1" maxOccurs="1" name="Id" type="s:int"/>
 *     <s:element minOccurs="1" maxOccurs="1" name="AgreementId" nillable="true" type="s:int"/>
 *     <s:element minOccurs="1" maxOccurs="1" name="CompanyId" nillable="true" type="s:int"/>
 *     <s:element minOccurs="1" maxOccurs="1" name="AddressId" nillable="true" type="s:int"/>
 *     <s:element minOccurs="1" maxOccurs="1" name="LastUpdate" type="s:dateTime"/>
 *     <s:element minOccurs="0" maxOccurs="1" name="UpdatedBy" type="s:string"/>
 *   </s:sequence>
 * </s:complexType>
 * ----
 */
public interface AgreementSite extends
  HasId,
  HasAgreementId,
  HasCompanyId,
  HasAddressId,
  HasLastUpdate,
  HasUpdatedBy,
  XmlSerializable
{
}
