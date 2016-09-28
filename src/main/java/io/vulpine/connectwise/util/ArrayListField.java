package io.vulpine.connectwise.util;

import java.util.ArrayList;
import java.util.List;

public class ArrayListField < T > extends SimpleObjectField< List < T > > implements ListField < T >
{
  private String wrapper = "string";

  public ArrayListField()
  {
    super("", new ArrayList <>());
  }

  public ArrayListField( String name )
  {
    super(name, new ArrayList <>());
  }

  public ArrayListField( String name, ArrayList < T > value )
  {
    super(name, value);
  }

  public ArrayListField( String name, boolean optional, boolean nullable )
  {
    super(name, new ArrayList <>());

    setOptional(optional);
    setNullable(nullable);
  }

  @Override
  public String getElementWrapper()
  {
    return wrapper;
  }

  @Override
  public ArrayListField < T > setElementWrapper( String s )
  {
    wrapper = s;

    return this;
  }
}
