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
package io.vulpine.connectwise.type.agreement.addition;

import io.vulpine.connectwise.type.agreement.BillCustomer;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.Date;

import static org.junit.Assert.*;

public class AdditionTest
{
  @Test
  public void getAdditionProduct () throws Exception
  {
    final Addition        addition = new Addition();
    final Field           field    = addition.getClass().getDeclaredField("additionProduct");
    final AdditionProduct value    = new AdditionProduct();

    field.setAccessible(true);
    field.set(addition, value);

    assertEquals(value, addition.getAdditionProduct());
  }

  @Test
  public void setAdditionProduct () throws Exception
  {
    final Addition        addition = new Addition();
    final Field           field    = addition.getClass().getDeclaredField("additionProduct");
    final AdditionProduct value    = new AdditionProduct();

    field.setAccessible(true);
    addition.setAdditionProduct(value);

    assertEquals(value, field.get(addition));
  }

  @Test
  public void getQuantity () throws Exception
  {
    final Addition addition = new Addition();
    final Field    field    = addition.getClass().getDeclaredField("quantity");
    final double   value    = 66.6;

    field.setAccessible(true);
    field.set(addition, value);

    assertEquals(value, addition.getQuantity(), 0);
  }

  @Test
  public void setQuantity () throws Exception
  {
    final Addition addition = new Addition();
    final Field    field    = addition.getClass().getDeclaredField("quantity");
    final double   value    = 66.6;

    field.setAccessible(true);
    addition.setQuantity(value);

    assertEquals(value, field.get(addition));
  }

  @Test
  public void getLessIncluded () throws Exception
  {
    final Addition addition = new Addition();
    final Field    field    = addition.getClass().getDeclaredField("lessIncluded");
    final double   value    = 6.66;

    field.setAccessible(true);
    field.set(addition, value);

    assertEquals(value, addition.getLessIncluded(), 0);
  }

  @Test
  public void setLessIncluded () throws Exception
  {
    final Addition addition = new Addition();
    final Field    field    = addition.getClass().getDeclaredField("lessIncluded");
    final double   value    = 6.66;

    field.setAccessible(true);
    addition.setLessIncluded(value);

    assertEquals(value, field.get(addition));
  }

  @Test
  public void getUnitPrice () throws Exception
  {
    final Addition addition = new Addition();
    final Field    field    = addition.getClass().getDeclaredField("unitPrice");
    final double   value    = 666.0;

    field.setAccessible(true);
    field.set(addition, value);

    assertEquals(value, addition.getUnitPrice(), 0);
  }

  @Test
  public void setUnitPrice () throws Exception
  {
    final Addition addition = new Addition();
    final Field    field    = addition.getClass().getDeclaredField("unitPrice");
    final double   value    = 666.0;

    field.setAccessible(true);
    addition.setUnitPrice(value);

    assertEquals(value, field.get(addition));
  }

  @Test
  public void getUnitCost () throws Exception
  {
    final Addition addition = new Addition();
    final Field    field    = addition.getClass().getDeclaredField("unitCost");
    final double   value    = 6.66;

    field.setAccessible(true);
    field.set(addition, value);

    assertEquals(value, addition.getUnitCost(), 0);
  }

  @Test
  public void setUnitCost () throws Exception
  {
    final Addition addition = new Addition();
    final Field    field    = addition.getClass().getDeclaredField("unitCost");
    final double   value    = 6.66;

    field.setAccessible(true);
    addition.setUnitCost(value);

    assertEquals(value, field.get(addition));
  }

  @Test
  public void getEffectiveDate () throws Exception
  {
    final Addition addition = new Addition();
    final Field    field    = addition.getClass().getDeclaredField("effectiveDate");
    final Date     value    = new Date();

    field.setAccessible(true);
    field.set(addition, value);

    assertEquals(value, addition.getEffectiveDate());
  }

  @Test
  public void setEffectiveDate () throws Exception
  {
    final Addition addition = new Addition();
    final Field    field    = addition.getClass().getDeclaredField("effectiveDate");
    final Date     value    = new Date();

    field.setAccessible(true);
    addition.setEffectiveDate(value);

    assertEquals(value, field.get(addition));
  }

  @Test
  public void getCancelledDate () throws Exception
  {
    final Addition addition = new Addition();
    final Field    field    = addition.getClass().getDeclaredField("cancelledDate");
    final Date     value    = new Date();

    field.setAccessible(true);
    field.set(addition, value);

    assertEquals(value, addition.getCancelledDate());
  }

  @Test
  public void setCancelledDate () throws Exception
  {
    final Addition addition = new Addition();
    final Field    field    = addition.getClass().getDeclaredField("cancelledDate");
    final Date     value    = new Date();

    field.setAccessible(true);
    addition.setCancelledDate(value);

    assertEquals(value, field.get(addition));
  }

  @Test
  public void getBillCustomer () throws Exception
  {
    final Addition     addition = new Addition();
    final Field        field    = addition.getClass().getDeclaredField("billCustomer");
    final BillCustomer value    = BillCustomer.DO_NOT_BILL;

    field.setAccessible(true);
    field.set(addition, value);

    assertEquals(value, addition.getBillCustomer());
  }

  @Test
  public void setBillCustomer () throws Exception
  {
    final Addition     addition = new Addition();
    final Field        field    = addition.getClass().getDeclaredField("billCustomer");
    final BillCustomer value    = BillCustomer.DO_NOT_BILL;

    field.setAccessible(true);
    addition.setBillCustomer(value);

    assertEquals(value, field.get(addition));
  }

  @Test
  public void isTaxable () throws Exception
  {
    final Addition addition = new Addition();
    final Field    field    = addition.getClass().getDeclaredField("taxable");
    final boolean  value    = true;

    field.setAccessible(true);
    field.set(addition, value);

    assertEquals(value, addition.isTaxable());
  }

  @Test
  public void setTaxable () throws Exception
  {
    final Addition addition = new Addition();
    final Field    field    = addition.getClass().getDeclaredField("taxable");
    final boolean  value    = true;

    field.setAccessible(true);
    addition.setTaxable(value);

    assertEquals(value, field.get(addition));
  }

  @Test
  public void getSerialNumber () throws Exception
  {
    final Addition addition = new Addition();
    final Field    field    = addition.getClass().getDeclaredField("serialNumber");
    final String   value    = "Test Value";

    field.setAccessible(true);
    field.set(addition, value);

    assertEquals(value, addition.getSerialNumber());
  }

  @Test
  public void setSerialNumber () throws Exception
  {
    final Addition addition = new Addition();
    final Field    field    = addition.getClass().getDeclaredField("serialNumber");
    final String   value    = "Test Value";

    field.setAccessible(true);
    addition.setSerialNumber(value);

    assertEquals(value, field.get(addition));
  }

  @Test
  public void getInvoiceDescription () throws Exception
  {
    final Addition addition = new Addition();
    final Field    field    = addition.getClass().getDeclaredField("invoiceDescription");
    final String   value    = "Test Value.";

    field.setAccessible(true);
    field.set(addition, value);

    assertEquals(value, addition.getInvoiceDescription());
  }

  @Test
  public void setInvoiceDescription () throws Exception
  {
    final Addition addition = new Addition();
    final Field    field    = addition.getClass().getDeclaredField("invoiceDescription");
    final String   value    = "Test Value.";

    field.setAccessible(true);
    addition.setInvoiceDescription(value);

    assertEquals(value, field.get(addition));
  }

  @Test
  public void isPurchaseItem () throws Exception
  {
    final Addition addition = new Addition();
    final Field    field    = addition.getClass().getDeclaredField("purchaseItem");
    final boolean  value    = true;

    field.setAccessible(true);
    field.set(addition, value);

    assertEquals(value, addition.isPurchaseItem());
  }

  @Test
  public void setPurchaseItem () throws Exception
  {
    final Addition addition = new Addition();
    final Field    field    = addition.getClass().getDeclaredField("purchaseItem");
    final boolean  value    = true;

    field.setAccessible(true);
    addition.setPurchaseItem(value);

    assertEquals(value, field.get(addition));
  }

  @Test
  public void isSpecialOrder () throws Exception
  {
    final Addition addition = new Addition();
    final Field    field    = addition.getClass().getDeclaredField("specialOrder");
    final boolean  value    = true;

    field.setAccessible(true);
    field.set(addition, value);

    assertEquals(value, addition.isSpecialOrder());
  }

  @Test
  public void setSpecialOrder () throws Exception
  {
    final Addition addition = new Addition();
    final Field    field    = addition.getClass().getDeclaredField("specialOrder");
    final boolean  value    = true;

    field.setAccessible(true);
    addition.setSpecialOrder(value);

    assertEquals(value, field.get(addition));
  }

  @Test
  public void getBilledQuantity () throws Exception
  {
    final Addition addition = new Addition();
    final Field    field    = addition.getClass().getDeclaredField("billedQuantity");
    final double   value    = 66.6;

    field.setAccessible(true);
    field.set(addition, value);

    assertEquals(value, addition.getBilledQuantity(), 0);
  }

  @Test
  public void setBilledQuantity () throws Exception
  {
    final Addition addition = new Addition();
    final Field    field    = addition.getClass().getDeclaredField("billedQuantity");
    final double   value    = 66.6;

    field.setAccessible(true);
    addition.setBilledQuantity(value);

    assertEquals(value, field.get(addition));
  }

  @Test
  public void getUom () throws Exception
  {
    final Addition addition = new Addition();
    final Field    field    = addition.getClass().getDeclaredField("uom");
    final String   value    = "Test Value.";

    field.setAccessible(true);
    field.set(addition, value);

    assertEquals(value, addition.getUom());
  }

  @Test
  public void setUom () throws Exception
  {
    final Addition addition = new Addition();
    final Field    field    = addition.getClass().getDeclaredField("uom");
    final String   value    = "Test Value.";

    field.setAccessible(true);
    addition.setUom(value);

    assertEquals(value, field.get(addition));
  }

  @Test
  public void getExtPrice () throws Exception
  {
    final Addition addition = new Addition();
    final Field    field    = addition.getClass().getDeclaredField("extPrice");
    final double   value    = 66.6;

    field.setAccessible(true);
    field.set(addition, value);

    assertEquals(value, addition.getExtPrice(), 0);
  }

  @Test
  public void setExtPrice () throws Exception
  {
    final Addition addition = new Addition();
    final Field    field    = addition.getClass().getDeclaredField("extPrice");
    final double   value    = 66.6;

    field.setAccessible(true);
    addition.setExtPrice(value);

    assertEquals(value, field.get(addition));
  }

  @Test
  public void getExtCost () throws Exception
  {
    final Addition addition = new Addition();
    final Field    field    = addition.getClass().getDeclaredField("extCost");
    final double   value    = 66.6;

    field.setAccessible(true);
    field.set(addition, value);

    assertEquals(value, addition.getExtCost(), 0);
  }

  @Test
  public void setExtCost () throws Exception
  {
    final Addition addition = new Addition();
    final Field    field    = addition.getClass().getDeclaredField("extCost");
    final double   value    = 66.6;

    field.setAccessible(true);
    addition.setExtCost(value);

    assertEquals(value, field.get(addition));
  }

  @Test
  public void getMargin () throws Exception
  {
    final Addition addition = new Addition();
    final Field    field    = addition.getClass().getDeclaredField("margin");
    final double   value    = 66.6;

    field.setAccessible(true);
    field.set(addition, value);

    assertEquals(value, addition.getMargin(), 0);
  }

  @Test
  public void setMargin () throws Exception
  {
    final Addition addition = new Addition();
    final Field    field    = addition.getClass().getDeclaredField("margin");
    final double   value    = 66.6;

    field.setAccessible(true);
    addition.setMargin(value);

    assertEquals(value, field.get(addition));
  }

}
