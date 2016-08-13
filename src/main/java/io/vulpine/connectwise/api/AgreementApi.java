package io.vulpine.connectwise.api;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import io.vulpine.connectwise.api.agreement.AddOrUpdate;
import io.vulpine.connectwise.api.agreement.Delete;
import io.vulpine.connectwise.api.agreement.Find;
import io.vulpine.connectwise.api.agreement.Get;
import io.vulpine.connectwise.api.request.Credentials;

public class AgreementApi extends ConnectwiseSubApi implements ConnectwiseSubApiInterface
{
  protected AddOrUpdate addOrUpdate = null;
  protected Delete delete = null;
  protected Find find = null;
  protected Get get = null;

  AgreementApi ( final ConnectwiseApi a, final XmlMapper x, final Credentials c )
  {
    super(a, c, x, "AgreementApi.asmx");
  }

  public AddOrUpdate addOrUpdate ()
  {
    if ( null == addOrUpdate ) {
      addOrUpdate = new AddOrUpdate(credentials, xmlMapper, this);
    }

    return addOrUpdate;
  }

  public Delete delete ()
  {
    if ( null == delete ) {
      delete = new Delete(credentials, xmlMapper, this);
    }

    return delete;
  }

  public Find find ()
  {
    if ( null == find ) {
      find = new Find(credentials, xmlMapper, this);
    }

    return find;
  }

  public Get get ()
  {
    if ( null == get ) {
      get = new Get(credentials, xmlMapper, this);
    }

    return get;
  }
}
