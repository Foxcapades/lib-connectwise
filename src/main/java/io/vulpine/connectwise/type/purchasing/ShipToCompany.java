package io.vulpine.connectwise.type.purchasing;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import io.vulpine.connectwise.type.ConnectwiseCommon;

@SuppressWarnings( "unused" )
public class ShipToCompany extends ConnectwiseCommon
{
  @JacksonXmlProperty(localName = "CompanyIdentifier")
  protected String CompanyIdentifier;

  @JacksonXmlProperty(localName = "Name")
  protected String Name;

  public String getCompanyIdentifier ()
  {
    return CompanyIdentifier;
  }

  public void setCompanyIdentifier ( final String companyIdentifier )
  {
    CompanyIdentifier = companyIdentifier;
  }

  public String getName ()
  {
    return Name;
  }

  public void setName ( final String name )
  {
    Name = name;
  }
}
