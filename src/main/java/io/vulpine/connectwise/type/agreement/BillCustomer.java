package io.vulpine.connectwise.type.agreement;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum BillCustomer
{
  BILLABLE("Billable"),
  DO_NOT_BILL("DoNotBill"),
  NO_CHARGE("NoCharge");

  private final String value;

  BillCustomer ( String value )
  {
    this.value = value;
  }


  @Override
  public String toString ()
  {
    return this.value;
  }

  @JsonCreator
  public static BillCustomer fromString ( final String value )
  {
    for ( BillCustomer bill : values() ) {
      if ( bill.value.equals(value) ) {
        return bill;
      }
    }

    return null;
  }
}
