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
package io.vulpine.connectwise.type.agreement.adjustment;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.vulpine.connectwise.type.agreement.AbstractSubAgreement;

import java.util.Date;

public class Adjustment extends AbstractSubAgreement
{
  private Date effectiveDate;

  private Double adjustmentAmount;

  @JsonGetter( "AdjustmentAmount" )
  public Double adjustmentAmount()
  {
    return adjustmentAmount;
  }

  @JsonSetter( "AdjustmentAmount" )
  public Adjustment adjustmentAmount( Double adjustmentAmount )
  {
    this.adjustmentAmount = adjustmentAmount;

    return this;
  }

  @JsonGetter( "EffectiveDate" )
  public Date effectiveDate()
  {
    return effectiveDate;
  }

  @JsonSetter( "EffectiveDate" )
  public Adjustment effectiveDate( Date effectiveDate )
  {
    this.effectiveDate = effectiveDate;

    return this;
  }
}
