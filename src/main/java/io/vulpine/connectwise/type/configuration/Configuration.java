package io.vulpine.connectwise.type.configuration;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.vulpine.connectwise.type.CwObject;

import java.util.Date;

@JacksonXmlRootElement( localName = "Configuration" )
public class Configuration extends CwObject
{
  @JacksonXmlProperty( localName = "ConfigurationTypeId" )
  protected int configurationTypeId;

  @JacksonXmlProperty( localName = "ConfigurationType" )
  protected String configurationType;

  @JacksonXmlProperty( localName = "StatusId" )
  protected int statusId;

  @JacksonXmlProperty( localName = "Status" )
  protected String status;

  @JacksonXmlProperty( localName = "ConfigurationName" )
  protected String configurationName;

  @JacksonXmlProperty( localName = "ContactName" )
  protected String contactName;

  @JacksonXmlProperty( localName = "CompanyName" )
  protected String companyName;

  @JacksonXmlProperty( localName = "CompanyId" )
  protected int companyId;

  @JacksonXmlProperty( localName = "ContactId" )
  protected int contactId;

  @JacksonXmlProperty( localName = "LocationId" )
  protected int locationId;

  @JacksonXmlProperty( localName = "BusinessUnitId" )
  protected int businessUnitId;

  @JacksonXmlProperty( localName = "DeviceIdentifier" )
  protected String deviceIdentifier;

  @JacksonXmlProperty( localName = "SerialNumber" )
  protected String serialNumber;

  @JacksonXmlProperty( localName = "ModelNumber" )
  protected String modelNumber;

  @JacksonXmlProperty( localName = "TagNumber" )
  protected String tagNumber;

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
  @JacksonXmlProperty( localName = "PurchaseDate" )
  protected Date purchaseDate;

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
  @JacksonXmlProperty( localName = "InstallationDate" )
  protected Date installationDate;

  @JacksonXmlProperty( localName = "InstalledBy" )
  protected String installedBy;

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
  @JacksonXmlProperty( localName = "WarrantyExpiration" )
  protected Date warrantyExpiration;

  @JacksonXmlProperty( localName = "AddressId" )
  protected int addressId;

  @JacksonXmlProperty( localName = "AddressLine1" )
  protected String addressLine1;

  @JacksonXmlProperty( localName = "AddressLine2" )
  protected String addressLine2;

  @JacksonXmlProperty( localName = "City" )
  protected String city;

  @JacksonXmlProperty( localName = "State" )
  protected String state;

  @JacksonXmlProperty( localName = "ZipCode" )
  protected String zipCode;

  @JacksonXmlProperty( localName = "Country" )
  protected String country;

  @JacksonXmlProperty( localName = "VendorNotes" )
  protected String vendorNotes;

  @JacksonXmlProperty( localName = "Notes" )
  protected String notes;

  @JacksonXmlProperty( localName = "MacAddress" )
  protected String macAddress;

  @JacksonXmlProperty( localName = "LastLoginName" )
  protected String lastLoginName;

  @JacksonXmlProperty( localName = "BillFlag" )
  protected boolean billFlag;

  @JacksonXmlProperty( localName = "BackupSuccesses" )
  protected int backupSuccesses;

  @JacksonXmlProperty( localName = "BackupIncomplete" )
  protected int backupIncomplete;

  @JacksonXmlProperty( localName = "BackupFailed" )
  protected int backupFailed;

  @JacksonXmlProperty( localName = "BackupRestores" )
  protected int backupRestores;

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
  @JacksonXmlProperty( localName = "LastBackupDate" )
  protected Date lastBackupDate;

  @JacksonXmlProperty( localName = "BackupServerName" )
  protected String backupServerName;

  @JacksonXmlProperty( localName = "BackupBillableSpaceGb" )
  protected double backupBillableSpaceGb;

  @JacksonXmlProperty( localName = "BackupProtectedDeviceList" )
  protected String backupProtectedDeviceList;

  @JacksonXmlProperty( localName = "BackupYear" )
  protected int backupYear;

  @JacksonXmlProperty( localName = "BackupMonth" )
  protected int backupMonth;

  @JacksonXmlProperty( localName = "IPAddress" )
  protected String iPAddress;

  @JacksonXmlProperty( localName = "DefaultGateway" )
  protected String defaultGateway;

  @JacksonXmlProperty( localName = "OSType" )
  protected String osType;

  @JacksonXmlProperty( localName = "OSInfo" )
  protected String osInfo;

  @JacksonXmlProperty( localName = "CPUSpeed" )
  protected String cpuSpeed;

  @JacksonXmlProperty( localName = "RAM" )
  protected String ram;

  @JacksonXmlProperty( localName = "LocalHardDrives" )
  protected String localHardDrives;

  @JacksonXmlProperty( localName = "IsActive" )
  protected boolean isActive;

  @JacksonXmlProperty( localName = "ParentConfigurationId" )
  protected int parentConfigurationId;

  @JacksonXmlProperty( localName = "ConfigurationQuestions" )
  protected ConfigurationQuestion[] configurationQuestions;

  @JacksonXmlProperty( localName = "VendorCompany" )
  protected VendorCompany vendorCompany;

  @JacksonXmlProperty( localName = "ManufacturerCompany" )
  protected ManufacturerCompany manufacturerCompany;

  public int getConfigurationTypeId ()
  {
    return configurationTypeId;
  }

  public void setConfigurationTypeId ( int configurationTypeId )
  {
    this.configurationTypeId = configurationTypeId;
  }

  public String getConfigurationType ()
  {
    return configurationType;
  }

  public void setConfigurationType ( String configurationType )
  {
    this.configurationType = configurationType;
  }

  public int getStatusId ()
  {
    return statusId;
  }

  public void setStatusId ( int statusId )
  {
    this.statusId = statusId;
  }

  public String getStatus ()
  {
    return status;
  }

  public void setStatus ( String status )
  {
    this.status = status;
  }

  public String getConfigurationName ()
  {
    return configurationName;
  }

  public void setConfigurationName ( String configurationName )
  {
    this.configurationName = configurationName;
  }

  public String getContactName ()
  {
    return contactName;
  }

  public void setContactName ( String contactName )
  {
    this.contactName = contactName;
  }

  public String getCompanyName ()
  {
    return companyName;
  }

  public void setCompanyName ( String companyName )
  {
    this.companyName = companyName;
  }

  public int getCompanyId ()
  {
    return companyId;
  }

  public void setCompanyId ( int companyId )
  {
    this.companyId = companyId;
  }

  public int getContactId ()
  {
    return contactId;
  }

  public void setContactId ( int contactId )
  {
    this.contactId = contactId;
  }

  public int getLocationId ()
  {
    return locationId;
  }

  public void setLocationId ( int locationId )
  {
    this.locationId = locationId;
  }

  public int getBusinessUnitId ()
  {
    return businessUnitId;
  }

  public void setBusinessUnitId ( int businessUnitId )
  {
    this.businessUnitId = businessUnitId;
  }

  public String getDeviceIdentifier ()
  {
    return deviceIdentifier;
  }

  public void setDeviceIdentifier ( String deviceIdentifier )
  {
    this.deviceIdentifier = deviceIdentifier;
  }

  public String getSerialNumber ()
  {
    return serialNumber;
  }

  public void setSerialNumber ( String serialNumber )
  {
    this.serialNumber = serialNumber;
  }

  public String getModelNumber ()
  {
    return modelNumber;
  }

  public void setModelNumber ( String modelNumber )
  {
    this.modelNumber = modelNumber;
  }

  public String getTagNumber ()
  {
    return tagNumber;
  }

  public void setTagNumber ( String tagNumber )
  {
    this.tagNumber = tagNumber;
  }

  public Date getPurchaseDate ()
  {
    return purchaseDate;
  }

  public void setPurchaseDate ( Date purchaseDate )
  {
    this.purchaseDate = purchaseDate;
  }

  public Date getInstallationDate ()
  {
    return installationDate;
  }

  public void setInstallationDate ( Date installationDate )
  {
    this.installationDate = installationDate;
  }

  public String getInstalledBy ()
  {
    return installedBy;
  }

  public void setInstalledBy ( String installedBy )
  {
    this.installedBy = installedBy;
  }

  public Date getWarrantyExpiration ()
  {
    return warrantyExpiration;
  }

  public void setWarrantyExpiration ( Date warrantyExpiration )
  {
    this.warrantyExpiration = warrantyExpiration;
  }

  public int getAddressId ()
  {
    return addressId;
  }

  public void setAddressId ( int addressId )
  {
    this.addressId = addressId;
  }

  public String getAddressLine1 ()
  {
    return addressLine1;
  }

  public void setAddressLine1 ( String addressLine1 )
  {
    this.addressLine1 = addressLine1;
  }

  public String getAddressLine2 ()
  {
    return addressLine2;
  }

  public void setAddressLine2 ( String addressLine2 )
  {
    this.addressLine2 = addressLine2;
  }

  public String getCity ()
  {
    return city;
  }

  public void setCity ( String city )
  {
    this.city = city;
  }

  public String getState ()
  {
    return state;
  }

  public void setState ( String state )
  {
    this.state = state;
  }

  public String getZipCode ()
  {
    return zipCode;
  }

  public void setZipCode ( String zipCode )
  {
    this.zipCode = zipCode;
  }

  public String getCountry ()
  {
    return country;
  }

  public void setCountry ( String country )
  {
    this.country = country;
  }

  public String getVendorNotes ()
  {
    return vendorNotes;
  }

  public void setVendorNotes ( String vendorNotes )
  {
    this.vendorNotes = vendorNotes;
  }

  public String getNotes ()
  {
    return notes;
  }

  public void setNotes ( String notes )
  {
    this.notes = notes;
  }

  public String getMacAddress ()
  {
    return macAddress;
  }

  public void setMacAddress ( String macAddress )
  {
    this.macAddress = macAddress;
  }

  public String getLastLoginName ()
  {
    return lastLoginName;
  }

  public void setLastLoginName ( String lastLoginName )
  {
    this.lastLoginName = lastLoginName;
  }

  public boolean isBillFlag ()
  {
    return billFlag;
  }

  public void setBillFlag ( boolean billFlag )
  {
    this.billFlag = billFlag;
  }

  public int getBackupSuccesses ()
  {
    return backupSuccesses;
  }

  public void setBackupSuccesses ( int backupSuccesses )
  {
    this.backupSuccesses = backupSuccesses;
  }

  public int getBackupIncomplete ()
  {
    return backupIncomplete;
  }

  public void setBackupIncomplete ( int backupIncomplete )
  {
    this.backupIncomplete = backupIncomplete;
  }

  public int getBackupFailed ()
  {
    return backupFailed;
  }

  public void setBackupFailed ( int backupFailed )
  {
    this.backupFailed = backupFailed;
  }

  public int getBackupRestores ()
  {
    return backupRestores;
  }

  public void setBackupRestores ( int backupRestores )
  {
    this.backupRestores = backupRestores;
  }

  public Date getLastBackupDate ()
  {
    return lastBackupDate;
  }

  public void setLastBackupDate ( Date lastBackupDate )
  {
    this.lastBackupDate = lastBackupDate;
  }

  public String getBackupServerName ()
  {
    return backupServerName;
  }

  public void setBackupServerName ( String backupServerName )
  {
    this.backupServerName = backupServerName;
  }

  public double getBackupBillableSpaceGb ()
  {
    return backupBillableSpaceGb;
  }

  public void setBackupBillableSpaceGb ( double backupBillableSpaceGb )
  {
    this.backupBillableSpaceGb = backupBillableSpaceGb;
  }

  public String getBackupProtectedDeviceList ()
  {
    return backupProtectedDeviceList;
  }

  public void setBackupProtectedDeviceList ( String backupProtectedDeviceList )
  {
    this.backupProtectedDeviceList = backupProtectedDeviceList;
  }

  public int getBackupYear ()
  {
    return backupYear;
  }

  public void setBackupYear ( int backupYear )
  {
    this.backupYear = backupYear;
  }

  public int getBackupMonth ()
  {
    return backupMonth;
  }

  public void setBackupMonth ( int backupMonth )
  {
    this.backupMonth = backupMonth;
  }

  public String getiPAddress ()
  {
    return iPAddress;
  }

  public void setiPAddress ( String iPAddress )
  {
    this.iPAddress = iPAddress;
  }

  public String getDefaultGateway ()
  {
    return defaultGateway;
  }

  public void setDefaultGateway ( String defaultGateway )
  {
    this.defaultGateway = defaultGateway;
  }

  public String getOsType()
  {
    return osType;
  }

  public void setOsType( String osType )
  {
    this.osType = osType;
  }

  public String getOsInfo()
  {
    return osInfo;
  }

  public void setOsInfo( String osInfo )
  {
    this.osInfo = osInfo;
  }

  public String getCpuSpeed()
  {
    return cpuSpeed;
  }

  public void setCpuSpeed( String cpuSpeed )
  {
    this.cpuSpeed = cpuSpeed;
  }

  public String getRam()
  {
    return ram;
  }

  public void setRam( String ram )
  {
    this.ram = ram;
  }

  public String getLocalHardDrives ()
  {
    return localHardDrives;
  }

  public void setLocalHardDrives ( String localHardDrives )
  {
    this.localHardDrives = localHardDrives;
  }

  public boolean isActive ()
  {
    return isActive;
  }

  public void setActive ( boolean active )
  {
    isActive = active;
  }

  public int getParentConfigurationId ()
  {
    return parentConfigurationId;
  }

  public void setParentConfigurationId ( int parentConfigurationId )
  {
    this.parentConfigurationId = parentConfigurationId;
  }

  public ConfigurationQuestion[] getConfigurationQuestions ()
  {
    return configurationQuestions;
  }

  public void setConfigurationQuestions ( ConfigurationQuestion[] configurationQuestions )
  {
    this.configurationQuestions = configurationQuestions;
  }

  public VendorCompany getVendorCompany ()
  {
    return vendorCompany;
  }

  public void setVendorCompany ( VendorCompany vendorCompany )
  {
    this.vendorCompany = vendorCompany;
  }

  public ManufacturerCompany getManufacturerCompany ()
  {
    return manufacturerCompany;
  }

  public void setManufacturerCompany ( ManufacturerCompany manufacturerCompany )
  {
    this.manufacturerCompany = manufacturerCompany;
  }
}
