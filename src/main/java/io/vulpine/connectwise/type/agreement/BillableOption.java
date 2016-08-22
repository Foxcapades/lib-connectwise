package io.vulpine.connectwise.type.agreement;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum BillableOption
{
  BILLABLE("Billable"),
  DO_NOT_BILL("DoNotBill"),
  NO_CHARGE("NoCharge"),
  NO_DEFAULT("NoDefault");

  private final String value;

  BillableOption ( String value )
  {
    this.value = value;
  }


  @Override
  public String toString ()
  {
    return value;
  }

  @JsonCreator
  public static BillableOption fromString( final String value )
  {
    for ( final BillableOption opt : values() ) {
      if ( opt.value.equals(value) ) {
        return opt;
      }
    }
    return null;
  }
}
