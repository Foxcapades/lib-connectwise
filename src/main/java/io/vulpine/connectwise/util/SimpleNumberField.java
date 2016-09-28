package io.vulpine.connectwise.util;

/**
 * = Number Field
 *
 * @param <T> Type of this field
 *
 * @since 0.1.0
 * @version 1.0.0
 * @author https://github.com/elliefops[Elizabeth Harper]
 */
public class SimpleNumberField < T extends Number > extends SimpleObjectField < T > implements NumberField < T >
{
  public SimpleNumberField()
  {
  }

  public SimpleNumberField( String name )
  {
    super(name);
  }

  public SimpleNumberField( String name, T value )
  {
    super(name, value);
  }

  public SimpleNumberField( String name, boolean optional, boolean nullable )
  {
    super(name, optional, nullable);
  }

  @Override
  public < R extends Number > NumberField < R > sum( R x )
  {
    return add(get(), x);
  }

  @Override
  public < R extends Number > NumberField < R > sum( NumberField < R > x )
  {
    return add(get(), x.get());
  }

  @Override
  public < R extends Number > NumberField < R > difference( R x )
  {
    return subtract(get(), x);
  }

  @Override
  public < R extends Number > NumberField < R > difference( NumberField < R > x )
  {
    return subtract(get(), x.get());
  }

  @Override
  public < R extends Number > NumberField < R > product( R x )
  {
    return multiply(get(), x);
  }

  @Override
  public < R extends Number > NumberField < R > product( NumberField < R > x )
  {
    return multiply(get(), x.get());
  }

  @Override
  public < R extends Number > NumberField < R > quotient( R x )
  {
    return divide(get(), x);
  }

  @Override
  public < R extends Number > NumberField < R > quotient( NumberField < R > x )
  {
    return divide(get(), x.get());
  }

  private < R extends Number > R add( T a, Number b )
  {
    final String claz = b.getClass().getSimpleName();

    switch ( claz ) {
      case "Integer": case "int":    return (R) new Integer(a.intValue() + b.intValue());
      case "Double":  case "double": return (R) new Double(a.doubleValue() + b.doubleValue());
      case "Long":    case "long":   return (R) new Long(a.longValue() + b.longValue());
      case "Float":   case "float":  return (R) new Float(a.floatValue() + b.floatValue());
      case "Short":   case "short":  return (R) new Short((short) (a.shortValue() + b.shortValue()));
      case "Byte":    case "byte":   return (R) new Byte((byte) (a.byteValue() + b.byteValue()));
    }

    return (R) new Integer(a.intValue() + b.intValue());
  }

  private < R extends Number > R subtract( T a, Number b )
  {
    final String cn = b.getClass().getSimpleName();

    switch ( cn ) {
      case "Integer": case "int":    return (R) new Integer(a.intValue() - b.intValue());
      case "Double":  case "double": return (R) new Double(a.doubleValue() - b.doubleValue());
      case "Long":    case "long":   return (R) new Long(a.longValue() - b.longValue());
      case "Float":   case "float":  return (R) new Float(a.floatValue() - b.floatValue());
      case "Short":   case "short":  return (R) new Short((short) (a.shortValue() - b.shortValue()));
      case "Byte":    case "byte":   return (R) new Byte((byte) (a.byteValue() - b.byteValue()));
    }

    return (R) new Integer(a.intValue() - b.intValue());
  }

  private < R extends Number > R divide( T a, Number b )
  {
    final String cn = b.getClass().getSimpleName();

    switch ( cn ) {
      case "Integer": case "int":    return (R) new Integer(a.intValue() / b.intValue());
      case "Double":  case "double": return (R) new Double(a.doubleValue() / b.doubleValue());
      case "Long":    case "long":   return (R) new Long(a.longValue() / b.longValue());
      case "Float":   case "float":  return (R) new Float(a.floatValue() / b.floatValue());
      case "Short":   case "short":  return (R) new Short((short) (a.shortValue() / b.shortValue()));
      case "Byte":    case "byte":   return (R) new Byte((byte) (a.byteValue() / b.byteValue()));
    }

    return (R) new Integer(a.intValue() / b.intValue());
  }

  private < R extends Number > R multiply( T a, Number b )
  {
    final String cn = b.getClass().getSimpleName();

    switch ( cn ) {
      case "Integer": case "int":    return (R) new Integer(a.intValue() * b.intValue());
      case "Double":  case "double": return (R) new Double(a.doubleValue() * b.doubleValue());
      case "Long":    case "long":   return (R) new Long(a.longValue() * b.longValue());
      case "Float":   case "float":  return (R) new Float(a.floatValue() * b.floatValue());
      case "Short":   case "short":  return (R) new Short((short) (a.shortValue() * b.shortValue()));
      case "Byte":    case "byte":   return (R) new Byte((byte) (a.byteValue() * b.byteValue()));
    }

    return (R) new Integer(a.intValue() * b.intValue());
  }
}
