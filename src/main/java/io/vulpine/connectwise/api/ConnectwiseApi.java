package io.vulpine.connectwise.api;

import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.EmptyFilter;
import io.vulpine.connectwise.api.request.Credentials;
import io.vulpine.connectwise.api.request.SoapConfig;
import io.vulpine.http.Request;

import java.io.IOException;
import java.util.regex.Pattern;

public class ConnectwiseApi
{
  // Jackson-DataFormat-XML v2.7.5 has issues parsing xsi:nil on primitives.
  // This is to filter those elements out of the responses.
  final static Pattern nilFilter = Pattern.compile("<[\\w -]+xsi:nil=\"true\"[\\w -]+/>");

  protected AgreementApi agreementApi = null;
  protected CompanyApi   companyApi   = null;
  protected ProductApi   productApi   = null;

  public final Credentials r;

  // Package Access
  final SoapConfig c;
  final XmlMapper  x;


  public ConnectwiseApi ( final SoapConfig credentials, final XmlMapper xml )
  {
    this.c = credentials;
    this.x = xml;

    x.setFilterProvider(new SimpleFilterProvider().addFilter("filter-empty", new EmptyFilter()));

    this.r = new Credentials().setCompanyId(c.getCompany())
      .setIntegratorLoginId(c.getApiUsername())
      .setIntegratorPassword(c.getApiPassword());
  }

  public AgreementApi agreementApi ()
  {
    if ( null == agreementApi ) {
      agreementApi = new AgreementApi(this, r, x);
    }

    return agreementApi;
  }

  public CompanyApi companyApi ()
  {
    if ( null == companyApi ) {
      companyApi = new CompanyApi(this, r, x);
    }

    return companyApi;
  }

  public ProductApi productApi ()
  {
    if ( null == productApi ) {
      productApi = new ProductApi(this, r, x);
    }
    return productApi;
  }

  String send ( final String url, final String xml ) throws IOException
  {
    return nilFilter.matcher(
      new Request()
        .url(url)
        .post()
        .setHeader("Content-Type", "text/xml; charset=utf-8")
        .setHeader("Content-Length", String.valueOf(xml.getBytes("UTF-8").length))
        .addErrorHandler(( s, r ) -> System.out.println(s))
        .requestBody(xml)
        .submit()
        .getBody()
    ).replaceAll("");
  }
}
