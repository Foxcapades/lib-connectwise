package io.vulpine.connectwise.api;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.company.*;
import io.vulpine.connectwise.api.request.Credentials;

public class CompanyApi extends ConnectwiseSubApi
{
  protected Add add = null;

  protected AddOrUpdate addOrUpdate = null;

  protected Delete delete = null;

  protected Find find = null;

  protected Get get = null;

  protected GetAll getAll = null;

  protected Load load = null;

  protected Set set = null;

  protected Update update = null;

  public CompanyApi( final ConnectwiseApi api, final Credentials creds, final XmlMapper mapper )
  {
    super(api, creds, mapper, "CompanyApi.asmx");
  }

  public Add getAdd()
  {
    if (null == add)
      add = new Add(credentials, xmlMapper, this);

    return add;
  }

  public AddOrUpdate getAddOrUpdate()
  {
    if (null == addOrUpdate)
      addOrUpdate = new AddOrUpdate(credentials, xmlMapper, this);

    return addOrUpdate;
  }

  public Delete getDelete()
  {
    if (null == delete)
      delete = new Delete(credentials, xmlMapper, this);

    return delete;
  }

  public Find getFind()
  {
    if (null == find)
      find = new Find(credentials, xmlMapper, this);

    return find;
  }

  public Get getGet()
  {
    if (null == get)
      get = new Get(credentials, xmlMapper, this);

    return get;
  }

  public GetAll getGetAll()
  {
    if (null == getAll)
      getAll = new GetAll(credentials, xmlMapper, this);

    return getAll;
  }

  public Load getLoad()
  {
    if (null == load)
      load = new Load(credentials, xmlMapper, this);

    return load;
  }

  public Set getSet()
  {
    if (null == set)
      set = new Set(credentials, xmlMapper, this);

    return set;
  }

  public Update getUpdate()
  {
    if (null == update)
      update = new Update(credentials, xmlMapper, this);

    return update;
  }
}
