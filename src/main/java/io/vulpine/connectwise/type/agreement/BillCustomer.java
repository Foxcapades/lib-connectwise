package io.vulpine.connectwise.type.agreement;

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
