package io.vulpine.connectwise.type.configuration;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.vulpine.connectwise.type.ConnectwiseCommon;

@SuppressWarnings( "unused" )
public class ConfigurationType extends ConnectwiseCommon
{
  @JacksonXmlProperty( localName = "Name")
  protected String name;

  @JacksonXmlProperty( localName = "InactiveFlag" )
  protected boolean inactiveFlag;

  @JacksonXmlProperty( localName = "SystemFlag" )
  protected boolean systemFlag;

  @JacksonXmlProperty (localName = "ConfigurationTypeQuestions")
  protected ConfigurationTypeQuestion[] configurationTypeQuestions;

  public String getName ()
  {
    return name;
  }

  public void setName ( String name )
  {
    this.name = name;
  }

  public boolean isInactiveFlag ()
  {
    return inactiveFlag;
  }

  public void setInactiveFlag ( boolean inactiveFlag )
  {
    this.inactiveFlag = inactiveFlag;
  }

  public boolean isSystemFlag ()
  {
    return systemFlag;
  }

  public void setSystemFlag ( boolean systemFlag )
  {
    this.systemFlag = systemFlag;
  }

  public ConfigurationTypeQuestion[] getConfigurationTypeQuestions ()
  {
    return configurationTypeQuestions;
  }

  public void setConfigurationTypeQuestions ( ConfigurationTypeQuestion[] configurationTypeQuestions )
  {
    this.configurationTypeQuestions = configurationTypeQuestions;
  }
}
