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
package io.vulpine.connectwise.type.purchasing;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@SuppressWarnings( "unused" )
public class VendorContact
{
  @JacksonXmlProperty(localName = "FirstName")
  protected String FirstName;

  @JacksonXmlProperty(localName = "LastName")
  protected String LastName;

  public String getFirstName ()
  {
    return FirstName;
  }

  public void setFirstName ( final String firstName )
  {
    FirstName = firstName;
  }

  public String getLastName ()
  {
    return LastName;
  }

  public void setLastName ( final String lastName )
  {
    LastName = lastName;
  }
}
