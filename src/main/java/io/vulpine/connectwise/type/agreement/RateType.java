package io.vulpine.connectwise.type.agreement;

public enum RateType
{
  ADJUSTMENT_AMOUNT("AdjAmount"),
  CUSTOM("Custom"),
  MULTIPLIER("Multiplier");

  private final String v;

  RateType ( String v )
  {
    this.v = v;
  }

  @Override
  public String toString ()
  {
    return v;
  }

  public static RateType fromString( final String s )
  {
    for ( final RateType r : values() ) {
      if ( r.v.equals(s) ) {
        return r;
      }
    }
    return null;
  }
}
