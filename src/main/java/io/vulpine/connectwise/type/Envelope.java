package io.vulpine.connectwise.type;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement( namespace = "Soap", localName = "Envelope" )
public class Envelope < T >
{
  protected final T body;

  @JsonCreator
  public Envelope ( @JacksonXmlProperty( namespace = "Soap", localName = "Body" ) final T body )
  {
    this.body = body;
  }

  public T getBody ()
  {
    return body;
  }
}
