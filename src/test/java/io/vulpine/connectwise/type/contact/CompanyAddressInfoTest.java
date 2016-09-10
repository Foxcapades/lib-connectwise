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
package io.vulpine.connectwise.type.contact;

import de.bechte.junit.runners.context.HierarchicalContextRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.lang.reflect.Field;

import static org.junit.Assert.assertEquals;

@RunWith( HierarchicalContextRunner.class )
public class CompanyAddressInfoTest
{
  private static final String TEST_STRING = "Test string value.";
  private CompanyAddressInfo addressInfo;

  @Before
  public void setUp() throws Exception
  {
    addressInfo = new CompanyAddressInfo();
  }

  public class AddressLine1
  {
    private final Field field;

    public AddressLine1() throws NoSuchFieldException
    {
      field = CompanyAddressInfo.class.getDeclaredField("addressLine1");
      field.setAccessible(true);
    }

    @Test
    public void getAddressLine1() throws Exception
    {
      field.set(addressInfo, TEST_STRING);
      assertEquals(TEST_STRING, addressInfo.getAddressLine1());
    }

    @Test
    public void setAddressLine1() throws Exception
    {
      addressInfo.setAddressLine1(TEST_STRING);
      assertEquals(TEST_STRING, field.get(addressInfo));
    }
  }

  public class AddressLine2
  {
    private final Field field;

    public AddressLine2() throws NoSuchFieldException
    {
      field = CompanyAddressInfo.class.getDeclaredField("addressLine2");
      field.setAccessible(true);
    }

    @Test
    public void getAddressLine2() throws Exception
    {
      field.set(addressInfo, TEST_STRING);
      assertEquals(TEST_STRING, addressInfo.getAddressLine2());
    }

    @Test
    public void setAddressLine2() throws Exception
    {
      addressInfo.setAddressLine2(TEST_STRING);
      assertEquals(TEST_STRING, field.get(addressInfo));
    }
  }

  public class City
  {
    private final Field field;

    public City() throws NoSuchFieldException
    {
      field = CompanyAddressInfo.class.getDeclaredField("city");
      field.setAccessible(true);
    }


    @Test
    public void getCity() throws Exception
    {     field.set(addressInfo, TEST_STRING);
      assertEquals(TEST_STRING, addressInfo.getCity());

    }

    @Test
    public void setCity() throws Exception
    {     addressInfo.setCity(TEST_STRING);
      assertEquals(TEST_STRING, field.get(addressInfo));

    }
  }

  public class State
  {
    private final Field field;

    public State() throws NoSuchFieldException
    {
      field = CompanyAddressInfo.class.getDeclaredField("state");
      field.setAccessible(true);
    }

    @Test
    public void getState() throws Exception
    {
      field.set(addressInfo, TEST_STRING);
      assertEquals(TEST_STRING, addressInfo.getState());
    }

    @Test
    public void setState() throws Exception
    {
      addressInfo.setState(TEST_STRING);
      assertEquals(TEST_STRING, field.get(addressInfo));
    }
  }

  public class Zip
  {
    private final Field field;

    public Zip() throws NoSuchFieldException
    {
      field = CompanyAddressInfo.class.getDeclaredField("zip");
      field.setAccessible(true);
    }

    @Test
    public void getZip() throws Exception
    {
      field.set(addressInfo, TEST_STRING);
      assertEquals(TEST_STRING, addressInfo.getZip());
    }

    @Test
    public void setZip() throws Exception
    {
      addressInfo.setZip(TEST_STRING);
      assertEquals(TEST_STRING, field.get(addressInfo));
    }
  }

  public class Country
  {
    private final Field field;

    public Country() throws NoSuchFieldException
    {
      field = CompanyAddressInfo.class.getDeclaredField("country");
      field.setAccessible(true);
    }

    @Test
    public void getCountry() throws Exception
    {
      field.set(addressInfo, TEST_STRING);
      assertEquals(TEST_STRING, addressInfo.getCountry());
    }

    @Test
    public void setCountry() throws Exception
    {
      addressInfo.setCountry(TEST_STRING);
      assertEquals(TEST_STRING, field.get(addressInfo));
    }
  }
}
