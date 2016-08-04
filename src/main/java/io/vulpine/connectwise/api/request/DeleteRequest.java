package io.vulpine.connectwise.api.request;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import io.vulpine.connectwise.api.ConnectwiseSubApiInterface;

public abstract class DeleteRequest extends CwRequest < Void >
{
  @JacksonXmlProperty(localName = "id")
  protected int id;


  public DeleteRequest (
    final Credentials c,
    final XmlMapper x,
    final ConnectwiseSubApiInterface i
  )
  {
    super(c, x, i);
  }

  public int getId ()
  {
    return id;
  }

  public DeleteRequest setId ( final int id )
  {
    this.id = id;
    return this;
  }
}
