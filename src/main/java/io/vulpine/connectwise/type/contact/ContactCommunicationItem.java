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

package io.vulpine.connectwise.type.contact;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.vulpine.connectwise.type.ConnectwiseCommon;

@SuppressWarnings( "unused" )
public class ContactCommunicationItem extends ConnectwiseCommon
{
  public enum Type
  {
    Unknown, EmailAddress, PhoneNumber, FaxNumber
  }

  @JacksonXmlProperty( localName = "Type" )
  protected Type type;

  @JacksonXmlProperty( localName = "CommunicationTypeId" )
  protected int communicationTypeId;

  @JacksonXmlProperty( localName = "Value" )
  protected String value;

  @JacksonXmlProperty( localName = "ValueExtension" )
  protected String valueExtension;

  @JacksonXmlProperty( localName = "IsDefaultForType" )
  protected boolean isDefaultForType;

  public Type getType ()
  {
    return type;
  }

  public void setType ( Type type )
  {
    this.type = type;
  }

  public int getCommunicationTypeId ()
  {
    return communicationTypeId;
  }

  public void setCommunicationTypeId ( int communicationTypeId )
  {
    this.communicationTypeId = communicationTypeId;
  }

  public String getValue ()
  {
    return value;
  }

  public void setValue ( String value )
  {
    this.value = value;
  }

  public String getValueExtension ()
  {
    return valueExtension;
  }

  public void setValueExtension ( String valueExtension )
  {
    this.valueExtension = valueExtension;
  }

  public boolean isDefaultForType ()
  {
    return isDefaultForType;
  }

  public void setDefaultForType ( boolean defaultForType )
  {
    isDefaultForType = defaultForType;
  }
}
