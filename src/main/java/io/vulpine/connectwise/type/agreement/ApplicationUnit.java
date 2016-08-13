package io.vulpine.connectwise.type.agreement;

public enum ApplicationUnit
{
  AMOUNT("Amount"), HOURS("Hours"), INCIDENTS("Incidents");

  private final String value;

  ApplicationUnit ( String value ) {this.value = value;}

  @Override
  public String toString () { return value; }

  public static ApplicationUnit fromString ( final String value )
  {
    for ( final ApplicationUnit u : ApplicationUnit.values() ) if ( u.value.equals(value) ) return u;
    return null;
  }
}
