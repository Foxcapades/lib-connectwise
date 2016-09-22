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

package io.vulpine.connectwise.type.agreement.workrole;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.vulpine.connectwise.type.agreement.RateType;

import java.util.Date;

@SuppressWarnings( "unused" )
@JacksonXmlRootElement( localName = "GetAgreementWorkRoleResult" )
public class WorkRole extends WorkRoleCommon
{
  @JacksonXmlProperty( localName = "LocationId" )
  protected Integer LocationId;

  @JacksonXmlProperty( localName = "RateType" )
  protected RateType RateType;

  @JacksonXmlProperty( localName = "Rate" )
  protected Double Rate;

  @JacksonXmlProperty( localName = "LimitTo" )
  protected Double LimitTo;

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
  @JacksonXmlProperty( localName = "EffectiveDate" )
  protected Date EffectiveDate;

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
  @JacksonXmlProperty( localName = "EndingDate" )
  protected Date EndingDate;

  public Integer getLocationId ()
  {
    return LocationId;
  }

  public void setLocationId ( Integer locationId )
  {
    LocationId = locationId;
  }

  public RateType getRateType ()
  {
    return RateType;
  }

  public void setRateType ( RateType rateType )
  {
    RateType = rateType;
  }

  public Double getRate ()
  {
    return Rate;
  }

  public void setRate ( Double rate )
  {
    Rate = rate;
  }

  public Double getLimitTo ()
  {
    return LimitTo;
  }

  public void setLimitTo ( Double limitTo )
  {
    LimitTo = limitTo;
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
}
