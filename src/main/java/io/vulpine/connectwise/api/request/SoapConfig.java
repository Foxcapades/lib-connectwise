package io.vulpine.connectwise.api.request;

public class SoapConfig
{
  final String company;
  final String apiUsername;
  final String apiPassword;
  final String apiPath;

  public SoapConfig ( final String company, final String apiUsername, final String apiPassword, final String apiPath )
  {
    this.company = company;
    this.apiUsername = apiUsername;
    this.apiPassword = apiPassword;
    this.apiPath = apiPath;
  }

  public String getCompany ()
  {
    return company;
  }

  public String getApiUsername ()
  {
    return apiUsername;
  }

  public String getApiPassword ()
  {
    return apiPassword;
  }

  public String getApiPath ()
  {
    return apiPath;
  }
}
