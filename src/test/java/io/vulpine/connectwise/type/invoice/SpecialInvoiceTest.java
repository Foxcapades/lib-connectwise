package io.vulpine.connectwise.type.invoice;

import de.bechte.junit.runners.context.HierarchicalContextRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

@RunWith( HierarchicalContextRunner.class )
public class SpecialInvoiceTest
{
  public final static int    TEST_INT    = 666666;

  public final static double TEST_DOUBLE = 666.666;

  public final static boolean TEST_BOOLEAN = false;

  public final static Date TEST_DATE = new Date(666666);

  public SpecialInvoice specialInvoice;

  @Before
  public void setUp() throws Exception
  {
    specialInvoice = new SpecialInvoice();
  }

  public class companyId
  {
    private Field field;

    public companyId() throws Exception
    {
      field = SpecialInvoice.class.getDeclaredField("companyId");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(specialInvoice, TEST_INT);
      assertEquals(TEST_INT, specialInvoice.companyId());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      specialInvoice.companyId(TEST_INT);
      assertEquals(TEST_INT, field.get(specialInvoice));
    }
  }

  public class billToCompanyId
  {
    private Field field;

    public billToCompanyId() throws Exception
    {
      field = SpecialInvoice.class.getDeclaredField("billToCompanyId");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(specialInvoice, TEST_INT);
      assertEquals(TEST_INT, specialInvoice.billToCompanyId());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      specialInvoice.billToCompanyId(TEST_INT);
      assertEquals(TEST_INT, field.get(specialInvoice));
    }
  }

  public class applyTo
  {
    private final ApplyTo TEST_APPLY_TO = new ApplyTo();
    private Field         field;

    public applyTo() throws Exception
    {
      field = SpecialInvoice.class.getDeclaredField("applyTo");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(specialInvoice, TEST_APPLY_TO);
      assertSame(TEST_APPLY_TO, specialInvoice.applyTo());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      specialInvoice.applyTo(TEST_APPLY_TO);
      assertSame(TEST_APPLY_TO, field.get(specialInvoice));
    }
  }

  public class attention
  {
    private Field field;

    public attention() throws Exception
    {
      field = SpecialInvoice.class.getDeclaredField("attention");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(specialInvoice, TEST_INT);
      assertEquals(TEST_INT, specialInvoice.attention());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      specialInvoice.attention(TEST_INT);
      assertEquals(TEST_INT, field.get(specialInvoice));
    }
  }

  public class addressId
  {
    private Field field;

    public addressId() throws Exception
    {
      field = SpecialInvoice.class.getDeclaredField("addressId");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(specialInvoice, TEST_INT);
      assertEquals(TEST_INT, specialInvoice.addressId());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      specialInvoice.addressId(TEST_INT);
      assertEquals(TEST_INT, field.get(specialInvoice));
    }
  }

  public class billingTermsId
  {
    private Field field;

    public billingTermsId() throws Exception
    {
      field = SpecialInvoice.class.getDeclaredField("billingTermsId");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(specialInvoice, TEST_INT);
      assertEquals(TEST_INT, specialInvoice.billingTermsId());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      specialInvoice.billingTermsId(TEST_INT);
      assertEquals(TEST_INT, field.get(specialInvoice));
    }
  }

  public class reference
  {
    private Field field;

    public reference() throws Exception
    {
      field = SpecialInvoice.class.getDeclaredField("reference");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(specialInvoice, TEST_INT);
      assertEquals(TEST_INT, specialInvoice.reference());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      specialInvoice.reference(TEST_INT);
      assertEquals(TEST_INT, field.get(specialInvoice));
    }
  }

  public class customerPO
  {
    private Field field;

    public customerPO() throws Exception
    {
      field = SpecialInvoice.class.getDeclaredField("customerPO");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(specialInvoice, TEST_INT);
      assertEquals(TEST_INT, specialInvoice.customerPO());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      specialInvoice.customerPO(TEST_INT);
      assertEquals(TEST_INT, field.get(specialInvoice));
    }
  }

  public class invoiceTemplateId
  {
    private Field field;

    public invoiceTemplateId() throws Exception
    {
      field = SpecialInvoice.class.getDeclaredField("invoiceTemplateId");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(specialInvoice, TEST_INT);
      assertEquals(TEST_INT, specialInvoice.invoiceTemplateId());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      specialInvoice.invoiceTemplateId(TEST_INT);
      assertEquals(TEST_INT, field.get(specialInvoice));
    }
  }

  public class invoiceEmailTemplateId
  {
    private Field field;

    public invoiceEmailTemplateId() throws Exception
    {
      field = SpecialInvoice.class.getDeclaredField("invoiceEmailTemplateId");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(specialInvoice, TEST_INT);
      assertEquals(TEST_INT, specialInvoice.invoiceEmailTemplateId());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      specialInvoice.invoiceEmailTemplateId(TEST_INT);
      assertEquals(TEST_INT, field.get(specialInvoice));
    }
  }

  public class addToBatchEmailList
  {
    private Field field;

    public addToBatchEmailList() throws Exception
    {
      field = SpecialInvoice.class.getDeclaredField("addToBatchEmailList");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(specialInvoice, TEST_BOOLEAN);
      assertEquals(TEST_BOOLEAN, specialInvoice.addToBatchEmailList());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      specialInvoice.addToBatchEmailList(TEST_BOOLEAN);
      assertEquals(TEST_BOOLEAN, field.get(specialInvoice));
    }
  }

  public class invoiceNumber
  {
    private Field field;

    public invoiceNumber() throws Exception
    {
      field = SpecialInvoice.class.getDeclaredField("invoiceNumber");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(specialInvoice, TEST_INT);
      assertEquals(TEST_INT, specialInvoice.invoiceNumber());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      specialInvoice.invoiceNumber(TEST_INT);
      assertEquals(TEST_INT, field.get(specialInvoice));
    }
  }

  public class invoiceDate
  {
    private Field field;

    public invoiceDate() throws Exception
    {
      field = SpecialInvoice.class.getDeclaredField("invoiceDate");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(specialInvoice, TEST_DATE);
      assertEquals(TEST_DATE, specialInvoice.invoiceDate());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      specialInvoice.invoiceDate(TEST_DATE);
      assertEquals(TEST_DATE, field.get(specialInvoice));
    }
  }

  public class invoiceTypeIdentifier
  {
    private Field field;

    public invoiceTypeIdentifier() throws Exception
    {
      field = SpecialInvoice.class.getDeclaredField("invoiceTypeIdentifier");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(specialInvoice, TEST_INT);
      assertEquals(TEST_INT, specialInvoice.invoiceTypeIdentifier());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      specialInvoice.invoiceTypeIdentifier(TEST_INT);
      assertEquals(TEST_INT, field.get(specialInvoice));
    }
  }

  public class invoiceType
  {
    private Field field;

    public invoiceType() throws Exception
    {
      field = SpecialInvoice.class.getDeclaredField("invoiceType");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(specialInvoice, TEST_INT);
      assertEquals(TEST_INT, specialInvoice.invoiceType());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      specialInvoice.invoiceType(TEST_INT);
      assertEquals(TEST_INT, field.get(specialInvoice));
    }
  }

  public class restrictDownpayment
  {
    private Field field;

    public restrictDownpayment() throws Exception
    {
      field = SpecialInvoice.class.getDeclaredField("restrictDownpayment");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(specialInvoice, TEST_BOOLEAN);
      assertEquals(TEST_BOOLEAN, specialInvoice.restrictDownpayment());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      specialInvoice.restrictDownpayment(TEST_BOOLEAN);
      assertEquals(TEST_BOOLEAN, field.get(specialInvoice));
    }
  }

  public class billingStatusId
  {
    private Field field;

    public billingStatusId() throws Exception
    {
      field = SpecialInvoice.class.getDeclaredField("billingStatusId");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(specialInvoice, TEST_INT);
      assertEquals(TEST_INT, specialInvoice.billingStatusId());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      specialInvoice.billingStatusId(TEST_INT);
      assertEquals(TEST_INT, field.get(specialInvoice));
    }
  }

  public class billingStatus
  {
    private Field field;

    public billingStatus() throws Exception
    {
      field = SpecialInvoice.class.getDeclaredField("billingStatus");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(specialInvoice, TEST_INT);
      assertEquals(TEST_INT, specialInvoice.billingStatus());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      specialInvoice.billingStatus(TEST_INT);
      assertEquals(TEST_INT, field.get(specialInvoice));
    }
  }

  public class locationId
  {
    private Field field;

    public locationId() throws Exception
    {
      field = SpecialInvoice.class.getDeclaredField("locationId");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(specialInvoice, TEST_INT);
      assertEquals(TEST_INT, specialInvoice.locationId());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      specialInvoice.locationId(TEST_INT);
      assertEquals(TEST_INT, field.get(specialInvoice));
    }
  }

  public class departmentId
  {
    private Field field;

    public departmentId() throws Exception
    {
      field = SpecialInvoice.class.getDeclaredField("departmentId");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(specialInvoice, TEST_INT);
      assertEquals(TEST_INT, specialInvoice.departmentId());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      specialInvoice.departmentId(TEST_INT);
      assertEquals(TEST_INT, field.get(specialInvoice));
    }
  }

  public class territoryId
  {
    private Field field;

    public territoryId() throws Exception
    {
      field = SpecialInvoice.class.getDeclaredField("territoryId");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(specialInvoice, TEST_INT);
      assertEquals(TEST_INT, specialInvoice.territoryId());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      specialInvoice.territoryId(TEST_INT);
      assertEquals(TEST_INT, field.get(specialInvoice));
    }
  }

  public class topComment
  {
    private Field field;

    public topComment() throws Exception
    {
      field = SpecialInvoice.class.getDeclaredField("topComment");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(specialInvoice, TEST_INT);
      assertEquals(TEST_INT, specialInvoice.topComment());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      specialInvoice.topComment(TEST_INT);
      assertEquals(TEST_INT, field.get(specialInvoice));
    }
  }

  public class bottomComment
  {
    private Field field;

    public bottomComment() throws Exception
    {
      field = SpecialInvoice.class.getDeclaredField("bottomComment");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(specialInvoice, TEST_INT);
      assertEquals(TEST_INT, specialInvoice.bottomComment());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      specialInvoice.bottomComment(TEST_INT);
      assertEquals(TEST_INT, field.get(specialInvoice));
    }
  }

  public class total
  {
    private Field field;

    public total() throws Exception
    {
      field = SpecialInvoice.class.getDeclaredField("total");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(specialInvoice, TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, specialInvoice.total(), 0);
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      specialInvoice.total(TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, field.get(specialInvoice));
    }
  }

  public class taxable
  {
    private Field field;

    public taxable() throws Exception
    {
      field = SpecialInvoice.class.getDeclaredField("taxable");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(specialInvoice, TEST_BOOLEAN);
      assertEquals(TEST_BOOLEAN, specialInvoice.taxable());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      specialInvoice.taxable(TEST_BOOLEAN);
      assertEquals(TEST_BOOLEAN, field.get(specialInvoice));
    }
  }

  public class taxCodeId
  {
    private Field field;

    public taxCodeId() throws Exception
    {
      field = SpecialInvoice.class.getDeclaredField("taxCodeId");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(specialInvoice, TEST_INT);
      assertEquals(TEST_INT, specialInvoice.taxCodeId());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      specialInvoice.taxCodeId(TEST_INT);
      assertEquals(TEST_INT, field.get(specialInvoice));
    }
  }

  public class internalNotes
  {
    private Field field;

    public internalNotes() throws Exception
    {
      field = SpecialInvoice.class.getDeclaredField("internalNotes");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(specialInvoice, TEST_INT);
      assertEquals(TEST_INT, specialInvoice.internalNotes());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      specialInvoice.internalNotes(TEST_INT);
      assertEquals(TEST_INT, field.get(specialInvoice));
    }
  }

  public class downpaymentPreviouslyTaxed
  {
    private Field field;

    public downpaymentPreviouslyTaxed() throws Exception
    {
      field = SpecialInvoice.class.getDeclaredField("downpaymentPreviouslyTaxed");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(specialInvoice, TEST_BOOLEAN);
      assertEquals(TEST_BOOLEAN, specialInvoice.downpaymentPreviouslyTaxed());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      specialInvoice.downpaymentPreviouslyTaxed(TEST_BOOLEAN);
      assertEquals(TEST_BOOLEAN, field.get(specialInvoice));
    }
  }

  public class specialInvoiceProducts
  {
    private final List< SpecialInvoiceProduct > list;
    private Field field;

    public specialInvoiceProducts() throws Exception
    {
      list = new ArrayList < SpecialInvoiceProduct >();
      field = SpecialInvoice.class.getDeclaredField("specialInvoiceProducts");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(specialInvoice, list);
      assertSame(list, specialInvoice.specialInvoiceProducts());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      specialInvoice.specialInvoiceProducts(list);
      assertSame(list, field.get(specialInvoice));
    }
  }

  public class dueDate
  {
    private Field field;

    public dueDate() throws Exception
    {
      field = SpecialInvoice.class.getDeclaredField("dueDate");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(specialInvoice, TEST_DATE);
      assertEquals(TEST_DATE, specialInvoice.dueDate());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      specialInvoice.dueDate(TEST_DATE);
      assertEquals(TEST_DATE, field.get(specialInvoice));
    }
  }

  public class expenseTotal
  {
    private Field field;

    public expenseTotal() throws Exception
    {
      field = SpecialInvoice.class.getDeclaredField("expenseTotal");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(specialInvoice, TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, specialInvoice.expenseTotal(), 0);
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      specialInvoice.expenseTotal(TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, field.get(specialInvoice));
    }
  }

  public class productTotal
  {
    private Field field;

    public productTotal() throws Exception
    {
      field = SpecialInvoice.class.getDeclaredField("productTotal");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(specialInvoice, TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, specialInvoice.productTotal(), 0);
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      specialInvoice.productTotal(TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, field.get(specialInvoice));
    }
  }

  public class previousProgressApplied
  {
    private Field field;

    public previousProgressApplied() throws Exception
    {
      field = SpecialInvoice.class.getDeclaredField("previousProgressApplied");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(specialInvoice, TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, specialInvoice.previousProgressApplied(), 0);
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      specialInvoice.previousProgressApplied(TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, field.get(specialInvoice));
    }
  }

  public class serviceAdjustmentAmount
  {
    private Field field;

    public serviceAdjustmentAmount() throws Exception
    {
      field = SpecialInvoice.class.getDeclaredField("serviceAdjustmentAmount");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(specialInvoice, TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, specialInvoice.serviceAdjustmentAmount(), 0);
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      specialInvoice.serviceAdjustmentAmount(TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, field.get(specialInvoice));
    }
  }

  public class agreementAmount
  {
    private Field field;

    public agreementAmount() throws Exception
    {
      field = SpecialInvoice.class.getDeclaredField("agreementAmount");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(specialInvoice, TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, specialInvoice.agreementAmount(), 0);
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      specialInvoice.agreementAmount(TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, field.get(specialInvoice));
    }
  }

  public class downpaymentApplied
  {
    private Field field;

    public downpaymentApplied() throws Exception
    {
      field = SpecialInvoice.class.getDeclaredField("downpaymentApplied");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(specialInvoice, TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, specialInvoice.downpaymentApplied(), 0);
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      specialInvoice.downpaymentApplied(TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, field.get(specialInvoice));
    }
  }

  public class invoiceSubtotal
  {
    private Field field;

    public invoiceSubtotal() throws Exception
    {
      field = SpecialInvoice.class.getDeclaredField("invoiceSubtotal");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(specialInvoice, TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, specialInvoice.invoiceSubtotal(), 0);
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      specialInvoice.invoiceSubtotal(TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, field.get(specialInvoice));
    }
  }

  public class remainingDownpayment
  {
    private Field field;

    public remainingDownpayment() throws Exception
    {
      field = SpecialInvoice.class.getDeclaredField("remainingDownpayment");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(specialInvoice, TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, specialInvoice.remainingDownpayment(), 0);
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      specialInvoice.remainingDownpayment(TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, field.get(specialInvoice));
    }
  }

  public class salesTax
  {
    private Field field;

    public salesTax() throws Exception
    {
      field = SpecialInvoice.class.getDeclaredField("salesTax");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(specialInvoice, TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, specialInvoice.salesTax(), 0);
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      specialInvoice.salesTax(TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, field.get(specialInvoice));
    }
  }

  public class invoiceTotal
  {
    private Field field;

    public invoiceTotal() throws Exception
    {
      field = SpecialInvoice.class.getDeclaredField("invoiceTotal");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(specialInvoice, TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, specialInvoice.invoiceTotal(), 0);
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      specialInvoice.invoiceTotal(TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, field.get(specialInvoice));
    }
  }

  public class adjustmentReason
  {
    private Field field;

    public adjustmentReason() throws Exception
    {
      field = SpecialInvoice.class.getDeclaredField("adjustmentReason");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(specialInvoice, TEST_INT);
      assertEquals(TEST_INT, specialInvoice.adjustmentReason());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      specialInvoice.adjustmentReason(TEST_INT);
      assertEquals(TEST_INT, field.get(specialInvoice));
    }
  }

  public class by
  {
    private Field field;

    public by() throws Exception
    {
      field = SpecialInvoice.class.getDeclaredField("by");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(specialInvoice, TEST_INT);
      assertEquals(TEST_INT, specialInvoice.by());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      specialInvoice.by(TEST_INT);
      assertEquals(TEST_INT, field.get(specialInvoice));
    }
  }

  public class payments
  {
    private Field field;

    public payments() throws Exception
    {
      field = SpecialInvoice.class.getDeclaredField("payments");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(specialInvoice, TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, specialInvoice.payments(), 0);
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      specialInvoice.payments(TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, field.get(specialInvoice));
    }
  }

  public class credits
  {
    private Field field;

    public credits() throws Exception
    {
      field = SpecialInvoice.class.getDeclaredField("credits");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(specialInvoice, TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, specialInvoice.credits(), 0);
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      specialInvoice.credits(TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, field.get(specialInvoice));
    }
  }

  public class invoiceBalance
  {
    private Field field;

    public invoiceBalance() throws Exception
    {
      field = SpecialInvoice.class.getDeclaredField("invoiceBalance");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(specialInvoice, TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, specialInvoice.invoiceBalance(), 0);
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      specialInvoice.invoiceBalance(TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, field.get(specialInvoice));
    }
  }

  public class shipToCompanyId
  {
    private Field field;

    public shipToCompanyId() throws Exception
    {
      field = SpecialInvoice.class.getDeclaredField("shipToCompanyId");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(specialInvoice, TEST_INT);
      assertEquals(TEST_INT, specialInvoice.shipToCompanyId());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      specialInvoice.shipToCompanyId(TEST_INT);
      assertEquals(TEST_INT, field.get(specialInvoice));
    }
  }

  public class shipToAddressId
  {
    private Field field;

    public shipToAddressId() throws Exception
    {
      field = SpecialInvoice.class.getDeclaredField("shipToAddressId");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(specialInvoice, TEST_INT);
      assertEquals(TEST_INT, specialInvoice.shipToAddressId());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      specialInvoice.shipToAddressId(TEST_INT);
      assertEquals(TEST_INT, field.get(specialInvoice));
    }
  }

  public class shipToAttention
  {
    private Field field;

    public shipToAttention() throws Exception
    {
      field = SpecialInvoice.class.getDeclaredField("shipToAttention");
      field.setAccessible(true);
    }

    @Test
    public void has_valid_getter() throws Exception
    {
      field.set(specialInvoice, TEST_INT);
      assertEquals(TEST_INT, specialInvoice.shipToAttention());
    }

    @Test
    public void has_valid_setter() throws Exception
    {
      specialInvoice.shipToAttention(TEST_INT);
      assertEquals(TEST_INT, field.get(specialInvoice));
    }
  }

}