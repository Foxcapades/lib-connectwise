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

package io.vulpine.connectwise.type.agreement;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Field;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@RunWith( Parameterized.class )
public class ApplicationUnitTest
{
  private static Field value;

  private final ApplicationUnit type;

  public ApplicationUnitTest( ApplicationUnit type )
  {
    this.type = type;
  }

  @BeforeClass
  public static void setUpClass() throws NoSuchFieldException
  {
    value = ApplicationUnit.class.getDeclaredField("value");
    value.setAccessible(true);
  }

  @Parameterized.Parameters( name = "{index}: {0}" )
  public static Object[] data()
  {
    return ApplicationUnit.values();
  }

  @Test
  public void toString_returns_enum_value() throws Exception
  {
    assertEquals(value.get(type), type.toString());
  }

  @Test
  public void fromString_returns_enum_instance_by_value() throws Exception
  {
    assertEquals(type, ApplicationUnit.fromString((String) value.get(type)));
  }

  @Test
  public void fromString_returns_null_on_unknown_value()
  {
    assertNull(ApplicationUnit.fromString("asdl;fjfasd"));
  }

}
