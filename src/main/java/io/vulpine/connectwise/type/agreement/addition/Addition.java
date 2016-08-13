package io.vulpine.connectwise.type.agreement.addition;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.vulpine.connectwise.type.agreement.AbstractSubAgreement;
import io.vulpine.connectwise.type.agreement.BillCustomer;

import java.util.Date;

@SuppressWarnings( "unused" )
public class Addition extends AbstractSubAgreement
{
  @JacksonXmlProperty( localName = "AdditionsProduct" )
  protected AdditionProduct AdditionProduct;

  @JacksonXmlProperty( localName = "Quantity" )
  protected double Quantity;

  @JacksonXmlProperty( localName = "LessIncluded" )
  protected double LessIncluded;

  @JacksonXmlProperty( localName = "UnitPrice" )
  protected double UnitPrice;

  @JacksonXmlProperty( localName = "UnitCost" )
  protected double UnitCost;

  @JacksonXmlProperty( localName = "EffectiveDate" )
  protected Date EffectiveDate;

  @JacksonXmlProperty( localName = "CancelledDate" )
  protected Date CancelledDate;

  @JacksonXmlProperty( localName = "BillCustomer" )
  protected BillCustomer billCustomer;

  @JacksonXmlProperty( localName = "TaxableFlag" )
  protected boolean Taxable;

  @JacksonXmlProperty( localName = "SerialNumber" )
  protected String SerialNumber;

  @JacksonXmlProperty( localName = "InvoiceDescription" )
  protected String InvoiceDescription;

  @JacksonXmlProperty( localName = "PurchaseItemFlag" )
  protected boolean PurchaseItem;

  @JacksonXmlProperty( localName = "SpecialOrderFlag" )
  protected boolean SpecialOrder;

  @JacksonXmlProperty( localName = "BilledQuantity" )
  protected double BilledQuantity;

  @JacksonXmlProperty( localName = "UOM" )
  protected String UOM;

  @JacksonXmlProperty( localName = "ExtPrice" )
  protected double ExtPrice;

  @JacksonXmlProperty( localName = "ExtCost" )
  protected double ExtCost;

  @JacksonXmlProperty( localName = "Margin" )
  protected double Margin;

  public double getQuantity ()
  {
    return Quantity;
  }

  public void setQuantity ( double quantity )
  {
    Quantity = quantity;
  }

  public double getLessIncluded ()
  {
    return LessIncluded;
  }

  public void setLessIncluded ( double lessIncluded )
  {
    LessIncluded = lessIncluded;
  }

  public double getUnitPrice ()
  {
    return UnitPrice;
  }

  public void setUnitPrice ( double unitPrice )
  {
    UnitPrice = unitPrice;
  }

  public double getUnitCost ()
  {
    return UnitCost;
  }

  public void setUnitCost ( double unitCost )
  {
    UnitCost = unitCost;
  }

  public Date getEffectiveDate ()
  {
    return EffectiveDate;
  }

  public void setEffectiveDate ( Date effectiveDate )
  {
    EffectiveDate = effectiveDate;
  }

  public Date getCancelledDate ()
  {
    return CancelledDate;
  }

  public void setCancelledDate ( Date cancelledDate )
  {
    CancelledDate = cancelledDate;
  }

  public BillCustomer getBillCustomer ()
  {
    return billCustomer;
  }

  public void setBillCustomer ( BillCustomer billCustomer )
  {
    this.billCustomer = billCustomer;
  }

  public boolean isTaxable ()
  {
    return Taxable;
  }

  public void setTaxable ( boolean taxable )
  {
    Taxable = taxable;
  }

  public String getSerialNumber ()
  {
    return SerialNumber;
  }

  public void setSerialNumber ( String serialNumber )
  {
    SerialNumber = serialNumber;
  }

  public String getInvoiceDescription ()
  {
    return InvoiceDescription;
  }

  public void setInvoiceDescription ( String invoiceDescription )
  {
    InvoiceDescription = invoiceDescription;
  }

  public boolean isPurchaseItem ()
  {
    return PurchaseItem;
  }

  public void setPurchaseItem ( boolean purchaseItem )
  {
    PurchaseItem = purchaseItem;
  }

  public boolean isSpecialOrder ()
  {
    return SpecialOrder;
  }

  public void setSpecialOrder ( boolean specialOrder )
  {
    SpecialOrder = specialOrder;
  }

  public double getBilledQuantity ()
  {
    return BilledQuantity;
  }

  public void setBilledQuantity ( double billedQuantity )
  {
    BilledQuantity = billedQuantity;
  }

  public String getUOM ()
  {
    return UOM;
  }

  public void setUOM ( String UOM )
  {
    this.UOM = UOM;
  }

  public double getExtPrice ()
  {
    return ExtPrice;
  }

  public void setExtPrice ( double extPrice )
  {
    ExtPrice = extPrice;
  }

  public double getExtCost ()
  {
    return ExtCost;
  }

  public void setExtCost ( double extCost )
  {
    ExtCost = extCost;
  }

  public double getMargin ()
  {
    return Margin;
  }

  public void setMargin ( double margin )
  {
    Margin = margin;
  }

  public AdditionProduct getAdditionProduct ()
  {
    return AdditionProduct;
  }

  public void setAdditionProduct ( AdditionProduct additionProduct )
  {
    AdditionProduct = additionProduct;
  }
}
