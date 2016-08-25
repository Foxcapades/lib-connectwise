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

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.Date;

import static org.junit.Assert.*;

public class ConfigurationTest
{
  private static final String TEST_STRING = "Test String Value.";
  private static final double TEST_DOUBLE = 6.66;
  private static final boolean TEST_BOOLEAN = true;
  private static final int TEST_INT = 666;
  private static final Date TEST_DATE = new Date();

  private static Field
    configurationTypeId,
    configurationType,
    statusId,
    status,
    configurationName,
    contactName,
    companyName,
    companyId,
    contactId,
    locationId,
    businessUnitId,
    deviceIdentifier,
    serialNumber,
    modelNumber,
    tagNumber,
    purchaseDate,
    installationDate,
    installedBy,
    warrantyExpiration,
    addressId,
    addressLine1,
    addressLine2,
    city,
    state,
    zipCode,
    country,
    vendorNotes,
    notes,
    macAddress,
    lastLoginName,
    billFlag,
    backupSuccesses,
    backupIncomplete,
    backupFailed,
    backupRestores,
    lastBackupDate,
    backupServerName,
    backupBillableSpaceGb,
    backupProtectedDeviceList,
    backupYear,
    backupMonth,
    iPAddress,
    defaultGateway,
    osType,
    osInfo,
    cpuSpeed,
    ram,
    localHardDrives,
    isActive,
    parentConfigurationId,
    configurationQuestions,
    vendorCompany,
    manufacturerCompany;

  private Configuration configuration;

  @BeforeClass
  public static void setUpClass () throws Exception
  {
    final Class < Configuration > clasz = Configuration.class;

    configurationTypeId = clasz.getDeclaredField("configurationTypeId");
    configurationTypeId.setAccessible(true);
    configurationType = clasz.getDeclaredField("configurationType");
    configurationType.setAccessible(true);
    statusId = clasz.getDeclaredField("statusId");
    statusId.setAccessible(true);
    status = clasz.getDeclaredField("status");
    status.setAccessible(true);
    configurationName = clasz.getDeclaredField("configurationName");
    configurationName.setAccessible(true);
    contactName = clasz.getDeclaredField("contactName");
    contactName.setAccessible(true);
    companyName = clasz.getDeclaredField("companyName");
    companyName.setAccessible(true);
    companyId = clasz.getDeclaredField("companyId");
    companyId.setAccessible(true);
    contactId = clasz.getDeclaredField("contactId");
    contactId.setAccessible(true);
    locationId = clasz.getDeclaredField("locationId");
    locationId.setAccessible(true);
    businessUnitId = clasz.getDeclaredField("businessUnitId");
    businessUnitId.setAccessible(true);
    deviceIdentifier = clasz.getDeclaredField("deviceIdentifier");
    deviceIdentifier.setAccessible(true);
    serialNumber = clasz.getDeclaredField("serialNumber");
    serialNumber.setAccessible(true);
    modelNumber = clasz.getDeclaredField("modelNumber");
    modelNumber.setAccessible(true);
    tagNumber = clasz.getDeclaredField("tagNumber");
    tagNumber.setAccessible(true);
    purchaseDate = clasz.getDeclaredField("purchaseDate");
    purchaseDate.setAccessible(true);
    installationDate = clasz.getDeclaredField("installationDate");
    installationDate.setAccessible(true);
    installedBy = clasz.getDeclaredField("installedBy");
    installedBy.setAccessible(true);
    warrantyExpiration = clasz.getDeclaredField("warrantyExpiration");
    warrantyExpiration.setAccessible(true);
    addressId = clasz.getDeclaredField("addressId");
    addressId.setAccessible(true);
    addressLine1 = clasz.getDeclaredField("addressLine1");
    addressLine1.setAccessible(true);
    addressLine2 = clasz.getDeclaredField("addressLine2");
    addressLine2.setAccessible(true);
    city = clasz.getDeclaredField("city");
    city.setAccessible(true);
    state = clasz.getDeclaredField("state");
    state.setAccessible(true);
    zipCode = clasz.getDeclaredField("zipCode");
    zipCode.setAccessible(true);
    country = clasz.getDeclaredField("country");
    country.setAccessible(true);
    vendorNotes = clasz.getDeclaredField("vendorNotes");
    vendorNotes.setAccessible(true);
    notes = clasz.getDeclaredField("notes");
    notes.setAccessible(true);
    macAddress = clasz.getDeclaredField("macAddress");
    macAddress.setAccessible(true);
    lastLoginName = clasz.getDeclaredField("lastLoginName");
    lastLoginName.setAccessible(true);
    billFlag = clasz.getDeclaredField("billFlag");
    billFlag.setAccessible(true);
    backupSuccesses = clasz.getDeclaredField("backupSuccesses");
    backupSuccesses.setAccessible(true);
    backupIncomplete = clasz.getDeclaredField("backupIncomplete");
    backupIncomplete.setAccessible(true);
    backupFailed = clasz.getDeclaredField("backupFailed");
    backupFailed.setAccessible(true);
    backupRestores = clasz.getDeclaredField("backupRestores");
    backupRestores.setAccessible(true);
    lastBackupDate = clasz.getDeclaredField("lastBackupDate");
    lastBackupDate.setAccessible(true);
    backupServerName = clasz.getDeclaredField("backupServerName");
    backupServerName.setAccessible(true);
    backupBillableSpaceGb = clasz.getDeclaredField("backupBillableSpaceGb");
    backupBillableSpaceGb.setAccessible(true);
    backupProtectedDeviceList = clasz.getDeclaredField("backupProtectedDeviceList");
    backupProtectedDeviceList.setAccessible(true);
    backupYear = clasz.getDeclaredField("backupYear");
    backupYear.setAccessible(true);
    backupMonth = clasz.getDeclaredField("backupMonth");
    backupMonth.setAccessible(true);
    iPAddress = clasz.getDeclaredField("iPAddress");
    iPAddress.setAccessible(true);
    defaultGateway = clasz.getDeclaredField("defaultGateway");
    defaultGateway.setAccessible(true);
    osType = clasz.getDeclaredField("osType");
    osType.setAccessible(true);
    osInfo = clasz.getDeclaredField("osInfo");
    osInfo.setAccessible(true);
    cpuSpeed = clasz.getDeclaredField("cpuSpeed");
    cpuSpeed.setAccessible(true);
    ram = clasz.getDeclaredField("ram");
    ram.setAccessible(true);
    localHardDrives = clasz.getDeclaredField("localHardDrives");
    localHardDrives.setAccessible(true);
    isActive = clasz.getDeclaredField("isActive");
    isActive.setAccessible(true);
    parentConfigurationId = clasz.getDeclaredField("parentConfigurationId");
    parentConfigurationId.setAccessible(true);
    configurationQuestions = clasz.getDeclaredField("configurationQuestions");
    configurationQuestions.setAccessible(true);
    vendorCompany = clasz.getDeclaredField("vendorCompany");
    vendorCompany.setAccessible(true);
    manufacturerCompany = clasz.getDeclaredField("manufacturerCompany");
    manufacturerCompany.setAccessible(true);
  }

  @Before
  public void setUp () throws Exception
  {
    configuration = new Configuration();
  }

  @Test
  public void getConfigurationTypeId () throws Exception
  {
    configurationTypeId.set(configuration, TEST_INT);
    assertEquals(TEST_INT, configuration.getConfigurationTypeId());
  }

  @Test
  public void setConfigurationTypeId () throws Exception
  {
    configuration.setConfigurationTypeId(TEST_INT);
    assertEquals(TEST_INT, configurationTypeId.get(configuration));
  }

  @Test
  public void getConfigurationType () throws Exception
  {
    configurationType.set(configuration, TEST_STRING);
    assertEquals(TEST_STRING, configuration.getConfigurationType());
  }

  @Test
  public void setConfigurationType () throws Exception
  {
    configuration.setConfigurationType(TEST_STRING);
    assertEquals(TEST_STRING, configurationType.get(configuration));
  }

  @Test
  public void getStatusId () throws Exception
  {
    statusId.set(configuration, TEST_INT);
    assertEquals(TEST_INT, configuration.getStatusId());
  }

  @Test
  public void setStatusId () throws Exception
  {
    configuration.setStatusId(TEST_INT);
    assertEquals(TEST_INT, statusId.get(configuration));
  }

  @Test
  public void getStatus () throws Exception
  {
    status.set(configuration, TEST_STRING);
    assertEquals(TEST_STRING, configuration.getStatus());
  }

  @Test
  public void setStatus () throws Exception
  {
    configuration.setStatus(TEST_STRING);
    assertEquals(TEST_STRING, status.get(configuration));
  }

  @Test
  public void getConfigurationName () throws Exception
  {
    configurationName.set(configuration, TEST_STRING);
    assertEquals(TEST_STRING, configuration.getConfigurationName());
  }

  @Test
  public void setConfigurationName () throws Exception
  {
    configuration.setConfigurationName(TEST_STRING);
    assertEquals(TEST_STRING, configurationName.get(configuration));
  }

  @Test
  public void getContactName () throws Exception
  {
    contactName.set(configuration, TEST_STRING);
    assertEquals(TEST_STRING,configuration.getContactName() );
  }

  @Test
  public void setContactName () throws Exception
  {
    configuration.setContactName(TEST_STRING);
    assertEquals(TEST_STRING, contactName.get(configuration));
  }

  @Test
  public void getCompanyName () throws Exception
  {
    companyName.set(configuration, TEST_STRING);
    assertEquals(TEST_STRING,configuration.getCompanyName() );
  }

  @Test
  public void setCompanyName () throws Exception
  {
    configuration.setCompanyName(TEST_STRING);
    assertEquals(TEST_STRING, companyName.get(configuration));
  }

  @Test
  public void getCompanyId () throws Exception
  {
    companyId.set(configuration, TEST_INT);
    assertEquals(TEST_INT, configuration.getCompanyId());
  }

  @Test
  public void setCompanyId () throws Exception
  {
    configuration.setCompanyId(TEST_INT);
    assertEquals(TEST_INT, companyId.get(configuration));
  }

  @Test
  public void getContactId () throws Exception
  {
    contactId.set(configuration, TEST_INT);
    assertEquals(TEST_INT, configuration.getContactId());
  }

  @Test
  public void setContactId () throws Exception
  {
    configuration.setContactId(TEST_INT);
    assertEquals(TEST_INT, contactId.get(configuration));
  }

  @Test
  public void getLocationId () throws Exception
  {
    locationId.set(configuration, TEST_INT);
    assertEquals(TEST_INT, configuration.getLocationId());
  }

  @Test
  public void setLocationId () throws Exception
  {
    configuration.setLocationId(TEST_INT);
    assertEquals(TEST_INT, locationId.get(configuration));
  }

  @Test
  public void getBusinessUnitId () throws Exception
  {
    businessUnitId.set(configuration, TEST_INT);
    assertEquals(TEST_INT, configuration.getBusinessUnitId());
  }

  @Test
  public void setBusinessUnitId () throws Exception
  {
    configuration.setBusinessUnitId(TEST_INT);
    assertEquals(TEST_INT, businessUnitId.get(configuration));
  }

  @Test
  public void getDeviceIdentifier () throws Exception
  {
    deviceIdentifier.set(configuration, TEST_STRING);
    assertEquals(TEST_STRING, configuration.getDeviceIdentifier());
  }

  @Test
  public void setDeviceIdentifier () throws Exception
  {
    configuration.setDeviceIdentifier(TEST_STRING);
    assertEquals(TEST_STRING, deviceIdentifier.get(configuration));
  }

  @Test
  public void getSerialNumber () throws Exception
  {
    serialNumber.set(configuration, TEST_STRING);
    assertEquals(TEST_STRING, configuration.getSerialNumber());
  }

  @Test
  public void setSerialNumber () throws Exception
  {
    configuration.setSerialNumber(TEST_STRING);
    assertEquals(TEST_STRING, serialNumber.get(configuration));
  }

  @Test
  public void getModelNumber () throws Exception
  {
    modelNumber.set(configuration, TEST_STRING);
    assertEquals(TEST_STRING,configuration.getModelNumber() );
  }

  @Test
  public void setModelNumber () throws Exception
  {
    configuration.setModelNumber(TEST_STRING);
    assertEquals(TEST_STRING, modelNumber.get(configuration));
  }

  @Test
  public void getTagNumber () throws Exception
  {
    tagNumber.set(configuration, TEST_STRING);
    assertEquals(TEST_STRING, configuration.getTagNumber());
  }

  @Test
  public void setTagNumber () throws Exception
  {
    configuration.setTagNumber(TEST_STRING);
    assertEquals(TEST_STRING, tagNumber.get(configuration));
  }

  @Test
  public void getPurchaseDate () throws Exception
  {
    purchaseDate.set(configuration, TEST_DATE);
    assertEquals(TEST_DATE, configuration.getPurchaseDate());
  }

  @Test
  public void setPurchaseDate () throws Exception
  {
    configuration.setPurchaseDate(TEST_DATE);
    assertEquals(TEST_DATE, purchaseDate.get(configuration));
  }

  @Test
  public void getInstallationDate () throws Exception
  {
    installationDate.set(configuration, TEST_DATE);
    assertEquals(TEST_DATE, configuration.getInstallationDate());
  }

  @Test
  public void setInstallationDate () throws Exception
  {
    configuration.setInstallationDate(TEST_DATE);
    assertEquals(TEST_DATE, installationDate.get(configuration));
  }

  @Test
  public void getInstalledBy () throws Exception
  {
    installedBy.set(configuration, TEST_STRING);
    assertEquals(TEST_STRING,configuration.getInstalledBy() );
  }

  @Test
  public void setInstalledBy () throws Exception
  {
    configuration.setInstalledBy(TEST_STRING);
    assertEquals(TEST_STRING, installedBy.get(configuration));
  }

  @Test
  public void getWarrantyExpiration () throws Exception
  {
    warrantyExpiration.set(configuration, TEST_DATE);
    assertEquals(TEST_DATE, configuration.getWarrantyExpiration());
  }

  @Test
  public void setWarrantyExpiration () throws Exception
  {
    configuration.setWarrantyExpiration(TEST_DATE);
    assertEquals(TEST_DATE, warrantyExpiration.get(configuration));
  }

  @Test
  public void getAddressId () throws Exception
  {
    addressId.set(configuration, TEST_INT);
    assertEquals(TEST_INT, configuration.getAddressId());
  }

  @Test
  public void setAddressId () throws Exception
  {
    configuration.setAddressId(TEST_INT);
    assertEquals(TEST_INT, addressId.get(configuration));
  }

  @Test
  public void getAddressLine1 () throws Exception
  {
    addressLine1.set(configuration, TEST_STRING);
    assertEquals(TEST_STRING, configuration.getAddressLine1());
  }

  @Test
  public void setAddressLine1 () throws Exception
  {
    configuration.setAddressLine1(TEST_STRING);
    assertEquals(TEST_STRING, addressLine1.get(configuration));
  }

  @Test
  public void getAddressLine2 () throws Exception
  {
    addressLine2.set(configuration, TEST_STRING);
    assertEquals(TEST_STRING, configuration.getAddressLine2());
  }

  @Test
  public void setAddressLine2 () throws Exception
  {
    configuration.setAddressLine2(TEST_STRING);
    assertEquals(TEST_STRING, addressLine2.get(configuration));
  }

  @Test
  public void getCity () throws Exception
  {
    city.set(configuration, TEST_STRING);
    assertEquals(TEST_STRING, configuration.getCity());
  }

  @Test
  public void setCity () throws Exception
  {
    configuration.setCity(TEST_STRING);
    assertEquals(TEST_STRING, city.get(configuration));
  }

  @Test
  public void getState () throws Exception
  {
    state.set(configuration, TEST_STRING);
    assertEquals(TEST_STRING, configuration.getState());
  }

  @Test
  public void setState () throws Exception
  {
    configuration.setState(TEST_STRING);
    assertEquals(TEST_STRING, state.get(configuration));
  }

  @Test
  public void getZipCode () throws Exception
  {
    zipCode.set(configuration, TEST_STRING);
    assertEquals(TEST_STRING, configuration.getZipCode());
  }

  @Test
  public void setZipCode () throws Exception
  {
    configuration.setZipCode(TEST_STRING);
    assertEquals(TEST_STRING, zipCode.get(configuration));
  }

  @Test
  public void getCountry () throws Exception
  {
    country.set(configuration, TEST_STRING);
    assertEquals(TEST_STRING, configuration.getCountry());
  }

  @Test
  public void setCountry () throws Exception
  {
    configuration.setCountry(TEST_STRING);
    assertEquals(TEST_STRING, country.get(configuration));
  }

  @Test
  public void getVendorNotes () throws Exception
  {
    vendorNotes.set(configuration, TEST_STRING);
    assertEquals(TEST_STRING,configuration.getVendorNotes() );
  }

  @Test
  public void setVendorNotes () throws Exception
  {
    configuration.setVendorNotes(TEST_STRING);
    assertEquals(TEST_STRING, vendorNotes.get(configuration));
  }

  @Test
  public void getNotes () throws Exception
  {
    notes.set(configuration, TEST_STRING);
    assertEquals(TEST_STRING, configuration.getNotes());
  }

  @Test
  public void setNotes () throws Exception
  {
    configuration.setNotes(TEST_STRING);
    assertEquals(TEST_STRING, notes.get(configuration));
  }

  @Test
  public void getMacAddress () throws Exception
  {
    macAddress.set(configuration, TEST_STRING);
    assertEquals(TEST_STRING, configuration.getMacAddress());
  }

  @Test
  public void setMacAddress () throws Exception
  {
    configuration.setMacAddress(TEST_STRING);
    assertEquals(TEST_STRING, macAddress.get(configuration));
  }

  @Test
  public void getLastLoginName () throws Exception
  {
    lastLoginName.set(configuration, TEST_STRING);
    assertEquals(TEST_STRING, configuration.getLastLoginName());
  }

  @Test
  public void setLastLoginName () throws Exception
  {
    configuration.setLastLoginName(TEST_STRING);
    assertEquals(TEST_STRING, lastLoginName.get(configuration));
  }

  @Test
  public void isBillFlag () throws Exception
  {
    billFlag.set(configuration, TEST_BOOLEAN);
    assertEquals(TEST_BOOLEAN, configuration.isBillFlag());
  }

  @Test
  public void setBillFlag () throws Exception
  {
    configuration.setBillFlag(TEST_BOOLEAN);
    assertEquals(TEST_BOOLEAN, billFlag.get(configuration));
  }

  @Test
  public void getBackupSuccesses () throws Exception
  {
    backupSuccesses.set(configuration, TEST_INT);
    assertEquals(TEST_INT, configuration.getBackupSuccesses());
  }

  @Test
  public void setBackupSuccesses () throws Exception
  {
    configuration.setBackupSuccesses(TEST_INT);
    assertEquals(TEST_INT, backupSuccesses.get(configuration));
  }

  @Test
  public void getBackupIncomplete () throws Exception
  {
    backupIncomplete.set(configuration, TEST_INT);
    assertEquals(TEST_INT, configuration.getBackupIncomplete());
  }

  @Test
  public void setBackupIncomplete () throws Exception
  {
    configuration.setBackupIncomplete(TEST_INT);
    assertEquals(TEST_INT, backupIncomplete.get(configuration));
  }

  @Test
  public void getBackupFailed () throws Exception
  {
    backupFailed.set(configuration, TEST_INT);
    assertEquals(TEST_INT, configuration.getBackupFailed());
  }

  @Test
  public void setBackupFailed () throws Exception
  {
    configuration.setBackupFailed(TEST_INT);
    assertEquals(TEST_INT, backupFailed.get(configuration));
  }

  @Test
  public void getBackupRestores () throws Exception
  {
    backupRestores.set(configuration, TEST_INT);
    assertEquals(TEST_INT, configuration.getBackupRestores());
  }

  @Test
  public void setBackupRestores () throws Exception
  {
    configuration.setBackupRestores(TEST_INT);
    assertEquals(TEST_INT, backupRestores.get(configuration));
  }

  @Test
  public void getLastBackupDate () throws Exception
  {
    lastBackupDate.set(configuration, TEST_DATE);
    assertEquals(TEST_DATE, configuration.getLastBackupDate());
  }

  @Test
  public void setLastBackupDate () throws Exception
  {
    configuration.setLastBackupDate(TEST_DATE);
    assertEquals(TEST_DATE, lastBackupDate.get(configuration));
  }

  @Test
  public void getBackupServerName () throws Exception
  {
    backupServerName.set(configuration, TEST_STRING);
    assertEquals(TEST_STRING, configuration.getBackupServerName());
  }

  @Test
  public void setBackupServerName () throws Exception
  {
    configuration.setBackupServerName(TEST_STRING);
    assertEquals(TEST_STRING, backupServerName.get(configuration));
  }

  @Test
  public void getBackupBillableSpaceGb () throws Exception
  {
    backupBillableSpaceGb.set(configuration, TEST_DOUBLE);
    assertEquals(TEST_DOUBLE, configuration.getBackupBillableSpaceGb(), 0);
  }

  @Test
  public void setBackupBillableSpaceGb () throws Exception
  {
    configuration.setBackupBillableSpaceGb(TEST_DOUBLE);
    assertEquals(TEST_DOUBLE, backupBillableSpaceGb.get(configuration));
  }

  @Test
  public void getBackupProtectedDeviceList () throws Exception
  {
    backupProtectedDeviceList.set(configuration, TEST_STRING);
    assertEquals(TEST_STRING, configuration.getBackupProtectedDeviceList());
  }

  @Test
  public void setBackupProtectedDeviceList () throws Exception
  {
    configuration.setBackupProtectedDeviceList(TEST_STRING);
    assertEquals(TEST_STRING, backupProtectedDeviceList.get(configuration));
  }

  @Test
  public void getBackupYear () throws Exception
  {
    backupYear.set(configuration, TEST_INT);
    assertEquals(TEST_INT, configuration.getBackupYear());
  }

  @Test
  public void setBackupYear () throws Exception
  {
    configuration.setBackupYear(TEST_INT);
    assertEquals(TEST_INT, backupYear.get(configuration));
  }

  @Test
  public void getBackupMonth () throws Exception
  {
    backupMonth.set(configuration, TEST_INT);
    assertEquals(TEST_INT,configuration.getBackupMonth() );
  }

  @Test
  public void setBackupMonth () throws Exception
  {
    configuration.setBackupMonth(TEST_INT);
    assertEquals(TEST_INT, backupMonth.get(configuration));
  }

  @Test
  public void getiPAddress () throws Exception
  {
    iPAddress.set(configuration, TEST_STRING);
    assertEquals(TEST_STRING, configuration.getiPAddress());
  }

  @Test
  public void setiPAddress () throws Exception
  {
    configuration.setiPAddress(TEST_STRING);
    assertEquals(TEST_STRING, iPAddress.get(configuration));
  }

  @Test
  public void getDefaultGateway () throws Exception
  {
    defaultGateway.set(configuration, TEST_STRING);
    assertEquals(TEST_STRING, configuration.getDefaultGateway());
  }

  @Test
  public void setDefaultGateway () throws Exception
  {
    configuration.setDefaultGateway(TEST_STRING);
    assertEquals(TEST_STRING, defaultGateway.get(configuration));
  }

  @Test
  public void getOsType () throws Exception
  {
    osType.set(configuration, TEST_STRING);
    assertEquals(TEST_STRING, configuration.getOsType());
  }

  @Test
  public void setOsType () throws Exception
  {
    configuration.setOsType(TEST_STRING);
    assertEquals(TEST_STRING, osType.get(configuration));
  }

  @Test
  public void getOsInfo () throws Exception
  {
    osInfo.set(configuration, TEST_STRING);
    assertEquals(TEST_STRING, configuration.getOsInfo());
  }

  @Test
  public void setOsInfo () throws Exception
  {
    configuration.setOsInfo(TEST_STRING);
    assertEquals(TEST_STRING, osInfo.get(configuration));
  }

  @Test
  public void getCpuSpeed () throws Exception
  {
    cpuSpeed.set(configuration, TEST_STRING);
    assertEquals(TEST_STRING, configuration.getCpuSpeed());
  }

  @Test
  public void setCpuSpeed () throws Exception
  {
    configuration.setCpuSpeed(TEST_STRING);
    assertEquals(TEST_STRING, cpuSpeed.get(configuration));
  }

  @Test
  public void getRam () throws Exception
  {
    ram.set(configuration, TEST_STRING);
    assertEquals(TEST_STRING, configuration.getRam());
  }

  @Test
  public void setRam () throws Exception
  {
    configuration.setRam(TEST_STRING);
    assertEquals(TEST_STRING, ram.get(configuration));
  }

  @Test
  public void getLocalHardDrives () throws Exception
  {
    localHardDrives.set(configuration, TEST_STRING);
    assertEquals(TEST_STRING, configuration.getLocalHardDrives());
  }

  @Test
  public void setLocalHardDrives () throws Exception
  {
    configuration.setLocalHardDrives(TEST_STRING);
    assertEquals(TEST_STRING, localHardDrives.get(configuration));
  }

  @Test
  public void isActive () throws Exception
  {
    isActive.set(configuration, TEST_BOOLEAN);
    assertEquals(TEST_BOOLEAN, configuration.isActive());
  }

  @Test
  public void setActive () throws Exception
  {
    configuration.setActive(TEST_BOOLEAN);
    assertEquals(TEST_BOOLEAN, isActive.get(configuration));
  }

  @Test
  public void getParentConfigurationId () throws Exception
  {
    parentConfigurationId.set(configuration, TEST_INT);
    assertEquals(TEST_INT, configuration.getParentConfigurationId());
  }

  @Test
  public void setParentConfigurationId () throws Exception
  {
    configuration.setParentConfigurationId(TEST_INT);
    assertEquals(TEST_INT, parentConfigurationId.get(configuration));
  }

  @Test
  public void getConfigurationQuestions () throws Exception
  {
    final ConfigurationQuestion[] test = new ConfigurationQuestion[] { new ConfigurationQuestion() };
    configurationQuestions.set(configuration, test);
    assertArrayEquals(test, configuration.getConfigurationQuestions());
  }

  @Test
  public void setConfigurationQuestions () throws Exception
  {
    final ConfigurationQuestion[] test = new ConfigurationQuestion[] { new ConfigurationQuestion() };
    configuration.setConfigurationQuestions(test);
    assertEquals(test, configurationQuestions.get(configuration));
  }

  @Test
  public void getVendorCompany () throws Exception
  {
    final VendorCompany test = new VendorCompany();
    vendorCompany.set(configuration, test);
    assertEquals(test, configuration.getVendorCompany());
  }

  @Test
  public void setVendorCompany () throws Exception
  {
    final VendorCompany test = new VendorCompany();
    configuration.setVendorCompany(test);
    assertEquals(test, vendorCompany.get(configuration));
  }

  @Test
  public void getManufacturerCompany () throws Exception
  {
    final ManufacturerCompany test = new ManufacturerCompany();
    manufacturerCompany.set(configuration, test);
    assertEquals(test, configuration.getManufacturerCompany());
  }

  @Test
  public void setManufacturerCompany () throws Exception
  {
    final ManufacturerCompany test = new ManufacturerCompany();
    configuration.setManufacturerCompany(test);
    assertEquals(test, manufacturerCompany.get(configuration));
  }

}
