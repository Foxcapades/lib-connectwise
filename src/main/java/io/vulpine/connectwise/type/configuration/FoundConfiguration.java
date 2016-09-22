package io.vulpine.connectwise.type.configuration;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.vulpine.connectwise.type.ConnectwiseCommon;

import java.util.Date;

@JsonIgnoreProperties( { "LastUpdate", "Description" } )
public class FoundConfiguration extends ConnectwiseCommon
{
  private String configurationName;

  private Integer configurationTypeId;

  private String configurationType;

  private Integer companyId;

  private String companyIdentifier;

  private Integer statusId;

  private String status;

  private String contactName;

  private String serialNumber;

  private String modelNumber;

  private String tagNumber;

  private Date warrantyExpiration;

  private String installedBy;

  private Boolean closedFlag;

  @JsonGetter( "ClosedFlag" )
  public Boolean closedFlag()
  {
    return this.closedFlag;
  }

  @JsonSetter( "ClosedFlag" )
  public void closedFlag( final Boolean closedFlag )
  {
    this.closedFlag = closedFlag;
  }

  @JsonGetter( "CompanyId" )
  public Integer companyId()
  {
    return this.companyId;
  }

  @JsonSetter( "CompanyId" )
  public void companyId( final Integer companyId )
  {
    this.companyId = companyId;
  }

  @JsonGetter( "CompanyIdentifier" )
  public String companyIdentifier()
  {
    return this.companyIdentifier;
  }

  @JsonSetter( "CompanyIdentifier" )
  public void companyIdentifier( final String companyIdentifier )
  {
    this.companyIdentifier = companyIdentifier;
  }

  @JsonGetter( "ConfigurationName" )
  public String configurationName()
  {
    return this.configurationName;
  }

  @JsonSetter( "ConfigurationName" )
  public void configurationName( final String configurationName )
  {
    this.configurationName = configurationName;
  }

  @JsonGetter( "ConfigurationType" )
  public String configurationType()
  {
    return this.configurationType;
  }

  @JsonSetter( "ConfigurationType" )
  public void configurationType( final String configurationType )
  {
    this.configurationType = configurationType;
  }

  @JsonGetter( "ConfigurationTypeId" )
  public Integer configurationTypeId()
  {
    return this.configurationTypeId;
  }

  @JsonSetter( "ConfigurationTypeId" )
  public void configurationTypeId( final Integer configurationTypeId )
  {
    this.configurationTypeId = configurationTypeId;
  }

  @JsonGetter( "ContactName" )
  public String contactName()
  {
    return this.contactName;
  }

  @JsonSetter( "ContactName" )
  public void contactName( final String contactName )
  {
    this.contactName = contactName;
  }

  @JsonGetter( "InstalledBy" )
  public String installedBy()
  {
    return this.installedBy;
  }

  @JsonSetter( "InstalledBy" )
  public void installedBy( final String installedBy )
  {
    this.installedBy = installedBy;
  }

  @JsonGetter( "ModelNumber" )
  public String modelNumber()
  {
    return this.modelNumber;
  }

  @JsonSetter( "ModelNumber" )
  public void modelNumber( final String modelNumber )
  {
    this.modelNumber = modelNumber;
  }

  @JsonGetter( "SerialNumber" )
  public String serialNumber()
  {
    return this.serialNumber;
  }

  @JsonSetter( "SerialNumber" )
  public void serialNumber( final String serialNumber )
  {
    this.serialNumber = serialNumber;
  }

  @JsonGetter( "Status" )
  public String status()
  {
    return this.status;
  }

  @JsonSetter( "Status" )
  public void status( final String status )
  {
    this.status = status;
  }

  @JsonGetter( "StatusId" )
  public Integer statusId()
  {
    return this.statusId;
  }

  @JsonSetter( "StatusId" )
  public void statusId( final Integer statusId )
  {
    this.statusId = statusId;
  }

  @JsonGetter( "TagNumber" )
  public String tagNumber()
  {
    return this.tagNumber;
  }

  @JsonSetter( "TagNumber" )
  public void tagNumber( final String tagNumber )
  {
    this.tagNumber = tagNumber;
  }

  @JsonGetter( "WarrantyExpiration" )
  public Date warrantyExpiration()
  {
    return this.warrantyExpiration;
  }

  @JsonSetter( "WarrantyExpiration" )
  public void warrantyExpiration( final Date warrantyExpiration )
  {
    this.warrantyExpiration = warrantyExpiration;
  }

}
