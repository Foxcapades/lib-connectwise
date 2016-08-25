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

package io.vulpine.connectwise.type.configuration;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.vulpine.connectwise.type.ConnectwiseCommon;

@SuppressWarnings( "unused" )
public class ConfigurationQuestion extends ConnectwiseCommon
{
  @JacksonXmlProperty( localName = "QuestionId" )
  protected int questionId;

  @JacksonXmlProperty( localName = "Question" )
  protected String question;

  @JacksonXmlProperty( localName = "SequenceNumber" )
  protected double sequenceNumber;

  @JacksonXmlProperty( localName = "FieldType" )
  protected String fieldType;

  @JacksonXmlProperty( localName = "NumberOfDecimals" )
  protected short numberOfDecimals;

  @JacksonXmlProperty( localName = "Answer" )
  protected String answer;

  public int getQuestionId ()
  {
    return questionId;
  }

  public void setQuestionId ( int questionId )
  {
    this.questionId = questionId;
  }

  public String getQuestion ()
  {
    return question;
  }

  public void setQuestion ( String question )
  {
    this.question = question;
  }

  public double getSequenceNumber ()
  {
    return sequenceNumber;
  }

  public void setSequenceNumber ( double sequenceNumber )
  {
    this.sequenceNumber = sequenceNumber;
  }

  public String getFieldType ()
  {
    return fieldType;
  }

  public void setFieldType ( String fieldType )
  {
    this.fieldType = fieldType;
  }

  public short getNumberOfDecimals ()
  {
    return numberOfDecimals;
  }

  public void setNumberOfDecimals ( short numberOfDecimals )
  {
    this.numberOfDecimals = numberOfDecimals;
  }

  public String getAnswer ()
  {
    return answer;
  }

  public void setAnswer ( String answer )
  {
    this.answer = answer;
  }
}
