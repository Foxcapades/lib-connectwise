package io.vulpine.connectwise.api.company;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.common.ApiDivision;
import io.vulpine.connectwise.api.def.ConnectwiseSubApiInterface;
import io.vulpine.connectwise.api.company.getAll.GetAllCompanyNotes;
import io.vulpine.connectwise.api.request.Credentials;

public class GetAll extends ApiDivision
{
  public GetAll ( Credentials credentials, XmlMapper mapper, ConnectwiseSubApiInterface api )
  {
    super(credentials, mapper, api);
  }

  public GetAllCompanyNotes notes()
  {
    return new GetAllCompanyNotes();
  }
}
