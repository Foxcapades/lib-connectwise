package io.vulpine.connectwise.api;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.common.ConnectwiseSubApi;
import io.vulpine.connectwise.api.company.*;
import io.vulpine.connectwise.api.request.Credentials;

public class CompanyApi extends ConnectwiseSubApi
{
  /**
   * "Add" Endpoints Container
   * <p>
   * Instantiated On Demand
   */
  private Add add = null;

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

  /**
   * "Get All" Endpoints Container
   * <p>
   * Instantiated On Demand
   */
  private GetAll getAll = null;

  /**
   * "Load" Endpoints Container
   * <p>
   * Instantiated On Demand
   */
  private Load load = null;

  /**
   * "Set" Endpoints Container
   * <p>
   * Instantiated On Demand
   */
  private Set set = null;

  /**
   * "Update" Endpoints Container
   * <p>
   * Instantiated On Demand
   */
  private Update update = null;

  public CompanyApi(
    final ConnectwiseApi connectwiseApi,
    final Credentials credentials,
    final XmlMapper xmlMapper,
    final String endpoint
  )
  {
    super(connectwiseApi, credentials, xmlMapper, endpoint + "CompanyApi.asmx");
  }

  public Add add()
  {
    if (null == add)
      add = new Add(credentials, xmlMapper, this);

    return add;
  }

  public AddOrUpdate addOrUpdate()
  {
    if (null == addOrUpdate)
      addOrUpdate = new AddOrUpdate(credentials, xmlMapper, this);

    return addOrUpdate;
  }

  public Delete delete()
  {
    if (null == delete)
      delete = new Delete(credentials, xmlMapper, this);

    return delete;
  }

  public Find find()
  {
    if (null == find)
      find = new Find(credentials, xmlMapper, this);

    return find;
  }

  public Get get()
  {
    if (null == get)
      get = new Get(credentials, xmlMapper, this);

    return get;
  }

  public GetAll getAll()
  {
    if (null == getAll)
      getAll = new GetAll(credentials, xmlMapper, this);

    return getAll;
  }

  public Load load()
  {
    if (null == load)
      load = new Load(credentials, xmlMapper, this);

    return load;
  }

  public Set set()
  {
    if (null == set)
      set = new Set(credentials, xmlMapper, this);

    return set;
  }

  public Update update()
  {
    if (null == update)
      update = new Update(credentials, xmlMapper, this);

    return update;
  }
}
