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
    public void isClientLocation() throws Exception
    {
      field.set(invoice, TEST_BOOLEAN);
      assertEquals(TEST_BOOLEAN, invoice.isClientLocation());
    }

    @Test
    public void setClientLocation() throws Exception
    {
      invoice.setClientLocation(TEST_BOOLEAN);
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
    public void isTaxable() throws Exception
    {
      field.set(invoice, TEST_BOOLEAN);
      assertEquals(TEST_BOOLEAN, invoice.isTaxable());
    }

    @Test
    public void setTaxable() throws Exception
    {
      invoice.setTaxable(TEST_BOOLEAN);
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
    public void isEmail() throws Exception
    {
      field.set(invoice, TEST_BOOLEAN);
      assertEquals(TEST_BOOLEAN, invoice.isEmail());
    }

    @Test
    public void setEmail() throws Exception
    {
      invoice.setEmail(TEST_BOOLEAN);
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
    public void isClosed() throws Exception
    {
      field.set(invoice, TEST_BOOLEAN);
      assertEquals(TEST_BOOLEAN, invoice.isClosed());
    }

    @Test
    public void setClosed() throws Exception
    {
      invoice.setClosed(TEST_BOOLEAN);
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
    public void isSent() throws Exception
    {
      field.set(invoice, TEST_BOOLEAN);
      assertEquals(TEST_BOOLEAN, invoice.isSent());
    }

    @Test
    public void setSent() throws Exception
    {
      invoice.setSent(TEST_BOOLEAN);
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
    public void isGlPosted() throws Exception
    {
      field.set(invoice, TEST_BOOLEAN);
      assertEquals(TEST_BOOLEAN, invoice.isGlPosted());
    }

    @Test
    public void setGlPosted() throws Exception
    {
      invoice.setGlPosted(TEST_BOOLEAN);
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
    public void getDueDate() throws Exception
    {
      field.set(invoice, TEST_DATE);
      assertSame(TEST_DATE, invoice.getDueDate());
    }

    @Test
    public void setDueDate() throws Exception
    {
      invoice.setDueDate(TEST_DATE);
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
    public void getInvoiceDate() throws Exception
    {
      field.set(invoice, TEST_DATE);
      assertSame(TEST_DATE, invoice.getInvoiceDate());
    }

    @Test
    public void setInvoiceDate() throws Exception
    {
      invoice.setInvoiceDate(TEST_DATE);
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
    public void getInvoiceType() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.getInvoiceType());
    }

    @Test
    public void setInvoiceType() throws Exception
    {
      invoice.setInvoiceType(TEST_STRING);
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
    public void getDownpaymentAmount() throws Exception
    {
      field.set(invoice, TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, invoice.getDownpaymentAmount(), 0);
    }

    @Test
    public void setDownpaymentAmount() throws Exception
    {
      invoice.setDownpaymentAmount(TEST_DOUBLE);
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
    public void getInvoiceAmount() throws Exception
    {
      field.set(invoice, TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, invoice.getInvoiceAmount(), 0);
    }

    @Test
    public void setInvoiceAmount() throws Exception
    {
      invoice.setInvoiceAmount(TEST_DOUBLE);
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
    public void getProjectBillingAmount() throws Exception
    {
      field.set(invoice, TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, invoice.getProjectBillingAmount(), 0);
    }

    @Test
    public void setProjectBillingAmount() throws Exception
    {
      invoice.setProjectBillingAmount(TEST_DOUBLE);
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
    public void getProjectBillingRate() throws Exception
    {
      field.set(invoice, TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, invoice.getProjectBillingRate(), 0);
    }

    @Test
    public void setProjectBillingRate() throws Exception
    {
      invoice.setProjectBillingRate(TEST_DOUBLE);
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
    public void getSalesTaxAmount() throws Exception
    {
      field.set(invoice, TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, invoice.getSalesTaxAmount(), 0);
    }

    @Test
    public void setSalesTaxAmount() throws Exception
    {
      invoice.setSalesTaxAmount(TEST_DOUBLE);
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
    public void getTaxableAmount() throws Exception
    {
      field.set(invoice, TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, invoice.getTaxableAmount(), 0);
    }

    @Test
    public void setTaxableAmount() throws Exception
    {
      invoice.setTaxableAmount(TEST_DOUBLE);
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
    public void getTaxRate() throws Exception
    {
      field.set(invoice, TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, invoice.getTaxRate(), 0);
    }

    @Test
    public void setTaxRate() throws Exception
    {
      invoice.setTaxRate(TEST_DOUBLE);
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
    public void getTicketBillingAmount() throws Exception
    {
      field.set(invoice, TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, invoice.getTicketBillingAmount(), 0);
    }

    @Test
    public void setTicketBillingAmount() throws Exception
    {
      invoice.setTicketBillingAmount(TEST_DOUBLE);
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
    public void getDueDays() throws Exception
    {
      field.set(invoice, TEST_INT);
      assertEquals(TEST_INT, invoice.getDueDays());
    }

    @Test
    public void setDueDays() throws Exception
    {
      invoice.setDueDays(TEST_INT);
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
    public void getAgreementName() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.getAgreementName());
    }

    @Test
    public void setAgreementName() throws Exception
    {
      invoice.setAgreementName(TEST_STRING);
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
    public void getAgreementType() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.getAgreementType());
    }

    @Test
    public void setAgreementType() throws Exception
    {
      invoice.setAgreementType(TEST_STRING);
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
    public void getBillingDelivery() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.getBillingDelivery());
    }

    @Test
    public void setBillingDelivery() throws Exception
    {
      invoice.setBillingDelivery(TEST_STRING);
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
    public void getBillingMethod() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.getBillingMethod());
    }

    @Test
    public void setBillingMethod() throws Exception
    {
      invoice.setBillingMethod(TEST_STRING);
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
    public void getBillingTerms() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.getBillingTerms());
    }

    @Test
    public void setBillingTerms() throws Exception
    {
      invoice.setBillingTerms(TEST_STRING);
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
    public void getBillingTermsXref() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.getBillingTermsXref());
    }

    @Test
    public void setBillingTermsXref() throws Exception
    {
      invoice.setBillingTermsXref(TEST_STRING);
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
    public void getBusinessUnit() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.getBusinessUnit());
    }

    @Test
    public void setBusinessUnit() throws Exception
    {
      invoice.setBusinessUnit(TEST_STRING);
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
    public void getCurrencyName() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.getCurrencyName());
    }

    @Test
    public void setCurrencyName() throws Exception
    {
      invoice.setCurrencyName(TEST_STRING);
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
    public void getCurrencySymbol() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.getCurrencySymbol());
    }

    @Test
    public void setCurrencySymbol() throws Exception
    {
      invoice.setCurrencySymbol(TEST_STRING);
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
    public void getGlBatchId() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.getGlBatchId());
    }

    @Test
    public void setGlBatchId() throws Exception
    {
      invoice.setGlBatchId(TEST_STRING);
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
    public void getTopComment() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.getTopComment());
    }

    @Test
    public void setTopComment() throws Exception
    {
      invoice.setTopComment(TEST_STRING);
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
    public void getBottomComment() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.getBottomComment());
    }

    @Test
    public void setBottomComment() throws Exception
    {
      invoice.setBottomComment(TEST_STRING);
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
    public void getInvoiceNumber() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.getInvoiceNumber());
    }

    @Test
    public void setInvoiceNumber() throws Exception
    {
      invoice.setInvoiceNumber(TEST_STRING);
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
    public void getLocation() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.getLocation());
    }

    @Test
    public void setLocation() throws Exception
    {
      invoice.setLocation(TEST_STRING);
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
    public void getPoNumber() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.getPoNumber());
    }

    @Test
    public void setPoNumber() throws Exception
    {
      invoice.setPoNumber(TEST_STRING);
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
    public void getProjectName() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.getProjectName());
    }

    @Test
    public void setProjectName() throws Exception
    {
      invoice.setProjectName(TEST_STRING);
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
    public void getProjectNumber() throws Exception
    {
      field.set(invoice, TEST_INT);
      assertEquals(TEST_INT, invoice.getProjectNumber());
    }

    @Test
    public void setProjectNumber() throws Exception
    {
      invoice.setProjectNumber(TEST_INT);
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
    public void getPhaseName() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.getPhaseName());
    }

    @Test
    public void setPhaseName() throws Exception
    {
      invoice.setPhaseName(TEST_STRING);
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
    public void getRoutedMemberIdentifier() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.getRoutedMemberIdentifier());
    }

    @Test
    public void setRoutedMemberIdentifier() throws Exception
    {
      invoice.setRoutedMemberIdentifier(TEST_STRING);
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
    public void getRoutedMemberName() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.getRoutedMemberName());
    }

    @Test
    public void setRoutedMemberName() throws Exception
    {
      invoice.setRoutedMemberName(TEST_STRING);
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
    public void getRemitName() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.getRemitName());
    }

    @Test
    public void setRemitName() throws Exception
    {
      invoice.setRemitName(TEST_STRING);
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
    public void getRemitPhone() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.getRemitPhone());
    }

    @Test
    public void setRemitPhone() throws Exception
    {
      invoice.setRemitPhone(TEST_STRING);
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
    public void getSalesRepIdentifier() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.getSalesRepIdentifier());
    }

    @Test
    public void setSalesRepIdentifier() throws Exception
    {
      invoice.setSalesRepIdentifier(TEST_STRING);
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
    public void getStatus() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.getStatus());
    }

    @Test
    public void setStatus() throws Exception
    {
      invoice.setStatus(TEST_STRING);
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
    public void getTaxCodeDescription() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.getTaxCodeDescription());
    }

    @Test
    public void setTaxCodeDescription() throws Exception
    {
      invoice.setTaxCodeDescription(TEST_STRING);
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
    public void getTaxCode() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.getTaxCode());
    }

    @Test
    public void setTaxCode() throws Exception
    {
      invoice.setTaxCode(TEST_STRING);
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
    public void getTerritory() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.getTerritory());
    }

    @Test
    public void setTerritory() throws Exception
    {
      invoice.setTerritory(TEST_STRING);
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
    public void getTicketNumber() throws Exception
    {
      field.set(invoice, TEST_INT);
      assertEquals(TEST_INT, invoice.getTicketNumber());
    }

    @Test
    public void setTicketNumber() throws Exception
    {
      invoice.setTicketNumber(TEST_INT);
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
    public void getTicketResolution() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.getTicketResolution());
    }

    @Test
    public void setTicketResolution() throws Exception
    {
      invoice.setTicketResolution(TEST_STRING);
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
    public void getTicketSummary() throws Exception
    {
      field.set(invoice, TEST_STRING);
      assertEquals(TEST_STRING, invoice.getTicketSummary());
    }

    @Test
    public void setTicketSummary() throws Exception
    {
      invoice.setTicketSummary(TEST_STRING);
      assertEquals(TEST_STRING, field.get(invoice));
    }
  }
}
