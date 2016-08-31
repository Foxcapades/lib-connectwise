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
package io.vulpine.connectwise.type.company;

import de.bechte.junit.runners.context.HierarchicalContextRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

@RunWith( HierarchicalContextRunner.class )
public class AddressTest
{
  private static final boolean TEST_BOOLEAN = true;

  private static final int TEST_INT = 666;

  private static final double TEST_DOUBLE = 6.66;

  private static final String TEST_STRING = "Test String Value.";

  private Address address;

  @Before
  public void setUp() throws Exception
  {
    address = new Address();
  }

  public class defaultFlag
  {
    private final Field field;

    public defaultFlag() throws NoSuchFieldException
    {
      field = Address.class.getDeclaredField("defaultFlag");
      field.setAccessible(true);
    }

    @Test
    public void isDefaultFlag() throws Exception
    {
      field.set(address, TEST_BOOLEAN);
      assertEquals(TEST_BOOLEAN, address.isDefaultFlag());
    }

    @Test
    public void setDefaultFlag() throws Exception
    {
      address.setDefaultFlag(TEST_BOOLEAN);
      assertEquals(TEST_BOOLEAN, field.get(address));
    }
  }

  public class companyId
  {
    private final Field field;

    public companyId() throws NoSuchFieldException
    {
      field = Address.class.getDeclaredField("companyId");
      field.setAccessible(true);
    }

    @Test
    public void getCompanyId() throws Exception
    {
      field.set(address, TEST_INT);
      assertEquals(TEST_INT, address.getCompanyId());
    }

    @Test
    public void setCompanyId() throws Exception
    {
      address.setCompanyId(TEST_INT);
      assertEquals(TEST_INT, field.get(address));
    }
  }

  public class siteName
  {
    private final Field field;

    public siteName() throws NoSuchFieldException
    {
      field = Address.class.getDeclaredField("siteName");
      field.setAccessible(true);
    }

    @Test
    public void getSiteName() throws Exception
    {
      field.set(address, TEST_STRING);
      assertEquals(TEST_STRING, address.getSiteName());
    }

    @Test
    public void setSiteName() throws Exception
    {
      address.setSiteName(TEST_STRING);
      assertEquals(TEST_STRING, field.get(address));
    }
  }

  public class inactiveFlag
  {
    private final Field field;

    public inactiveFlag() throws NoSuchFieldException
    {
      field = Address.class.getDeclaredField("inactiveFlag");
      field.setAccessible(true);
    }

    @Test
    public void isInactiveFlag() throws Exception
    {
      field.set(address, TEST_BOOLEAN);
      assertEquals(TEST_BOOLEAN, address.isInactiveFlag());
    }

    @Test
    public void setInactiveFlag() throws Exception
    {
      address.setInactiveFlag(TEST_BOOLEAN);
      assertEquals(TEST_BOOLEAN, field.get(address));
    }
  }

  public class defaultBillFlag
  {
    private final Field field;

    public defaultBillFlag() throws NoSuchFieldException
    {
      field = Address.class.getDeclaredField("defaultBillFlag");
      field.setAccessible(true);
    }

    @Test
    public void isDefaultBillFlag() throws Exception
    {
      field.set(address, TEST_BOOLEAN);
      assertEquals(TEST_BOOLEAN, address.isDefaultBillFlag());
    }

    @Test
    public void setDefaultBillFlag() throws Exception
    {
      address.setDefaultBillFlag(TEST_BOOLEAN);
      assertEquals(TEST_BOOLEAN, field.get(address));
    }
  }

  public class defaultShipFlag
  {
    private final Field field;

    public defaultShipFlag() throws NoSuchFieldException
    {
      field = Address.class.getDeclaredField("defaultShipFlag");
      field.setAccessible(true);
    }

    @Test
    public void isDefaultShipFlag() throws Exception
    {
      field.set(address, TEST_BOOLEAN);
      assertEquals(TEST_BOOLEAN, address.isDefaultShipFlag());
    }

    @Test
    public void setDefaultShipFlag() throws Exception
    {
      address.setDefaultShipFlag(TEST_BOOLEAN);
      assertEquals(TEST_BOOLEAN, field.get(address));
    }
  }

  public class city
  {
    private final Field field;

    public city() throws NoSuchFieldException
    {
      field = Address.class.getDeclaredField("city");
      field.setAccessible(true);
    }

    @Test
    public void getCity() throws Exception
    {
      field.set(address, TEST_STRING);
      assertEquals(TEST_STRING, address.getCity());
    }

    @Test
    public void setCity() throws Exception
    {
      address.setCity(TEST_STRING);
      assertEquals(TEST_STRING, field.get(address));
    }
  }

  public class state
  {
    private final Field field;

    public state() throws NoSuchFieldException
    {
      field = Address.class.getDeclaredField("state");
      field.setAccessible(true);
    }

    @Test
    public void getState() throws Exception
    {
      field.set(address, TEST_STRING);
      assertEquals(TEST_STRING, address.getState());
    }

    @Test
    public void setState() throws Exception
    {
      address.setState(TEST_STRING);
      assertEquals(TEST_STRING, field.get(address));
    }
  }

  public class zip
  {
    private final Field field;

    public zip() throws NoSuchFieldException
    {
      field = Address.class.getDeclaredField("zip");
      field.setAccessible(true);
    }

    @Test
    public void getZip() throws Exception
    {
      field.set(address, TEST_STRING);
      assertEquals(TEST_STRING, address.getZip());
    }

    @Test
    public void setZip() throws Exception
    {
      address.setZip(TEST_STRING);
      assertEquals(TEST_STRING, field.get(address));
    }
  }

  public class country
  {
    private final Field field;

    public country() throws NoSuchFieldException
    {
      field = Address.class.getDeclaredField("country");
      field.setAccessible(true);
    }

    @Test
    public void getCountry() throws Exception
    {
      field.set(address, TEST_STRING);
      assertEquals(TEST_STRING, address.getCountry());
    }

    @Test
    public void setCountry() throws Exception
    {
      address.setCountry(TEST_STRING);
      assertEquals(TEST_STRING, field.get(address));
    }
  }

  public class streetLines
  {
    final List < String > lines = new ArrayList < String >();

    private final Field field;

    public streetLines() throws NoSuchFieldException
    {
      field = Address.class.getDeclaredField("streetLines");
      field.setAccessible(true);
      lines.add(TEST_STRING);
      lines.add(TEST_STRING);
      lines.add(TEST_STRING);
      lines.add(TEST_STRING);
    }

    @Test
    public void getStreetLines() throws Exception
    {
      field.set(address, lines);
      assertSame(lines, address.getStreetLines());
    }

    @Test
    public void setStreetLines() throws Exception
    {
      address.setStreetLines(lines);
      assertSame(lines, field.get(address));
    }
  }
}
