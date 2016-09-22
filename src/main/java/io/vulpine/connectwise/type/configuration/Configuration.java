/*
 * Copyright 2016 Elizabeth Harper
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.vulpine.connectwise.type.configuration;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.vulpine.connectwise.type.ConnectwiseCommon;

import java.util.Date;
import java.util.List;

@JsonRootName( "Configuration" )
public class Configuration extends ConnectwiseCommon
{
  private Integer addressId = null;

  private Integer backupFailed = null;

  private Integer backupIncomplete = null;

  private Integer backupMonth = null;

  private Integer backupRestores = null;

  private Integer backupSuccesses = null;

  private Integer businessUnitId = null;

  private Integer backupYear = null;

  private Integer companyId = null;

  private Integer contactId = null;

  private Integer configurationTypeId = null;

  private Integer locationId = null;

  private Integer parentConfigurationId = null;

  private Integer statusId = null;

  private Boolean billFlag = null;

  private Boolean isActive = null;

  private Double backupBillableSpaceGb = null;

  private List < ConfigurationQuestion > configurationQuestions = null;

  private VendorCompany vendorCompany = null;

  private ManufacturerCompany manufacturerCompany = null;

  private Date installationDate = null;

  private Date lastBackupDate = null;

  private Date purchaseDate = null;

  private Date warrantyExpiration = null;

  private String addressLine1 = null;

  private String addressLine2 = null;

  private String backupServerName = null;

  private String backupProtectedDeviceList = null;

  private String city = null;

  private String companyName = null;

  private String configurationName = null;

  private String configurationType = null;

  private String contactName = null;

  private String country = null;

  private String cpuSpeed = null;

  private String defaultGateway = null;

  private String deviceIdentifier = null;

  private String installedBy = null;

  private String ipAddress = null;

  private String lastLoginName = null;

  private String localHardDrives = null;

  private String macAddress = null;

  private String modelNumber = null;

  private String notes = null;

  private String osType = null;

  private String osInfo = null;

  private String serialNumber = null;

  private String state = null;

  private String status = null;

  private String ram = null;

  private String tagNumber = null;

  private String vendorNotes = null;

  private String zipCode = null;

  @JsonGetter( "IsActive" )
  public Boolean active()
  {
    return isActive;
  }

  /**
   * @chainable
   * @return This Configuration
   */
  @JsonSetter( "IsActive" )
  public Configuration active( Boolean active )
  {
    isActive = active;

    return this;
  }

  @JsonGetter( "AddressId" )
  public Integer addressId()
  {
    return addressId;
  }

  /**
   * @chainable
   * @return This Configuration
   */
  @JsonSetter( "AddressId" )
  public Configuration addressId( final Integer addressId )
  {
    this.addressId = addressId;

    return this;
  }

  @JsonGetter( "AddressLine1" )
  public String addressLine1()
  {
    return addressLine1;
  }

  /**
   * @chainable
   * @return This Configuration
   */
  @JsonSetter( "AddressLine1" )
  public Configuration addressLine1( final String addressLine1 )
  {
    this.addressLine1 = addressLine1;

    return this;
  }

  @JsonGetter( "AddressLine2" )
  public String addressLine2()
  {
    return addressLine2;
  }

  /**
   * @chainable
   * @return This Configuration
   */
  @JsonSetter( "AddressLine2" )
  public Configuration addressLine2( final String addressLine2 )
  {
    this.addressLine2 = addressLine2;

    return this;
  }

  @JsonGetter( "BackupBillableSpaceGb" )
  public Double backupBillableSpaceGb()
  {
    return backupBillableSpaceGb;
  }

  /**
   * @chainable
   * @return This Configuration
   */
  @JsonSetter( "BackupBillableSpaceGb" )
  public Configuration backupBillableSpaceGb( Double backupBillableSpaceGb )
  {
    this.backupBillableSpaceGb = backupBillableSpaceGb;

    return this;
  }

  @JsonGetter( "BackupFailed" )
  public Integer backupFailed()
  {
    return backupFailed;
  }

  /**
   * @chainable
   * @return This Configuration
   */
  @JsonSetter( "BackupFailed" )
  public Configuration backupFailed( final Integer backupFailed )
  {
    this.backupFailed = backupFailed;

    return this;
  }

  @JsonGetter( "BackupIncomplete" )
  public Integer backupIncomplete()
  {
    return backupIncomplete;
  }

  /**
   * @chainable
   * @return This Configuration
   */
  @JsonSetter( "BackupIncomplete" )
  public Configuration backupIncomplete( final Integer backupIncomplete )
  {
    this.backupIncomplete = backupIncomplete;

    return this;
  }

  @JsonGetter( "BackupMonth" )
  public Integer backupMonth()
  {
    return backupMonth;
  }

  /**
   * @chainable
   * @return This Configuration
   */
  @JsonSetter( "BackupMonth" )
  public Configuration backupMonth( final Integer backupMonth )
  {
    this.backupMonth = backupMonth;

    return this;
  }

  @JsonGetter( "BackupProtectedDeviceList" )
  public String backupProtectedDeviceList()
  {
    return backupProtectedDeviceList;
  }

  /**
   * @chainable
   * @return This Configuration
   */
  @JsonSetter( "BackupProtectedDeviceList" )
  public Configuration backupProtectedDeviceList( final String backupProtectedDeviceList )
  {
    this.backupProtectedDeviceList = backupProtectedDeviceList;

    return this;
  }

  @JsonGetter( "BackupRestores" )
  public Integer backupRestores()
  {
    return backupRestores;
  }

  /**
   * @chainable
   * @return This Configuration
   */
  @JsonSetter( "BackupRestores" )
  public Configuration backupRestores( final Integer backupRestores )
  {
    this.backupRestores = backupRestores;

    return this;
  }

  @JsonGetter( "BackupServerName" )
  public String backupServerName()
  {
    return backupServerName;
  }

  /**
   * @chainable
   * @return This Configuration
   */
  @JsonSetter( "BackupServerName" )
  public Configuration backupServerName( final String backupServerName )
  {
    this.backupServerName = backupServerName;

    return this;
  }

  @JsonGetter( "BackupSuccesses" )
  public Integer backupSuccesses()
  {
    return backupSuccesses;
  }

  /**
   * @chainable
   * @return This Configuration
   */
  @JsonSetter( "BackupSuccesses" )
  public Configuration backupSuccesses( final Integer backupSuccesses )
  {
    this.backupSuccesses = backupSuccesses;

    return this;
  }

  @JsonGetter( "BackupYear" )
  public Integer backupYear()
  {
    return backupYear;
  }

  /**
   * @chainable
   * @return This Configuration
   */
  @JsonSetter( "BackupYear" )
  public Configuration backupYear( final Integer backupYear )
  {
    this.backupYear = backupYear;

    return this;
  }

  @JsonGetter( "BillFlag" )
  public Boolean billFlag()
  {
    return billFlag;
  }

  /**
   * @chainable
   * @return This Configuration
   */
  @JsonSetter( "BillFlag" )
  public Configuration billFlag( Boolean billFlag )
  {
    this.billFlag = billFlag;

    return this;
  }

  @JsonGetter( "BusinessUnitId" )
  public Integer businessUnitId()
  {
    return businessUnitId;
  }

  /**
   * @chainable
   * @return This Configuration
   */
  @JsonSetter( "BusinessUnitId" )
  public Configuration businessUnitId( final Integer businessUnitId )
  {
    this.businessUnitId = businessUnitId;

    return this;
  }

  @JsonGetter( "City" )
  public String city()
  {
    return city;
  }

  /**
   * @chainable
   * @return This Configuration
   */
  @JsonSetter( "City" )
  public Configuration city( final String city )
  {
    this.city = city;

    return this;
  }

  @JsonGetter( "CompanyId" )
  public Integer companyId()
  {
    return companyId;
  }

  /**
   * @chainable
   * @return This Configuration
   */
  @JsonSetter( "CompanyId" )
  public Configuration companyId( final Integer companyId )
  {
    this.companyId = companyId;

    return this;
  }

  @JsonGetter( "CompanyName" )
  public String companyName()
  {
    return companyName;
  }

  /**
   * @chainable
   * @return This Configuration
   */
  @JsonSetter( "CompanyName" )
  public Configuration companyName( final String companyName )
  {
    this.companyName = companyName;

    return this;
  }

  @JsonGetter( "ConfigurationName" )
  public String configurationName()
  {
    return configurationName;
  }

  /**
   * Sets this configurations Name
   *
   * @chainable
   * @return This Configuration
   */
  @JsonSetter( "ConfigurationName" )
  public Configuration configurationName( final String configurationName )
  {
    this.configurationName = configurationName;

    return this;
  }

  @JsonGetter( "ConfigurationQuestions" )
  public List < ConfigurationQuestion > configurationQuestions()
  {
    return configurationQuestions;
  }

  /**
   * @chainable
   * @return This Configuration
   */
  @JsonSetter( "ConfigurationQuestions" )
  public Configuration configurationQuestions( final List < ConfigurationQuestion > configurationQuestions )
  {
    this.configurationQuestions = configurationQuestions;

    return this;
  }

  @JsonGetter( "ConfigurationType" )
  public String configurationType()
  {
    return configurationType;
  }

  /**
   * @chainable
   * @return This Configuration
   */
  @JsonSetter( "ConfigurationType" )
  public Configuration configurationType( final String configurationType )
  {
    this.configurationType = configurationType;

    return this;
  }

  @JsonGetter( "ConfigurationTypeId" )
  public Integer configurationTypeId()
  {
    return configurationTypeId;
  }

  /**
   * @chainable
   * @return This Configuration
   */
  @JsonSetter( "ConfigurationTypeId" )
  public Configuration configurationTypeId( final Integer configurationTypeId )
  {
    this.configurationTypeId = configurationTypeId;

    return this;
  }

  @JsonGetter( "ContactId" )
  public Integer contactId()
  {
    return contactId;
  }

  /**
   * @chainable
   * @return This Configuration
   */
  @JsonSetter( "ContactId" )
  public Configuration contactId( final Integer contactId )
  {
    this.contactId = contactId;

    return this;
  }

  @JsonGetter( "ContactName" )
  public String contactName()
  {
    return contactName;
  }

  /**
   * @chainable
   * @return This Configuration
   */
  @JsonSetter( "ContactName" )
  public Configuration contactName( final String contactName )
  {
    this.contactName = contactName;

    return this;
  }

  @JsonGetter( "Country" )
  public String country()
  {
    return country;
  }

  /**
   * @chainable
   * @return This Configuration
   */
  @JsonSetter( "Country" )
  public Configuration country( final String country )
  {
    this.country = country;

    return this;
  }

  @JsonGetter( "CPUSpeed" )
  public String cpuSpeed()
  {
    return cpuSpeed;
  }

  /**
   * @chainable
   * @return This Configuration
   */
  @JsonSetter( "CPUSpeed" )
  public Configuration cpuSpeed( final String cpuSpeed )
  {
    this.cpuSpeed = cpuSpeed;

    return this;
  }

  @JsonGetter( "DefaultGateway" )
  public String defaultGateway()
  {
    return defaultGateway;
  }

  /**
   * @chainable
   * @return This Configuration
   */
  @JsonSetter( "DefaultGateway" )
  public Configuration defaultGateway( final String defaultGateway )
  {
    this.defaultGateway = defaultGateway;

    return this;
  }

  @JsonGetter( "DeviceIdentifier" )
  public String deviceIdentifier()
  {
    return deviceIdentifier;
  }

  /**
   * @chainable
   * @return This Configuration
   */
  @JsonSetter( "DeviceIdentifier" )
  public Configuration deviceIdentifier( final String deviceIdentifier )
  {
    this.deviceIdentifier = deviceIdentifier;

    return this;
  }

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss" )
  @JsonGetter( "InstallationDate" )
  public Date installationDate()
  {
    return installationDate;
  }

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss" )
  @JsonSetter( "InstallationDate" )
  public Configuration installationDate( final Date installationDate )
  {
    this.installationDate = installationDate;

    return this;
  }

  @JsonGetter( "InstalledBy" )
  public String installedBy()
  {
    return installedBy;
  }

  /**
   * @chainable
   * @return This Configuration
   */
  @JsonSetter( "InstalledBy" )
  public Configuration installedBy( final String installedBy )
  {
    this.installedBy = installedBy;

    return this;
  }

  @JsonGetter( "IPAddress" )
  public String ipAddress()
  {
    return ipAddress;
  }

  /**
   * @chainable
   * @return This Configuration
   */
  @JsonSetter( "IPAddress" )
  public Configuration ipAddress( final String ipAddress )
  {
    this.ipAddress = ipAddress;

    return this;
  }

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss" )
  @JsonGetter( "LastBackupDate" )
  public Date lastBackupDate()
  {
    return lastBackupDate;
  }

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss" )
  @JsonSetter( "LastBackupDate" )
  public Configuration lastBackupDate( final Date lastBackupDate )
  {
    this.lastBackupDate = lastBackupDate;

    return this;
  }

  @JsonGetter( "LastLoginName" )
  public String lastLoginName()
  {
    return lastLoginName;
  }

  /**
   * @chainable
   * @return This Configuration
   */
  @JsonSetter( "LastLoginName" )
  public Configuration lastLoginName( final String lastLoginName )
  {
    this.lastLoginName = lastLoginName;

    return this;
  }

  @JsonGetter( "LocalHardDrives" )
  public String localHardDrives()
  {
    return localHardDrives;
  }

  /**
   * @chainable
   * @return This Configuration
   */
  @JsonSetter( "LocalHardDrives" )
  public Configuration localHardDrives( final String localHardDrives )
  {
    this.localHardDrives = localHardDrives;

    return this;
  }

  @JsonGetter( "LocationId" )
  public Integer locationId()
  {
    return locationId;
  }

  /**
   * @chainable
   * @return This Configuration
   */
  @JsonSetter( "LocationId" )
  public Configuration locationId( final Integer locationId )
  {
    this.locationId = locationId;

    return this;
  }

  @JsonGetter( "MacAddress" )
  public String macAddress()
  {
    return macAddress;
  }

  /**
   * @chainable
   * @return This Configuration
   */
  @JsonSetter( "MacAddress" )
  public Configuration macAddress( final String macAddress )
  {
    this.macAddress = macAddress;

    return this;
  }

  @JsonGetter( "ManufacturerCompany" )
  public ManufacturerCompany manufacturerCompany()
  {
    return manufacturerCompany;
  }

  /**
   * @chainable
   * @return This Configuration
   */
  @JsonSetter( "ManufacturerCompany" )
  public Configuration manufacturerCompany( ManufacturerCompany manufacturerCompany )
  {
    this.manufacturerCompany = manufacturerCompany;

    return this;
  }

  @JsonGetter( "ModelNumber" )
  public String modelNumber()
  {
    return modelNumber;
  }

  /**
   * @chainable
   * @return This Configuration
   */
  @JsonSetter( "ModelNumber" )
  public Configuration modelNumber( final String modelNumber )
  {
    this.modelNumber = modelNumber;

    return this;
  }

  @JsonGetter( "Notes" )
  public String notes()
  {
    return notes;
  }

  /**
   * @chainable
   * @return This Configuration
   */
  @JsonSetter( "Notes" )
  public Configuration notes( final String notes )
  {
    this.notes = notes;

    return this;
  }

  @JsonGetter( "OSInfo" )
  public String osInfo()
  {
    return osInfo;
  }

  /**
   * @chainable
   * @return This Configuration
   */
  @JsonSetter( "OSInfo" )
  public Configuration osInfo( final String osInfo )
  {
    this.osInfo = osInfo;

    return this;
  }

  @JsonGetter( "OSType" )
  public String osType()
  {
    return osType;
  }

  /**
   * @chainable
   * @return This Configuration
   */
  @JsonSetter( "OSType" )
  public Configuration osType( final String osType )
  {
    this.osType = osType;

    return this;
  }

  @JsonGetter( "ParentConfigurationId" )
  public Integer parentConfigurationId()
  {
    return parentConfigurationId;
  }

  /**
   * @chainable
   * @return This Configuration
   */
  @JsonSetter( "ParentConfigurationId" )
  public Configuration parentConfigurationId( final Integer parentConfigurationId )
  {
    this.parentConfigurationId = parentConfigurationId;

    return this;
  }

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss" )
  @JsonGetter( "PurchaseDate" )
  public Date purchaseDate()
  {
    return purchaseDate;
  }

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss" )
  @JsonSetter( "PurchaseDate" )
  public Configuration purchaseDate( final Date purchaseDate )
  {
    this.purchaseDate = purchaseDate;

    return this;
  }

  @JsonGetter( "RAM" )
  public String ram()
  {
    return ram;
  }

  /**
   * @chainable
   * @return This Configuration
   */
  @JsonSetter( "RAM" )
  public Configuration ram( final String ram )
  {
    this.ram = ram;

    return this;
  }

  @JsonGetter( "SerialNumber" )
  public String serialNumber()
  {
    return serialNumber;
  }

  /**
   * @chainable
   * @return This Configuration
   */
  @JsonSetter( "SerialNumber" )
  public Configuration serialNumber( final String serialNumber )
  {
    this.serialNumber = serialNumber;

    return this;
  }

  @JsonGetter( "State" )
  public String state()
  {
    return state;
  }

  /**
   * @chainable
   * @return This Configuration
   */
  @JsonSetter( "State" )
  public Configuration state( final String state )
  {
    this.state = state;

    return this;
  }

  @JsonGetter( "Status" )
  public String status()
  {
    return status;
  }

  /**
   * @chainable
   * @return This Configuration
   */
  @JsonSetter( "Status" )
  public Configuration status( final String status )
  {
    this.status = status;

    return this;
  }

  @JsonGetter( "StatusId" )
  public Integer statusId()
  {
    return statusId;
  }

  /**
   * @chainable
   * @return This Configuration
   */
  @JsonSetter( "StatusId" )
  public Configuration statusId( final Integer statusId )
  {
    this.statusId = statusId;

    return this;
  }

  @JsonGetter( "TagNumber" )
  public String tagNumber()
  {
    return tagNumber;
  }

  /**
   * @chainable
   * @return This Configuration
   */
  @JsonSetter( "TagNumber" )
  public Configuration tagNumber( final String tagNumber )
  {
    this.tagNumber = tagNumber;

    return this;
  }

  @JsonGetter( "VendorCompany" )
  public VendorCompany vendorCompany()
  {
    return vendorCompany;
  }

  /**
   * @chainable
   * @return This Configuration
   */
  @JsonSetter( "VendorCompany" )
  public Configuration vendorCompany( VendorCompany vendorCompany )
  {
    this.vendorCompany = vendorCompany;

    return this;
  }

  @JsonGetter( "VendorNotes" )
  public String vendorNotes()
  {
    return vendorNotes;
  }

  /**
   * @chainable
   * @return This Configuration
   */
  @JsonSetter( "VendorNotes" )
  public Configuration vendorNotes( final String vendorNotes )
  {
    this.vendorNotes = vendorNotes;

    return this;
  }

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss" )
  @JsonGetter( "WarrantyExpiration" )
  public Date warrantyExpiration()
  {
    return warrantyExpiration;
  }

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss" )
  @JsonSetter( "WarrantyExpiration" )
  public Configuration warrantyExpiration( final Date warrantyExpiration )
  {
    this.warrantyExpiration = warrantyExpiration;

    return this;
  }

  @JsonGetter( "ZipCode" )
  public String zipCode()
  {
    return zipCode;
  }

  /**
   * @chainable
   * @return This Configuration
   */
  @JsonSetter( "ZipCode" )
  public Configuration zipCode( final String zipCode )
  {
    this.zipCode = zipCode;

    return this;
  }
}
