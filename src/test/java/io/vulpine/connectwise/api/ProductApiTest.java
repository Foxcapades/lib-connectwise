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

public class ProductApiTest
{
  @Test
  public void addDoesNotReturnNull()
  {
    final ProductApi product = new ProductApi(null, null, null, "");
    assertTrue(null != product.add());
  }

  @Test
  public void addReturnsOnlyOneInstance()
  {
    final ProductApi product = new ProductApi(null, null, null, "");
    assertTrue(product.add() == product.add());
  }

  @Test
  public void addOrUpdateDoesNotReturnNull()
  {
    final ProductApi product = new ProductApi(null, null, null, "");
    assertTrue(null != product.addOrUpdate());
  }

  @Test
  public void addOrUpdateReturnsOnlyOneInstance()
  {
    final ProductApi product = new ProductApi(null, null, null, "");
    assertTrue(product.addOrUpdate() == product.addOrUpdate());
  }

  @Test
  public void deleteDoesNotReturnNull()
  {
    final ProductApi product = new ProductApi(null, null, null, "");
    assertTrue(null != product.delete());
  }

  @Test
  public void deleteReturnsOnlyOneInstance()
  {
    final ProductApi product = new ProductApi(null, null, null, "");
    assertTrue(product.delete() == product.delete());
  }

  @Test
  public void findDoesNotReturnNull()
  {
    final ProductApi product = new ProductApi(null, null, null, "");
    assertTrue(null != product.find());
  }

  @Test
  public void findReturnsOnlyOneInstance()
  {
    final ProductApi product = new ProductApi(null, null, null, "");
    assertTrue(product.find() == product.find());
  }

  @Test
  public void getDoesNotReturnNull()
  {
    final ProductApi product = new ProductApi(null, null, null, "");
    assertTrue(null != product.get());
  }

  @Test
  public void getReturnsOnlyOneInstance()
  {
    final ProductApi product = new ProductApi(null, null, null, "");
    assertTrue(product.get() == product.get());
  }

  @Test
  public void loadDoesNotReturnNull()
  {
    final ProductApi product = new ProductApi(null, null, null, "");
    assertTrue(null != product.load());
  }

  @Test
  public void loadReturnsOnlyOneInstance()
  {
    final ProductApi product = new ProductApi(null, null, null, "");
    assertTrue(product.load() == product.load());
  }

  @Test
  public void removeDoesNotReturnNull()
  {
    final ProductApi product = new ProductApi(null, null, null, "");
    assertTrue(null != product.remove());
  }

  @Test
  public void removeReturnsOnlyOneInstance()
  {
    final ProductApi product = new ProductApi(null, null, null, "");
    assertTrue(product.remove() == product.remove());
  }

  @Test
  public void setDoesNotReturnNull()
  {
    final ProductApi product = new ProductApi(null, null, null, "");
    assertTrue(null != product.set());
  }

  @Test
  public void setReturnsOnlyOneInstance()
  {
    final ProductApi product = new ProductApi(null, null, null, "");
    assertTrue(product.set() == product.set());
  }

  @Test
  public void updateDoesNotReturnNull()
  {
    final ProductApi product = new ProductApi(null, null, null, "");
    assertTrue(null != product.update());
  }

  @Test
  public void updateReturnsOnlyOneInstance()
  {
    final ProductApi product = new ProductApi(null, null, null, "");
    assertTrue(product.update() == product.update());
  }

}
