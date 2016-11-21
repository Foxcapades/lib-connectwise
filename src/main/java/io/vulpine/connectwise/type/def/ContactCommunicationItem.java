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
import io.vulpine.connectwise.type.def.gen.HasDescription;
import io.vulpine.connectwise.type.def.gen.HasId;

public interface ContactCommunicationItem extends HasId, HasDescription
{
  @JsonGetter( "Type" )
  String type();

  @JsonSetter( "Type" )
  ContactCommunicationItem type( final String s );

  @JsonGetter( "CommunicationTypeId" )
  Integer communicationTypeId();

  @JsonSetter( "CommunicationTypeId" )
  ContactCommunicationItem communicationTypeId( final Integer i );

  @JsonGetter( "Value" )
  String value();

  @JsonSetter( "Value" )
  ContactCommunicationItem value( final String s );

  @JsonGetter( "ValueExtension" )
  String valueExtension();

  @JsonSetter( "ValueExtension" )
  ContactCommunicationItem valueExtension( final String s );

  @JsonGetter( "IsDefaultForType" )
  Boolean isDefaultForType();

  @JsonSetter( "IsDefaultForType" )
  ContactCommunicationItem isDefaultForType( final Boolean s );
}
