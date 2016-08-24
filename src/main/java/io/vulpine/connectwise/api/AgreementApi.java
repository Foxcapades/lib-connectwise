package io.vulpine.connectwise.api;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import io.vulpine.connectwise.api.agreement.AddOrUpdate;
import io.vulpine.connectwise.api.agreement.Delete;
import io.vulpine.connectwise.api.agreement.Find;
import io.vulpine.connectwise.api.agreement.Get;
import io.vulpine.connectwise.api.common.ConnectwiseSubApi;
import io.vulpine.connectwise.api.def.ConnectwiseSubApiInterface;
import io.vulpine.connectwise.api.request.Credentials;
import io.vulpine.connectwise.api.request.CwRequest;

import java.io.IOException;

public class AgreementApi extends ConnectwiseSubApi implements ConnectwiseSubApiInterface
{
  /**
   * "Add or Update" Endpoints Container
   * <p>
   * Instantiated On Demand
   */
  private AddOrUpdate addOrUpdate = null;

  /**
   * "Delete" Endpoints Container
   * <p>
   * Instantiated On Demand
   */
  private Delete delete = null;

  /**
   * "Find" Endpoints Container
   * <p>
   * Instantiated On Demand
   */
  private Find find = null;

  /**
   * "Get" Endpoints Container
   * <p>
   * Instantiated On Demand
   */
  private Get get = null;

  AgreementApi(
    final ConnectwiseApi connectwiseApi,
    final Credentials credentials,
    final XmlMapper xmlMapper,
    final String endpoint
  )
  {
    super(connectwiseApi, credentials, xmlMapper, endpoint + "AgreementApi.asmx");
  }

  public AddOrUpdate addOrUpdate()
  {
    if (null == addOrUpdate) {
      addOrUpdate = new AddOrUpdate(credentials, xmlMapper, this);
    }

    return addOrUpdate;
  }

  public Delete delete()
  {
    if (null == delete) {
      delete = new Delete(credentials, xmlMapper, this);
    }

    return delete;
  }

  public Find find()
  {
    if (null == find) {
      find = new Find(credentials, xmlMapper, this);
    }

    return find;
  }

  public Get get()
  {
    if (null == get) {
      get = new Get(credentials, xmlMapper, this);
    }

    return get;
  }

  @Override
  public String send( final CwRequest r ) throws IOException
  {
    return super.send(r).replaceAll("Overrruns", "Overruns");
  }
}
