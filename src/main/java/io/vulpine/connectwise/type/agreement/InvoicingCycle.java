package io.vulpine.connectwise.type.agreement;

public enum InvoicingCycle
{
  CALENDAR_YEAR("CalendarYear"),
  CONTRACT_YEAR("ContractYear");

  private final String v;

  InvoicingCycle ( String v ) {this.v = v;}

  public static InvoicingCycle fromString( final String v )
  {
    for ( final InvoicingCycle i : values() ) {
      if ( i.v.equals(v) ) {
        return i;
      }
    }
    return null;
  }

}
