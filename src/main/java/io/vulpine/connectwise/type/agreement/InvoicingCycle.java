package io.vulpine.connectwise.type.agreement;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum InvoicingCycle
{
  CALENDAR_YEAR("CalendarYear"),
  CONTRACT_YEAR("ContractYear");

  private final String v;

  InvoicingCycle ( String v ) {this.v = v;}

  @JsonCreator
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
