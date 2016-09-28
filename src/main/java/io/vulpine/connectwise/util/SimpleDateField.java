package io.vulpine.connectwise.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * = Simple Date Field Implementation
 *
 * @since 0.1.0
 * @version 1.0.0
 * @author https://github.com/elliefops[Elizabeth Harper]
 */
public class SimpleDateField extends SimpleObjectField< Date > implements DateField
{
  private DateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

  public SimpleDateField()
  {
  }

  public SimpleDateField( String name )
  {
    super(name);
  }

  public SimpleDateField( String name, Date value )
  {
    super(name, value);
  }

  public SimpleDateField( String name, boolean optional, boolean nullable )
  {
    super(name, optional, nullable);
  }

  @Override
  public DateFormat getDateFormat()
  {
    return format;
  }

  @Override
  public DateField setDateFormat( DateFormat format )
  {
    this.format = format;

    return this;
  }
}
