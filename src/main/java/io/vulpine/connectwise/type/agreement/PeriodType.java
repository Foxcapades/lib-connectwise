package io.vulpine.connectwise.type.agreement;

public enum PeriodType
{
  CURRENT("Current"), FUTURE("Future"), BOTH("Both"), UNDEFINED("Undefined");

  private final String value;

  PeriodType ( String value ) {this.value = value;}

  @Override
  public String toString () { return value; }

  public static PeriodType fromString ( final String value )
  {
    for ( PeriodType p : values() ) if ( p.value.equals(value) ) return p;
    return null;
  }
}
