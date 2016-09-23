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

import io.vulpine.connectwise.type.ConnectwiseCommon;

import java.util.Date;

public class Agreement extends ConnectwiseCommon implements io.vulpine.connectwise.type.def.Agreement
{
  private Boolean allowOverruns;

  private Boolean applicationUnlimited;

  private Boolean billableExpenseInvoice;

  private Boolean billableProductInvoice;

  private Boolean billableTimeInvoice;

  private Boolean billOneTime;

  private Boolean bottomComment;

  private Boolean cancelled;

  private Boolean carryOverUnused;

  private Boolean chargeToFirm;

  private Boolean coverAgreementExpense;

  private Boolean coverAgreementProduct;

  private Boolean coverAgreementTime;

  private Boolean coverSalesTax;

  private Boolean expireWhenZero;

  private Boolean noEndingDate;

  private Boolean oneTime;

  private Boolean restrictDepartment;

  private Boolean restrictDownPayment;

  private Boolean restrictLocation;

  private Boolean taxable;

  private Boolean topComment;

  private Date billStartDate;

  private Date dateCancelled;

  private Date endDate;

  private Date startDate;

  private Double applicationLimit;

  private Double billAmount;

  private Double compHourlyRate;

  private Double compLimitAmount;

  private Double prorateFirstBill;

  private Integer agreementTypeId;

  private Integer billCycleId;

  private Integer billTermsId;

  private Integer billToAddressId;

  private Integer billToCompanyId;

  private Integer contactId;

  private Integer companyId;

  private Integer departmentId;

  private Integer expiredDays;

  private Integer invoiceTemplateId;

  private Integer limit;

  private Integer locationId;

  private Integer opportunityId;

  private Integer parentAgreementId;

  private Integer projectTypeId;

  private Integer slaId;

  private Integer subContractCompanyId;

  private Integer subContractContactId;

  private Integer taxCodeId;

  private Integer workRoleId;

  private Integer workTypeId;

  private String agreementName;

  private String applicationCycle;

  private String applicationUnits;

  private String billExpenses;

  private String billProducts;

  private String billTime;

  private String customerPo;

  private String employeeCompNotExceed;

  private String employeeCompRate;

  private String invoiceDescription;

  private String invoicingCycle;

  private String internalNotes;

  private String periodType;

  private String reasonCancelled;

  private String workOrder;

  @Override
  public String agreementName()
  {
    return agreementName;
  }

  @Override
  public Agreement agreementName( String agreementName )
  {
    this.agreementName = agreementName;

    return this;
  }

  @Override
  public Integer agreementTypeId()
  {
    return agreementTypeId;
  }

  @Override
  public Agreement agreementTypeId( Integer agreementTypeId )
  {
    this.agreementTypeId = agreementTypeId;

    return this;
  }

  @Override
  public String applicationCycle()
  {
    return applicationCycle;
  }

  @Override
  public Agreement applicationCycle( String applicationCycle )
  {
    this.applicationCycle = applicationCycle;

    return this;
  }

  @Override
  public Double applicationLimit()
  {
    return applicationLimit;
  }

  @Override
  public Agreement applicationLimit( Double applicationLimit )
  {
    this.applicationLimit = applicationLimit;

    return this;
  }

  @Override
  public String applicationUnits()
  {
    return applicationUnits;
  }

  @Override
  public Agreement applicationUnits( String applicationUnits )
  {
    this.applicationUnits = applicationUnits;

    return this;
  }

  @Override
  public Double billAmount()
  {
    return billAmount;
  }

  @Override
  public Agreement billAmount( Double billAmount )
  {
    this.billAmount = billAmount;

    return this;
  }

  @Override
  public Integer billCycleId()
  {
    return billCycleId;
  }

  @Override
  public Agreement billCycleId( Integer billCycleId )
  {
    this.billCycleId = billCycleId;

    return this;
  }

  @Override
  public String billExpenses()
  {
    return billExpenses;
  }

  @Override
  public Agreement billExpenses( String billExpenses )
  {
    this.billExpenses = billExpenses;

    return this;
  }

  @Override
  public String billProducts()
  {
    return billProducts;
  }

  @Override
  public Agreement billProducts( String billProducts )
  {
    this.billProducts = billProducts;

    return this;
  }

  @Override
  public Date billStartDate()
  {
    return billStartDate;
  }

  @Override
  public Agreement billStartDate( final Date billStartDate )
  {
    this.billStartDate = billStartDate;

    return this;
  }

  @Override
  public Integer billTermsId()
  {
    return billTermsId;
  }

  @Override
  public Agreement billTermsId( Integer billTermsId )
  {
    this.billTermsId = billTermsId;

    return this;
  }

  @Override
  public String billTime()
  {
    return billTime;
  }

  @Override
  public Agreement billTime( String billTime )
  {
    this.billTime = billTime;

    return this;
  }

  @Override
  public Integer billToAddressId()
  {
    return billToAddressId;
  }

  @Override
  public Agreement billToAddressId( Integer billToAddressId )
  {
    this.billToAddressId = billToAddressId;

    return this;
  }

  @Override
  public Integer billToCompanyId()
  {
    return billToCompanyId;
  }

  @Override
  public Agreement billToCompanyId( Integer billToCompanyId )
  {
    this.billToCompanyId = billToCompanyId;

    return this;
  }

  @Override
  public Double compHourlyRate()
  {
    return compHourlyRate;
  }

  @Override
  public Agreement compHourlyRate( Double compHourlyRate )
  {
    this.compHourlyRate = compHourlyRate;

    return this;
  }

  @Override
  public Double compLimitAmount()
  {
    return compLimitAmount;
  }

  @Override
  public Agreement compLimitAmount( Double compLimitAmount )
  {
    this.compLimitAmount = compLimitAmount;

    return this;
  }

  @Override
  public Integer companyId()
  {
    return companyId;
  }

  @Override
  public Agreement companyId( Integer companyId )
  {
    this.companyId = companyId;

    return this;
  }

  @Override
  public Integer contactId()
  {
    return contactId;
  }

  @Override
  public Agreement contactId( Integer contactId )
  {
    this.contactId = contactId;

    return this;
  }

  @Override
  public String customerPo()
  {
    return customerPo;
  }

  @Override
  public Agreement customerPo( String customerPo )
  {
    this.customerPo = customerPo;

    return this;
  }

  @Override
  public Date dateCancelled()
  {
    return dateCancelled;
  }

  @Override
  public Agreement dateCancelled( final Date dateCancelled )
  {
    this.dateCancelled = dateCancelled;

    return this;
  }

  @Override
  public Integer departmentId()
  {
    return departmentId;
  }

  @Override
  public Agreement departmentId( Integer departmentId )
  {
    this.departmentId = departmentId;

    return this;
  }

  @Override
  public String employeeCompNotExceed()
  {
    return employeeCompNotExceed;
  }

  @Override
  public Agreement employeeCompNotExceed( String employeeCompNotExceed )
  {
    this.employeeCompNotExceed = employeeCompNotExceed;

    return this;
  }

  @Override
  public String employeeCompRate()
  {
    return employeeCompRate;
  }

  @Override
  public Agreement employeeCompRate( String employeeCompRate )
  {
    this.employeeCompRate = employeeCompRate;

    return this;
  }

  @Override
  public Date endDate()
  {
    return endDate;
  }

  @Override
  public Agreement endDate( final Date endDate )
  {
    this.endDate = endDate;

    return this;
  }

  @Override
  public Integer expiredDays()
  {
    return expiredDays;
  }

  @Override
  public Agreement expiredDays( Integer expiredDays )
  {
    this.expiredDays = expiredDays;

    return this;
  }

  @Override
  public String internalNotes()
  {
    return internalNotes;
  }

  @Override
  public Agreement internalNotes( String internalNotes )
  {
    this.internalNotes = internalNotes;

    return this;
  }

  @Override
  public String invoiceDescription()
  {
    return invoiceDescription;
  }

  @Override
  public Agreement invoiceDescription( String invoiceDescription )
  {
    this.invoiceDescription = invoiceDescription;

    return this;
  }

  @Override
  public Integer invoiceTemplateId()
  {
    return invoiceTemplateId;
  }

  @Override
  public Agreement invoiceTemplateId( Integer invoiceTemplateId )
  {
    this.invoiceTemplateId = invoiceTemplateId;

    return this;
  }

  @Override
  public String invoicingCycle()
  {
    return invoicingCycle;
  }

  @Override
  public Agreement invoicingCycle( String invoicingCycle )
  {
    this.invoicingCycle = invoicingCycle;

    return this;
  }

  @Override
  public Integer limit()
  {
    return limit;
  }

  @Override
  public Agreement limit( Integer limit )
  {
    this.limit = limit;

    return this;
  }

  @Override
  public Integer locationId()
  {
    return locationId;
  }

  @Override
  public Agreement locationId( Integer locationId )
  {
    this.locationId = locationId;

    return this;
  }

  @Override
  public Integer opportunityId()
  {
    return opportunityId;
  }

  @Override
  public Agreement opportunityId( Integer opportunityId )
  {
    this.opportunityId = opportunityId;

    return this;
  }

  @Override
  public Integer parentAgreementId()
  {
    return parentAgreementId;
  }

  @Override
  public Agreement parentAgreementId( Integer parentAgreementId )
  {
    this.parentAgreementId = parentAgreementId;

    return this;
  }

  @Override
  public String periodType()
  {
    return periodType;
  }

  @Override
  public Agreement periodType( String periodType )
  {
    this.periodType = periodType;

    return this;
  }

  @Override
  public Integer projectTypeId()
  {
    return projectTypeId;
  }

  @Override
  public Agreement projectTypeId( Integer projectTypeId )
  {
    this.projectTypeId = projectTypeId;

    return this;
  }

  @Override
  public Double prorateFirstBill()
  {
    return prorateFirstBill;
  }

  @Override
  public Agreement prorateFirstBill( Double prorateFirstBill )
  {
    this.prorateFirstBill = prorateFirstBill;

    return this;
  }

  @Override
  public String reasonCancelled()
  {
    return reasonCancelled;
  }

  @Override
  public Agreement reasonCancelled( String reasonCancelled )
  {
    this.reasonCancelled = reasonCancelled;

    return this;
  }

  @Override
  public Integer slaId()
  {
    return slaId;
  }

  @Override
  public Agreement slaId( Integer slaId )
  {
    this.slaId = slaId;

    return this;
  }

  @Override
  public Date startDate()
  {
    return startDate;
  }

  @Override
  public Agreement startDate( final Date startDate )
  {
    this.startDate = startDate;

    return this;
  }

  @Override
  public Integer subContractCompanyId()
  {
    return subContractCompanyId;
  }

  @Override
  public Agreement subContractCompanyId( Integer subContractCompanyId )
  {
    this.subContractCompanyId = subContractCompanyId;

    return this;
  }

  @Override
  public Integer subContractContactId()
  {
    return subContractContactId;
  }

  @Override
  public Agreement subContractContactId( Integer subContractContactId )
  {
    this.subContractContactId = subContractContactId;

    return this;
  }

  @Override
  public Integer taxCodeId()
  {
    return taxCodeId;
  }

  @Override
  public Agreement taxCodeId( Integer taxCodeId )
  {
    this.taxCodeId = taxCodeId;

    return this;
  }

  @Override
  public String workOrder()
  {
    return workOrder;
  }

  @Override
  public Agreement workOrder( String workOrder )
  {
    this.workOrder = workOrder;

    return this;
  }

  @Override
  public Integer workRoleId()
  {
    return workRoleId;
  }

  @Override
  public Agreement workRoleId( Integer workRoleId )
  {
    this.workRoleId = workRoleId;

    return this;
  }

  @Override
  public Integer workTypeId()
  {
    return workTypeId;
  }

  @Override
  public Agreement workTypeId( Integer workTypeId )
  {
    this.workTypeId = workTypeId;

    return this;
  }

  @Override
  public Boolean allowOverruns()
  {
    return allowOverruns;
  }

  @Override
  public Agreement allowOverruns( Boolean allowOverruns )
  {
    this.allowOverruns = allowOverruns;

    return this;
  }

  @Override
  public Boolean applicationUnlimited()
  {
    return applicationUnlimited;
  }

  @Override
  public Agreement applicationUnlimited( Boolean applicationUnlimited )
  {
    this.applicationUnlimited = applicationUnlimited;

    return this;
  }

  @Override
  public Boolean billOneTime()
  {
    return billOneTime;
  }

  @Override
  public Agreement billOneTime( Boolean billOneTime )
  {
    this.billOneTime = billOneTime;

    return this;
  }

  @Override
  public Boolean billableExpenseInvoice()
  {
    return billableExpenseInvoice;
  }

  @Override
  public Agreement billableExpenseInvoice( Boolean billableExpenseInvoice )
  {
    this.billableExpenseInvoice = billableExpenseInvoice;

    return this;
  }

  @Override
  public Boolean billableProductInvoice()
  {
    return billableProductInvoice;
  }

  @Override
  public Agreement billableProductInvoice( Boolean billableProductInvoice )
  {
    this.billableProductInvoice = billableProductInvoice;

    return this;
  }

  @Override
  public Boolean billableTimeInvoice()
  {
    return billableTimeInvoice;
  }

  @Override
  public Agreement billableTimeInvoice( Boolean billableTimeInvoice )
  {
    this.billableTimeInvoice = billableTimeInvoice;

    return this;
  }

  @Override
  public Boolean bottomComment()
  {
    return bottomComment;
  }

  @Override
  public Agreement bottomComment( Boolean bottomComment )
  {
    this.bottomComment = bottomComment;

    return this;
  }

  @Override
  public Boolean cancelled()
  {
    return cancelled;
  }

  @Override
  public Agreement cancelled( Boolean cancelled )
  {
    this.cancelled = cancelled;

    return this;
  }

  @Override
  public Boolean carryOverUnused()
  {
    return carryOverUnused;
  }

  @Override
  public Agreement carryOverUnused( Boolean carryOverUnused )
  {
    this.carryOverUnused = carryOverUnused;

    return this;
  }

  @Override
  public Boolean chargeToFirm()
  {
    return chargeToFirm;
  }

  @Override
  public Agreement chargeToFirm( Boolean chargeToFirm )
  {
    this.chargeToFirm = chargeToFirm;

    return this;
  }

  @Override
  public Boolean coverAgreementExpense()
  {
    return coverAgreementExpense;
  }

  @Override
  public Agreement coverAgreementExpense( Boolean coverAgreementExpense )
  {
    this.coverAgreementExpense = coverAgreementExpense;

    return this;
  }

  @Override
  public Boolean coverAgreementProduct()
  {
    return coverAgreementProduct;
  }

  @Override
  public Agreement coverAgreementProduct( Boolean coverAgreementProduct )
  {
    this.coverAgreementProduct = coverAgreementProduct;

    return this;
  }

  @Override
  public Boolean coverAgreementTime()
  {
    return coverAgreementTime;
  }

  @Override
  public Agreement coverAgreementTime( Boolean coverAgreementTime )
  {
    this.coverAgreementTime = coverAgreementTime;

    return this;
  }

  @Override
  public Boolean coverSalesTax()
  {
    return coverSalesTax;
  }

  @Override
  public Agreement coverSalesTax( Boolean coverSalesTax )
  {
    this.coverSalesTax = coverSalesTax;

    return this;
  }

  @Override
  public Boolean expireWhenZero()
  {
    return expireWhenZero;
  }

  @Override
  public Agreement expireWhenZero( Boolean expireWhenZero )
  {
    this.expireWhenZero = expireWhenZero;

    return this;
  }

  @Override
  public Boolean noEndingDate()
  {
    return noEndingDate;
  }

  @Override
  public Agreement noEndingDate( Boolean noEndingDate )
  {
    this.noEndingDate = noEndingDate;

    return this;
  }

  @Override
  public Boolean oneTime()
  {
    return oneTime;
  }

  @Override
  public Agreement oneTime( Boolean oneTime )
  {
    this.oneTime = oneTime;

    return this;
  }

  @Override
  public Boolean restrictDepartment()
  {
    return restrictDepartment;
  }

  @Override
  public Agreement restrictDepartment( final Boolean restrictDepartment )
  {
    this.restrictDepartment = restrictDepartment;

    return this;
  }

  @Override
  public Boolean restrictDownPayment()
  {
    return restrictDownPayment;
  }

  @Override
  public Agreement restrictDownPayment( Boolean restrictDownPayment )
  {
    this.restrictDownPayment = restrictDownPayment;

    return this;
  }

  @Override
  public Boolean restrictLocation()
  {
    return restrictLocation;
  }

  @Override
  public Agreement restrictLocation( Boolean restrictLocation )
  {
    this.restrictLocation = restrictLocation;

    return this;
  }

  @Override
  public Boolean taxable()
  {
    return taxable;
  }

  @Override
  public Agreement taxable( Boolean taxable )
  {
    this.taxable = taxable;

    return this;
  }

  @Override
  public Boolean topComment()
  {
    return topComment;
  }

  @Override
  public Agreement topComment( Boolean topComment )
  {
    this.topComment = topComment;

    return this;
  }
}
