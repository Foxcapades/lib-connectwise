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

package io.vulpine.connectwise.type.agreement.worktype;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.vulpine.connectwise.type.agreement.BillableOption;
import io.vulpine.connectwise.type.agreement.RateType;

import java.util.Date;

@SuppressWarnings( "unused" )
@JacksonXmlRootElement( localName = "GetAgreementWorkTypeResult" )
public class WorkType extends WorkTypeCommon
{
  @JacksonXmlProperty( localName = "LocationId" )
  protected Integer LocationId;

  @JacksonXmlProperty( localName = "RateType" )
  protected RateType RateType;

  @JacksonXmlProperty( localName = "Rate" )
  protected Double Rate;

  @JacksonXmlProperty( localName = "EffectiveDate" )
  protected Date EffectiveDate;

  @JacksonXmlProperty( localName = "EndingDate" )
  protected Date EndingDate;

  @JacksonXmlProperty( localName = "BillTime" )
  protected BillableOption BillTime;

  @JacksonXmlProperty( localName = "HoursMin" )
  protected Double HoursMin;

  @JacksonXmlProperty( localName = "HoursMax" )
  protected Double HoursMax;

  @JacksonXmlProperty( localName = "AddressId" )
  protected Integer AddressId;

  public Integer getLocationId ()
  {
    return LocationId;
  }

  public void setLocationId ( Integer locationId )
  {
    LocationId = locationId;
  }

  public Double getRate ()
  {
    return Rate;
  }

  public void setRate ( Double rate )
  {
    Rate = rate;
  }

  public Date getEffectiveDate ()
  {
    return EffectiveDate;
  }

  public void setEffectiveDate ( Date effectiveDate )
  {
    EffectiveDate = effectiveDate;
  }

  public Date getEndingDate ()
  {
    return EndingDate;
  }

  public void setEndingDate ( Date endingDate )
  {
    EndingDate = endingDate;
  }

  public Double getHoursMin ()
  {
    return HoursMin;
  }

  public void setHoursMin ( Double hoursMin )
  {
    HoursMin = hoursMin;
  }

  public Double getHoursMax ()
  {
    return HoursMax;
  }

  public void setHoursMax ( Double hoursMax )
  {
    HoursMax = hoursMax;
  }

  public Integer getAddressId ()
  {
    return AddressId;
  }

  public void setAddressId ( Integer addressId )
  {
    AddressId = addressId;
  }

  public RateType getRateType ()
  {
    return RateType;
  }

  public void setRateType ( RateType rateType )
  {
    RateType = rateType;
  }

  public BillableOption getBillTime ()
  {
    return BillTime;
  }

  public void setBillTime ( BillableOption billTime )
  {
    BillTime = billTime;
  }
}
