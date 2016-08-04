package io.vulpine.connectwise.data.company;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement( localName = "CompanyFindResult" )
@JsonIgnoreProperties( { "DefaultContactId", "DefaultBillingContactId", "LastUpdated" } )
public class CompanyFindResult
{
  protected final int    id;
  protected final String companyIdentifier;
  protected final String companyName;

  @JsonCreator
  public CompanyFindResult (
    @JacksonXmlProperty( localName = "Id" ) final int id,
    @JacksonXmlProperty( localName = "CompanyIdentifier" ) final String companyIdentifier,
    @JacksonXmlProperty( localName = "CompanyName" ) final String companyName
  )
  {
    this.id = id;
    this.companyIdentifier = companyIdentifier;
    this.companyName = companyName;
  }

  public int getId ()
  {
    return id;
  }

  public String getCompanyIdentifier ()
  {
    return companyIdentifier;
  }

  public String getCompanyName ()
  {
    return companyName;
  }
}
