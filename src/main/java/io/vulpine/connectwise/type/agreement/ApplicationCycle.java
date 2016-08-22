package io.vulpine.connectwise.type.agreement;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum ApplicationCycle
{
  CONTRACT_2_WEEKS("Contract2Weeks"),
  CONTRACT_4_WEEKS("Contract4Weeks"),
  CONTRACT_YEAR("ContractYear"),
  CALENDAR_MONTH("CalendarMonth"),
  CALENDAR_QUARTER("CalendarQuarter"),
  CALENDAR_WEEK("CalendarWeek"),
  CONTRACT_QUARTER("ContractQuarter"),
  CALENDAR_YEAR("CalendarYear");

  private final String value;

  ApplicationCycle ( String value ) { this.value = value; }

  @Override
  public String toString () { return value; }

  @JsonCreator
  public static ApplicationCycle fromString ( final String value )
  {
    for ( final ApplicationCycle ac : ApplicationCycle.values() ) if ( ac.value.equals(value) ) return ac;
    return null;
  }
}
