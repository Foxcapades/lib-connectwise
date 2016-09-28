package io.vulpine.connectwise.util;

public interface NumberField < T extends Number > extends Field < T >
{
  < R extends Number > NumberField < R > sum( R x );
  < R extends Number > NumberField < R > sum( NumberField < R > x );

  < R extends Number > NumberField < R > difference( R x );
  < R extends Number > NumberField < R > difference( NumberField < R > x );

  < R extends Number > NumberField < R > product( R x );
  < R extends Number > NumberField < R > product( NumberField < R > x );

  < R extends Number > NumberField < R > quotient( R x );
  < R extends Number > NumberField < R > quotient( NumberField < R > x );
}
