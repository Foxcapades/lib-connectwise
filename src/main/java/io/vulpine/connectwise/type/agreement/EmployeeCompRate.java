package io.vulpine.connectwise.type.agreement;

public enum EmployeeCompRate
{
  ACTUAL("Actual"), HOURLY("Hourly");

  private final String value;

  EmployeeCompRate ( String value ) {this.value = value;}

  @Override
  public String toString () { return value; }
  public static EmployeeCompRate fromString( final String value )
  {
    for ( final EmployeeCompRate r : values() )
      if (r.value.equals(value))
        return r;
    return null;
  }
}
