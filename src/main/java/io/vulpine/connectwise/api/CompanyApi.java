package io.vulpine.connectwise.api;

import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.EmptyFilter;
import io.vulpine.connectwise.api.company.*;
import io.vulpine.connectwise.api.request.Credentials;

public class CompanyApi extends ConnectwiseSubApi
{
  public final Add         add;
  public final AddOrUpdate addOrUpdate;
  public final Delete      delete;
  public final Find        find;
  public final Get         get;
  public final GetAll      getAll;
  public final Load        load;
  public final Set         set;
  public final Update      update;

  public CompanyApi ( final ConnectwiseApi api, final Credentials creds, final XmlMapper mapper )
  {
    super(api, creds, mapper, "CompanyApi.asmx");
    mapper.setFilterProvider(new SimpleFilterProvider().addFilter("filter-empty", new EmptyFilter()));

    delete      = new Delete(creds, mapper, this);
    find        = new Find(creds, mapper, this);
    add         = new Add(creds, mapper, this);
    addOrUpdate = new AddOrUpdate(creds, mapper, this);
    get         = new Get(creds, mapper, this);
    getAll      = new GetAll(creds, mapper, this);
    load        = new Load(creds, mapper, this);
    set         = new Set(creds, mapper, this);
    update      = new Update(creds, mapper, this);
  }
}
