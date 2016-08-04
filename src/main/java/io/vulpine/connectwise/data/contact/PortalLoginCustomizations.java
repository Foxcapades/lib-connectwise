package io.vulpine.connectwise.data.contact;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@SuppressWarnings( "unused" )
public class PortalLoginCustomizations
{
  @JacksonXmlProperty( localName = "LoginColor" )
  protected String loginColor;

  @JacksonXmlProperty( localName = "Locale" )
  protected String locale;

  public String getLoginColor ()
  {
    return loginColor;
  }

  public void setLoginColor ( String loginColor )
  {
    this.loginColor = loginColor;
  }

  public String getLocale ()
  {
    return locale;
  }

  public void setLocale ( String locale )
  {
    this.locale = locale;
  }
}
