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
package io.vulpine.connectwise.type.def.gen;

import io.vulpine.connectwise.type.def.XmlSerializable;
import io.vulpine.connectwise.util.Field;

import java.util.Date;

/**
 * = XmlSerializable Object with a StartDate Field
 *
 * @since 0.10.0
 * @version 1.0.0
 */
public interface HasStartDate extends XmlSerializable
{
  default Date startDate()
  {
    return startDateField().get();
  }

  Field< Date > startDateField();

  HasStartDate startDate( Date d );
}
