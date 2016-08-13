package io.vulpine.connectwise.api;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import io.vulpine.connectwise.api.agreement.FindAgreementAdditions;
import io.vulpine.connectwise.api.agreement.FindAgreements;
import io.vulpine.connectwise.api.request.Credentials;
import io.vulpine.connectwise.api.request.CwRequest;
import io.vulpine.connectwise.api.request.SoapEnvelope;

import java.io.IOException;

public class AgreementApi implements ConnectwiseSubApiInterface
{
  private final ConnectwiseApi a;
  private final XmlMapper x;
  private final Credentials c;
  private static final String u = "AgreementApi.asmx";

  AgreementApi ( final ConnectwiseApi a, final XmlMapper x, final Credentials c )
  {
    this.a = a;
    this.x = x;
    this.c = c;
  }

  public FindAgreements findAgreements () throws IOException
  {
    return new FindAgreements(c, x, this);
  }

  public FindAgreementAdditions findAgreementAdditions () throws IOException
  {
    return new FindAgreementAdditions(c, x, this);
  }

  @Override
  public String send ( final CwRequest r ) throws IOException
  {
    return soap.matcher(a.send(
      a.c.getApiPath() + u,
      a.x.writeValueAsString(new SoapEnvelope(r))
    )).replaceAll("");
  }
}
