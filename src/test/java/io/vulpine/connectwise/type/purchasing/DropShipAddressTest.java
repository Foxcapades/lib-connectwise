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
package io.vulpine.connectwise.type.purchasing;

import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.assertEquals;

public class DropShipAddressTest
{
  @Test
  public void getContactName() throws Exception
  {
    final DropShipAddress address = new DropShipAddress();
    final Field prop = address.getClass().getDeclaredField("contactName");
    final String value = "Test contact name";

    prop.setAccessible(true);
    prop.set(address, value);

    assertEquals(value, address.getContactName());
  }

  @Test
  public void setContactName() throws Exception
  {
    final DropShipAddress address = new DropShipAddress();
    final Field prop = address.getClass().getDeclaredField("contactName");
    final String value = "Test contact name";

    prop.setAccessible(true);
    address.setContactName(value);

    assertEquals(value, prop.get(address));
  }

  @Test
  public void getPOPhone() throws Exception
  {
    final DropShipAddress address = new DropShipAddress();
    final Field prop = address.getClass().getDeclaredField("poPhone");
    final String value = "Test value";

    prop.setAccessible(true);
    prop.set(address, value);

    assertEquals(value, address.getPoPhone());
  }

  @Test
  public void setPOPhone() throws Exception
  {
    final DropShipAddress address = new DropShipAddress();
    final Field prop = address.getClass().getDeclaredField("poPhone");
    final String value = "Test value";

    prop.setAccessible(true);
    address.setPoPhone(value);

    assertEquals(value, prop.get(address));
  }

  @Test
  public void getPhoneExt() throws Exception
  {
    final DropShipAddress address = new DropShipAddress();
    final Field prop = address.getClass().getDeclaredField("phoneExt");
    final String value = "Test value";

    prop.setAccessible(true);
    prop.set(address, value);

    assertEquals(value, address.getPhoneExt());
  }

  @Test
  public void setPhoneExt() throws Exception
  {
    final DropShipAddress address = new DropShipAddress();
    final Field prop = address.getClass().getDeclaredField("phoneExt");
    final String value = "Test value";

    prop.setAccessible(true);
    address.setPhoneExt(value);

    assertEquals(value, prop.get(address));
  }

  @Test
  public void getSiteName() throws Exception
  {
    final DropShipAddress address = new DropShipAddress();
    final Field prop = address.getClass().getDeclaredField("siteName");
    final String value = "Test value";

    prop.setAccessible(true);
    prop.set(address, value);

    assertEquals(value, address.getSiteName());
  }

  @Test
  public void setSiteName() throws Exception
  {
    final DropShipAddress address = new DropShipAddress();
    final Field prop = address.getClass().getDeclaredField("siteName");
    final String value = "Test value";

    prop.setAccessible(true);
    address.setSiteName(value);

    assertEquals(value, prop.get(address));
  }

  @Test
  public void getStreetLine1() throws Exception
  {
    final DropShipAddress address = new DropShipAddress();
    final Field prop = address.getClass().getDeclaredField("streetLine1");
    final String value = "Test value";

    prop.setAccessible(true);
    prop.set(address, value);

    assertEquals(value, address.getStreetLine1());
  }

  @Test
  public void setStreetLine1() throws Exception
  {
    final DropShipAddress address = new DropShipAddress();
    final Field prop = address.getClass().getDeclaredField("streetLine1");
    final String value = "Test value";

    prop.setAccessible(true);
    address.setStreetLine1(value);

    assertEquals(value, prop.get(address));
  }

  @Test
  public void getStreetLine2() throws Exception
  {
    final DropShipAddress address = new DropShipAddress();
    final Field prop = address.getClass().getDeclaredField("streetLine2");
    final String value = "Test value";

    prop.setAccessible(true);
    prop.set(address, value);

    assertEquals(value, address.getStreetLine2());
  }

  @Test
  public void setStreetLine2() throws Exception
  {
    final DropShipAddress address = new DropShipAddress();
    final Field prop = address.getClass().getDeclaredField("streetLine2");
    final String value = "Test value";

    prop.setAccessible(true);
    address.setStreetLine2(value);

    assertEquals(value, prop.get(address));
  }

  @Test
  public void getCity() throws Exception
  {
    final DropShipAddress address = new DropShipAddress();
    final Field prop = address.getClass().getDeclaredField("city");
    final String value = "Test value";

    prop.setAccessible(true);
    prop.set(address, value);

    assertEquals(value, address.getCity());
  }

  @Test
  public void setCity() throws Exception
  {
    final DropShipAddress address = new DropShipAddress();
    final Field prop = address.getClass().getDeclaredField("city");
    final String value = "Test value";

    prop.setAccessible(true);
    address.setCity(value);

    assertEquals(value, prop.get(address));
  }

  @Test
  public void getCountry() throws Exception
  {
    final DropShipAddress address = new DropShipAddress();
    final Field prop = address.getClass().getDeclaredField("country");
    final String value = "Test value";

    prop.setAccessible(true);
    prop.set(address, value);

    assertEquals(value, address.getCountry());
  }

  @Test
  public void setCountry() throws Exception
  {
    final DropShipAddress address = new DropShipAddress();
    final Field prop = address.getClass().getDeclaredField("country");
    final String value = "Test value";

    prop.setAccessible(true);
    address.setCountry(value);

    assertEquals(value, prop.get(address));
  }

  @Test
  public void getState() throws Exception
  {
    final DropShipAddress address = new DropShipAddress();
    final Field prop = address.getClass().getDeclaredField("state");
    final String value = "Test value";

    prop.setAccessible(true);
    prop.set(address, value);

    assertEquals(value, address.getState());
  }

  @Test
  public void setState() throws Exception
  {
    final DropShipAddress address = new DropShipAddress();
    final Field prop = address.getClass().getDeclaredField("state");
    final String value = "Test value";

    prop.setAccessible(true);
    address.setState(value);

    assertEquals(value, prop.get(address));
  }

  @Test
  public void getZip() throws Exception
  {
    final DropShipAddress address = new DropShipAddress();
    final Field prop = address.getClass().getDeclaredField("zip");
    final String value = "Test value";

    prop.setAccessible(true);
    prop.set(address, value);

    assertEquals(value, address.getZip());
  }

  @Test
  public void setZip() throws Exception
  {
    final DropShipAddress address = new DropShipAddress();
    final Field prop = address.getClass().getDeclaredField("zip");
    final String value = "Test value";

    prop.setAccessible(true);
    address.setZip(value);

    assertEquals(value, prop.get(address));

  }
}
