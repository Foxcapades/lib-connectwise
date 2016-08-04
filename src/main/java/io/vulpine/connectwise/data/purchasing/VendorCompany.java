package io.vulpine.connectwise.data.purchasing;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import io.vulpine.connectwise.data.CwObject;

@SuppressWarnings( "unused" )
public class VendorCompany extends CwObject
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
