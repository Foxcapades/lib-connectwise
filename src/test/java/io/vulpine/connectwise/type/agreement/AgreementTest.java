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

  private SimpleAgreement agreement;

  @BeforeClass
  public static void setUpClass () throws Exception
  {
    final Class < SimpleAgreement > clazz = SimpleAgreement.class;
    agreementTypeId = clazz.getDeclaredField("agreementTypeId");
    agreementTypeId.setAccessible(true);
    agreementName = clazz.getDeclaredField("agreementName");
    agreementName.setAccessible(true);
    billableProductInvoice = clazz.getDeclaredField("billableProductInvoice");
    billableProductInvoice.setAccessible(true);
    billableExpenseInvoice = clazz.getDeclaredField("billableExpenseInvoice");
    billableExpenseInvoice.setAccessible(true);
    parentAgreementId = clazz.getDeclaredField("parentAgreementId");
    parentAgreementId.setAccessible(true);
    companyId = clazz.getDeclaredField("companyId");
    companyId.setAccessible(true);
    contactId = clazz.getDeclaredField("contactId");
    contactId.setAccessible(true);
    customerPo = clazz.getDeclaredField("customerPo");
    customerPo.setAccessible(true);
    locationId = clazz.getDeclaredField("locationId");
    locationId.setAccessible(true);
    departmentId = clazz.getDeclaredField("departmentId");
    departmentId.setAccessible(true);
    restrictLocation = clazz.getDeclaredField("restrictLocation");
    restrictLocation.setAccessible(true);
    restrictDepartment = clazz.getDeclaredField("restrictDepartment");
    restrictDepartment.setAccessible(true);
    startDate = clazz.getDeclaredField("startDate");
    startDate.setAccessible(true);
    endDate = clazz.getDeclaredField("endDate");
    endDate.setAccessible(true);
    noEndingDate = clazz.getDeclaredField("noEndingDate");
    noEndingDate.setAccessible(true);
    opportunityId = clazz.getDeclaredField("opportunityId");
    opportunityId.setAccessible(true);
    cancelled = clazz.getDeclaredField("cancelled");
    cancelled.setAccessible(true);
    dateCancelled = clazz.getDeclaredField("dateCancelled");
    dateCancelled.setAccessible(true);
    reasonCancelled = clazz.getDeclaredField("reasonCancelled");
    reasonCancelled.setAccessible(true);
    slaId = clazz.getDeclaredField("slaId");
    slaId.setAccessible(true);
    subContractCompanyId = clazz.getDeclaredField("subContractCompanyId");
    subContractCompanyId.setAccessible(true);
    subContractContactId = clazz.getDeclaredField("subContractContactId");
    subContractContactId.setAccessible(true);
    workOrder = clazz.getDeclaredField("workOrder");
    workOrder.setAccessible(true);
    internalNotes = clazz.getDeclaredField("internalNotes");
    internalNotes.setAccessible(true);
    applicationUnits = clazz.getDeclaredField("applicationUnits");
    applicationUnits.setAccessible(true);
    applicationLimit = clazz.getDeclaredField("applicationLimit");
    applicationLimit.setAccessible(true);
    applicationCycle = clazz.getDeclaredField("applicationCycle");
    applicationCycle.setAccessible(true);
    periodType = clazz.getDeclaredField("periodType");
    periodType.setAccessible(true);
    applicationUnlimited = clazz.getDeclaredField("applicationUnlimited");
    applicationUnlimited.setAccessible(true);
    oneTime = clazz.getDeclaredField("oneTime");
    oneTime.setAccessible(true);
    coverAgreementTime = clazz.getDeclaredField("coverAgreementTime");
    coverAgreementTime.setAccessible(true);
    coverAgreementProduct = clazz.getDeclaredField("coverAgreementProduct");
    coverAgreementProduct.setAccessible(true);
    coverAgreementExpense = clazz.getDeclaredField("coverAgreementExpense");
    coverAgreementExpense.setAccessible(true);
    coverSalesTax = clazz.getDeclaredField("coverSalesTax");
    coverSalesTax.setAccessible(true);
    carryOverUnused = clazz.getDeclaredField("carryOverUnused");
    carryOverUnused.setAccessible(true);
    allowOverruns = clazz.getDeclaredField("allowOverruns");
    allowOverruns.setAccessible(true);
    expiredDays = clazz.getDeclaredField("expiredDays");
    expiredDays.setAccessible(true);
    limit = clazz.getDeclaredField("limit");
    limit.setAccessible(true);
    expireWhenZero = clazz.getDeclaredField("expireWhenZero");
    expireWhenZero.setAccessible(true);
    chargeToFirm = clazz.getDeclaredField("chargeToFirm");
    chargeToFirm.setAccessible(true);
    employeeCompRate = clazz.getDeclaredField("employeeCompRate");
    employeeCompRate.setAccessible(true);
    employeeCompNotExceed = clazz.getDeclaredField("employeeCompNotExceed");
    employeeCompNotExceed.setAccessible(true);
    compHourlyRate = clazz.getDeclaredField("compHourlyRate");
    compHourlyRate.setAccessible(true);
    compLimitAmount = clazz.getDeclaredField("compLimitAmount");
    compLimitAmount.setAccessible(true);
    billCycleId = clazz.getDeclaredField("billCycleId");
    billCycleId.setAccessible(true);
    billOneTime = clazz.getDeclaredField("billOneTime");
    billOneTime.setAccessible(true);
    billTermsId = clazz.getDeclaredField("billTermsId");
    billTermsId.setAccessible(true);
    invoicingCycle = clazz.getDeclaredField("invoicingCycle");
    invoicingCycle.setAccessible(true);
    billToCompanyId = clazz.getDeclaredField("billToCompanyId");
    billToCompanyId.setAccessible(true);
    billToAddressId = clazz.getDeclaredField("billToAddressId");
    billToAddressId.setAccessible(true);
    billAmount = clazz.getDeclaredField("billAmount");
    billAmount.setAccessible(true);
    taxable = clazz.getDeclaredField("taxable");
    taxable.setAccessible(true);
    prorateFirstBill = clazz.getDeclaredField("prorateFirstBill");
    prorateFirstBill.setAccessible(true);
    billStartDate = clazz.getDeclaredField("billStartDate");
    billStartDate.setAccessible(true);
    taxCodeId = clazz.getDeclaredField("taxCodeId");
    taxCodeId.setAccessible(true);
    restrictDownPayment = clazz.getDeclaredField("restrictDownPayment");
    restrictDownPayment.setAccessible(true);
    invoiceDescription = clazz.getDeclaredField("invoiceDescription");
    invoiceDescription.setAccessible(true);
    topComment = clazz.getDeclaredField("topComment");
    topComment.setAccessible(true);
    bottomComment = clazz.getDeclaredField("bottomComment");
    bottomComment.setAccessible(true);
    workRoleId = clazz.getDeclaredField("workRoleId");
    workRoleId.setAccessible(true);
    workTypeId = clazz.getDeclaredField("workTypeId");
    workTypeId.setAccessible(true);
    projectTypeId = clazz.getDeclaredField("projectTypeId");
    projectTypeId.setAccessible(true);
    invoiceTemplateId = clazz.getDeclaredField("invoiceTemplateId");
    invoiceTemplateId.setAccessible(true);
    billTime = clazz.getDeclaredField("billTime");
    billTime.setAccessible(true);
    billExpenses = clazz.getDeclaredField("billExpenses");
    billExpenses.setAccessible(true);
    billProducts = clazz.getDeclaredField("billProducts");
    billProducts.setAccessible(true);
    billableTimeInvoice = clazz.getDeclaredField("billableTimeInvoice");
    billableTimeInvoice.setAccessible(true);
    billableExpenseInvoice = clazz.getDeclaredField("billableExpenseInvoice");
    billableExpenseInvoice.setAccessible(true);
  }

  @Before
  public void setUp ()
  {
    agreement = new SimpleAgreement();
  }

  @Test
  public void getAgreementTypeId () throws Exception
  {
    agreementTypeId.set(agreement, intTest);
    assertEquals(intTest, agreement.agreementTypeId());
  }

  @Test
  public void setAgreementTypeId () throws Exception
  {
    agreement.agreementTypeId(intTest);
    assertEquals(intTest, agreementTypeId.get(agreement));
  }

  @Test
  public void getAgreementName () throws Exception
  {
    agreementName.set(agreement, stringTest);
    assertEquals(stringTest, agreement.agreementName());
  }

  @Test
  public void setAgreementName () throws Exception
  {
    agreement.agreementName(stringTest);
    assertEquals(stringTest, agreementName.get(agreement));
  }

  @Test
  public void getParentAgreementId () throws Exception
  {
    parentAgreementId.set(agreement, intTest);
    assertEquals(intTest, agreement.parentAgreementId());
  }

  @Test
  public void setParentAgreementId () throws Exception
  {
    agreement.parentAgreementId(intTest);
    assertEquals(intTest, parentAgreementId.get(agreement));
  }

  @Test
  public void getCompanyId () throws Exception
  {
    companyId.set(agreement, intTest);
    assertEquals(intTest, agreement.companyId());
  }

  @Test
  public void setCompanyId () throws Exception
  {
    agreement.companyId(intTest);
    assertEquals(intTest, companyId.get(agreement));
  }

  @Test
  public void getContactId () throws Exception
  {
    contactId.set(agreement, intTest);
    assertEquals(intTest, agreement.contactId());
  }

  @Test
  public void setContactId () throws Exception
  {
    agreement.contactId(intTest);
    assertEquals(intTest, contactId.get(agreement));
  }

  @Test
  public void getCustomerPo () throws Exception
  {
    customerPo.set(agreement, stringTest);
    assertEquals(stringTest, agreement.customerPo());
  }

  @Test
  public void setCustomerPo () throws Exception
  {
    agreement.customerPo(stringTest);
    assertEquals(stringTest, customerPo.get(agreement));
  }

  @Test
  public void getLocationId () throws Exception
  {
    locationId.set(agreement, intTest);
    assertEquals(intTest, agreement.locationId());
  }

  @Test
  public void setLocationId () throws Exception
  {
    agreement.locationId(intTest);
    assertEquals(intTest, locationId.get(agreement));
  }

  @Test
  public void getDepartmentId () throws Exception
  {
    departmentId.set(agreement, intTest);
    assertEquals(intTest, agreement.departmentId());
  }

  @Test
  public void setDepartmentId () throws Exception
  {
    agreement.departmentId(intTest);
    assertEquals(intTest, departmentId.get(agreement));
  }

  @Test
  public void isRestrictLocation () throws Exception
  {
    restrictLocation.set(agreement, booleanTest);
    assertEquals(booleanTest, agreement.restrictLocation());
  }

  @Test
  public void setRestrictLocation () throws Exception
  {
    agreement.restrictLocation(booleanTest);
    assertEquals(booleanTest, restrictLocation.get(agreement));
  }

  @Test
  public void isRestrictDepartment () throws Exception
  {
    restrictDepartment.set(agreement, booleanTest);
    assertEquals(booleanTest, agreement.restrictDepartment());
  }

  @Test
  public void setRestrictDepartment () throws Exception
  {
    agreement.restrictDepartment(booleanTest);
    assertEquals(booleanTest, restrictDepartment.get(agreement));
  }

  @Test
  public void getStartDate () throws Exception
  {
    startDate.set(agreement, dateTest);
    assertEquals(dateTest, agreement.startDate());
  }

  @Test
  public void setStartDate () throws Exception
  {
    agreement.startDate(dateTest);
    assertEquals(dateTest, startDate.get(agreement));
  }

  @Test
  public void getEndDate () throws Exception
  {
    endDate.set(agreement, dateTest);
    assertEquals(dateTest, agreement.endDate());
  }

  @Test
  public void setEndDate () throws Exception
  {
    agreement.endDate(dateTest);
    assertEquals(dateTest, endDate.get(agreement));
  }

  @Test
  public void isNoEndingDate () throws Exception
  {
    noEndingDate.set(agreement, booleanTest);
    assertEquals(booleanTest, agreement.noEndingDate());
  }

  @Test
  public void setNoEndingDate () throws Exception
  {
    agreement.noEndingDate(booleanTest);
    assertEquals(booleanTest, noEndingDate.get(agreement));
  }

  @Test
  public void getOpportunityId () throws Exception
  {
    opportunityId.set(agreement, intTest);
    assertEquals(intTest, agreement.opportunityId());
  }

  @Test
  public void setOpportunityId () throws Exception
  {
    agreement.opportunityId(intTest);
    assertEquals(intTest, opportunityId.get(agreement));
  }

  @Test
  public void isCancelled () throws Exception
  {
    cancelled.set(agreement, booleanTest);
    assertEquals(booleanTest, agreement.cancelled());
  }

  @Test
  public void setCancelled () throws Exception
  {
    agreement.cancelled(booleanTest);
    assertEquals(booleanTest, cancelled.get(agreement));
  }

  @Test
  public void getDateCancelled () throws Exception
  {
    dateCancelled.set(agreement, dateTest);
    assertEquals(dateTest, agreement.dateCancelled());
  }

  @Test
  public void setDateCancelled () throws Exception
  {
    agreement.dateCancelled(dateTest);
    assertEquals(dateTest, dateCancelled.get(agreement));
  }

  @Test
  public void getReasonCancelled () throws Exception
  {
    reasonCancelled.set(agreement, stringTest);
    assertEquals(stringTest, agreement.reasonCancelled());
  }

  @Test
  public void setReasonCancelled () throws Exception
  {
    agreement.reasonCancelled(stringTest);
    assertEquals(stringTest, reasonCancelled.get(agreement));
  }

  @Test
  public void getSlaId () throws Exception
  {
    slaId.set(agreement, intTest);
    assertEquals(intTest, agreement.slaId());
  }

  @Test
  public void setSlaId () throws Exception
  {
    agreement.slaId(intTest);
    assertEquals(intTest, slaId.get(agreement));
  }

  @Test
  public void getSubContractCompanyId () throws Exception
  {
    subContractCompanyId.set(agreement, intTest);
    assertEquals(intTest, agreement.subContractCompanyId());
  }

  @Test
  public void setSubContractCompanyId () throws Exception
  {
    agreement.subContractCompanyId(intTest);
    assertEquals(intTest, subContractCompanyId.get(agreement));
  }

  @Test
  public void getSubContractContactId () throws Exception
  {
    subContractContactId.set(agreement, intTest);
    assertEquals(intTest, agreement.subContractContactId());
  }

  @Test
  public void setSubContractContactId () throws Exception
  {
    agreement.subContractContactId(intTest);
    assertEquals(intTest, subContractContactId.get(agreement));
  }

  @Test
  public void getWorkOrder () throws Exception
  {
    workOrder.set(agreement, stringTest);
    assertEquals(stringTest, agreement.workOrder());
  }

  @Test
  public void setWorkOrder () throws Exception
  {
    agreement.workOrder(stringTest);
    assertEquals(stringTest, workOrder.get(agreement));
  }

  @Test
  public void getInternalNotes () throws Exception
  {
    internalNotes.set(agreement, stringTest);
    assertEquals(stringTest, agreement.internalNotes());
  }

  @Test
  public void setInternalNotes () throws Exception
  {
    agreement.internalNotes(stringTest);
    assertEquals(stringTest, internalNotes.get(agreement));
  }

  @Test
  public void getApplicationUnits () throws Exception
  {
    applicationUnits.set(agreement, stringTest);
    assertEquals(stringTest, agreement.applicationUnits());
  }

  @Test
  public void setApplicationUnits () throws Exception
  {
    agreement.applicationUnits(stringTest);
    assertEquals(stringTest, applicationUnits.get(agreement));
  }

  @Test
  public void getApplicationLimit () throws Exception
  {
    applicationLimit.set(agreement, doubleTest);
    assertEquals(doubleTest, agreement.applicationLimit(), 0);
  }

  @Test
  public void setApplicationLimit () throws Exception
  {
    agreement.applicationLimit(doubleTest);
    assertEquals(doubleTest, applicationLimit.get(agreement));
  }

  @Test
  public void getApplicationCycle () throws Exception
  {
    applicationCycle.set(agreement, stringTest);
    assertEquals(stringTest, agreement.applicationCycle());
  }

  @Test
  public void setApplicationCycle () throws Exception
  {
    agreement.applicationCycle(stringTest);
    assertEquals(stringTest, applicationCycle.get(agreement));
  }

  @Test
  public void getPeriodType () throws Exception
  {
    periodType.set(agreement, stringTest);
    assertEquals(stringTest, agreement.periodType());
  }

  @Test
  public void setPeriodType () throws Exception
  {
    agreement.periodType(stringTest);
    assertEquals(stringTest, periodType.get(agreement));
  }

  @Test
  public void isApplicationUnlimited () throws Exception
  {
    applicationUnlimited.set(agreement, booleanTest);
    assertEquals(booleanTest, agreement.applicationUnlimited());
  }

  @Test
  public void setApplicationUnlimited () throws Exception
  {
    agreement.applicationUnlimited(booleanTest);
    assertEquals(booleanTest, applicationUnlimited.get(agreement));
  }

  @Test
  public void isOneTime () throws Exception
  {
    oneTime.set(agreement, booleanTest);
    assertEquals(booleanTest, agreement.oneTime());
  }

  @Test
  public void setOneTime () throws Exception
  {
    agreement.oneTime(booleanTest);
    assertEquals(booleanTest, oneTime.get(agreement));
  }

  @Test
  public void isCoverAgreementTime () throws Exception
  {
    coverAgreementTime.set(agreement, booleanTest);
    assertEquals(booleanTest, agreement.coverAgreementTime());
  }

  @Test
  public void setCoverAgreementTime () throws Exception
  {
    agreement.coverAgreementTime(booleanTest);
    assertEquals(booleanTest, coverAgreementTime.get(agreement));
  }

  @Test
  public void isCoverAgreementProduct () throws Exception
  {
    coverAgreementProduct.set(agreement, booleanTest);
    assertEquals(booleanTest, agreement.coverAgreementProduct());
  }

  @Test
  public void setCoverAgreementProduct () throws Exception
  {
    agreement.coverAgreementProduct(booleanTest);
    assertEquals(booleanTest, coverAgreementProduct.get(agreement));
  }

  @Test
  public void isCoverAgreementExpense () throws Exception
  {
    coverAgreementExpense.set(agreement, booleanTest);
    assertEquals(booleanTest, agreement.coverAgreementExpense());
  }

  @Test
  public void setCoverAgreementExpense () throws Exception
  {
    agreement.coverAgreementExpense(booleanTest);
    assertEquals(booleanTest, coverAgreementExpense.get(agreement));
  }

  @Test
  public void isCoverSalesTax () throws Exception
  {
    coverSalesTax.set(agreement, booleanTest);
    assertEquals(booleanTest, agreement.coverSalesTax());
  }

  @Test
  public void setCoverSalesTax () throws Exception
  {
    agreement.coverSalesTax(booleanTest);
    assertEquals(booleanTest, coverSalesTax.get(agreement));
  }

  @Test
  public void isCarryOverUnused () throws Exception
  {
    carryOverUnused.set(agreement, booleanTest);
    assertEquals(booleanTest, agreement.carryOverUnused());
  }

  @Test
  public void setCarryOverUnused () throws Exception
  {
    agreement.carryOverUnused(booleanTest);
    assertEquals(booleanTest, carryOverUnused.get(agreement));
  }

  @Test
  public void isAllowOverruns () throws Exception
  {
    allowOverruns.set(agreement, booleanTest);
    assertEquals(booleanTest, agreement.allowOverruns());
  }

  @Test
  public void setAllowOverruns () throws Exception
  {
    agreement.allowOverruns(booleanTest);
    assertEquals(booleanTest, allowOverruns.get(agreement));
  }

  @Test
  public void getExpiredDays () throws Exception
  {
    expiredDays.set(agreement, intTest);
    assertEquals(intTest, agreement.expiredDays());
  }

  @Test
  public void setExpiredDays () throws Exception
  {
    agreement.expiredDays(intTest);
    assertEquals(intTest, expiredDays.get(agreement));
  }

  @Test
  public void getLimit () throws Exception
  {
    limit.set(agreement, intTest);
    assertEquals(intTest, agreement.limit());
  }

  @Test
  public void setLimit () throws Exception
  {
    agreement.limit(intTest);
    assertEquals(intTest, limit.get(agreement));
  }

  @Test
  public void isExpireWhenZero () throws Exception
  {
    expireWhenZero.set(agreement, booleanTest);
    assertEquals(booleanTest, agreement.expireWhenZero());
  }

  @Test
  public void setExpireWhenZero () throws Exception
  {
    agreement.expireWhenZero(booleanTest);
    assertEquals(booleanTest, expireWhenZero.get(agreement));
  }

  @Test
  public void isChargeToFirm () throws Exception
  {
    chargeToFirm.set(agreement, booleanTest);
    assertEquals(booleanTest, agreement.chargeToFirm());
  }

  @Test
  public void setChargeToFirm () throws Exception
  {
    agreement.chargeToFirm(booleanTest);
    assertEquals(booleanTest, chargeToFirm.get(agreement));
  }

  @Test
  public void getEmployeeCompRate () throws Exception
  {
    employeeCompRate.set(agreement, stringTest);
    assertEquals(stringTest, agreement.employeeCompRate());
  }

  @Test
  public void setEmployeeCompRate () throws Exception
  {
    agreement.employeeCompRate(stringTest);
    assertEquals(stringTest, employeeCompRate.get(agreement));
  }

  @Test
  public void getEmployeeCompNotExceed () throws Exception
  {
    employeeCompNotExceed.set(agreement, stringTest);
    assertEquals(stringTest, agreement.employeeCompNotExceed());
  }

  @Test
  public void setEmployeeCompNotExceed () throws Exception
  {
    agreement.employeeCompNotExceed(stringTest);
    assertEquals(stringTest, employeeCompNotExceed.get(agreement));
  }

  @Test
  public void getCompHourlyRate () throws Exception
  {
    compHourlyRate.set(agreement, doubleTest);
    assertEquals(doubleTest, agreement.compHourlyRate(), 0);
  }

  @Test
  public void setCompHourlyRate () throws Exception
  {
    agreement.compHourlyRate(doubleTest);
    assertEquals(doubleTest, compHourlyRate.get(agreement));
  }

  @Test
  public void getCompLimitAmount () throws Exception
  {
    compLimitAmount.set(agreement, doubleTest);
    assertEquals(doubleTest, agreement.compLimitAmount(), 0);
  }

  @Test
  public void setCompLimitAmount () throws Exception
  {
    agreement.compLimitAmount(doubleTest);
    assertEquals(doubleTest, compLimitAmount.get(agreement));
  }

  @Test
  public void getBillCycleId () throws Exception
  {
    billCycleId.set(agreement, intTest);
    assertEquals(intTest, agreement.billCycleId());
  }

  @Test
  public void setBillCycleId () throws Exception
  {
    agreement.billCycleId(intTest);
    assertEquals(intTest, billCycleId.get(agreement));
  }

  @Test
  public void isBillOneTime () throws Exception
  {
    billOneTime.set(agreement, booleanTest);
    assertEquals(booleanTest, agreement.billOneTime());
  }

  @Test
  public void setBillOneTime () throws Exception
  {
    agreement.billOneTime(booleanTest);
    assertEquals(booleanTest, billOneTime.get(agreement));
  }

  @Test
  public void getBillTermsId () throws Exception
  {
    billTermsId.set(agreement, intTest);
    assertEquals(intTest, agreement.billTermsId());
  }

  @Test
  public void setBillTermsId () throws Exception
  {
    agreement.billTermsId(intTest);
    assertEquals(intTest, billTermsId.get(agreement));
  }

  @Test
  public void getInvoicingCycle () throws Exception
  {
    invoicingCycle.set(agreement, stringTest);
    assertEquals(stringTest, agreement.invoicingCycle());
  }

  @Test
  public void setInvoicingCycle () throws Exception
  {
    agreement.invoicingCycle(stringTest);
    assertEquals(stringTest, invoicingCycle.get(agreement));
  }

  @Test
  public void getBillToCompanyId () throws Exception
  {
    billToCompanyId.set(agreement, intTest);
    assertEquals(intTest, agreement.billToCompanyId());
  }

  @Test
  public void setBillToCompanyId () throws Exception
  {
    agreement.billToCompanyId(intTest);
    assertEquals(intTest, billToCompanyId.get(agreement));
  }

  @Test
  public void getBillToAddressId () throws Exception
  {
    billToAddressId.set(agreement, intTest);
    assertEquals(intTest, agreement.billToAddressId());
  }

  @Test
  public void setBillToAddressId () throws Exception
  {
    agreement.billToAddressId(intTest);
    assertEquals(intTest, billToAddressId.get(agreement));
  }

  @Test
  public void getBillAmount () throws Exception
  {
    billAmount.set(agreement, doubleTest);
    assertEquals(doubleTest, agreement.billAmount(), 0);
  }

  @Test
  public void setBillAmount () throws Exception
  {
    agreement.billAmount(doubleTest);
    assertEquals(doubleTest, billAmount.get(agreement));
  }

  @Test
  public void isTaxable () throws Exception
  {
    taxable.set(agreement, booleanTest);
    assertEquals(booleanTest, agreement.taxable());
  }

  @Test
  public void setTaxable () throws Exception
  {
    agreement.taxable(booleanTest);
    assertEquals(booleanTest, taxable.get(agreement));
  }

  @Test
  public void getProrateFirstBill () throws Exception
  {
    prorateFirstBill.set(agreement, doubleTest);
    assertEquals(doubleTest, agreement.prorateFirstBill(), 0);
  }

  @Test
  public void setProrateFirstBill () throws Exception
  {
    agreement.prorateFirstBill(doubleTest);
    assertEquals(doubleTest, prorateFirstBill.get(agreement));
  }

  @Test
  public void getBillStartDate () throws Exception
  {
    billStartDate.set(agreement, dateTest);
    assertEquals(dateTest, agreement.billStartDate());
  }

  @Test
  public void setBillStartDate () throws Exception
  {
    agreement.billStartDate(dateTest);
    assertEquals(dateTest, billStartDate.get(agreement));
  }

  @Test
  public void getTaxCodeId () throws Exception
  {
    taxCodeId.set(agreement, intTest);
    assertEquals(intTest, agreement.taxCodeId());
  }

  @Test
  public void setTaxCodeId () throws Exception
  {
    agreement.taxCodeId(intTest);
    assertEquals(intTest, taxCodeId.get(agreement));
  }

  @Test
  public void isRestrictDownPayment () throws Exception
  {
    restrictDownPayment.set(agreement, booleanTest);
    assertEquals(booleanTest, agreement.restrictDownPayment());
  }

  @Test
  public void setRestrictDownPayment () throws Exception
  {
    agreement.restrictDownPayment(booleanTest);
    assertEquals(booleanTest, restrictDownPayment.get(agreement));
  }

  @Test
  public void getInvoiceDescription () throws Exception
  {
    invoiceDescription.set(agreement, stringTest);
    assertEquals(stringTest, agreement.invoiceDescription());
  }

  @Test
  public void setInvoiceDescription () throws Exception
  {
    agreement.invoiceDescription(stringTest);
    assertEquals(stringTest, invoiceDescription.get(agreement));
  }

  @Test
  public void isTopComment () throws Exception
  {
    topComment.set(agreement, booleanTest);
    assertEquals(booleanTest, agreement.topComment());
  }

  @Test
  public void setTopComment () throws Exception
  {
    agreement.topComment(booleanTest);
    assertEquals(booleanTest, topComment.get(agreement));
  }

  @Test
  public void isBottomComment () throws Exception
  {
    bottomComment.set(agreement, booleanTest);
    assertEquals(booleanTest, agreement.bottomComment());
  }

  @Test
  public void setBottomComment () throws Exception
  {
    agreement.bottomComment(booleanTest);
    assertEquals(booleanTest, bottomComment.get(agreement));
  }

  @Test
  public void getWorkRoleId () throws Exception
  {
    workRoleId.set(agreement, intTest);
    assertEquals(intTest, agreement.workRoleId());
  }

  @Test
  public void setWorkRoleId () throws Exception
  {
    agreement.workRoleId(intTest);
    assertEquals(intTest, workRoleId.get(agreement));
  }

  @Test
  public void getWorkTypeId () throws Exception
  {
    workTypeId.set(agreement, intTest);
    assertEquals(intTest, agreement.workTypeId());
  }

  @Test
  public void setWorkTypeId () throws Exception
  {
    agreement.workTypeId(intTest);
    assertEquals(intTest, workTypeId.get(agreement));
  }

  @Test
  public void getProjectTypeId () throws Exception
  {
    projectTypeId.set(agreement, intTest);
    assertEquals(intTest, agreement.projectTypeId());
  }

  @Test
  public void setProjectTypeId () throws Exception
  {
    agreement.projectTypeId(intTest);
    assertEquals(intTest, projectTypeId.get(agreement));
  }

  @Test
  public void getInvoiceTemplateId () throws Exception
  {
    invoiceTemplateId.set(agreement, intTest);
    assertEquals(intTest, agreement.invoiceTemplateId());
  }

  @Test
  public void setInvoiceTemplateId () throws Exception
  {
    agreement.invoiceTemplateId(intTest);
    assertEquals(intTest, invoiceTemplateId.get(agreement));
  }

  @Test
  public void getBillTime () throws Exception
  {
    billTime.set(agreement, stringTest);
    assertEquals(stringTest, agreement.billTime());
  }

  @Test
  public void setBillTime () throws Exception
  {
    agreement.billTime(stringTest);
    assertEquals(stringTest, billTime.get(agreement));
  }

  @Test
  public void getBillExpenses () throws Exception
  {
    billExpenses.set(agreement, stringTest);
    assertEquals(stringTest, agreement.billExpenses());
  }

  @Test
  public void setBillExpenses () throws Exception
  {
    agreement.billExpenses(stringTest);
    assertEquals(stringTest, billExpenses.get(agreement));
  }

  @Test
  public void getBillProducts () throws Exception
  {
    billProducts.set(agreement, stringTest);
    assertEquals(stringTest, agreement.billProducts());
  }

  @Test
  public void setBillProducts () throws Exception
  {
    agreement.billProducts(stringTest);
    assertEquals(stringTest, billProducts.get(agreement));
  }

  @Test
  public void isBillableTimeInvoice () throws Exception
  {
    billableTimeInvoice.set(agreement, booleanTest);
    assertEquals(booleanTest, agreement.billableTimeInvoice());
  }

  @Test
  public void setBillableTimeInvoice () throws Exception
  {
    agreement.billableTimeInvoice(booleanTest);
    assertEquals(booleanTest, billableTimeInvoice.get(agreement));
  }

  @Test
  public void isBillableExpenseInvoice () throws Exception
  {
    billableExpenseInvoice.set(agreement, booleanTest);
    assertEquals(booleanTest, agreement.billableExpenseInvoice());
  }

  @Test
  public void setBillableExpenseInvoice () throws Exception
  {
    agreement.billableExpenseInvoice(booleanTest);
    assertEquals(booleanTest, billableExpenseInvoice.get(agreement));
  }

  @Test
  public void isBillableProductInvoice () throws Exception
  {
    billableProductInvoice.set(agreement, booleanTest);
    assertEquals(booleanTest, agreement.billableProductInvoice());
  }

  @Test
  public void setBillableProductInvoice () throws Exception
  {
    agreement.billableProductInvoice(booleanTest);
    assertEquals(booleanTest, billableProductInvoice.get(agreement));
  }

}
