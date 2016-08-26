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

import de.bechte.junit.runners.context.HierarchicalContextRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.lang.reflect.Field;
import java.util.Date;

import static org.junit.Assert.*;

@RunWith( HierarchicalContextRunner.class )
public class ConfigurationTest
{
  private static final String  TEST_STRING  = "Test String Value.";
  private static final double  TEST_DOUBLE  = 6.66;
  private static final boolean TEST_BOOLEAN = true;
  private static final int     TEST_INT     = 666;
  private static final Date    TEST_DATE    = new Date();

  private Configuration configuration;

  @Before
  public void setUp() throws Exception
  {
    configuration = new Configuration();
  }

  public class ConfigurationTypeId
  {
    private final Field prop;

    public ConfigurationTypeId() throws Exception
    {
      prop = Configuration.class.getDeclaredField("configurationTypeId");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_INT);
      assertEquals(TEST_INT, configuration.getConfigurationTypeId());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setConfigurationTypeId(TEST_INT);
      assertEquals(TEST_INT, prop.get(configuration));
    }
  }

  public class ConfigurationType
  {
    private final Field prop;

    public ConfigurationType() throws Exception
    {
      prop = Configuration.class.getDeclaredField("configurationType");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_STRING);
      assertEquals(TEST_STRING, configuration.getConfigurationType());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setConfigurationType(TEST_STRING);
      assertEquals(TEST_STRING, prop.get(configuration));
    }
  }

  public class StatusId
  {
    private final Field prop;

    public StatusId() throws Exception
    {
      prop = Configuration.class.getDeclaredField("statusId");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_INT);
      assertEquals(TEST_INT, configuration.getStatusId());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setStatusId(TEST_INT);
      assertEquals(TEST_INT, prop.get(configuration));
    }
  }

  public class Status
  {
    private final Field prop;

    public Status() throws Exception
    {
      prop = Configuration.class.getDeclaredField("status");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_STRING);
      assertEquals(TEST_STRING, configuration.getStatus());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setStatus(TEST_STRING);
      assertEquals(TEST_STRING, prop.get(configuration));
    }
  }

  public class ConfigurationName
  {
    private final Field prop;

    public ConfigurationName() throws Exception
    {
      prop = Configuration.class.getDeclaredField("configurationName");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_STRING);
      assertEquals(TEST_STRING, configuration.getConfigurationName());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setConfigurationName(TEST_STRING);
      assertEquals(TEST_STRING, prop.get(configuration));
    }
  }

  public class ContactName
  {
    private final Field prop;

    public ContactName() throws Exception
    {
      prop = Configuration.class.getDeclaredField("contactName");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_STRING);
      assertEquals(TEST_STRING, configuration.getContactName());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setContactName(TEST_STRING);
      assertEquals(TEST_STRING, prop.get(configuration));
    }
  }

  public class CompanyName
  {
    private final Field prop;

    public CompanyName() throws Exception
    {
      prop = Configuration.class.getDeclaredField("companyName");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_STRING);
      assertEquals(TEST_STRING, configuration.getCompanyName());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setCompanyName(TEST_STRING);
      assertEquals(TEST_STRING, prop.get(configuration));
    }
  }

  public class CompanyId
  {
    private final Field prop;

    public CompanyId() throws Exception
    {
      prop = Configuration.class.getDeclaredField("companyId");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_INT);
      assertEquals(TEST_INT, configuration.getCompanyId());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setCompanyId(TEST_INT);
      assertEquals(TEST_INT, prop.get(configuration));
    }
  }

  public class ContactId
  {
    private final Field prop;

    public ContactId() throws Exception
    {
      prop = Configuration.class.getDeclaredField("contactId");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_INT);
      assertEquals(TEST_INT, configuration.getContactId());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setContactId(TEST_INT);
      assertEquals(TEST_INT, prop.get(configuration));
    }
  }

  public class LocationId
  {
    private final Field prop;

    public LocationId() throws Exception
    {
      prop = Configuration.class.getDeclaredField("locationId");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_INT);
      assertEquals(TEST_INT, configuration.getLocationId());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setLocationId(TEST_INT);
      assertEquals(TEST_INT, prop.get(configuration));
    }
  }

  public class BusinessUnitId
  {
    private final Field prop;

    public BusinessUnitId() throws Exception
    {
      prop = Configuration.class.getDeclaredField("businessUnitId");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_INT);
      assertEquals(TEST_INT, configuration.getBusinessUnitId());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setBusinessUnitId(TEST_INT);
      assertEquals(TEST_INT, prop.get(configuration));
    }
  }

  public class DeviceIdentifier
  {
    private final Field prop;

    public DeviceIdentifier() throws Exception
    {
      prop = Configuration.class.getDeclaredField("deviceIdentifier");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_STRING);
      assertEquals(TEST_STRING, configuration.getDeviceIdentifier());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setDeviceIdentifier(TEST_STRING);
      assertEquals(TEST_STRING, prop.get(configuration));
    }
  }

  public class SerialNumber
  {
    private final Field prop;

    public SerialNumber() throws Exception
    {
      prop = Configuration.class.getDeclaredField("serialNumber");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_STRING);
      assertEquals(TEST_STRING, configuration.getSerialNumber());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setSerialNumber(TEST_STRING);
      assertEquals(TEST_STRING, prop.get(configuration));
    }
  }

  public class ModelNumber
  {
    private final Field prop;

    public ModelNumber() throws Exception
    {
      prop = Configuration.class.getDeclaredField("modelNumber");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_STRING);
      assertEquals(TEST_STRING, configuration.getModelNumber());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setModelNumber(TEST_STRING);
      assertEquals(TEST_STRING, prop.get(configuration));
    }
  }

  public class TagNumber
  {
    private final Field prop;

    public TagNumber() throws Exception
    {
      prop = Configuration.class.getDeclaredField("tagNumber");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_STRING);
      assertEquals(TEST_STRING, configuration.getTagNumber());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setTagNumber(TEST_STRING);
      assertEquals(TEST_STRING, prop.get(configuration));
    }
  }

  public class PurchaseDate
  {
    private final Field prop;

    public PurchaseDate() throws Exception
    {
      prop = Configuration.class.getDeclaredField("purchaseDate");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_DATE);
      assertSame(TEST_DATE, configuration.getPurchaseDate());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setPurchaseDate(TEST_DATE);
      assertSame(TEST_DATE, prop.get(configuration));
    }
  }

  public class InstallationDate
  {
    private final Field prop;

    public InstallationDate() throws Exception
    {
      prop = Configuration.class.getDeclaredField("installationDate");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_DATE);
      assertSame(TEST_DATE, configuration.getInstallationDate());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setInstallationDate(TEST_DATE);
      assertSame(TEST_DATE, prop.get(configuration));
    }
  }

  public class InstalledBy
  {
    private final Field prop;

    public InstalledBy() throws Exception
    {
      prop = Configuration.class.getDeclaredField("installedBy");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_STRING);
      assertEquals(TEST_STRING, configuration.getInstalledBy());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setInstalledBy(TEST_STRING);
      assertEquals(TEST_STRING, prop.get(configuration));
    }
  }

  public class WarrantyExpiration
  {
    private final Field prop;

    public WarrantyExpiration() throws Exception
    {
      prop = Configuration.class.getDeclaredField("warrantyExpiration");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_DATE);
      assertSame(TEST_DATE, configuration.getWarrantyExpiration());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setWarrantyExpiration(TEST_DATE);
      assertSame(TEST_DATE, prop.get(configuration));
    }
  }

  public class AddressId
  {
    private final Field prop;

    public AddressId() throws Exception
    {
      prop = Configuration.class.getDeclaredField("addressId");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_INT);
      assertEquals(TEST_INT, configuration.getAddressId());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setAddressId(TEST_INT);
      assertEquals(TEST_INT, prop.get(configuration));
    }
  }

  public class AddressLine1
  {
    private final Field prop;

    public AddressLine1() throws Exception
    {
      prop = Configuration.class.getDeclaredField("addressLine1");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_STRING);
      assertEquals(TEST_STRING, configuration.getAddressLine1());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setAddressLine1(TEST_STRING);
      assertEquals(TEST_STRING, prop.get(configuration));
    }
  }

  public class AddressLine2
  {
    private final Field prop;

    public AddressLine2() throws Exception
    {
      prop = Configuration.class.getDeclaredField("addressLine2");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_STRING);
      assertEquals(TEST_STRING, configuration.getAddressLine2());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setAddressLine2(TEST_STRING);
      assertEquals(TEST_STRING, prop.get(configuration));
    }
  }

  public class City
  {
    private final Field prop;

    public City() throws Exception
    {
      prop = Configuration.class.getDeclaredField("city");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_STRING);
      assertEquals(TEST_STRING, configuration.getCity());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setCity(TEST_STRING);
      assertEquals(TEST_STRING, prop.get(configuration));
    }
  }

  public class State
  {
    private final Field prop;

    public State() throws Exception
    {
      prop = Configuration.class.getDeclaredField("state");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_STRING);
      assertEquals(TEST_STRING, configuration.getState());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setState(TEST_STRING);
      assertEquals(TEST_STRING, prop.get(configuration));
    }
  }

  public class ZipCode
  {
    private final Field prop;

    public ZipCode() throws Exception
    {
      prop = Configuration.class.getDeclaredField("zipCode");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_STRING);
      assertEquals(TEST_STRING, configuration.getZipCode());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setZipCode(TEST_STRING);
      assertEquals(TEST_STRING, prop.get(configuration));
    }
  }

  public class Country
  {
    private final Field prop;

    public Country() throws Exception
    {
      prop = Configuration.class.getDeclaredField("country");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_STRING);
      assertEquals(TEST_STRING, configuration.getCountry());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setCountry(TEST_STRING);
      assertEquals(TEST_STRING, prop.get(configuration));
    }
  }

  public class VendorNotes
  {
    private final Field prop;

    public VendorNotes() throws Exception
    {
      prop = Configuration.class.getDeclaredField("vendorNotes");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_STRING);
      assertEquals(TEST_STRING, configuration.getVendorNotes());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setVendorNotes(TEST_STRING);
      assertEquals(TEST_STRING, prop.get(configuration));
    }
  }

  public class Notes
  {
    private final Field prop;

    public Notes() throws Exception
    {
      prop = Configuration.class.getDeclaredField("notes");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_STRING);
      assertEquals(TEST_STRING, configuration.getNotes());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setNotes(TEST_STRING);
      assertEquals(TEST_STRING, prop.get(configuration));
    }
  }

  public class MacAddress
  {
    private final Field prop;

    public MacAddress() throws Exception
    {
      prop = Configuration.class.getDeclaredField("macAddress");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_STRING);
      assertEquals(TEST_STRING, configuration.getMacAddress());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setMacAddress(TEST_STRING);
      assertEquals(TEST_STRING, prop.get(configuration));
    }
  }

  public class LastLoginName
  {
    private final Field prop;

    public LastLoginName() throws Exception
    {
      prop = Configuration.class.getDeclaredField("lastLoginName");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_STRING);
      assertEquals(TEST_STRING, configuration.getLastLoginName());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setLastLoginName(TEST_STRING);
      assertEquals(TEST_STRING, prop.get(configuration));
    }
  }

  public class BillFlag
  {
    private final Field prop;

    public BillFlag() throws Exception
    {
      prop = Configuration.class.getDeclaredField("billFlag");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_BOOLEAN);
      assertEquals(TEST_BOOLEAN, configuration.isBillFlag());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setBillFlag(TEST_BOOLEAN);
      assertEquals(TEST_BOOLEAN, prop.get(configuration));
    }
  }

  public class BackupSuccesses
  {
    private final Field prop;

    public BackupSuccesses() throws Exception
    {
      prop = Configuration.class.getDeclaredField("backupSuccesses");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_INT);
      assertEquals(TEST_INT, configuration.getBackupSuccesses());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setBackupSuccesses(TEST_INT);
      assertEquals(TEST_INT, prop.get(configuration));
    }
  }

  public class BackupIncomplete
  {
    private final Field prop;

    public BackupIncomplete() throws Exception
    {
      prop = Configuration.class.getDeclaredField("backupIncomplete");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_INT);
      assertEquals(TEST_INT, configuration.getBackupIncomplete());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setBackupIncomplete(TEST_INT);
      assertEquals(TEST_INT, prop.get(configuration));
    }
  }

  public class BackupFailed
  {
    private final Field prop;

    public BackupFailed() throws Exception
    {
      prop = Configuration.class.getDeclaredField("backupFailed");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_INT);
      assertEquals(TEST_INT, configuration.getBackupFailed());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setBackupFailed(TEST_INT);
      assertEquals(TEST_INT, prop.get(configuration));
    }
  }

  public class BackupRestores
  {
    private final Field prop;

    public BackupRestores() throws Exception
    {
      prop = Configuration.class.getDeclaredField("backupRestores");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_INT);
      assertEquals(TEST_INT, configuration.getBackupRestores());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setBackupRestores(TEST_INT);
      assertEquals(TEST_INT, prop.get(configuration));
    }
  }

  public class LastBackupDate
  {
    private final Field prop;

    public LastBackupDate() throws Exception
    {
      prop = Configuration.class.getDeclaredField("lastBackupDate");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_DATE);
      assertSame(TEST_DATE, configuration.getLastBackupDate());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setLastBackupDate(TEST_DATE);
      assertSame(TEST_DATE, prop.get(configuration));
    }
  }

  public class BackupServerName
  {
    private final Field prop;

    public BackupServerName() throws Exception
    {
      prop = Configuration.class.getDeclaredField("backupServerName");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_STRING);
      assertEquals(TEST_STRING, configuration.getBackupServerName());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setBackupServerName(TEST_STRING);
      assertEquals(TEST_STRING, prop.get(configuration));
    }
  }

  public class BackupBillableSpaceGb
  {
    private final Field prop;

    public BackupBillableSpaceGb() throws Exception
    {
      prop = Configuration.class.getDeclaredField("backupBillableSpaceGb");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, configuration.getBackupBillableSpaceGb(), 0);
    }

    @Test
    public void set() throws Exception
    {
      configuration.setBackupBillableSpaceGb(TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, prop.get(configuration));
    }
  }

  public class BackupProtectedDeviceList
  {
    private final Field prop;

    public BackupProtectedDeviceList() throws Exception
    {
      prop = Configuration.class.getDeclaredField("backupProtectedDeviceList");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_STRING);
      assertEquals(TEST_STRING, configuration.getBackupProtectedDeviceList());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setBackupProtectedDeviceList(TEST_STRING);
      assertEquals(TEST_STRING, prop.get(configuration));
    }
  }

  public class BackupYear
  {
    private final Field prop;

    public BackupYear() throws Exception
    {
      prop = Configuration.class.getDeclaredField("backupYear");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_INT);
      assertEquals(TEST_INT, configuration.getBackupYear());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setBackupYear(TEST_INT);
      assertEquals(TEST_INT, prop.get(configuration));
    }
  }

  public class BackupMonth
  {
    private final Field prop;

    public BackupMonth() throws Exception
    {
      prop = Configuration.class.getDeclaredField("backupMonth");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_INT);
      assertEquals(TEST_INT, configuration.getBackupMonth());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setBackupMonth(TEST_INT);
      assertEquals(TEST_INT, prop.get(configuration));
    }
  }

  public class IPAddress
  {
    private final Field prop;

    public IPAddress() throws Exception
    {
      prop = Configuration.class.getDeclaredField("iPAddress");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_STRING);
      assertEquals(TEST_STRING, configuration.getiPAddress());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setiPAddress(TEST_STRING);
      assertEquals(TEST_STRING, prop.get(configuration));
    }
  }

  public class DefaultGateway
  {
    private final Field prop;

    public DefaultGateway() throws Exception
    {
      prop = Configuration.class.getDeclaredField("defaultGateway");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_STRING);
      assertEquals(TEST_STRING, configuration.getDefaultGateway());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setDefaultGateway(TEST_STRING);
      assertEquals(TEST_STRING, prop.get(configuration));
    }
  }

  public class OSType
  {
    private final Field prop;

    public OSType() throws Exception
    {
      prop = Configuration.class.getDeclaredField("osType");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_STRING);
      assertEquals(TEST_STRING, configuration.getOsType());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setOsType(TEST_STRING);
      assertEquals(TEST_STRING, prop.get(configuration));
    }

  }

  public class OSInfo
  {
    private final Field prop;

    public OSInfo() throws Exception
    {
      prop = Configuration.class.getDeclaredField("osInfo");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_STRING);
      assertEquals(TEST_STRING, configuration.getOsInfo());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setOsInfo(TEST_STRING);
      assertEquals(TEST_STRING, prop.get(configuration));
    }
  }

  public class CPUSpeed
  {
    private final Field prop;

    public CPUSpeed() throws Exception
    {
      prop = Configuration.class.getDeclaredField("cpuSpeed");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_STRING);
      assertEquals(TEST_STRING, configuration.getCpuSpeed());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setCpuSpeed(TEST_STRING);
      assertEquals(TEST_STRING, prop.get(configuration));
    }
  }

  public class RAM
  {
    private final Field prop;

    public RAM() throws Exception
    {
      prop = Configuration.class.getDeclaredField("ram");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_STRING);
      assertEquals(TEST_STRING, configuration.getRam());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setRam(TEST_STRING);
      assertEquals(TEST_STRING, prop.get(configuration));
    }
  }

  public class LocalHardDrives
  {
    private final Field prop;

    public LocalHardDrives() throws Exception
    {
      prop = Configuration.class.getDeclaredField("localHardDrives");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_STRING);
      assertEquals(TEST_STRING, configuration.getLocalHardDrives());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setLocalHardDrives(TEST_STRING);
      assertEquals(TEST_STRING, prop.get(configuration));
    }
  }

  public class IsActive
  {
    private final Field prop;

    public IsActive() throws Exception
    {
      prop = Configuration.class.getDeclaredField("isActive");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_BOOLEAN);
      assertEquals(TEST_BOOLEAN, configuration.isActive());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setActive(TEST_BOOLEAN);
      assertEquals(TEST_BOOLEAN, prop.get(configuration));
    }
  }

  public class ParentConfigurationId
  {
    private final Field prop;

    public ParentConfigurationId() throws Exception
    {
      prop = Configuration.class.getDeclaredField("parentConfigurationId");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_INT);
      assertEquals(TEST_INT, configuration.getParentConfigurationId());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setParentConfigurationId(TEST_INT);
      assertEquals(TEST_INT, prop.get(configuration));
    }
  }

  public class ConfigurationQuestions
  {
    final io.vulpine.connectwise.type.configuration.ConfigurationQuestion[] test;
    private final Field prop;

    public ConfigurationQuestions() throws Exception
    {
      prop = Configuration.class.getDeclaredField("configurationQuestions");
      test = new ConfigurationQuestion[] { new ConfigurationQuestion() };
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, test);
      assertSame(test, configuration.getConfigurationQuestions());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setConfigurationQuestions(test);
      assertSame(test, prop.get(configuration));
    }
  }

  public class VendorCompany
  {
    private final io.vulpine.connectwise.type.configuration.VendorCompany test;
    private final Field prop;

    public VendorCompany() throws Exception
    {
      prop = Configuration.class.getDeclaredField("vendorCompany");
      test = new io.vulpine.connectwise.type.configuration.VendorCompany();
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, test);
      assertSame(test, configuration.getVendorCompany());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setVendorCompany(test);
      assertSame(test, prop.get(configuration));
    }
  }

  public class ManufacturerCompany
  {
    private final io.vulpine.connectwise.type.configuration.ManufacturerCompany test;
    private final Field prop;

    public ManufacturerCompany() throws Exception
    {
      prop = Configuration.class.getDeclaredField("manufacturerCompany");
      test = new io.vulpine.connectwise.type.configuration.ManufacturerCompany();
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, test);
      assertSame(test, configuration.getManufacturerCompany());
    }

    @Test
    public void set() throws Exception
    {
      configuration.setManufacturerCompany(test);
      assertSame(test, prop.get(configuration));
    }
  }
}
