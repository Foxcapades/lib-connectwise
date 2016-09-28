package io.vulpine.connectwise.util;

public class SimpleDoubleField extends SimpleNumberField < Double >
{
  public SimpleDoubleField()
  {
  }

  public SimpleDoubleField( String name )
  {
    super(name);
  }

  public SimpleDoubleField( String name, Double value )
  {
    super(name, value);
  }

  public SimpleDoubleField( String name, boolean optional, boolean nullable )
  {
    super(name, optional, nullable);
  }
}
