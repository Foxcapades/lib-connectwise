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
package io.vulpine.connectwise.type.invoice;

import de.bechte.junit.runners.context.HierarchicalContextRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.lang.reflect.Field;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

@RunWith( HierarchicalContextRunner.class )
public class InvoiceTest
{
  private static final String  TEST_STRING  = "Test string value.";

  private static final boolean TEST_BOOLEAN = true;

  private static final int     TEST_INT     = 666;

  private static final Date    TEST_DATE    = new Date();

  private static final double  TEST_DOUBLE  = 6.66;

  private static Invoice invoice = new Invoice();
  private static Field field;

  @Before
  public void setUp()
  {
    invoice = new Invoice();
  }

  public class IsClientLocation
  {
    @Before
    public void setUp() throws Exception
    {
      field = Invoice.class.getDeclaredField("isClientLocation");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(invoice, TEST_BOOLEAN);
      assertEquals(TEST_BOOLEAN, invoice.isClientLocation());
    }

    @Test
    public void clientLocation() throws Exception
    {
      invoice.isClientLocation(TEST_BOOLEAN);
      assertEquals(TEST_BOOLEAN, field.get(invoice));
    }
  }

  public class Taxable
  {
    @Before
    public void setUp() throws Exception
    {
      field = Invoice.class.getDeclaredField("taxable");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(invoice, TEST_BOOLEAN);
      assertEquals(TEST_BOOLEAN, invoice.taxable());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      invoice.taxable(TEST_BOOLEAN);
      assertEquals(TEST_BOOLEAN, field.get(invoice));
    }
  }

  public class Email
  {
    @Before
    public void setUp() throws Exception
    {
      field = Invoice.class.getDeclaredField("email");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(invoice, TEST_BOOLEAN);
      assertEquals(TEST_BOOLEAN, invoice.email());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      invoice.email(TEST_BOOLEAN);
      assertEquals(TEST_BOOLEAN, field.get(invoice));
    }
  }

  public class Closed
  {
    @Before
    public void setUp() throws Exception
    {
      field = Invoice.class.getDeclaredField("closed");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(invoice, TEST_BOOLEAN);
      assertEquals(TEST_BOOLEAN, invoice.closed());
    }

    @Test
    public void closed() throws Exception
    {
      invoice.closed(TEST_BOOLEAN);
      assertEquals(TEST_BOOLEAN, field.get(invoice));
    }
  }

  public class Sent
  {
    @Before
    public void setUp() throws Exception
    {
      field = Invoice.class.getDeclaredField("sent");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(invoice, TEST_BOOLEAN);
      assertEquals(TEST_BOOLEAN, invoice.sent());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      invoice.sent(TEST_BOOLEAN);
      assertEquals(TEST_BOOLEAN, field.get(invoice));
    }
  }

  public class GlPosted
  {
    @Before
    public void setUp() throws Exception
    {
      field = Invoice.class.getDeclaredField("glPosted");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(invoice, TEST_BOOLEAN);
      assertEquals(TEST_BOOLEAN, invoice.glPosted());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      invoice.glPosted(TEST_BOOLEAN);
      assertEquals(TEST_BOOLEAN, field.get(invoice));
    }
  }

  public class DueDate
  {
    @Before
    public void setUp() throws Exception
    {
      field = Invoice.class.getDeclaredField("dueDate");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(invoice, TEST_DATE);
      assertSame(TEST_DATE, invoice.dueDate());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      invoice.dueDate(TEST_DATE);
      assertSame(TEST_DATE, field.get(invoice));
    }
  }

  public class InvoiceDate
  {
    @Before
    public void setUp() throws Exception
    {
      field = Invoice.class.getDeclaredField("invoiceDate");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(invoice, TEST_DATE);
      assertSame(TEST_DATE, invoice.invoiceDate());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      invoice.invoiceDate(TEST_DATE);
      assertSame(TEST_DATE, field.get(invoice));
    }
  }

  public class InvoiceType
  {
    @Before
    public void setUp() throws Exception
    {
      field = Invoice.class.getDeclaredField("invoiceType");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.invoiceType());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      invoice.invoiceType(TEST_STRING);
      assertEquals(TEST_STRING, field.get(invoice));
    }
  }

  public class DownpaymentAmount
  {
    @Before
    public void setUp() throws Exception
    {
      field = Invoice.class.getDeclaredField("downpaymentAmount");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(invoice, TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, invoice.downpaymentAmount(), 0);
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      invoice.downpaymentAmount(TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, field.get(invoice));
    }
  }

  public class InvoiceAmount
  {
    @Before
    public void setUp() throws Exception
    {
      field = Invoice.class.getDeclaredField("invoiceAmount");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(invoice, TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, invoice.invoiceAmount(), 0);
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      invoice.invoiceAmount(TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, field.get(invoice));
    }
  }

  public class ProjectBillingAmount
  {
    @Before
    public void setUp() throws Exception
    {
      field = Invoice.class.getDeclaredField("projectBillingAmount");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(invoice, TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, invoice.projectBillingAmount(), 0);
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      invoice.projectBillingAmount(TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, field.get(invoice));
    }
  }

  public class ProjectBillingRate
  {
    @Before
    public void setUp() throws Exception
    {
      field = Invoice.class.getDeclaredField("projectBillingRate");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(invoice, TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, invoice.projectBillingRate(), 0);
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      invoice.projectBillingRate(TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, field.get(invoice));
    }
  }

  public class SalesTaxAmount
  {
    @Before
    public void setUp() throws Exception
    {
      field = Invoice.class.getDeclaredField("salesTaxAmount");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(invoice, TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, invoice.salesTaxAmount(), 0);
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      invoice.salesTaxAmount(TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, field.get(invoice));
    }
  }

  public class TaxableAmount
  {
    @Before
    public void setUp() throws Exception
    {
      field = Invoice.class.getDeclaredField("taxableAmount");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(invoice, TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, invoice.taxableAmount(), 0);
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      invoice.taxableAmount(TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, field.get(invoice));
    }
  }

  public class TaxRate
  {
    @Before
    public void setUp() throws Exception
    {
      field = Invoice.class.getDeclaredField("taxRate");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(invoice, TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, invoice.taxRate(), 0);
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      invoice.taxRate(TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, field.get(invoice));
    }
  }

  public class TicketBillingAmount
  {
    @Before
    public void setUp() throws Exception
    {
      field = Invoice.class.getDeclaredField("ticketBillingAmount");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getterAmount() throws Exception
    {
      field.set(invoice, TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, invoice.ticketBillingAmount(), 0);
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      invoice.ticketBillingAmount(TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, field.get(invoice));
    }
  }

  public class DueDays
  {
    @Before
    public void setUp() throws Exception
    {
      field = Invoice.class.getDeclaredField("dueDays");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(invoice, TEST_INT);
      assertEquals(TEST_INT, invoice.dueDays());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      invoice.dueDays(TEST_INT);
      assertEquals(TEST_INT, field.get(invoice));
    }
  }

  public class AgreementName
  {
    @Before
    public void setUp() throws Exception
    {
      field = Invoice.class.getDeclaredField("agreementName");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.agreementName());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      invoice.agreementName(TEST_STRING);
      assertEquals(TEST_STRING, field.get(invoice));
    }
  }

  public class AgreementType
  {
    @Before
    public void setUp() throws Exception
    {
      field = Invoice.class.getDeclaredField("agreementType");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.agreementType());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      invoice.agreementType(TEST_STRING);
      assertEquals(TEST_STRING, field.get(invoice));
    }
  }

  public class BillingDelivery
  {
    @Before
    public void setUp() throws Exception
    {
      field = Invoice.class.getDeclaredField("billingDelivery");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.billingDelivery());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      invoice.billingDelivery(TEST_STRING);
      assertEquals(TEST_STRING, field.get(invoice));
    }
  }

  public class BillingMethod
  {
    @Before
    public void setUp() throws Exception
    {
      field = Invoice.class.getDeclaredField("billingMethod");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.billingMethod());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      invoice.billingMethod(TEST_STRING);
      assertEquals(TEST_STRING, field.get(invoice));
    }
  }

  public class BillingTerms
  {
    @Before
    public void setUp() throws Exception
    {
      field = Invoice.class.getDeclaredField("billingTerms");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.billingTerms());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      invoice.billingTerms(TEST_STRING);
      assertEquals(TEST_STRING, field.get(invoice));
    }
  }

  public class BillingTermsXref
  {
    @Before
    public void setUp() throws Exception
    {
      field = Invoice.class.getDeclaredField("billingTermsXref");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.billingTermsXref());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      invoice.billingTermsXref(TEST_STRING);
      assertEquals(TEST_STRING, field.get(invoice));
    }
  }

  public class BusinessUnit
  {
    @Before
    public void setUp() throws Exception
    {
      field = Invoice.class.getDeclaredField("businessUnit");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.businessUnit());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      invoice.businessUnit(TEST_STRING);
      assertEquals(TEST_STRING, field.get(invoice));
    }
  }

  public class CurrencyName
  {
    @Before
    public void setUp() throws Exception
    {
      field = Invoice.class.getDeclaredField("currencyName");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.currencyName());
    }

    @Test
    public void currencyName() throws Exception
    {
      invoice.currencyName(TEST_STRING);
      assertEquals(TEST_STRING, field.get(invoice));
    }
  }

  public class CurrencySymbol
  {
    @Before
    public void setUp() throws Exception
    {
      field = Invoice.class.getDeclaredField("currencySymbol");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.currencySymbol());
    }

    @Test
    public void currencySymbol() throws Exception
    {
      invoice.currencySymbol(TEST_STRING);
      assertEquals(TEST_STRING, field.get(invoice));
    }
  }

  public class GlBatchId
  {
    @Before
    public void setUp() throws Exception
    {
      field = Invoice.class.getDeclaredField("glBatchId");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.glBatchId());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      invoice.glBatchId(TEST_STRING);
      assertEquals(TEST_STRING, field.get(invoice));
    }
  }

  public class TopComment
  {
    @Before
    public void setUp() throws Exception
    {
      field = Invoice.class.getDeclaredField("topComment");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.topComment());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      invoice.topComment(TEST_STRING);
      assertEquals(TEST_STRING, field.get(invoice));
    }
  }

  public class BottomComment
  {
    @Before
    public void setUp() throws Exception
    {
      field = Invoice.class.getDeclaredField("bottomComment");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.bottomComment());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      invoice.bottomComment(TEST_STRING);
      assertEquals(TEST_STRING, field.get(invoice));
    }
  }

  public class InvoiceNumber
  {
    @Before
    public void setUp() throws Exception
    {
      field = Invoice.class.getDeclaredField("invoiceNumber");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.invoiceNumber());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      invoice.invoiceNumber(TEST_STRING);
      assertEquals(TEST_STRING, field.get(invoice));
    }
  }

  public class Location
  {
    @Before
    public void setUp() throws Exception
    {
      field = Invoice.class.getDeclaredField("location");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.location());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      invoice.location(TEST_STRING);
      assertEquals(TEST_STRING, field.get(invoice));
    }
  }

  public class PoNumber
  {
    @Before
    public void setUp() throws Exception
    {
      field = Invoice.class.getDeclaredField("poNumber");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.poNumber());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      invoice.poNumber(TEST_STRING);
      assertEquals(TEST_STRING, field.get(invoice));
    }
  }

  public class ProjectName
  {
    @Before
    public void setUp() throws Exception
    {
      field = Invoice.class.getDeclaredField("projectName");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.projectName());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      invoice.projectName(TEST_STRING);
      assertEquals(TEST_STRING, field.get(invoice));
    }
  }

  public class ProjectNumber
  {
    @Before
    public void setUp() throws Exception
    {
      field = Invoice.class.getDeclaredField("projectNumber");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(invoice, TEST_INT);
      assertEquals(TEST_INT, invoice.projectNumber());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      invoice.projectNumber(TEST_INT);
      assertEquals(TEST_INT, field.get(invoice));
    }
  }

  public class PhaseName
  {
    @Before
    public void setUp() throws Exception
    {
      field = Invoice.class.getDeclaredField("phaseName");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.phaseName());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      invoice.phaseName(TEST_STRING);
      assertEquals(TEST_STRING, field.get(invoice));
    }
  }

  public class RoutedMemberIdentifier
  {
    @Before
    public void setUp() throws Exception
    {
      field = Invoice.class.getDeclaredField("routedMemberIdentifier");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.routedMemberIdentifier());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      invoice.routedMemberIdentifier(TEST_STRING);
      assertEquals(TEST_STRING, field.get(invoice));
    }
  }

  public class RoutedMemberName
  {
    @Before
    public void setUp() throws Exception
    {
      field = Invoice.class.getDeclaredField("routedMemberName");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.routedMemberName());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      invoice.routedMemberName(TEST_STRING);
      assertEquals(TEST_STRING, field.get(invoice));
    }
  }

  public class RemitName
  {
    @Before
    public void setUp() throws Exception
    {
      field = Invoice.class.getDeclaredField("remitName");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.remitName());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      invoice.remitName(TEST_STRING);
      assertEquals(TEST_STRING, field.get(invoice));
    }
  }

  public class RemitPhone
  {
    @Before
    public void setUp() throws Exception
    {
      field = Invoice.class.getDeclaredField("remitPhone");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.remitPhone());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      invoice.remitPhone(TEST_STRING);
      assertEquals(TEST_STRING, field.get(invoice));
    }
  }

  public class SalesRepIdentifier
  {
    @Before
    public void setUp() throws Exception
    {
      field = Invoice.class.getDeclaredField("salesRepIdentifier");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.salesRepIdentifier());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      invoice.salesRepIdentifier(TEST_STRING);
      assertEquals(TEST_STRING, field.get(invoice));
    }
  }

  public class Status
  {
    @Before
    public void setUp() throws Exception
    {
      field = Invoice.class.getDeclaredField("status");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.status());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      invoice.status(TEST_STRING);
      assertEquals(TEST_STRING, field.get(invoice));
    }
  }

  public class TaxCodeDescription
  {
    @Before
    public void setUp() throws Exception
    {
      field = Invoice.class.getDeclaredField("taxCodeDescription");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.taxCodeDescription());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      invoice.taxCodeDescription(TEST_STRING);
      assertEquals(TEST_STRING, field.get(invoice));
    }
  }

  public class TaxCode
  {
    @Before
    public void setUp() throws Exception
    {
      field = Invoice.class.getDeclaredField("taxCode");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.taxCode());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      invoice.taxCode(TEST_STRING);
      assertEquals(TEST_STRING, field.get(invoice));
    }
  }

  public class Territory
  {
    @Before
    public void setUp() throws Exception
    {
      field = Invoice.class.getDeclaredField("territory");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.territory());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      invoice.territory(TEST_STRING);
      assertEquals(TEST_STRING, field.get(invoice));
    }
  }

  public class TicketNumber
  {
    @Before
    public void setUp() throws Exception
    {
      field = Invoice.class.getDeclaredField("ticketNumber");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(invoice, TEST_INT);
      assertEquals(TEST_INT, invoice.ticketNumber());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      invoice.ticketNumber(TEST_INT);
      assertEquals(TEST_INT, field.get(invoice));
    }
  }

  public class TicketResolution
  {
    @Before
    public void setUp() throws Exception
    {
      field = Invoice.class.getDeclaredField("ticketResolution");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.ticketResolution());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      invoice.ticketResolution(TEST_STRING);
      assertEquals(TEST_STRING, field.get(invoice));
    }
  }

  public class TicketSummary
  {
    @Before
    public void setUp() throws Exception
    {
      field = Invoice.class.getDeclaredField("ticketSummary");
      field.setAccessible(true);
    }


    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.ticketSummary());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      invoice.ticketSummary(TEST_STRING);
      assertEquals(TEST_STRING, field.get(invoice));
    }
  }
}
