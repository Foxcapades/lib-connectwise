package io.vulpine.connectwise.type.agreement;

public enum EmployeeCompNotExceed
{
  BILLING("Billing"), PERCENT("Percent"), AMOUNT("Amount");

  private final String value;

  EmployeeCompNotExceed ( String value ) {this.value = value;}


  @Override
  public String toString () { return value; }

  public static EmployeeCompNotExceed fromString ( final String v )
  {
    for ( final EmployeeCompNotExceed e : values() ) {
      if ( e.value.equals(v) ) {
        return e;
      }
    }
    return null;
  }
}
