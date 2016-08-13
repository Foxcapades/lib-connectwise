package io.vulpine.connectwise.api.company;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.ApiDivision;
import io.vulpine.connectwise.api.ConnectwiseSubApiInterface;
import io.vulpine.connectwise.api.company.getAll.GetAllCompanyNotes;
import io.vulpine.connectwise.api.request.Credentials;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class GetAll extends ApiDivision
{
  public GetAll ( Credentials credentials, XmlMapper mapper, ConnectwiseSubApiInterface api )
  {
    super(credentials, mapper, api);
  }

  public GetAllCompanyNotes getAllCompanyNotes()
  {
    throw new NotImplementedException();
  }

}
