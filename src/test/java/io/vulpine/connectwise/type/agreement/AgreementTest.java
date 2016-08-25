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

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.Date;

import static org.junit.Assert.*;

public class AgreementTest
{
  private static final int     intTest     = 159753;
  private static final String  stringTest  = "Test String Value.";
  private static final boolean booleanTest = true;
  private static final Date    dateTest    = new Date();
  private static final double  doubleTest  = 66.6;

  private static Field
    agreementTypeId,
    agreementName,
    parentAgreementId,
    companyId,
    contactId,
    customerPo,
    locationId,
    departmentId,
    restrictLocation,
    restrictDepartment,
    startDate,
    endDate,
    noEndingDate,
    opportunityId,
    cancelled,
    dateCancelled,
    reasonCancelled,
    slaId,
    subContractCompanyId,
    subContractContactId,
    workOrder,
    internalNotes,
    applicationUnits,
    applicationLimit,
    applicationCycle,
    periodType,
    applicationUnlimited,
    oneTime,
    coverAgreementTime,
    coverAgreementProduct,
    coverAgreementExpense,
    coverSalesTax,
    carryOverUnused,
    allowOverruns,
    expiredDays,
    limit,
    expireWhenZero,
    chargeToFirm,
    employeeCompRate,
    employeeCompNotExceed,
    compHourlyRate,
    compLimitAmount,
    billCycleId,
    billOneTime,
    billTermsId,
    invoicingCycle,
    billToCompanyId,
    billToAddressId,
    billAmount,
    taxable,
    prorateFirstBill,
    billStartDate,
    taxCodeId,
    restrictDownPayment,
    invoiceDescription,
    topComment,
    bottomComment,
    workRoleId,
    workTypeId,
    projectTypeId,
    invoiceTemplateId,
    billTime,
    billExpenses,
    billProducts,
    billableTimeInvoice,
    billableExpenseInvoice,
    billableProductInvoice;

  private Agreement agreement;

  @BeforeClass
  public static void setUpClass () throws Exception
  {
    final Class < Agreement > c = Agreement.class;
    agreementTypeId = c.getDeclaredField("agreementTypeId");
    agreementTypeId.setAccessible(true);
    agreementName = c.getDeclaredField("agreementName");
    agreementName.setAccessible(true);
    billableProductInvoice = c.getDeclaredField("billableProductInvoice");
    billableProductInvoice.setAccessible(true);
    billableExpenseInvoice = c.getDeclaredField("billableExpenseInvoice");
    billableExpenseInvoice.setAccessible(true);
    parentAgreementId = c.getDeclaredField("parentAgreementId");
    parentAgreementId.setAccessible(true);
    companyId = c.getDeclaredField("companyId");
    companyId.setAccessible(true);
    contactId = c.getDeclaredField("contactId");
    contactId.setAccessible(true);
    customerPo = c.getDeclaredField("customerPo");
    customerPo.setAccessible(true);
    locationId = c.getDeclaredField("locationId");
    locationId.setAccessible(true);
    departmentId = c.getDeclaredField("departmentId");
    departmentId.setAccessible(true);
    restrictLocation = c.getDeclaredField("restrictLocation");
    restrictLocation.setAccessible(true);
    restrictDepartment = c.getDeclaredField("restrictDepartment");
    restrictDepartment.setAccessible(true);
    startDate = c.getDeclaredField("startDate");
    startDate.setAccessible(true);
    endDate = c.getDeclaredField("endDate");
    endDate.setAccessible(true);
    noEndingDate = c.getDeclaredField("noEndingDate");
    noEndingDate.setAccessible(true);
    opportunityId = c.getDeclaredField("opportunityId");
    opportunityId.setAccessible(true);
    cancelled = c.getDeclaredField("cancelled");
    cancelled.setAccessible(true);
    dateCancelled = c.getDeclaredField("dateCancelled");
    dateCancelled.setAccessible(true);
    reasonCancelled = c.getDeclaredField("reasonCancelled");
    reasonCancelled.setAccessible(true);
    slaId = c.getDeclaredField("slaId");
    slaId.setAccessible(true);
    subContractCompanyId = c.getDeclaredField("subContractCompanyId");
    subContractCompanyId.setAccessible(true);
    subContractContactId = c.getDeclaredField("subContractContactId");
    subContractContactId.setAccessible(true);
    workOrder = c.getDeclaredField("workOrder");
    workOrder.setAccessible(true);
    internalNotes = c.getDeclaredField("internalNotes");
    internalNotes.setAccessible(true);
    applicationUnits = c.getDeclaredField("applicationUnits");
    applicationUnits.setAccessible(true);
    applicationLimit = c.getDeclaredField("applicationLimit");
    applicationLimit.setAccessible(true);
    applicationCycle = c.getDeclaredField("applicationCycle");
    applicationCycle.setAccessible(true);
    periodType = c.getDeclaredField("periodType");
    periodType.setAccessible(true);
    applicationUnlimited = c.getDeclaredField("applicationUnlimited");
    applicationUnlimited.setAccessible(true);
    oneTime = c.getDeclaredField("oneTime");
    oneTime.setAccessible(true);
    coverAgreementTime = c.getDeclaredField("coverAgreementTime");
    coverAgreementTime.setAccessible(true);
    coverAgreementProduct = c.getDeclaredField("coverAgreementProduct");
    coverAgreementProduct.setAccessible(true);
    coverAgreementExpense = c.getDeclaredField("coverAgreementExpense");
    coverAgreementExpense.setAccessible(true);
    coverSalesTax = c.getDeclaredField("coverSalesTax");
    coverSalesTax.setAccessible(true);
    carryOverUnused = c.getDeclaredField("carryOverUnused");
    carryOverUnused.setAccessible(true);
    allowOverruns = c.getDeclaredField("allowOverruns");
    allowOverruns.setAccessible(true);
    expiredDays = c.getDeclaredField("expiredDays");
    expiredDays.setAccessible(true);
    limit = c.getDeclaredField("limit");
    limit.setAccessible(true);
    expireWhenZero = c.getDeclaredField("expireWhenZero");
    expireWhenZero.setAccessible(true);
    chargeToFirm = c.getDeclaredField("chargeToFirm");
    chargeToFirm.setAccessible(true);
    employeeCompRate = c.getDeclaredField("employeeCompRate");
    employeeCompRate.setAccessible(true);
    employeeCompNotExceed = c.getDeclaredField("employeeCompNotExceed");
    employeeCompNotExceed.setAccessible(true);
    compHourlyRate = c.getDeclaredField("compHourlyRate");
    compHourlyRate.setAccessible(true);
    compLimitAmount = c.getDeclaredField("compLimitAmount");
    compLimitAmount.setAccessible(true);
    billCycleId = c.getDeclaredField("billCycleId");
    billCycleId.setAccessible(true);
    billOneTime = c.getDeclaredField("billOneTime");
    billOneTime.setAccessible(true);
    billTermsId = c.getDeclaredField("billTermsId");
    billTermsId.setAccessible(true);
    invoicingCycle = c.getDeclaredField("invoicingCycle");
    invoicingCycle.setAccessible(true);
    billToCompanyId = c.getDeclaredField("billToCompanyId");
    billToCompanyId.setAccessible(true);
    billToAddressId = c.getDeclaredField("billToAddressId");
    billToAddressId.setAccessible(true);
    billAmount = c.getDeclaredField("billAmount");
    billAmount.setAccessible(true);
    taxable = c.getDeclaredField("taxable");
    taxable.setAccessible(true);
    prorateFirstBill = c.getDeclaredField("prorateFirstBill");
    prorateFirstBill.setAccessible(true);
    billStartDate = c.getDeclaredField("billStartDate");
    billStartDate.setAccessible(true);
    taxCodeId = c.getDeclaredField("taxCodeId");
    taxCodeId.setAccessible(true);
    restrictDownPayment = c.getDeclaredField("restrictDownPayment");
    restrictDownPayment.setAccessible(true);
    invoiceDescription = c.getDeclaredField("invoiceDescription");
    invoiceDescription.setAccessible(true);
    topComment = c.getDeclaredField("topComment");
    topComment.setAccessible(true);
    bottomComment = c.getDeclaredField("bottomComment");
    bottomComment.setAccessible(true);
    workRoleId = c.getDeclaredField("workRoleId");
    workRoleId.setAccessible(true);
    workTypeId = c.getDeclaredField("workTypeId");
    workTypeId.setAccessible(true);
    projectTypeId = c.getDeclaredField("projectTypeId");
    projectTypeId.setAccessible(true);
    invoiceTemplateId = c.getDeclaredField("invoiceTemplateId");
    invoiceTemplateId.setAccessible(true);
    billTime = c.getDeclaredField("billTime");
    billTime.setAccessible(true);
    billExpenses = c.getDeclaredField("billExpenses");
    billExpenses.setAccessible(true);
    billProducts = c.getDeclaredField("billProducts");
    billProducts.setAccessible(true);
    billableTimeInvoice = c.getDeclaredField("billableTimeInvoice");
    billableTimeInvoice.setAccessible(true);
    billableExpenseInvoice = c.getDeclaredField("billableExpenseInvoice");
    billableExpenseInvoice.setAccessible(true);
  }

  @Before
  public void setUp ()
  {
    agreement = new Agreement();
  }

  @Test
  public void getAgreementTypeId () throws Exception
  {
    agreementTypeId.set(agreement, intTest);
    assertEquals(intTest, agreement.getAgreementTypeId());
  }

  @Test
  public void setAgreementTypeId () throws Exception
  {
    agreement.setAgreementTypeId(intTest);
    assertEquals(intTest, agreementTypeId.get(agreement));
  }

  @Test
  public void getAgreementName () throws Exception
  {
    agreementName.set(agreement, stringTest);
    assertEquals(stringTest, agreement.getAgreementName());
  }

  @Test
  public void setAgreementName () throws Exception
  {
    agreement.setAgreementName(stringTest);
    assertEquals(stringTest, agreementName.get(agreement));
  }

  @Test
  public void getParentAgreementId () throws Exception
  {
    parentAgreementId.set(agreement, intTest);
    assertEquals(intTest, agreement.getParentAgreementId());
  }

  @Test
  public void setParentAgreementId () throws Exception
  {
    agreement.setParentAgreementId(intTest);
    assertEquals(intTest, parentAgreementId.get(agreement));
  }

  @Test
  public void getCompanyId () throws Exception
  {
    companyId.set(agreement, intTest);
    assertEquals(intTest, agreement.getCompanyId());
  }

  @Test
  public void setCompanyId () throws Exception
  {
    agreement.setCompanyId(intTest);
    assertEquals(intTest, companyId.get(agreement));
  }

  @Test
  public void getContactId () throws Exception
  {
    contactId.set(agreement, intTest);
    assertEquals(intTest, agreement.getContactId());
  }

  @Test
  public void setContactId () throws Exception
  {
    agreement.setContactId(intTest);
    assertEquals(intTest, contactId.get(agreement));
  }

  @Test
  public void getCustomerPo () throws Exception
  {
    customerPo.set(agreement, stringTest);
    assertEquals(stringTest, agreement.getCustomerPo());
  }

  @Test
  public void setCustomerPo () throws Exception
  {
    agreement.setCustomerPo(stringTest);
    assertEquals(stringTest, customerPo.get(agreement));
  }

  @Test
  public void getLocationId () throws Exception
  {
    locationId.set(agreement, intTest);
    assertEquals(intTest, agreement.getLocationId());
  }

  @Test
  public void setLocationId () throws Exception
  {
    agreement.setLocationId(intTest);
    assertEquals(intTest, locationId.get(agreement));
  }

  @Test
  public void getDepartmentId () throws Exception
  {
    departmentId.set(agreement, intTest);
    assertEquals(intTest, agreement.getDepartmentId());
  }

  @Test
  public void setDepartmentId () throws Exception
  {
    agreement.setDepartmentId(intTest);
    assertEquals(intTest, departmentId.get(agreement));
  }

  @Test
  public void isRestrictLocation () throws Exception
  {
    restrictLocation.set(agreement, booleanTest);
    assertEquals(booleanTest, agreement.isRestrictLocation());
  }

  @Test
  public void setRestrictLocation () throws Exception
  {
    agreement.setRestrictLocation(booleanTest);
    assertEquals(booleanTest, restrictLocation.get(agreement));
  }

  @Test
  public void isRestrictDepartment () throws Exception
  {
    restrictDepartment.set(agreement, booleanTest);
    assertEquals(booleanTest, agreement.isRestrictDepartment());
  }

  @Test
  public void setRestrictDepartment () throws Exception
  {
    agreement.setRestrictDepartment(booleanTest);
    assertEquals(booleanTest, restrictDepartment.get(agreement));
  }

  @Test
  public void getStartDate () throws Exception
  {
    startDate.set(agreement, dateTest);
    assertEquals(dateTest, agreement.getStartDate());
  }

  @Test
  public void setStartDate () throws Exception
  {
    agreement.setStartDate(dateTest);
    assertEquals(dateTest, startDate.get(agreement));
  }

  @Test
  public void getEndDate () throws Exception
  {
    endDate.set(agreement, dateTest);
    assertEquals(dateTest, agreement.getEndDate());
  }

  @Test
  public void setEndDate () throws Exception
  {
    agreement.setEndDate(dateTest);
    assertEquals(dateTest, endDate.get(agreement));
  }

  @Test
  public void isNoEndingDate () throws Exception
  {
    noEndingDate.set(agreement, booleanTest);
    assertEquals(booleanTest, agreement.isNoEndingDate());
  }

  @Test
  public void setNoEndingDate () throws Exception
  {
    agreement.setNoEndingDate(booleanTest);
    assertEquals(booleanTest, noEndingDate.get(agreement));
  }

  @Test
  public void getOpportunityId () throws Exception
  {
    opportunityId.set(agreement, intTest);
    assertEquals(intTest, agreement.getOpportunityId());
  }

  @Test
  public void setOpportunityId () throws Exception
  {
    agreement.setOpportunityId(intTest);
    assertEquals(intTest, opportunityId.get(agreement));
  }

  @Test
  public void isCancelled () throws Exception
  {
    cancelled.set(agreement, booleanTest);
    assertEquals(booleanTest, agreement.isCancelled());
  }

  @Test
  public void setCancelled () throws Exception
  {
    agreement.setCancelled(booleanTest);
    assertEquals(booleanTest, cancelled.get(agreement));
  }

  @Test
  public void getDateCancelled () throws Exception
  {
    dateCancelled.set(agreement, dateTest);
    assertEquals(dateTest, agreement.getDateCancelled());
  }

  @Test
  public void setDateCancelled () throws Exception
  {
    agreement.setDateCancelled(dateTest);
    assertEquals(dateTest, dateCancelled.get(agreement));
  }

  @Test
  public void getReasonCancelled () throws Exception
  {
    reasonCancelled.set(agreement, stringTest);
    assertEquals(stringTest, agreement.getReasonCancelled());
  }

  @Test
  public void setReasonCancelled () throws Exception
  {
    agreement.setReasonCancelled(stringTest);
    assertEquals(stringTest, reasonCancelled.get(agreement));
  }

  @Test
  public void getSlaId () throws Exception
  {
    slaId.set(agreement, intTest);
    assertEquals(intTest, agreement.getSlaId());
  }

  @Test
  public void setSlaId () throws Exception
  {
    agreement.setSlaId(intTest);
    assertEquals(intTest, slaId.get(agreement));
  }

  @Test
  public void getSubContractCompanyId () throws Exception
  {
    subContractCompanyId.set(agreement, intTest);
    assertEquals(intTest, agreement.getSubContractCompanyId());
  }

  @Test
  public void setSubContractCompanyId () throws Exception
  {
    agreement.setSubContractCompanyId(intTest);
    assertEquals(intTest, subContractCompanyId.get(agreement));
  }

  @Test
  public void getSubContractContactId () throws Exception
  {
    subContractContactId.set(agreement, intTest);
    assertEquals(intTest, agreement.getSubContractContactId());
  }

  @Test
  public void setSubContractContactId () throws Exception
  {
    agreement.setSubContractContactId(intTest);
    assertEquals(intTest, subContractContactId.get(agreement));
  }

  @Test
  public void getWorkOrder () throws Exception
  {
    workOrder.set(agreement, stringTest);
    assertEquals(stringTest, agreement.getWorkOrder());
  }

  @Test
  public void setWorkOrder () throws Exception
  {
    agreement.setWorkOrder(stringTest);
    assertEquals(stringTest, workOrder.get(agreement));
  }

  @Test
  public void getInternalNotes () throws Exception
  {
    internalNotes.set(agreement, stringTest);
    assertEquals(stringTest, agreement.getInternalNotes());
  }

  @Test
  public void setInternalNotes () throws Exception
  {
    agreement.setInternalNotes(stringTest);
    assertEquals(stringTest, internalNotes.get(agreement));
  }

  @Test
  public void getApplicationUnits () throws Exception
  {
    applicationUnits.set(agreement, stringTest);
    assertEquals(stringTest, agreement.getApplicationUnits());
  }

  @Test
  public void setApplicationUnits () throws Exception
  {
    agreement.setApplicationUnits(stringTest);
    assertEquals(stringTest, applicationUnits.get(agreement));
  }

  @Test
  public void getApplicationLimit () throws Exception
  {
    applicationLimit.set(agreement, doubleTest);
    assertEquals(doubleTest, agreement.getApplicationLimit(), 0);
  }

  @Test
  public void setApplicationLimit () throws Exception
  {
    agreement.setApplicationLimit(doubleTest);
    assertEquals(doubleTest, applicationLimit.get(agreement));
  }

  @Test
  public void getApplicationCycle () throws Exception
  {
    applicationCycle.set(agreement, stringTest);
    assertEquals(stringTest, agreement.getApplicationCycle());
  }

  @Test
  public void setApplicationCycle () throws Exception
  {
    agreement.setApplicationCycle(stringTest);
    assertEquals(stringTest, applicationCycle.get(agreement));
  }

  @Test
  public void getPeriodType () throws Exception
  {
    periodType.set(agreement, stringTest);
    assertEquals(stringTest, agreement.getPeriodType());
  }

  @Test
  public void setPeriodType () throws Exception
  {
    agreement.setPeriodType(stringTest);
    assertEquals(stringTest, periodType.get(agreement));
  }

  @Test
  public void isApplicationUnlimited () throws Exception
  {
    applicationUnlimited.set(agreement, booleanTest);
    assertEquals(booleanTest, agreement.isApplicationUnlimited());
  }

  @Test
  public void setApplicationUnlimited () throws Exception
  {
    agreement.setApplicationUnlimited(booleanTest);
    assertEquals(booleanTest, applicationUnlimited.get(agreement));
  }

  @Test
  public void isOneTime () throws Exception
  {
    oneTime.set(agreement, booleanTest);
    assertEquals(booleanTest, agreement.isOneTime());
  }

  @Test
  public void setOneTime () throws Exception
  {
    agreement.setOneTime(booleanTest);
    assertEquals(booleanTest, oneTime.get(agreement));
  }

  @Test
  public void isCoverAgreementTime () throws Exception
  {
    coverAgreementTime.set(agreement, booleanTest);
    assertEquals(booleanTest, agreement.isCoverAgreementTime());
  }

  @Test
  public void setCoverAgreementTime () throws Exception
  {
    agreement.setCoverAgreementTime(booleanTest);
    assertEquals(booleanTest, coverAgreementTime.get(agreement));
  }

  @Test
  public void isCoverAgreementProduct () throws Exception
  {
    coverAgreementProduct.set(agreement, booleanTest);
    assertEquals(booleanTest, agreement.isCoverAgreementProduct());
  }

  @Test
  public void setCoverAgreementProduct () throws Exception
  {
    agreement.setCoverAgreementProduct(booleanTest);
    assertEquals(booleanTest, coverAgreementProduct.get(agreement));
  }

  @Test
  public void isCoverAgreementExpense () throws Exception
  {
    coverAgreementExpense.set(agreement, booleanTest);
    assertEquals(booleanTest, agreement.isCoverAgreementExpense());
  }

  @Test
  public void setCoverAgreementExpense () throws Exception
  {
    agreement.setCoverAgreementExpense(booleanTest);
    assertEquals(booleanTest, coverAgreementExpense.get(agreement));
  }

  @Test
  public void isCoverSalesTax () throws Exception
  {
    coverSalesTax.set(agreement, booleanTest);
    assertEquals(booleanTest, agreement.isCoverSalesTax());
  }

  @Test
  public void setCoverSalesTax () throws Exception
  {
    agreement.setCoverSalesTax(booleanTest);
    assertEquals(booleanTest, coverSalesTax.get(agreement));
  }

  @Test
  public void isCarryOverUnused () throws Exception
  {
    carryOverUnused.set(agreement, booleanTest);
    assertEquals(booleanTest, agreement.isCarryOverUnused());
  }

  @Test
  public void setCarryOverUnused () throws Exception
  {
    agreement.setCarryOverUnused(booleanTest);
    assertEquals(booleanTest, carryOverUnused.get(agreement));
  }

  @Test
  public void isAllowOverruns () throws Exception
  {
    allowOverruns.set(agreement, booleanTest);
    assertEquals(booleanTest, agreement.isAllowOverruns());
  }

  @Test
  public void setAllowOverruns () throws Exception
  {
    agreement.setAllowOverruns(booleanTest);
    assertEquals(booleanTest, allowOverruns.get(agreement));
  }

  @Test
  public void getExpiredDays () throws Exception
  {
    expiredDays.set(agreement, intTest);
    assertEquals(intTest, agreement.getExpiredDays());
  }

  @Test
  public void setExpiredDays () throws Exception
  {
    agreement.setExpiredDays(intTest);
    assertEquals(intTest, expiredDays.get(agreement));
  }

  @Test
  public void getLimit () throws Exception
  {
    limit.set(agreement, intTest);
    assertEquals(intTest, agreement.getLimit());
  }

  @Test
  public void setLimit () throws Exception
  {
    agreement.setLimit(intTest);
    assertEquals(intTest, limit.get(agreement));
  }

  @Test
  public void isExpireWhenZero () throws Exception
  {
    expireWhenZero.set(agreement, booleanTest);
    assertEquals(booleanTest, agreement.isExpireWhenZero());
  }

  @Test
  public void setExpireWhenZero () throws Exception
  {
    agreement.setExpireWhenZero(booleanTest);
    assertEquals(booleanTest, expireWhenZero.get(agreement));
  }

  @Test
  public void isChargeToFirm () throws Exception
  {
    chargeToFirm.set(agreement, booleanTest);
    assertEquals(booleanTest, agreement.isChargeToFirm());
  }

  @Test
  public void setChargeToFirm () throws Exception
  {
    agreement.setChargeToFirm(booleanTest);
    assertEquals(booleanTest, chargeToFirm.get(agreement));
  }

  @Test
  public void getEmployeeCompRate () throws Exception
  {
    employeeCompRate.set(agreement, stringTest);
    assertEquals(stringTest, agreement.getEmployeeCompRate());
  }

  @Test
  public void setEmployeeCompRate () throws Exception
  {
    agreement.setEmployeeCompRate(stringTest);
    assertEquals(stringTest, employeeCompRate.get(agreement));
  }

  @Test
  public void getEmployeeCompNotExceed () throws Exception
  {
    employeeCompNotExceed.set(agreement, stringTest);
    assertEquals(stringTest, agreement.getEmployeeCompNotExceed());
  }

  @Test
  public void setEmployeeCompNotExceed () throws Exception
  {
    agreement.setEmployeeCompNotExceed(stringTest);
    assertEquals(stringTest, employeeCompNotExceed.get(agreement));
  }

  @Test
  public void getCompHourlyRate () throws Exception
  {
    compHourlyRate.set(agreement, doubleTest);
    assertEquals(doubleTest, agreement.getCompHourlyRate(), 0);
  }

  @Test
  public void setCompHourlyRate () throws Exception
  {
    agreement.setCompHourlyRate(doubleTest);
    assertEquals(doubleTest, compHourlyRate.get(agreement));
  }

  @Test
  public void getCompLimitAmount () throws Exception
  {
    compLimitAmount.set(agreement, doubleTest);
    assertEquals(doubleTest, agreement.getCompLimitAmount(), 0);
  }

  @Test
  public void setCompLimitAmount () throws Exception
  {
    agreement.setCompLimitAmount(doubleTest);
    assertEquals(doubleTest, compLimitAmount.get(agreement));
  }

  @Test
  public void getBillCycleId () throws Exception
  {
    billCycleId.set(agreement, intTest);
    assertEquals(intTest, agreement.getBillCycleId());
  }

  @Test
  public void setBillCycleId () throws Exception
  {
    agreement.setBillCycleId(intTest);
    assertEquals(intTest, billCycleId.get(agreement));
  }

  @Test
  public void isBillOneTime () throws Exception
  {
    billOneTime.set(agreement, booleanTest);
    assertEquals(booleanTest, agreement.isBillOneTime());
  }

  @Test
  public void setBillOneTime () throws Exception
  {
    agreement.setBillOneTime(booleanTest);
    assertEquals(booleanTest, billOneTime.get(agreement));
  }

  @Test
  public void getBillTermsId () throws Exception
  {
    billTermsId.set(agreement, intTest);
    assertEquals(intTest, agreement.getBillTermsId());
  }

  @Test
  public void setBillTermsId () throws Exception
  {
    agreement.setBillTermsId(intTest);
    assertEquals(intTest, billTermsId.get(agreement));
  }

  @Test
  public void getInvoicingCycle () throws Exception
  {
    invoicingCycle.set(agreement, stringTest);
    assertEquals(stringTest, agreement.getInvoicingCycle());
  }

  @Test
  public void setInvoicingCycle () throws Exception
  {
    agreement.setInvoicingCycle(stringTest);
    assertEquals(stringTest, invoicingCycle.get(agreement));
  }

  @Test
  public void getBillToCompanyId () throws Exception
  {
    billToCompanyId.set(agreement, intTest);
    assertEquals(intTest, agreement.getBillToCompanyId());
  }

  @Test
  public void setBillToCompanyId () throws Exception
  {
    agreement.setBillToCompanyId(intTest);
    assertEquals(intTest, billToCompanyId.get(agreement));
  }

  @Test
  public void getBillToAddressId () throws Exception
  {
    billToAddressId.set(agreement, intTest);
    assertEquals(intTest, agreement.getBillToAddressId());
  }

  @Test
  public void setBillToAddressId () throws Exception
  {
    agreement.setBillToAddressId(intTest);
    assertEquals(intTest, billToAddressId.get(agreement));
  }

  @Test
  public void getBillAmount () throws Exception
  {
    billAmount.set(agreement, doubleTest);
    assertEquals(doubleTest, agreement.getBillAmount(), 0);
  }

  @Test
  public void setBillAmount () throws Exception
  {
    agreement.setBillAmount(doubleTest);
    assertEquals(doubleTest, billAmount.get(agreement));
  }

  @Test
  public void isTaxable () throws Exception
  {
    taxable.set(agreement, booleanTest);
    assertEquals(booleanTest, agreement.isTaxable());
  }

  @Test
  public void setTaxable () throws Exception
  {
    agreement.setTaxable(booleanTest);
    assertEquals(booleanTest, taxable.get(agreement));
  }

  @Test
  public void getProrateFirstBill () throws Exception
  {
    prorateFirstBill.set(agreement, doubleTest);
    assertEquals(doubleTest, agreement.getProrateFirstBill(), 0);
  }

  @Test
  public void setProrateFirstBill () throws Exception
  {
    agreement.setProrateFirstBill(doubleTest);
    assertEquals(doubleTest, prorateFirstBill.get(agreement));
  }

  @Test
  public void getBillStartDate () throws Exception
  {
    billStartDate.set(agreement, dateTest);
    assertEquals(dateTest, agreement.getBillStartDate());
  }

  @Test
  public void setBillStartDate () throws Exception
  {
    agreement.setBillStartDate(dateTest);
    assertEquals(dateTest, billStartDate.get(agreement));
  }

  @Test
  public void getTaxCodeId () throws Exception
  {
    taxCodeId.set(agreement, intTest);
    assertEquals(intTest, agreement.getTaxCodeId());
  }

  @Test
  public void setTaxCodeId () throws Exception
  {
    agreement.setTaxCodeId(intTest);
    assertEquals(intTest, taxCodeId.get(agreement));
  }

  @Test
  public void isRestrictDownPayment () throws Exception
  {
    restrictDownPayment.set(agreement, booleanTest);
    assertEquals(booleanTest, agreement.isRestrictDownPayment());
  }

  @Test
  public void setRestrictDownPayment () throws Exception
  {
    agreement.setRestrictDownPayment(booleanTest);
    assertEquals(booleanTest, restrictDownPayment.get(agreement));
  }

  @Test
  public void getInvoiceDescription () throws Exception
  {
    invoiceDescription.set(agreement, stringTest);
    assertEquals(stringTest, agreement.getInvoiceDescription());
  }

  @Test
  public void setInvoiceDescription () throws Exception
  {
    agreement.setInvoiceDescription(stringTest);
    assertEquals(stringTest, invoiceDescription.get(agreement));
  }

  @Test
  public void isTopComment () throws Exception
  {
    topComment.set(agreement, booleanTest);
    assertEquals(booleanTest, agreement.isTopComment());
  }

  @Test
  public void setTopComment () throws Exception
  {
    agreement.setTopComment(booleanTest);
    assertEquals(booleanTest, topComment.get(agreement));
  }

  @Test
  public void isBottomComment () throws Exception
  {
    bottomComment.set(agreement, booleanTest);
    assertEquals(booleanTest, agreement.isBottomComment());
  }

  @Test
  public void setBottomComment () throws Exception
  {
    agreement.setBottomComment(booleanTest);
    assertEquals(booleanTest, bottomComment.get(agreement));
  }

  @Test
  public void getWorkRoleId () throws Exception
  {
    workRoleId.set(agreement, intTest);
    assertEquals(intTest, agreement.getWorkRoleId());
  }

  @Test
  public void setWorkRoleId () throws Exception
  {
    agreement.setWorkRoleId(intTest);
    assertEquals(intTest, workRoleId.get(agreement));
  }

  @Test
  public void getWorkTypeId () throws Exception
  {
    workTypeId.set(agreement, intTest);
    assertEquals(intTest, agreement.getWorkTypeId());
  }

  @Test
  public void setWorkTypeId () throws Exception
  {
    agreement.setWorkTypeId(intTest);
    assertEquals(intTest, workTypeId.get(agreement));
  }

  @Test
  public void getProjectTypeId () throws Exception
  {
    projectTypeId.set(agreement, intTest);
    assertEquals(intTest, agreement.getProjectTypeId());
  }

  @Test
  public void setProjectTypeId () throws Exception
  {
    agreement.setProjectTypeId(intTest);
    assertEquals(intTest, projectTypeId.get(agreement));
  }

  @Test
  public void getInvoiceTemplateId () throws Exception
  {
    invoiceTemplateId.set(agreement, intTest);
    assertEquals(intTest, agreement.getInvoiceTemplateId());
  }

  @Test
  public void setInvoiceTemplateId () throws Exception
  {
    agreement.setInvoiceTemplateId(intTest);
    assertEquals(intTest, invoiceTemplateId.get(agreement));
  }

  @Test
  public void getBillTime () throws Exception
  {
    billTime.set(agreement, stringTest);
    assertEquals(stringTest, agreement.getBillTime());
  }

  @Test
  public void setBillTime () throws Exception
  {
    agreement.setBillTime(stringTest);
    assertEquals(stringTest, billTime.get(agreement));
  }

  @Test
  public void getBillExpenses () throws Exception
  {
    billExpenses.set(agreement, stringTest);
    assertEquals(stringTest, agreement.getBillExpenses());
  }

  @Test
  public void setBillExpenses () throws Exception
  {
    agreement.setBillExpenses(stringTest);
    assertEquals(stringTest, billExpenses.get(agreement));
  }

  @Test
  public void getBillProducts () throws Exception
  {
    billProducts.set(agreement, stringTest);
    assertEquals(stringTest, agreement.getBillProducts());
  }

  @Test
  public void setBillProducts () throws Exception
  {
    agreement.setBillProducts(stringTest);
    assertEquals(stringTest, billProducts.get(agreement));
  }

  @Test
  public void isBillableTimeInvoice () throws Exception
  {
    billableTimeInvoice.set(agreement, booleanTest);
    assertEquals(booleanTest, agreement.isBillableTimeInvoice());
  }

  @Test
  public void setBillableTimeInvoice () throws Exception
  {
    agreement.setBillableTimeInvoice(booleanTest);
    assertEquals(booleanTest, billableTimeInvoice.get(agreement));
  }

  @Test
  public void isBillableExpenseInvoice () throws Exception
  {
    billableExpenseInvoice.set(agreement, booleanTest);
    assertEquals(booleanTest, agreement.isBillableExpenseInvoice());
  }

  @Test
  public void setBillableExpenseInvoice () throws Exception
  {
    agreement.setBillableExpenseInvoice(booleanTest);
    assertEquals(booleanTest, billableExpenseInvoice.get(agreement));
  }

  @Test
  public void isBillableProductInvoice () throws Exception
  {
    billableProductInvoice.set(agreement, booleanTest);
    assertEquals(booleanTest, agreement.isBillableProductInvoice());
  }

  @Test
  public void setBillableProductInvoice () throws Exception
  {
    agreement.setBillableProductInvoice(booleanTest);
    assertEquals(booleanTest, billableProductInvoice.get(agreement));
  }

}