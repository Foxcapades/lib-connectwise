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
