package io.vulpine.connectwise.api.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Credentials
{
  @JacksonXmlProperty(localName = "CompanyId")
  protected String companyId;

  @JacksonXmlProperty(localName = "IntegratorLoginId")
  protected String integratorLoginId;

  @JacksonXmlProperty(localName = "IntegratorPassword")
  protected String integratorPassword;

  public String getCompanyId ()
  {
    return companyId;
  }

  public Credentials setCompanyId ( final String companyId )
  {
    this.companyId = companyId;
    return this;
  }

  public String getIntegratorLoginId ()
  {
    return integratorLoginId;
  }

  public Credentials setIntegratorLoginId ( final String integratorLoginId )
  {
    this.integratorLoginId = integratorLoginId;
    return this;
  }

  public String getIntegratorPassword ()
  {
    return integratorPassword;
  }

  public Credentials setIntegratorPassword ( final String integratorPassword )
  {
    this.integratorPassword = integratorPassword;
    return this;
  }
}
