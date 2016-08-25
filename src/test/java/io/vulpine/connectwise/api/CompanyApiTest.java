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
package io.vulpine.connectwise.api;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CompanyApiTest
{
  @Test
  public void addDoesNotReturnNull()
  {
    final CompanyApi company = new CompanyApi(null, null, null, "");
    assertTrue(company.add() != null);
  }

  @Test
  public void addReturnsOnlyOneInstance()
  {
    final CompanyApi company = new CompanyApi(null, null, null, "");
    assertTrue(company.add() == company.add());
  }

  @Test
  public void addOrUpdateDoesNotReturnNull()
  {
    final CompanyApi company = new CompanyApi(null, null, null, "");
    assertTrue(company.addOrUpdate() != null);
  }

  @Test
  public void addOrUpdateReturnsOnlyOneInstance()
  {
    final CompanyApi company = new CompanyApi(null, null, null, "");
    assertTrue(company.addOrUpdate() == company.addOrUpdate());
  }

  @Test
  public void deleteDoesNotReturnNull()
  {
    final CompanyApi company = new CompanyApi(null, null, null, "");
    assertTrue(company.delete() != null);
  }

  @Test
  public void deleteReturnsOnlyOneInstance()
  {
    final CompanyApi company = new CompanyApi(null, null, null, "");
    assertTrue(company.delete() == company.delete());
  }

  @Test
  public void findDoesNotReturnNull()
  {
    final CompanyApi company = new CompanyApi(null, null, null, "");
    assertTrue(company.find() != null);
  }

  @Test
  public void findReturnsOnlyOneInstance()
  {
    final CompanyApi company = new CompanyApi(null, null, null, "");
    assertTrue(company.find() == company.find());
  }

  @Test
  public void getDoesNotReturnNull()
  {
    final CompanyApi company = new CompanyApi(null, null, null, "");
    assertTrue(company.get() != null);
  }

  @Test
  public void getReturnsOnlyOneInstance()
  {
    final CompanyApi company = new CompanyApi(null, null, null, "");
    assertTrue(company.get() == company.get());
  }

  @Test
  public void getAllDoesNotReturnNull()
  {
    final CompanyApi company = new CompanyApi(null, null, null, "");
    assertTrue(company.getAll() != null);
  }

  @Test
  public void getAllReturnsOnlyOneInstance()
  {
    final CompanyApi company = new CompanyApi(null, null, null, "");
    assertTrue(company.getAll() == company.getAll());
  }

  @Test
  public void loadDoesNotReturnNull()
  {
    final CompanyApi company = new CompanyApi(null, null, null, "");
    assertTrue(company.load() != null);
  }

  @Test
  public void loadReturnsOnlyOneInstance()
  {
    final CompanyApi company = new CompanyApi(null, null, null, "");
    assertTrue(company.load() == company.load());
  }

  @Test
  public void setDoesNotReturnNull()
  {
    final CompanyApi company = new CompanyApi(null, null, null, "");
    assertTrue(company.set() != null);
  }

  @Test
  public void setReturnsOnlyOneInstance()
  {
    final CompanyApi company = new CompanyApi(null, null, null, "");
    assertTrue(company.set() == company.set());
  }

  @Test
  public void updateDoesNotReturnNull()
  {
    final CompanyApi company = new CompanyApi(null, null, null, "");
    assertTrue(company.update() != null);
  }

  @Test
  public void updateReturnsOnlyOneInstance()
  {
    final CompanyApi company = new CompanyApi(null, null, null, "");
    assertTrue(company.update() == company.update());
  }

}
