package io.vulpine.connectwise.type.def.agreement;

import io.vulpine.connectwise.type.agreement.BillCustomer;
import io.vulpine.connectwise.type.def.XmlSerializable;

import java.util.Date;

public interface AgreementAddition extends XmlSerializable
{
  AgreementAddition id( Integer i );

  Integer id();

  AgreementAddition agreementId( Integer i );

  Integer agreementId();

  AgreementAddition additionProduct( AdditionProduct a );

  AdditionProduct additionProduct();

  AgreementAddition quantity( Double d );

  Double quantity();

  AgreementAddition lessIncluded( Double d );

  Double lessIncluded();

  AgreementAddition unitPrice( Double d );

  Double unitPrice();

  AgreementAddition unitCost( Double d );

  Double unitCost();

  AgreementAddition effectiveDate( Date d );

  Date effectiveDate();

  AgreementAddition cancelledDate( Date d );

  Date cancelledDate();

  AgreementAddition billCustomer( BillCustomer b );

  BillCustomer billCustomer();

  AgreementAddition taxable( Boolean b );

  Boolean taxable();

  AgreementAddition serialNumber( String s );

  String serialNumber();

  AgreementAddition invoiceDescription( String s );

  String invoiceDescription();

  AgreementAddition purchaseItem( Boolean b );

  Boolean purchaseItem();

  AgreementAddition specialOrder( Boolean b );

  Boolean specialOrder();

  AgreementAddition description( String s );

  String description();

  AgreementAddition billedQuantity( Double d );

  Double billedQuantity();

  AgreementAddition uom( String s );

  String uom();

  AgreementAddition extPrice( Double d );

  Double extPrice();

  AgreementAddition extCost( Double d );

  Double extCost();

  AgreementAddition margin( Double d );

  Double margin();

  AgreementAddition updatedBy( String s );

  String updatedBy();

  AgreementAddition lastUpdate( Date d );

  Date lastUpdate();
}
