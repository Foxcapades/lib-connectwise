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
package io.vulpine.connectwise.type.def;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.vulpine.connectwise.type.def.gen.*;

public interface Component
  extends
  HasId,
  HasProductId,
  HasItemId,
  HasWarehouse,
  HasBin,
  HasItemIdentifier,
  HasDescription,
  HasCost,
  HasPrice,
  HasTaxable,
  HasInactive
{
  @JsonGetter( "SequenceNumber" )
  Integer sequenceNumber();

  @JsonGetter( "ParentId" )
  Integer parentId();

  @JsonGetter( "Quantity" )
  Integer quantity();

  @JsonGetter( "HidePrice" )
  Boolean hidePrice();

  @JsonGetter( "HideItemId" )
  Boolean hideItemId();

  @JsonGetter( "HideDescription" )
  Boolean hideDescription();

  @JsonGetter( "HideQuantity" )
  Boolean hideQuantity();

  @JsonGetter( "Serialized" )
  Boolean serialized();

  @JsonSetter( "SequenceNumber" )
  Component sequenceNumber( final Integer i );

  @JsonSetter( "ParentId" )
  Component parentId( final Integer i );

  @JsonSetter( "Quantity" )
  Component quantity( final Integer i );

  @JsonSetter( "HidePrice" )
  Component hidePrice( final Boolean b );

  @JsonSetter( "HideItemId" )
  Component hideItemId( final Boolean b );

  @JsonSetter( "HideDescription" )
  Component hideDescription( final Boolean b );

  @JsonSetter( "HideQuantity" )
  Component hideQuantity( final Boolean b );

  @JsonSetter( "Serialized" )
  Component serialized( final Boolean b );
}
