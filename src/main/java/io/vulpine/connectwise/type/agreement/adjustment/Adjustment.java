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

package io.vulpine.connectwise.type.agreement.adjustment;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.vulpine.connectwise.type.agreement.AbstractSubAgreement;

import java.util.Date;

public class Adjustment extends AbstractSubAgreement
{
  @JacksonXmlProperty( localName = "AdjustmentAmount" )
  protected double adjustmentAmount;

  @JacksonXmlProperty( localName = "EffectiveDate" )
  protected Date effectiveDate;

  public double getAdjustmentAmount ()
  {
    return adjustmentAmount;
  }

  public void setAdjustmentAmount ( double adjustmentAmount )
  {
    this.adjustmentAmount = adjustmentAmount;
  }

  public Date getEffectiveDate ()
  {
    return effectiveDate;
  }

  public void setEffectiveDate ( Date effectiveDate )
  {
    this.effectiveDate = effectiveDate;
  }
}
