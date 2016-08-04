package io.vulpine.connectwise.data.configuration;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.vulpine.connectwise.data.CwObject;

@SuppressWarnings( "unused" )
public class ConfigurationQuestion extends CwObject
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
