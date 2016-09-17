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
import java.util.LinkedList;
import java.util.List;

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
      assertEquals(TEST_INT, (int) configuration.configurationTypeId());
    }

    @Test
    public void set() throws Exception
    {
      configuration.configurationTypeId(TEST_INT);
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
      assertEquals(TEST_STRING, configuration.configurationType());
    }

    @Test
    public void set() throws Exception
    {
      configuration.configurationType(TEST_STRING);
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
      assertEquals(TEST_INT, (int) configuration.statusId());
    }

    @Test
    public void set() throws Exception
    {
      configuration.statusId(TEST_INT);
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
      assertEquals(TEST_STRING, configuration.status());
    }

    @Test
    public void set() throws Exception
    {
      configuration.status(TEST_STRING);
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
      assertEquals(TEST_STRING, configuration.configurationName());
    }

    @Test
    public void set() throws Exception
    {
      configuration.configurationName(TEST_STRING);
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
      assertEquals(TEST_STRING, configuration.contactName());
    }

    @Test
    public void set() throws Exception
    {
      configuration.contactName(TEST_STRING);
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
      assertEquals(TEST_STRING, configuration.companyName());
    }

    @Test
    public void set() throws Exception
    {
      configuration.companyName(TEST_STRING);
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
      assertEquals(TEST_INT, (int) configuration.companyId());
    }

    @Test
    public void set() throws Exception
    {
      configuration.companyId(TEST_INT);
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
      assertEquals(TEST_INT, (int) configuration.contactId());
    }

    @Test
    public void set() throws Exception
    {
      configuration.contactId(TEST_INT);
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
      assertEquals(TEST_INT, (int) configuration.locationId());
    }

    @Test
    public void set() throws Exception
    {
      configuration.locationId(TEST_INT);
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
      assertEquals(TEST_INT, (int) configuration.businessUnitId());
    }

    @Test
    public void set() throws Exception
    {
      configuration.businessUnitId(TEST_INT);
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
      assertEquals(TEST_STRING, configuration.deviceIdentifier());
    }

    @Test
    public void set() throws Exception
    {
      configuration.deviceIdentifier(TEST_STRING);
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
      assertEquals(TEST_STRING, configuration.serialNumber());
    }

    @Test
    public void set() throws Exception
    {
      configuration.serialNumber(TEST_STRING);
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
      assertEquals(TEST_STRING, configuration.modelNumber());
    }

    @Test
    public void set() throws Exception
    {
      configuration.modelNumber(TEST_STRING);
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
      assertEquals(TEST_STRING, configuration.tagNumber());
    }

    @Test
    public void set() throws Exception
    {
      configuration.tagNumber(TEST_STRING);
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
      assertSame(TEST_DATE, configuration.purchaseDate());
    }

    @Test
    public void set() throws Exception
    {
      configuration.purchaseDate(TEST_DATE);
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
      assertSame(TEST_DATE, configuration.installationDate());
    }

    @Test
    public void set() throws Exception
    {
      configuration.installationDate(TEST_DATE);
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
      assertEquals(TEST_STRING, configuration.installedBy());
    }

    @Test
    public void set() throws Exception
    {
      configuration.installedBy(TEST_STRING);
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
      assertSame(TEST_DATE, configuration.warrantyExpiration());
    }

    @Test
    public void set() throws Exception
    {
      configuration.warrantyExpiration(TEST_DATE);
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
      assertEquals(TEST_INT, (int) configuration.addressId());
    }

    @Test
    public void set() throws Exception
    {
      configuration.addressId(TEST_INT);
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
      assertEquals(TEST_STRING, configuration.addressLine1());
    }

    @Test
    public void set() throws Exception
    {
      configuration.addressLine1(TEST_STRING);
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
      assertEquals(TEST_STRING, configuration.addressLine2());
    }

    @Test
    public void set() throws Exception
    {
      configuration.addressLine2(TEST_STRING);
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
      assertEquals(TEST_STRING, configuration.city());
    }

    @Test
    public void set() throws Exception
    {
      configuration.city(TEST_STRING);
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
      assertEquals(TEST_STRING, configuration.state());
    }

    @Test
    public void set() throws Exception
    {
      configuration.state(TEST_STRING);
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
      assertEquals(TEST_STRING, configuration.zipCode());
    }

    @Test
    public void set() throws Exception
    {
      configuration.zipCode(TEST_STRING);
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
      assertEquals(TEST_STRING, configuration.country());
    }

    @Test
    public void set() throws Exception
    {
      configuration.country(TEST_STRING);
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
      assertEquals(TEST_STRING, configuration.vendorNotes());
    }

    @Test
    public void set() throws Exception
    {
      configuration.vendorNotes(TEST_STRING);
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
      assertEquals(TEST_STRING, configuration.notes());
    }

    @Test
    public void set() throws Exception
    {
      configuration.notes(TEST_STRING);
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
      assertEquals(TEST_STRING, configuration.macAddress());
    }

    @Test
    public void set() throws Exception
    {
      configuration.macAddress(TEST_STRING);
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
      assertEquals(TEST_STRING, configuration.lastLoginName());
    }

    @Test
    public void set() throws Exception
    {
      configuration.lastLoginName(TEST_STRING);
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
      assertEquals(TEST_BOOLEAN, configuration.billFlag());
    }

    @Test
    public void set() throws Exception
    {
      configuration.billFlag(TEST_BOOLEAN);
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
      assertEquals(TEST_INT, (int) configuration.backupSuccesses());
    }

    @Test
    public void set() throws Exception
    {
      configuration.backupSuccesses(TEST_INT);
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
      assertEquals(TEST_INT, (int) configuration.backupIncomplete());
    }

    @Test
    public void set() throws Exception
    {
      configuration.backupIncomplete(TEST_INT);
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
      assertEquals(TEST_INT, (int) configuration.backupFailed());
    }

    @Test
    public void set() throws Exception
    {
      configuration.backupFailed(TEST_INT);
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
      assertEquals(TEST_INT, (int) configuration.backupRestores());
    }

    @Test
    public void set() throws Exception
    {
      configuration.backupRestores(TEST_INT);
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
      assertSame(TEST_DATE, configuration.lastBackupDate());
    }

    @Test
    public void set() throws Exception
    {
      configuration.lastBackupDate(TEST_DATE);
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
      assertEquals(TEST_STRING, configuration.backupServerName());
    }

    @Test
    public void set() throws Exception
    {
      configuration.backupServerName(TEST_STRING);
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
      assertEquals(TEST_DOUBLE, configuration.backupBillableSpaceGb(), 0);
    }

    @Test
    public void set() throws Exception
    {
      configuration.backupBillableSpaceGb(TEST_DOUBLE);
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
      assertEquals(TEST_STRING, configuration.backupProtectedDeviceList());
    }

    @Test
    public void set() throws Exception
    {
      configuration.backupProtectedDeviceList(TEST_STRING);
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
      assertEquals(TEST_INT, (int) configuration.backupYear());
    }

    @Test
    public void set() throws Exception
    {
      configuration.backupYear(TEST_INT);
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
      assertEquals(TEST_INT, (int) configuration.backupMonth());
    }

    @Test
    public void set() throws Exception
    {
      configuration.backupMonth(TEST_INT);
      assertEquals(TEST_INT, prop.get(configuration));
    }
  }

  public class IPAddress
  {
    private final Field prop;

    public IPAddress() throws Exception
    {
      prop = Configuration.class.getDeclaredField("ipAddress");
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, TEST_STRING);
      assertEquals(TEST_STRING, configuration.ipAddress());
    }

    @Test
    public void set() throws Exception
    {
      configuration.ipAddress(TEST_STRING);
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
      assertEquals(TEST_STRING, configuration.defaultGateway());
    }

    @Test
    public void set() throws Exception
    {
      configuration.defaultGateway(TEST_STRING);
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
      assertEquals(TEST_STRING, configuration.osType());
    }

    @Test
    public void set() throws Exception
    {
      configuration.osType(TEST_STRING);
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
      assertEquals(TEST_STRING, configuration.osInfo());
    }

    @Test
    public void set() throws Exception
    {
      configuration.osInfo(TEST_STRING);
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
      assertEquals(TEST_STRING, configuration.cpuSpeed());
    }

    @Test
    public void set() throws Exception
    {
      configuration.cpuSpeed(TEST_STRING);
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
      assertEquals(TEST_STRING, configuration.ram());
    }

    @Test
    public void set() throws Exception
    {
      configuration.ram(TEST_STRING);
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
      assertEquals(TEST_STRING, configuration.localHardDrives());
    }

    @Test
    public void set() throws Exception
    {
      configuration.localHardDrives(TEST_STRING);
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
      assertEquals(TEST_BOOLEAN, configuration.active());
    }

    @Test
    public void set() throws Exception
    {
      configuration.active(TEST_BOOLEAN);
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
      assertEquals(TEST_INT, (int) configuration.parentConfigurationId());
    }

    @Test
    public void set() throws Exception
    {
      configuration.parentConfigurationId(TEST_INT);
      assertEquals(TEST_INT, prop.get(configuration));
    }
  }

  public class ConfigurationQuestions
  {
    private final List< ConfigurationQuestion > test;
    private final Field                         prop;

    public ConfigurationQuestions() throws Exception
    {
      prop = Configuration.class.getDeclaredField("configurationQuestions");
      test = new LinkedList < ConfigurationQuestion >();
      prop.setAccessible(true);
    }

    @Test
    public void get() throws Exception
    {
      prop.set(configuration, test);
      assertSame(test, configuration.configurationQuestions());
    }

    @Test
    public void set() throws Exception
    {
      configuration.configurationQuestions(test);
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
      assertSame(test, configuration.vendorCompany());
    }

    @Test
    public void set() throws Exception
    {
      configuration.vendorCompany(test);
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
      assertSame(test, configuration.manufacturerCompany());
    }

    @Test
    public void set() throws Exception
    {
      configuration.manufacturerCompany(test);
      assertSame(test, prop.get(configuration));
    }
  }
}
