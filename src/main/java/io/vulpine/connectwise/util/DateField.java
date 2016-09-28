package io.vulpine.connectwise.util;

import java.text.DateFormat;
import java.util.Date;

/**
 * = Date Field
 *
 * @since 0.1.0
 * @version 1.0.0
 * @author https://github.com/elliefops[Elizabeth Harper]
 */
public interface DateField extends Field < Date >
{
  DateFormat getDateFormat();
  DateField setDateFormat( DateFormat format );

  default String format() { return getDateFormat().format(get()); }
  default boolean before( Date d ) { return get().before(d); }
  default boolean before( DateField d ) { return get().before(d.get()); }
  default boolean after( Date d ) { return get().after(d); }
  default boolean after( DateField d ) { return get().after(d.get()); }
}
