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
 *
 */

package io.vulpine.connectwise.api.endpoints.company.add;

import io.vulpine.connectwise.api.common.request.AddRequest;
import io.vulpine.connectwise.type.company.Address;
import io.vulpine.connectwise.type.company.Company;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class AddCompanyTest
{
  private static final String TEST_STRING = "Test string value.";
  private static final int TEST_INT = 666;

  private static Field      dataField;
  private        Company    company;
  private        AddCompany request;

  @BeforeClass
  public static void setUpClass() throws NoSuchFieldException
  {
    dataField = AddRequest.class.getDeclaredField("data");
    dataField.setAccessible(true);
  }

  @Before
  public void setUp() throws Exception
  {
    company = Mockito.spy(Company.class);
    request = new AddCompany(null, null, null);

    dataField.set(request, company);
  }

  @Test
  public void companyName_passes_value_to_company_instance() throws Exception
  {
    request.companyName(TEST_STRING);
    Mockito.verify(company, Mockito.times(1)).setCompanyName(TEST_STRING);
  }

  @Test
  public void companyName_fetches_value_from_company_instance() throws Exception
  {
    request.companyName();
    Mockito.verify(company, Mockito.times(1)).getCompanyName();
  }

  @Test
  public void companyIdentifier_passes_value_to_company_instance() throws Exception
  {
    request.companyIdentifier(TEST_STRING);
    Mockito.verify(company, Mockito.times(1)).setCompanyIdentifier(TEST_STRING);
  }

  @Test
  public void companyIdentifier_fetches_value_from_company_instance() throws Exception
  {
    request.companyIdentifier();
    Mockito.verify(company, Mockito.times(1)).getCompanyIdentifier();
  }

  @Test
  public void defaultAddress_passes_value_to_company_instance() throws Exception
  {
    final Address address = new Address();
    request.defaultAddress(address);
    Mockito.verify(company, Mockito.times(1)).setDefaultAddress(address);
  }

  @Test
  public void defaultAddress_fetches_value_from_company_instance() throws Exception
  {
    request.defaultAddress();
    Mockito.verify(company, Mockito.times(1)).getDefaultAddress();
  }

  @Test
  public void addresses_passes_value_to_company_instance() throws Exception
  {
    final List< Address > list = new ArrayList< Address >();
    request.addresses(list);
    Mockito.verify(company, Mockito.times(1)).setAddresses(list);
  }

  @Test
  public void addresses_fetches_value_from_company_instance() throws Exception
  {
    request.addresses();
    Mockito.verify(company, Mockito.times(1)).getAddresses();
  }

  @Test
  public void phoneNumber_passes_value_to_company_instance() throws Exception
  {
    request.phoneNumber(TEST_STRING);
    Mockito.verify(company, Mockito.times(1)).setPhoneNumber(TEST_STRING);
  }

  @Test
  public void phoneNumber_fetches_value_from_company_instance() throws Exception
  {
    request.phoneNumber();
    Mockito.verify(company, Mockito.times(1)).getPhoneNumber();
  }

  @Test
  public void faxNumber_passes_value_to_company_instance() throws Exception
  {
    request.faxNumber(TEST_STRING);
    Mockito.verify(company, Mockito.times(1)).setFaxNumber(TEST_STRING);
  }

  @Test
  public void faxNumber_fetches_value_from_company_instance() throws Exception
  {
    request.faxNumber();
    Mockito.verify(company, Mockito.times(1)).getFaxNumber();
  }

  @Test
  public void webSite_passes_value_to_company_instance() throws Exception
  {
    request.webSite(TEST_STRING);
    Mockito.verify(company, Mockito.times(1)).setWebSite(TEST_STRING);
  }

  @Test
  public void webSite_fetches_value_from_company_instance() throws Exception
  {
    request.webSite();
    Mockito.verify(company, Mockito.times(1)).getWebSite();
  }

  @Test
  public void territory_passes_value_to_company_instance() throws Exception
  {
    request.territory(TEST_STRING);
    Mockito.verify(company, Mockito.times(1)).setTerritory(TEST_STRING);
  }

  @Test
  public void territory_fetches_value_from_company_instance() throws Exception
  {
    request.territory();
    Mockito.verify(company, Mockito.times(1)).getTerritory();
  }

  @Test
  public void market_passes_value_to_company_instance() throws Exception
  {
    request.market(TEST_STRING);
    Mockito.verify(company, Mockito.times(1)).setMarket(TEST_STRING);
  }

  @Test
  public void market_fetches_value_from_company_instance() throws Exception
  {
    request.market();
    Mockito.verify(company, Mockito.times(1)).getMarket();
  }

  @Test
  public void type_passes_value_to_company_instance() throws Exception
  {
    request.type(TEST_STRING);
    Mockito.verify(company, Mockito.times(1)).setType(TEST_STRING);
  }

  @Test
  public void type_fetches_value_from_company_instance() throws Exception
  {
    request.type();
    Mockito.verify(company, Mockito.times(1)).getType();
  }

  @Test
  public void status_passes_value_to_company_instance() throws Exception
  {
    request.status(TEST_STRING);
    Mockito.verify(company, Mockito.times(1)).setStatus(TEST_STRING);
  }

  @Test
  public void status_fetches_value_from_company_instance() throws Exception
  {
    request.status();
    Mockito.verify(company, Mockito.times(1)).getStatus();
  }

  @Test
  public void accountNumber_passes_value_to_company_instance() throws Exception
  {
    request.accountNumber(TEST_STRING);
    Mockito.verify(company, Mockito.times(1)).setAccountNumber(TEST_STRING);
  }

  @Test
  public void accountNumber_fetches_value_from_company_instance() throws Exception
  {
    request.accountNumber();
    Mockito.verify(company, Mockito.times(1)).getAccountNumber();
  }

  @Test
  public void defaultContactId_passes_value_to_company_instance() throws Exception
  {
    request.defaultContactId(TEST_INT);
    Mockito.verify(company, Mockito.times(1)).setDefaultContactId(TEST_INT);
  }

  @Test
  public void defaultContactId_fetches_value_from_company_instance() throws Exception
  {
    request.defaultContactId();
    Mockito.verify(company, Mockito.times(1)).getDefaultContactId();
  }

  @Test
  public void defaultBillingContactId_passes_value_to_company_instance() throws Exception
  {
    request.defaultBillingContactId(TEST_INT);
    Mockito.verify(company, Mockito.times(1)).setDefaultBillingContactId(TEST_INT);
  }

  @Test
  public void defaultBillingContactId_fetches_value_from_company_instance() throws Exception
  {
    request.defaultBillingContactId();
    Mockito.verify(company, Mockito.times(1)).getDefaultBillingContactId();
  }
}
