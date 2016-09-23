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

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.vulpine.connectwise.type.agreement.BillableOption;
import io.vulpine.connectwise.type.agreement.RateType;

import java.util.Date;

@SuppressWarnings( "unused" )
@JacksonXmlRootElement( localName = "GetAgreementWorkTypeResult" )
public class WorkType extends WorkTypeCommon// implements AgreementWorkType
{
  protected Integer id;

  protected Integer locationId;

  protected RateType rateType;

  protected Double rate;

  protected Date effectiveDate;

  protected Date endingDate;

  protected BillableOption billTime;

  protected Double hoursMin;

  protected Double hoursMax;

  protected Integer addressId;

  protected Integer workTypeId;

  private Date lastUpdate;

  public Integer id()
  {
    return id;
  }

  public WorkType id( final Integer id )
  {
    this.id = id;

    return this;
  }

  public Integer locationId ()
  {
    return locationId;
  }

  public WorkType locationId ( Integer locationId )
  {
    this.locationId = locationId;

    return this;
  }

  public Double rate ()
  {
    return rate;
  }

  public WorkType rate ( Double rate )
  {
    this.rate = rate;

    return this;
  }

  public Date effectiveDate ()
  {
    return effectiveDate;
  }

  public WorkType effectiveDate ( Date effectiveDate )
  {
    this.effectiveDate = effectiveDate;

    return this;
  }

  public Date endingDate ()
  {
    return endingDate;
  }

  public WorkType endingDate ( Date endingDate )
  {
    this.endingDate = endingDate;

    return this;
  }

  public Double hoursMin ()
  {
    return hoursMin;
  }

  public WorkType hoursMin ( Double hoursMin )
  {
    this.hoursMin = hoursMin;

    return this;
  }

  public Double hoursMax ()
  {
    return hoursMax;
  }

  public WorkType hoursMax ( Double hoursMax )
  {
    this.hoursMax = hoursMax;

    return this;
  }

  public Integer addressId ()
  {
    return addressId;
  }

  public WorkType addressId ( Integer addressId )
  {
    this.addressId = addressId;

    return this;
  }

  public RateType rateType ()
  {
    return rateType;
  }

  public WorkType rateType ( RateType rateType )
  {
    this.rateType = rateType;
    return this;
  }

  public BillableOption billTime ()
  {
    return billTime;
  }

  public WorkType billTime ( BillableOption billTime )
  {
    this.billTime = billTime;

    return this;
  }

  public Integer workTypeId ()
  {
    return workTypeId;
  }

  public WorkType workTypeId ( Integer workTypeId )
  {
    this.workTypeId = workTypeId;

    return this;
  }

  public Date lastUpdate()
  {
    return this.lastUpdate;
  }

  public WorkType lastUpdate( final Date lastUpdate )
  {
    this.lastUpdate = lastUpdate;

    return this;
  }
}
