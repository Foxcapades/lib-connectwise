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

import io.vulpine.connectwise.type.ConnectwiseCommon;
import io.vulpine.connectwise.type.def.AgreementAdjustment;
import io.vulpine.connectwise.util.*;

/**
 * = Agreement Adjustment Object
 *
 * @since 0.0.4
 * @version 2.0.0
 * @author https://github.com/elliefops[Elizabeth Harper]
 */
public class SimpleAdjustment extends ConnectwiseCommon implements AgreementAdjustment
{
  private final Field < String > description = new SimpleStringField("Description");

  private final DateField effectiveDate = new SimpleDateField("EffectiveDate");

  private final NumberField < Double > adjustmentAmount = new SimpleDoubleField("AdjustmentAmount");

  private final NumberField < Integer > agreementId = new SimpleIntegerField("AgreementId");

  @Override
  public Field< String > descriptionField()
  {
    return description;
  }

  @Override
  public DateField effectiveDateField()
  {
    return effectiveDate;
  }

  @Override
  public NumberField < Double > adjustmentAmountField()
  {
    return adjustmentAmount;
  }

  @Override
  public NumberField < Integer > agreementIdField()
  {
    return agreementId;
  }
}
