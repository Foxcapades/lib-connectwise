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
package io.vulpine.connectwise.type.agreement;

import org.junit.Test;

import java.lang.reflect.Field;
import java.util.Date;

import static org.junit.Assert.*;

public class AgreementTest
{
  @Test
  public void getAgreementTypeId () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("agreementTypeId");
    final int       value     = 123969;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.getAgreementTypeId());
  }

  @Test
  public void setAgreementTypeId () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("agreementTypeId");
    final int       value     = 123969;

    prop.setAccessible(true);
    agreement.setAgreementTypeId(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void getAgreementName () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("agreementName");
    final String    value     = "Test Value.";

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.getAgreementName());
  }

  @Test
  public void setAgreementName () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("agreementName");
    final String    value     = "Test Value.";

    prop.setAccessible(true);
    agreement.setAgreementName(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void getParentAgreementId () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("parentAgreementId");
    final int       value     = 123969;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.getParentAgreementId());
  }

  @Test
  public void setParentAgreementId () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("parentAgreementId");
    final int       value     = 123969;

    prop.setAccessible(true);
    agreement.setParentAgreementId(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void getCompanyId () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("companyId");
    final int       value     = 123969;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.getCompanyId());
  }

  @Test
  public void setCompanyId () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("companyId");
    final int       value     = 123969;

    prop.setAccessible(true);
    agreement.setCompanyId(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void getContactId () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("contactId");
    final int       value     = 123969;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.getContactId());
  }

  @Test
  public void setContactId () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("contactId");
    final int       value     = 123969;

    prop.setAccessible(true);
    agreement.setContactId(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void getCustomerPo () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("customerPo");
    final String    value     = "Test Value.";

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.getCustomerPo());
  }

  @Test
  public void setCustomerPo () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("customerPo");
    final String    value     = "Test Value.";

    prop.setAccessible(true);
    agreement.setCustomerPo(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void getLocationId () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("locationId");
    final int       value     = 123969;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.getLocationId());
  }

  @Test
  public void setLocationId () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("locationId");
    final int       value     = 123969;

    prop.setAccessible(true);
    agreement.setLocationId(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void getDepartmentId () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("departmentId");
    final int       value     = 123969;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.getDepartmentId());
  }

  @Test
  public void setDepartmentId () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("departmentId");
    final int       value     = 123969;

    prop.setAccessible(true);
    agreement.setDepartmentId(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void isRestrictLocation () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("restrictLocation");
    final boolean   value     = true;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.isRestrictLocation());
  }

  @Test
  public void setRestrictLocation () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("restrictLocation");
    final boolean   value     = true;

    prop.setAccessible(true);
    agreement.setRestrictLocation(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void isRestrictDepartment () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("restrictDepartment");
    final boolean   value     = true;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.isRestrictDepartment());
  }

  @Test
  public void setRestrictDepartment () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("restrictDepartment");
    final boolean   value     = true;

    prop.setAccessible(true);
    agreement.setRestrictDepartment(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void getStartDate () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("startDate");
    final Date      value     = new Date();

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.getStartDate());
  }

  @Test
  public void setStartDate () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("startDate");
    final Date      value     = new Date();

    prop.setAccessible(true);
    agreement.setStartDate(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void getEndDate () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("endDate");
    final Date      value     = new Date();

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.getEndDate());
  }

  @Test
  public void setEndDate () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("endDate");
    final Date      value     = new Date();

    prop.setAccessible(true);
    agreement.setEndDate(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void isNoEndingDate () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("noEndingDate");
    final boolean   value     = true;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.isNoEndingDate());
  }

  @Test
  public void setNoEndingDate () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("noEndingDate");
    final boolean   value     = true;

    prop.setAccessible(true);
    agreement.setNoEndingDate(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void getOpportunityId () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("opportunityId");
    final int       value     = 123969;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.getOpportunityId());
  }

  @Test
  public void setOpportunityId () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("opportunityId");
    final int       value     = 123969;

    prop.setAccessible(true);
    agreement.setOpportunityId(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void isCancelled () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("cancelled");
    final boolean   value     = true;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.isCancelled());
  }

  @Test
  public void setCancelled () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("cancelled");
    final boolean   value     = true;

    prop.setAccessible(true);
    agreement.setCancelled(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void getDateCancelled () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("dateCancelled");
    final Date      value     = new Date();

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.getDateCancelled());
  }

  @Test
  public void setDateCancelled () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("dateCancelled");
    final Date      value     = new Date();

    prop.setAccessible(true);
    agreement.setDateCancelled(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void getReasonCancelled () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("reasonCancelled");
    final String    value     = "Test Value.";

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.getReasonCancelled());
  }

  @Test
  public void setReasonCancelled () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("reasonCancelled");
    final String    value     = "Test Value.";

    prop.setAccessible(true);
    agreement.setReasonCancelled(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void getSlaId () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("slaId");
    final int       value     = 123969;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.getSlaId());
  }

  @Test
  public void setSlaId () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("slaId");
    final int       value     = 123969;

    prop.setAccessible(true);
    agreement.setSlaId(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void getSubContractCompanyId () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("subContractCompanyId");
    final int       value     = 123969;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.getSubContractCompanyId());
  }

  @Test
  public void setSubContractCompanyId () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("subContractCompanyId");
    final int       value     = 123969;

    prop.setAccessible(true);
    agreement.setSubContractCompanyId(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void getSubContractContactId () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("subContractContactId");
    final int       value     = 123969;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.getSubContractContactId());
  }

  @Test
  public void setSubContractContactId () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("subContractContactId");
    final int       value     = 123969;

    prop.setAccessible(true);
    agreement.setSubContractContactId(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void getWorkOrder () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("workOrder");
    final String    value     = "Test Value";

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.getWorkOrder());
  }

  @Test
  public void setWorkOrder () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("workOrder");
    final String    value     = "Test Value";

    prop.setAccessible(true);
    agreement.setWorkOrder(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void getInternalNotes () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("internalNotes");
    final String    value     = "Test Value";

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.getInternalNotes());
  }

  @Test
  public void setInternalNotes () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("internalNotes");
    final String    value     = "Test Value";

    prop.setAccessible(true);
    agreement.setInternalNotes(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void getApplicationUnits () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("applicationUnits");
    final String    value     = "Test Value";

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.getApplicationUnits());
  }

  @Test
  public void setApplicationUnits () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("applicationUnits");
    final String    value     = "Test Value";

    prop.setAccessible(true);
    agreement.setApplicationUnits(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void getApplicationLimit () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("applicationLimit");
    final double    value     = 66.6;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.getApplicationLimit(), 0);
  }

  @Test
  public void setApplicationLimit () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("applicationLimit");
    final double    value     = 66.6;

    prop.setAccessible(true);
    agreement.setApplicationLimit(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void getApplicationCycle () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("applicationCycle");
    final String    value     = "Test Value.";

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.getApplicationCycle());
  }

  @Test
  public void setApplicationCycle () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("applicationCycle");
    final String    value     = "Test Value.";

    prop.setAccessible(true);
    agreement.setApplicationCycle(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void getPeriodType () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("periodType");
    final String    value     = "Test Value.";

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.getPeriodType());
  }

  @Test
  public void setPeriodType () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("periodType");
    final String    value     = "Test Value.";

    prop.setAccessible(true);
    agreement.setPeriodType(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void isApplicationUnlimited () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("applicationUnlimited");
    final boolean   value     = true;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.isApplicationUnlimited());
  }

  @Test
  public void setApplicationUnlimited () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("applicationUnlimited");
    final boolean   value     = true;

    prop.setAccessible(true);
    agreement.setApplicationUnlimited(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void isOneTime () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("oneTime");
    final boolean   value     = true;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.isOneTime());
  }

  @Test
  public void setOneTime () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("oneTime");
    final boolean   value     = true;

    prop.setAccessible(true);
    agreement.setOneTime(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void isCoverAgreementTime () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("coverAgreementTime");
    final boolean   value     = true;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.isCoverAgreementTime());
  }

  @Test
  public void setCoverAgreementTime () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("coverAgreementTime");
    final boolean   value     = true;

    prop.setAccessible(true);
    agreement.setCoverAgreementTime(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void isCoverAgreementProduct () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("coverAgreementProduct");
    final boolean   value     = true;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.isCoverAgreementProduct());
  }

  @Test
  public void setCoverAgreementProduct () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("coverAgreementProduct");
    final boolean   value     = true;

    prop.setAccessible(true);
    agreement.setCoverAgreementProduct(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void isCoverAgreementExpense () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("coverAgreementExpense");
    final boolean   value     = true;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.isCoverAgreementExpense());
  }

  @Test
  public void setCoverAgreementExpense () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("coverAgreementExpense");
    final boolean   value     = true;

    prop.setAccessible(true);
    agreement.setCoverAgreementExpense(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void isCoverSalesTax () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("coverSalesTax");
    final boolean   value     = true;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.isCoverSalesTax());
  }

  @Test
  public void setCoverSalesTax () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("coverSalesTax");
    final boolean   value     = true;

    prop.setAccessible(true);
    agreement.setCoverSalesTax(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void isCarryOverUnused () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("carryOverUnused");
    final boolean   value     = true;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.isCarryOverUnused());
  }

  @Test
  public void setCarryOverUnused () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("carryOverUnused");
    final boolean   value     = true;

    prop.setAccessible(true);
    agreement.setCarryOverUnused(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void isAllowOverruns () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("allowOverruns");
    final boolean   value     = true;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.isAllowOverruns());
  }

  @Test
  public void setAllowOverruns () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("allowOverruns");
    final boolean   value     = true;

    prop.setAccessible(true);
    agreement.setAllowOverruns(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void getExpiredDays () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("expiredDays");
    final int       value     = 54675;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.getExpiredDays());
  }

  @Test
  public void setExpiredDays () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("expiredDays");
    final int       value     = 54675;

    prop.setAccessible(true);
    agreement.setExpiredDays(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void getLimit () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("limit");
    final int       value     = 54675;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.getLimit());
  }

  @Test
  public void setLimit () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("limit");
    final int       value     = 54675;

    prop.setAccessible(true);
    agreement.setLimit(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void isExpireWhenZero () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("expireWhenZero");
    final boolean   value     = true;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.isExpireWhenZero());
  }

  @Test
  public void setExpireWhenZero () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("expireWhenZero");
    final boolean   value     = true;

    prop.setAccessible(true);
    agreement.setExpireWhenZero(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void isChargeToFirm () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("chargeToFirm");
    final boolean   value     = true;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.isChargeToFirm());
  }

  @Test
  public void setChargeToFirm () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("chargeToFirm");
    final boolean   value     = true;

    prop.setAccessible(true);
    agreement.setChargeToFirm(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void getEmployeeCompRate () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("employeeCompRate");
    final String    value     = "Test Value.";

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.getEmployeeCompRate());
  }

  @Test
  public void setEmployeeCompRate () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("employeeCompRate");
    final String    value     = "Test Value.";

    prop.setAccessible(true);
    agreement.setEmployeeCompRate(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void getEmployeeCompNotExceed () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("employeeCompNotExceed");
    final String    value     = "Test Value.";

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.getEmployeeCompNotExceed());
  }

  @Test
  public void setEmployeeCompNotExceed () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("employeeCompNotExceed");
    final String    value     = "Test Value.";

    prop.setAccessible(true);
    agreement.setEmployeeCompNotExceed(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void getCompHourlyRate () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("compHourlyRate");
    final double    value     = 6.66;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.getCompHourlyRate(), 0);
  }

  @Test
  public void setCompHourlyRate () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("compHourlyRate");
    final double    value     = 6.66;

    prop.setAccessible(true);
    agreement.setCompHourlyRate(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void getCompLimitAmount () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("compLimitAmount");
    final double    value     = 666.0;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.getCompLimitAmount(), 0);
  }

  @Test
  public void setCompLimitAmount () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("compLimitAmount");
    final double    value     = 666.0;

    prop.setAccessible(true);
    agreement.setCompLimitAmount(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void getBillCycleId () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("billCycleId");
    final int       value     = 123969;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.getBillCycleId());
  }

  @Test
  public void setBillCycleId () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("billCycleId");
    final int       value     = 123969;

    prop.setAccessible(true);
    agreement.setBillCycleId(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void isBillOneTime () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("billOneTime");
    final boolean   value     = true;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.isBillOneTime());
  }

  @Test
  public void setBillOneTime () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("billOneTime");
    final boolean   value     = true;

    prop.setAccessible(true);
    agreement.setBillOneTime(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void getBillTermsId () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("billTermsId");
    final int       value     = 123969;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.getBillTermsId());
  }

  @Test
  public void setBillTermsId () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("billTermsId");
    final int       value     = 123969;

    prop.setAccessible(true);
    agreement.setBillTermsId(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void getInvoicingCycle () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("invoicingCycle");
    final String    value     = "Test Value";

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.getInvoicingCycle());
  }

  @Test
  public void setInvoicingCycle () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("invoicingCycle");
    final String    value     = "Test Value";

    prop.setAccessible(true);
    agreement.setInvoicingCycle(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void getBillToCompanyId () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("billToCompanyId");
    final int       value     = 123969;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.getBillToCompanyId());
  }

  @Test
  public void setBillToCompanyId () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("billToCompanyId");
    final int       value     = 123969;

    prop.setAccessible(true);
    agreement.setBillToCompanyId(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void getBillToAddressId () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("billToAddressId");
    final int       value     = 123969;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.getBillToAddressId());
  }

  @Test
  public void setBillToAddressId () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("billToAddressId");
    final int       value     = 123969;

    prop.setAccessible(true);
    agreement.setBillToAddressId(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void getBillAmount () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("billAmount");
    final double    value     = 0.666;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.getBillAmount(), 0);
  }

  @Test
  public void setBillAmount () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("billAmount");
    final double    value     = 0.666;

    prop.setAccessible(true);
    agreement.setBillAmount(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void isTaxable () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("taxable");
    final boolean   value     = true;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.isTaxable());
  }

  @Test
  public void setTaxable () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("taxable");
    final boolean   value     = true;

    prop.setAccessible(true);
    agreement.setTaxable(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void getProrateFirstBill () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("prorateFirstBill");
    final double    value     = 66.6;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.getProrateFirstBill(), 0);
  }

  @Test
  public void setProrateFirstBill () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("prorateFirstBill");
    final double    value     = 66.6;

    prop.setAccessible(true);
    agreement.setProrateFirstBill(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void getBillStartDate () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("billStartDate");
    final Date      value     = new Date();

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.getBillStartDate());
  }

  @Test
  public void setBillStartDate () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("billStartDate");
    final Date      value     = new Date();

    prop.setAccessible(true);
    agreement.setBillStartDate(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void getTaxCodeId () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("taxCodeId");
    final int       value     = 123969;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.getTaxCodeId());
  }

  @Test
  public void setTaxCodeId () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("taxCodeId");
    final int       value     = 123969;

    prop.setAccessible(true);
    agreement.setTaxCodeId(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void isRestrictDownPayment () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("restrictDownPayment");
    final boolean   value     = true;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.isRestrictDownPayment());
  }

  @Test
  public void setRestrictDownPayment () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("restrictDownPayment");
    final boolean   value     = true;

    prop.setAccessible(true);
    agreement.setRestrictDownPayment(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void getInvoiceDescription () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("invoiceDescription");
    final String    value     = "Test Value.";

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.getInvoiceDescription());
  }

  @Test
  public void setInvoiceDescription () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("invoiceDescription");
    final String    value     = "Test Value.";

    prop.setAccessible(true);
    agreement.setInvoiceDescription(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void isTopComment () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("topComment");
    final boolean   value     = true;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.isTopComment());
  }

  @Test
  public void setTopComment () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("topComment");
    final boolean   value     = true;

    prop.setAccessible(true);
    agreement.setTopComment(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void isBottomComment () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("bottomComment");
    final boolean   value     = true;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.isBottomComment());
  }

  @Test
  public void setBottomComment () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("bottomComment");
    final boolean   value     = true;

    prop.setAccessible(true);
    agreement.setBottomComment(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void getWorkRoleId () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("workRoleId");
    final int       value     = 123969;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.getWorkRoleId());
  }

  @Test
  public void setWorkRoleId () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("workRoleId");
    final int       value     = 123969;

    prop.setAccessible(true);
    agreement.setWorkRoleId(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void getWorkTypeId () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("workTypeId");
    final int       value     = 123969;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.getWorkTypeId());
  }

  @Test
  public void setWorkTypeId () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("workTypeId");
    final int       value     = 123969;

    prop.setAccessible(true);
    agreement.setWorkTypeId(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void getProjectTypeId () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("projectTypeId");
    final int       value     = 123969;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.getProjectTypeId());
  }

  @Test
  public void setProjectTypeId () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("projectTypeId");
    final int       value     = 123969;

    prop.setAccessible(true);
    agreement.setProjectTypeId(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void getInvoiceTemplateId () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("invoiceTemplateId");
    final int       value     = 123969;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.getInvoiceTemplateId());
  }

  @Test
  public void setInvoiceTemplateId () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("invoiceTemplateId");
    final int       value     = 123969;

    prop.setAccessible(true);
    agreement.setInvoiceTemplateId(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void getBillTime () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("billTime");
    final String    value     = "Test Value";

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.getBillTime());
  }

  @Test
  public void setBillTime () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("billTime");
    final String    value     = "Test Value";

    prop.setAccessible(true);
    agreement.setBillTime(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void getBillExpenses () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("billExpenses");
    final String    value     = "Test Value";

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.getBillExpenses());
  }

  @Test
  public void setBillExpenses () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("billExpenses");
    final String    value     = "Test Value";

    prop.setAccessible(true);
    agreement.setBillExpenses(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void getBillProducts () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("billProducts");
    final String    value     = "Test Value";

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.getBillProducts());
  }

  @Test
  public void setBillProducts () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("billProducts");
    final String    value     = "Test Value";

    prop.setAccessible(true);
    agreement.setBillProducts(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void isBillableTimeInvoice () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("billableTimeInvoice");
    final boolean   value     = true;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.isBillableTimeInvoice());
  }

  @Test
  public void setBillableTimeInvoice () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("billableTimeInvoice");
    final boolean   value     = true;

    prop.setAccessible(true);
    agreement.setBillableTimeInvoice(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void isBillableExpenseInvoice () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("billableExpenseInvoice");
    final boolean   value     = true;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.isBillableExpenseInvoice());
  }

  @Test
  public void setBillableExpenseInvoice () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("billableExpenseInvoice");
    final boolean   value     = true;

    prop.setAccessible(true);
    agreement.setBillableExpenseInvoice(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void isBillableProductInvoice () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("billableProductInvoice");
    final boolean   value     = true;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.isBillableProductInvoice());
  }

  @Test
  public void setBillableProductInvoice () throws Exception
  {
    final Agreement agreement = new Agreement();
    final Field     prop      = agreement.getClass().getDeclaredField("billableProductInvoice");
    final boolean   value     = true;

    prop.setAccessible(true);
    agreement.setBillableProductInvoice(value);

    assertEquals(value, prop.get(agreement));
  }

}