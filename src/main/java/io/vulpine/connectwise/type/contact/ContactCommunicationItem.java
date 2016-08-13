package io.vulpine.connectwise.type.contact;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.vulpine.connectwise.type.CwObject;

@SuppressWarnings( "unused" )
public class ContactCommunicationItem extends CwObject
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
