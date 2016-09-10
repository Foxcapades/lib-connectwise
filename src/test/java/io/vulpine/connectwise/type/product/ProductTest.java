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
package io.vulpine.connectwise.type.product;

import org.junit.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ProductTest
{
  @Test
  public void getType () throws Exception
  {
    final Product product = new Product();
    final Field   field   = product.getClass().getDeclaredField("type");
    final Object  value   = "";

    field.setAccessible(true);
    field.set(product, value);

    assertEquals(value, product.getType());
  }

  @Test
  public void setType () throws Exception
  {
    final Product product = new Product();
    final Field   field   = product.getClass().getDeclaredField("type");
    final String  value   = "Test Value.";

    field.setAccessible(true);
    product.setType(value);

    assertEquals(value, field.get(product));
  }

  @Test
  public void getCategory () throws Exception
  {
    final Product product = new Product();
    final Field   field   = product.getClass().getDeclaredField("category");
    final String  value   = "Test Value.";

    field.setAccessible(true);
    field.set(product, value);

    assertEquals(value, product.getCategory());
  }

  @Test
  public void setCategory () throws Exception
  {
    final Product product = new Product();
    final Field   field   = product.getClass().getDeclaredField("category");
    final String  value   = "Test Value.";

    field.setAccessible(true);
    product.setCategory(value);

    assertEquals(value, field.get(product));
  }

  @Test
  public void getSubCategory () throws Exception
  {
    final Product product = new Product();
    final Field   field   = product.getClass().getDeclaredField("subCategory");
    final String  value   = "Test Value.";

    field.setAccessible(true);
    field.set(product, value);

    assertEquals(value, product.getSubCategory());
  }

  @Test
  public void setSubCategory () throws Exception
  {
    final Product product = new Product();
    final Field   field   = product.getClass().getDeclaredField("subCategory");
    final String  value   = "Test Value.";

    field.setAccessible(true);
    product.setSubCategory(value);

    assertEquals(value, field.get(product));
  }

  @Test
  public void getUom () throws Exception
  {
    final Product product = new Product();
    final Field   field   = product.getClass().getDeclaredField("uom");
    final String  value   = "Test Value.";

    field.setAccessible(true);
    field.set(product, value);

    assertEquals(value, product.getUom());
  }

  @Test
  public void setUom () throws Exception
  {
    final Product product = new Product();
    final Field   field   = product.getClass().getDeclaredField("uom");
    final String  value   = "Test Value.";

    field.setAccessible(true);
    product.setUom(value);

    assertEquals(value, field.get(product));
  }

  @Test
  public void getLongDescription () throws Exception
  {
    final Product product = new Product();
    final Field   field   = product.getClass().getDeclaredField("longDescription");
    final String  value   = "Test Value.";

    field.setAccessible(true);
    field.set(product, value);

    assertEquals(value, product.getLongDescription());
  }

  @Test
  public void setLongDescription () throws Exception
  {
    final Product product = new Product();
    final Field   field   = product.getClass().getDeclaredField("longDescription");
    final String  value   = "Test Value.";

    field.setAccessible(true);
    product.setLongDescription(value);

    assertEquals(value, field.get(product));
  }

  @Test
  public void getManufacturer () throws Exception
  {
    final Product product = new Product();
    final Field   field   = product.getClass().getDeclaredField("manufacturer");
    final String  value   = "Test Value.";

    field.setAccessible(true);
    field.set(product, value);

    assertEquals(value, product.getManufacturer());
  }

  @Test
  public void setManufacturer () throws Exception
  {
    final Product product = new Product();
    final Field   field   = product.getClass().getDeclaredField("manufacturer");
    final String  value   = "Test Value.";

    field.setAccessible(true);
    product.setManufacturer(value);

    assertEquals(value, field.get(product));
  }

  @Test
  public void getVendor () throws Exception
  {
    final Product product = new Product();
    final Field   field   = product.getClass().getDeclaredField("vendor");
    final String  value   = "Test Value.";

    field.setAccessible(true);
    field.set(product, value);

    assertEquals(value, product.getVendor());
  }

  @Test
  public void setVendor () throws Exception
  {
    final Product product = new Product();
    final Field   field   = product.getClass().getDeclaredField("vendor");
    final String  value   = "Test Value.";

    field.setAccessible(true);
    product.setVendor(value);

    assertEquals(value, field.get(product));
  }

  @Test
  public void getVendorSku () throws Exception
  {
    final Product product = new Product();
    final Field   field   = product.getClass().getDeclaredField("vendorSku");
    final String  value   = "Test Value.";

    field.setAccessible(true);
    field.set(product, value);

    assertEquals(value, product.getVendorSku());
  }

  @Test
  public void setVendorSku () throws Exception
  {
    final Product product = new Product();
    final Field   field   = product.getClass().getDeclaredField("vendorSku");
    final String  value   = "Test Value.";

    field.setAccessible(true);
    product.setVendorSku(value);

    assertEquals(value, field.get(product));
  }

  @Test
  public void getProductClass () throws Exception
  {
    final Product product = new Product();
    final Field   field   = product.getClass().getDeclaredField("productClass");
    final String  value   = "Test Value.";

    field.setAccessible(true);
    field.set(product, value);

    assertEquals(value, product.getProductClass());
  }

  @Test
  public void setProductClass () throws Exception
  {
    final Product product = new Product();
    final Field   field   = product.getClass().getDeclaredField("productClass");
    final String  value   = "Test Value.";

    field.setAccessible(true);
    product.setProductClass(value);

    assertEquals(value, field.get(product));
  }

  @Test
  public void isPhaseProduct () throws Exception
  {
    final Product product = new Product();
    final Field   field   = product.getClass().getDeclaredField("phaseProduct");
    final boolean value   = true;

    field.setAccessible(true);
    field.set(product, value);

    assertEquals(value, product.isPhaseProduct());
  }

  @Test
  public void setPhaseProduct () throws Exception
  {
    final Product product = new Product();
    final Field   field   = product.getClass().getDeclaredField("phaseProduct");
    final boolean value   = true;

    field.setAccessible(true);
    product.setPhaseProduct(value);

    assertEquals(value, field.get(product));
  }

  @Test
  public void getManufacturerPartNumber () throws Exception
  {
    final Product product = new Product();
    final Field   field   = product.getClass().getDeclaredField("manufacturerPartNumber");
    final String  value   = "Test Value.";

    field.setAccessible(true);
    field.set(product, value);

    assertEquals(value, product.getManufacturerPartNumber());
  }

  @Test
  public void setManufacturerPartNumber () throws Exception
  {
    final Product product = new Product();
    final Field   field   = product.getClass().getDeclaredField("manufacturerPartNumber");
    final String  value   = "Test Value.";

    field.setAccessible(true);
    product.setManufacturerPartNumber(value);

    assertEquals(value, field.get(product));
  }

  @Test
  public void getPriceAttribute () throws Exception
  {
    final Product product = new Product();
    final Field   field   = product.getClass().getDeclaredField("priceAttribute");
    final String  value   = "Test Value.";

    field.setAccessible(true);
    field.set(product, value);

    assertEquals(value, product.getPriceAttribute());
  }

  @Test
  public void setPriceAttribute () throws Exception
  {
    final Product product = new Product();
    final Field   field   = product.getClass().getDeclaredField("priceAttribute");
    final String  value   = "Test Value.";

    field.setAccessible(true);
    product.setPriceAttribute(value);

    assertEquals(value, field.get(product));
  }

  @Test
  public void getComponents () throws Exception
  {
    final Product            product = new Product();
    final Field              field   = product.getClass().getDeclaredField("components");
    final List < Component > value   = new ArrayList < Component >();
    value.add(new Component());
    value.add(new Component());
    value.add(new Component());

    field.setAccessible(true);
    field.set(product, value);

    assertEquals(value, product.getComponents());
  }

  @Test
  public void setComponents () throws Exception
  {
    final Product            product = new Product();
    final Field              field   = product.getClass().getDeclaredField("components");
    final List < Component > value   = new ArrayList < Component >();
    value.add(new Component());
    value.add(new Component());
    value.add(new Component());

    field.setAccessible(true);
    product.setComponents(value);

    assertEquals(value, field.get(product));
  }

}
