package io.vulpine.connectwise.type;

public enum PriceAttribute
{
  FIXED_FEE("FixedFee"),
  NOT_TO_EXCEED("NotToExceed"),
  TIME_AND_MATERIALS("TimeAndMaterials"),
  OVERRIDE_RATE("OverrideRate");

  private final String value;

  PriceAttribute ( String value )
  {
    this.value = value;
  }


  @Override
  public String toString ()
  {
    return this.value;
  }

  public static PriceAttribute fromString( final String value )
  {
    for ( PriceAttribute pri : values() ) {
      if ( pri.value.equals(value) ) {
        return pri;
      }
    }
    return null;
  }
}
