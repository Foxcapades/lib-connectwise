package io.vulpine.connectwise.util;

public interface StringField extends Field < String >
{
  StringField append( final String s );
  default StringField append( final Field < String > s )
  {
    return this.append(s.get());
  }

  StringField prepend( final String s );
  default StringField prepend( final Field < String > s )
  {
    return this.prepend(s.get());
  }
}
