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

    assertEquals(value, addition.additionProduct());
  }

  @Test
  public void setAdditionProduct () throws Exception
  {
    final Addition        addition = new Addition();
    final Field           field    = addition.getClass().getDeclaredField("additionProduct");
    final AdditionProduct value    = new AdditionProduct();

    field.setAccessible(true);
    addition.additionProduct(value);

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

    assertEquals(value, addition.quantity(), 0);
  }

  @Test
  public void setQuantity () throws Exception
  {
    final Addition addition = new Addition();
    final Field    field    = addition.getClass().getDeclaredField("quantity");
    final double   value    = 66.6;

    field.setAccessible(true);
    addition.quantity(value);

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

    assertEquals(value, addition.lessIncluded(), 0);
  }

  @Test
  public void setLessIncluded () throws Exception
  {
    final Addition addition = new Addition();
    final Field    field    = addition.getClass().getDeclaredField("lessIncluded");
    final double   value    = 6.66;

    field.setAccessible(true);
    addition.lessIncluded(value);

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

    assertEquals(value, addition.unitPrice(), 0);
  }

  @Test
  public void setUnitPrice () throws Exception
  {
    final Addition addition = new Addition();
    final Field    field    = addition.getClass().getDeclaredField("unitPrice");
    final double   value    = 666.0;

    field.setAccessible(true);
    addition.unitPrice(value);

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

    assertEquals(value, addition.unitCost(), 0);
  }

  @Test
  public void setUnitCost () throws Exception
  {
    final Addition addition = new Addition();
    final Field    field    = addition.getClass().getDeclaredField("unitCost");
    final double   value    = 6.66;

    field.setAccessible(true);
    addition.unitCost(value);

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

    assertEquals(value, addition.effectiveDate());
  }

  @Test
  public void setEffectiveDate () throws Exception
  {
    final Addition addition = new Addition();
    final Field    field    = addition.getClass().getDeclaredField("effectiveDate");
    final Date     value    = new Date();

    field.setAccessible(true);
    addition.effectiveDate(value);

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

    assertEquals(value, addition.cancelledDate());
  }

  @Test
  public void setCancelledDate () throws Exception
  {
    final Addition addition = new Addition();
    final Field    field    = addition.getClass().getDeclaredField("cancelledDate");
    final Date     value    = new Date();

    field.setAccessible(true);
    addition.cancelledDate(value);

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

    assertEquals(value, addition.billCustomer());
  }

  @Test
  public void setBillCustomer () throws Exception
  {
    final Addition     addition = new Addition();
    final Field        field    = addition.getClass().getDeclaredField("billCustomer");
    final BillCustomer value    = BillCustomer.DO_NOT_BILL;

    field.setAccessible(true);
    addition.billCustomer(value);

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

    assertEquals(value, addition.taxable());
  }

  @Test
  public void setTaxable () throws Exception
  {
    final Addition addition = new Addition();
    final Field    field    = addition.getClass().getDeclaredField("taxable");
    final boolean  value    = true;

    field.setAccessible(true);
    addition.taxable(value);

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

    assertEquals(value, addition.serialNumber());
  }

  @Test
  public void setSerialNumber () throws Exception
  {
    final Addition addition = new Addition();
    final Field    field    = addition.getClass().getDeclaredField("serialNumber");
    final String   value    = "Test Value";

    field.setAccessible(true);
    addition.serialNumber(value);

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

    assertEquals(value, addition.invoiceDescription());
  }

  @Test
  public void setInvoiceDescription () throws Exception
  {
    final Addition addition = new Addition();
    final Field    field    = addition.getClass().getDeclaredField("invoiceDescription");
    final String   value    = "Test Value.";

    field.setAccessible(true);
    addition.invoiceDescription(value);

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

    assertEquals(value, addition.purchaseItem());
  }

  @Test
  public void setPurchaseItem () throws Exception
  {
    final Addition addition = new Addition();
    final Field    field    = addition.getClass().getDeclaredField("purchaseItem");
    final boolean  value    = true;

    field.setAccessible(true);
    addition.purchaseItem(value);

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

    assertEquals(value, addition.specialOrder());
  }

  @Test
  public void setSpecialOrder () throws Exception
  {
    final Addition addition = new Addition();
    final Field    field    = addition.getClass().getDeclaredField("specialOrder");
    final boolean  value    = true;

    field.setAccessible(true);
    addition.specialOrder(value);

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

    assertEquals(value, addition.billedQuantity(), 0);
  }

  @Test
  public void setBilledQuantity () throws Exception
  {
    final Addition addition = new Addition();
    final Field    field    = addition.getClass().getDeclaredField("billedQuantity");
    final double   value    = 66.6;

    field.setAccessible(true);
    addition.billedQuantity(value);

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

    assertEquals(value, addition.uom());
  }

  @Test
  public void setUom () throws Exception
  {
    final Addition addition = new Addition();
    final Field    field    = addition.getClass().getDeclaredField("uom");
    final String   value    = "Test Value.";

    field.setAccessible(true);
    addition.uom(value);

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

    assertEquals(value, addition.extPrice(), 0);
  }

  @Test
  public void setExtPrice () throws Exception
  {
    final Addition addition = new Addition();
    final Field    field    = addition.getClass().getDeclaredField("extPrice");
    final double   value    = 66.6;

    field.setAccessible(true);
    addition.extPrice(value);

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

    assertEquals(value, addition.extCost(), 0);
  }

  @Test
  public void setExtCost () throws Exception
  {
    final Addition addition = new Addition();
    final Field    field    = addition.getClass().getDeclaredField("extCost");
    final double   value    = 66.6;

    field.setAccessible(true);
    addition.extCost(value);

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

    assertEquals(value, addition.margin(), 0);
  }

  @Test
  public void setMargin () throws Exception
  {
    final Addition addition = new Addition();
    final Field    field    = addition.getClass().getDeclaredField("margin");
    final double   value    = 66.6;

    field.setAccessible(true);
    addition.margin(value);

    assertEquals(value, field.get(addition));
  }

}
