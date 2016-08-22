package io.vulpine.connectwise.api;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.product.*;
import io.vulpine.connectwise.api.request.Credentials;

public class ProductApi extends ConnectwiseSubApi
{
  private Add add = null;

  private Delete delete = null;

  private AddOrUpdate addOrUpdate = null;

  private Update update = null;

  private Set set = null;

  private Remove remove = null;

  private Load load = null;

  private Get get = null;

  private Find find = null;

  public ProductApi( final ConnectwiseApi api, final Credentials c, final XmlMapper x )
  {
    super(api, c, x, "ProductApi.asmx");
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

  public Load load()
  {
    if (null == load)
      load = new Load(credentials, xmlMapper, this);

    return load;
  }

  public Remove remove()
  {
    if (null == remove)
      remove = new Remove(credentials, xmlMapper, this);

    return remove;
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
