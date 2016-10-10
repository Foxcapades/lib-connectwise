package io.vulpine.connectwise.type.def.agreement;

import io.vulpine.connectwise.type.agreement.BillableOption;
import io.vulpine.connectwise.type.def.XmlSerializable;
import io.vulpine.connectwise.type.def.gen.*;

/**
 * = Agreement Work Type
 *
 * [source,xml]
 * .WSDL Definition
 * ----
 * <s:complexType name="AgreementWorkType">
 *   <s:sequence>
 *     <s:element minOccurs="1" maxOccurs="1" name="Id" type="s:int"/>
 *     <s:element minOccurs="1" maxOccurs="1" name="WorkTypeId" nillable="true" type="s:int"/>
 *     <s:element minOccurs="1" maxOccurs="1" name="AgreementId" nillable="true" type="s:int"/>
 *     <s:element minOccurs="1" maxOccurs="1" name="LocationId" nillable="true" type="s:int"/>
 *     <s:element minOccurs="1" maxOccurs="1" name="RateType" nillable="true" type="tns:RateType"/>
 *     <s:element minOccurs="1" maxOccurs="1" name="Rate" nillable="true" type="s:decimal"/>
 *     <s:element minOccurs="1" maxOccurs="1" name="EffectiveDate" nillable="true" type="s:dateTime"/>
 *     <s:element minOccurs="1" maxOccurs="1" name="EndingDate" nillable="true" type="s:dateTime"/>
 *     <s:element minOccurs="1" maxOccurs="1" name="BillTime" nillable="true" type="tns:BillableOptions"/>
 *     <s:element minOccurs="1" maxOccurs="1" name="HoursMin" nillable="true" type="s:decimal"/>
 *     <s:element minOccurs="1" maxOccurs="1" name="HoursMax" nillable="true" type="s:decimal"/>
 *     <s:element minOccurs="1" maxOccurs="1" name="AddressId" nillable="true" type="s:int"/>
 *     <s:element minOccurs="1" maxOccurs="1" name="LastUpdate" type="s:dateTime"/>
 *     <s:element minOccurs="0" maxOccurs="1" name="UpdatedBy" type="s:string"/>
 *   </s:sequence>
 * </s:complexType>
 * ----
 *
 * @version 2.0.0
 * @since 0.1.0
 * @author https://github.com/EllieFops[Elizabeth Harper]
 */
public interface AgreementWorkType
extends
  HasId,
  HasWorkTypeId,
  HasAgreementId,
  HasLocationId,
  HasRateType,
  HasRate,
  HasEffectiveDate,
  HasEndDate,
  HasAddressId,
  HasLastUpdate,
  HasUpdatedBy,
  XmlSerializable
{
  BillableOption billTime();

  AgreementWorkType billTime( final BillableOption bo );

  Double hoursMin();

  AgreementWorkType hoursMin( final Double d );

  Double hoursMax();

  AgreementWorkType hoursMax( final Double d );
}
