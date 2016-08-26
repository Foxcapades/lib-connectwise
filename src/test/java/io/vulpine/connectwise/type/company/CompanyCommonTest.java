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
package io.vulpine.connectwise.type.company;

import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.*;

public class CompanyCommonTest
{
  @Test
  public void getCompanyName () throws Exception
  {
    final CompanyCommon comp  = new CompanyCommon();
    final Field         field = comp.getClass().getDeclaredField("companyName");
    final String        value = "Test Value.";

    field.setAccessible(true);
    field.set(comp, value);

    assertEquals(value, comp.getCompanyName());
  }

  @Test
  public void setCompanyName () throws Exception
  {
    final CompanyCommon comp  = new CompanyCommon();
    final Field         field = comp.getClass().getDeclaredField("companyName");
    final String        value = "Test Value.";

    field.setAccessible(true);
    comp.setCompanyName(value);

    assertEquals(value, field.get(comp));
  }

  @Test
  public void getCompanyIdentifier () throws Exception
  {
    final CompanyCommon comp  = new CompanyCommon();
    final Field         field = comp.getClass().getDeclaredField("companyIdentifier");
    final String        value = "Test Value.";

    field.setAccessible(true);
    field.set(comp, value);

    assertEquals(value, comp.getCompanyIdentifier());
  }

  @Test
  public void setCompanyIdentifier () throws Exception
  {
    final CompanyCommon comp  = new CompanyCommon();
    final Field         field = comp.getClass().getDeclaredField("companyIdentifier");
    final String        value = "Test Value.";

    field.setAccessible(true);
    comp.setCompanyIdentifier(value);

    assertEquals(value, field.get(comp));
  }

  @Test
  public void getPhoneNumber () throws Exception
  {
    final CompanyCommon comp  = new CompanyCommon();
    final Field         field = comp.getClass().getDeclaredField("phoneNumber");
    final String        value = "Test Value.";

    field.setAccessible(true);
    field.set(comp, value);

    assertEquals(value, comp.getPhoneNumber());
  }

  @Test
  public void setPhoneNumber () throws Exception
  {
    final CompanyCommon comp  = new CompanyCommon();
    final Field         field = comp.getClass().getDeclaredField("phoneNumber");
    final String        value = "Test Value.";

    field.setAccessible(true);
    comp.setPhoneNumber(value);

    assertEquals(value, field.get(comp));
  }

  @Test
  public void getFaxNumber () throws Exception
  {
    final CompanyCommon comp  = new CompanyCommon();
    final Field         field = comp.getClass().getDeclaredField("faxNumber");
    final String        value = "Test Value.";

    field.setAccessible(true);
    field.set(comp, value);

    assertEquals(value, comp.getFaxNumber());
  }

  @Test
  public void setFaxNumber () throws Exception
  {
    final CompanyCommon comp  = new CompanyCommon();
    final Field         field = comp.getClass().getDeclaredField("faxNumber");
    final String        value = "Test Value.";

    field.setAccessible(true);
    comp.setFaxNumber(value);

    assertEquals(value, field.get(comp));
  }

  @Test
  public void getTerritory () throws Exception
  {
    final CompanyCommon comp  = new CompanyCommon();
    final Field         field = comp.getClass().getDeclaredField("territory");
    final String        value = "Test Value.";

    field.setAccessible(true);
    field.set(comp, value);

    assertEquals(value, comp.getTerritory());
  }

  @Test
  public void setTerritory () throws Exception
  {
    final CompanyCommon comp  = new CompanyCommon();
    final Field         field = comp.getClass().getDeclaredField("territory");
    final String        value = "Test Value.";

    field.setAccessible(true);
    comp.setTerritory(value);

    assertEquals(value, field.get(comp));
  }

  @Test
  public void getMarket () throws Exception
  {
    final CompanyCommon comp  = new CompanyCommon();
    final Field         field = comp.getClass().getDeclaredField("market");
    final String        value = "Test Value.";

    field.setAccessible(true);
    field.set(comp, value);

    assertEquals(value, comp.getMarket());
  }

  @Test
  public void setMarket () throws Exception
  {
    final CompanyCommon comp  = new CompanyCommon();
    final Field         field = comp.getClass().getDeclaredField("market");
    final String        value = "Test Value.";

    field.setAccessible(true);
    comp.setMarket(value);

    assertEquals(value, field.get(comp));
  }

  @Test
  public void getType () throws Exception
  {
    final CompanyCommon comp  = new CompanyCommon();
    final Field         field = comp.getClass().getDeclaredField("type");
    final String        value = "Test Value.";

    field.setAccessible(true);
    field.set(comp, value);

    assertEquals(value, comp.getType());
  }

  @Test
  public void setType () throws Exception
  {
    final CompanyCommon comp  = new CompanyCommon();
    final Field         field = comp.getClass().getDeclaredField("type");
    final String        value = "Test Value.";

    field.setAccessible(true);
    comp.setType(value);

    assertEquals(value, field.get(comp));
  }

  @Test
  public void getStatus () throws Exception
  {
    final CompanyCommon comp  = new CompanyCommon();
    final Field         field = comp.getClass().getDeclaredField("status");
    final String        value = "Test Value.";

    field.setAccessible(true);
    field.set(comp, value);

    assertEquals(value, comp.getStatus());
  }

  @Test
  public void setStatus () throws Exception
  {
    final CompanyCommon comp  = new CompanyCommon();
    final Field         field = comp.getClass().getDeclaredField("status");
    final String        value = "Test Value.";

    field.setAccessible(true);
    comp.setStatus(value);

    assertEquals(value, field.get(comp));
  }

  @Test
  public void getDefaultContactId () throws Exception
  {
    final CompanyCommon comp  = new CompanyCommon();
    final Field         field = comp.getClass().getDeclaredField("defaultContactId");
    final int           value = 12345;

    field.setAccessible(true);
    field.set(comp, value);

    assertEquals(value, comp.getDefaultContactId());
  }

  @Test
  public void setDefaultContactId () throws Exception
  {
    final CompanyCommon comp  = new CompanyCommon();
    final Field         field = comp.getClass().getDeclaredField("defaultContactId");
    final int           value = 12345;

    field.setAccessible(true);
    comp.setDefaultContactId(value);

    assertEquals(value, field.get(comp));
  }

  @Test
  public void getDefaultBillingContactId () throws Exception
  {
    final CompanyCommon comp  = new CompanyCommon();
    final Field         field = comp.getClass().getDeclaredField("defaultBillingContactId");
    final int           value = 65432;

    field.setAccessible(true);
    field.set(comp, value);

    assertEquals(value, comp.getDefaultBillingContactId());
  }

  @Test
  public void setDefaultBillingContactId () throws Exception
  {
    final CompanyCommon comp  = new CompanyCommon();
    final Field         field = comp.getClass().getDeclaredField("defaultBillingContactId");
    final int           value = 65432;

    field.setAccessible(true);
    comp.setDefaultBillingContactId(value);

    assertEquals(value, field.get(comp));
  }

}
