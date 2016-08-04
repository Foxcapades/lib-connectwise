package io.vulpine.connectwise.api.request;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.ConnectwiseSubApiInterface;
import io.vulpine.connectwise.data.CwObject;

import java.util.Date;

public abstract class AddRequest < T extends CwObject > extends CwRequest < T >
{
  protected T data;

  public AddRequest (
    Credentials credentials,
    XmlMapper xmlMapper,
    ConnectwiseSubApiInterface api,
    T data
  )
  {
    super(credentials, xmlMapper, api);

    this.data = data;
  }

  public int getId ()
  {
    return data.getId();
  }

  public AddRequest setId ( final int id )
  {
    data.setId(id);
    return this;
  }

  public String getUpdatedBy ()
  {
    return data.getUpdatedBy();
  }

  public AddRequest setUpdatedBy ( String updatedBy )
  {
    data.setUpdatedBy(updatedBy);
    return this;
  }

  public Date getLastUpdate ()
  {
    return data.getLastUpdate();
  }

  public AddRequest setLastUpdate ( Date lastUpdate )
  {
    data.setLastUpdate(lastUpdate);
    return this;
  }

  public String getDescription ()
  {
    return data.getDescription();
  }

  public AddRequest setDescription ( String description )
  {
    data.setDescription(description);
    return this;
  }

  public Date getLastUpdated ()
  {
    return data.getLastUpdated();
  }

  public AddRequest setLastUpdated ( Date lastUpdated )
  {
    data.setLastUpdated(lastUpdated);
    return this;
  }

  public abstract T getRequestData();
}
