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
package io.vulpine.connectwise.type;

import io.vulpine.connectwise.util.Field;
import io.vulpine.connectwise.util.SimpleObjectField;

import java.util.Date;

public abstract class ConnectwiseCommon
{
  protected Field < Integer > id = new SimpleObjectField<>("Id", false, true);

  protected Field < Date > lastUpdate = new SimpleObjectField<>("LastUpdate");

  protected Field < Date > lastUpdated = new SimpleObjectField<>("LastUpdated");

  protected Field < String > updatedBy = new SimpleObjectField<>("UpdatedBy");

  public Field < Integer > idField()
  {
    return id;
  }

  public Field < Date > lastUpdatedField()
  {
    return lastUpdated;
  }

  public Field < Date > lastUpdateField()
  {
    return lastUpdate;
  }

  public Field < String > updatedByField()
  {
    return updatedBy;
  }
}
