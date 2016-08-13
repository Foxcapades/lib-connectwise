package io.vulpine.connectwise.type.configuration;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.vulpine.connectwise.type.CwObject;

@SuppressWarnings( "unused" )
public class ConfigurationTypeQuestion extends CwObject
{
  @JacksonXmlProperty( localName = "FieldType" )
  protected String fieldType;

  @JacksonXmlProperty( localName = "EntryType" )
  protected String entryType;

  @JacksonXmlProperty( localName = "ConfigurationTypeId" )
  protected int configurationTypeId;

  @JacksonXmlProperty( localName = "SequenceNumber" )
  protected double sequenceNumber;

  @JacksonXmlProperty( localName = "Question" )
  protected String question;

  @JacksonXmlProperty( localName = "NumberOfDecimals" )
  protected short numberOfDecimals;

  @JacksonXmlProperty( localName = "RequiredFlag" )
  protected boolean requiredFlag;

  @JacksonXmlProperty( localName = "InactiveFlag" )
  protected boolean inactiveFlag;

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

  public int getConfigurationTypeId ()
  {
    return configurationTypeId;
  }

  public void setConfigurationTypeId ( int configurationTypeId )
  {
    this.configurationTypeId = configurationTypeId;
  }

  public double getSequenceNumber ()
  {
    return sequenceNumber;
  }

  public void setSequenceNumber ( double sequenceNumber )
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

  public boolean isRequiredFlag ()
  {
    return requiredFlag;
  }

  public void setRequiredFlag ( boolean requiredFlag )
  {
    this.requiredFlag = requiredFlag;
  }

  public boolean isInactiveFlag ()
  {
    return inactiveFlag;
  }

  public void setInactiveFlag ( boolean inactiveFlag )
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
