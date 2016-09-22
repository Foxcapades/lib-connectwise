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

package io.vulpine.connectwise.type.configuration;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.vulpine.connectwise.type.ConnectwiseCommon;

@SuppressWarnings( "unused" )
public class ConfigurationTypeQuestion extends ConnectwiseCommon
{
  @JacksonXmlProperty( localName = "FieldType" )
  protected String fieldType;

  @JacksonXmlProperty( localName = "EntryType" )
  protected String entryType;

  @JacksonXmlProperty( localName = "ConfigurationTypeId" )
  protected Integer configurationTypeId;

  @JacksonXmlProperty( localName = "SequenceNumber" )
  protected Double sequenceNumber;

  @JacksonXmlProperty( localName = "Question" )
  protected String question;

  @JacksonXmlProperty( localName = "NumberOfDecimals" )
  protected short numberOfDecimals;

  @JacksonXmlProperty( localName = "RequiredFlag" )
  protected Boolean requiredFlag;

  @JacksonXmlProperty( localName = "InactiveFlag" )
  protected Boolean inactiveFlag;

  @JacksonXmlProperty( localName = "PossibleResponses" )
  protected String possibleResponses;

  public String getFieldType ()
  {
    return fieldType;
  }

  public void setFieldType ( String fieldType )
  {
    this.fieldType = fieldType;
  }

  public String getEntryType ()
  {
    return entryType;
  }

  public void setEntryType ( String entryType )
  {
    this.entryType = entryType;
  }

  public Integer getConfigurationTypeId ()
  {
    return configurationTypeId;
  }

  public void setConfigurationTypeId ( Integer configurationTypeId )
  {
    this.configurationTypeId = configurationTypeId;
  }

  public Double getSequenceNumber ()
  {
    return sequenceNumber;
  }

  public void setSequenceNumber ( Double sequenceNumber )
  {
    this.sequenceNumber = sequenceNumber;
  }

  public String getQuestion ()
  {
    return question;
  }

  public void setQuestion ( String question )
  {
    this.question = question;
  }

  public short getNumberOfDecimals ()
  {
    return numberOfDecimals;
  }

  public void setNumberOfDecimals ( short numberOfDecimals )
  {
    this.numberOfDecimals = numberOfDecimals;
  }

  public Boolean isRequiredFlag ()
  {
    return requiredFlag;
  }

  public void setRequiredFlag ( Boolean requiredFlag )
  {
    this.requiredFlag = requiredFlag;
  }

  public Boolean isInactiveFlag ()
  {
    return inactiveFlag;
  }

  public void setInactiveFlag ( Boolean inactiveFlag )
  {
    this.inactiveFlag = inactiveFlag;
  }

  public String getPossibleResponses ()
  {
    return possibleResponses;
  }

  public void setPossibleResponses ( String possibleResponses )
  {
    this.possibleResponses = possibleResponses;
  }
}
