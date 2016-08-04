package io.vulpine.connectwise.api;

import com.fasterxml.jackson.core.type.TypeReference;

import io.vulpine.connectwise.data.Envelope;
import io.vulpine.connectwise.data.company.CompanyFindResult;
import io.vulpine.connectwise.data.company.FindCompanyBody;

import java.io.IOException;

public class CompanyApi
{
  final ConnectwiseApi c;

  private static final String a = "CompanyApi.asmx";

  CompanyApi ( ConnectwiseApi c )
  {
    this.c = c;
  }

  public CompanyFindResult[] findCompanies () throws IOException
  {
    final Envelope < FindCompanyBody > e = c.x
      .readerFor(new TypeReference < Envelope < FindCompanyBody > >() {})
      .readValue(c.send(c.c.getApiPath() + a, c.format(c.getXml("FindCompanies.xml"))));

    return e.getBody().getResponse().getResults();

  }
}
