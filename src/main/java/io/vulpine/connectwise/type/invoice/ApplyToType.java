package io.vulpine.connectwise.type.invoice;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ApplyToType
{
  ALL("All"),
  AGREEMENT("Agreement"),
  PROJECT("Project"),
  PROJECT_PHASE("ProjectPhase"),
  SALES_ORDER("SalesOrder"),
  TICKET("Ticket");

  private final String value;

  ApplyToType( String value )
  {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString()
  {
    return value;
  }

  @JsonCreator
  public ApplyToType fromString( final String string )
  {
    for ( final ApplyToType type : values() )
      if (type.value.equals(string))
        return type;
    return null;
  }
}
