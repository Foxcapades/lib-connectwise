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

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.vulpine.connectwise.type.ConnectwiseCommon;

import java.util.Date;

public class Agreement extends ConnectwiseCommon
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

  @JsonGetter( "AgreementName" )
  public String agreementName()
  {
    return agreementName;
  }

  @JsonSetter( "AgreementName" )
  public Agreement agreementName( String agreementName )
  {
    this.agreementName = agreementName;

    return this;
  }

  @JsonGetter( "AgreementTypeId" )
  public Integer agreementTypeId()
  {
    return agreementTypeId;
  }

  @JsonSetter( "AgreementTypeId" )
  public Agreement agreementTypeId( Integer agreementTypeId )
  {
    this.agreementTypeId = agreementTypeId;

    return this;
  }

  @JsonGetter( "ApplicationCycle" )
  public String applicationCycle()
  {
    return applicationCycle;
  }

  @JsonSetter( "ApplicationCycle" )
  public Agreement applicationCycle( String applicationCycle )
  {
    this.applicationCycle = applicationCycle;

    return this;
  }

  @JsonGetter( "ApplicationLimit" )
  public Double applicationLimit()
  {
    return applicationLimit;
  }

  @JsonSetter( "ApplicationLimit" )
  public Agreement applicationLimit( Double applicationLimit )
  {
    this.applicationLimit = applicationLimit;

    return this;
  }

  @JsonGetter( "ApplicationUnits" )
  public String applicationUnits()
  {
    return applicationUnits;
  }

  @JsonSetter( "ApplicationUnits" )
  public Agreement applicationUnits( String applicationUnits )
  {
    this.applicationUnits = applicationUnits;

    return this;
  }

  @JsonGetter( "BillAmount" )
  public Double billAmount()
  {
    return billAmount;
  }

  @JsonSetter( "BillAmount" )
  public Agreement billAmount( Double billAmount )
  {
    this.billAmount = billAmount;

    return this;
  }

  @JsonGetter( "BillCycleId" )
  public Integer billCycleId()
  {
    return billCycleId;
  }

  @JsonSetter( "BillCycleId" )
  public Agreement billCycleId( Integer billCycleId )
  {
    this.billCycleId = billCycleId;

    return this;
  }

  @JsonGetter( "BillExpenses" )
  public String billExpenses()
  {
    return billExpenses;
  }

  @JsonSetter( "BillExpenses" )
  public Agreement billExpenses( String billExpenses )
  {
    this.billExpenses = billExpenses;

    return this;
  }

  @JsonGetter( "BillProducts" )
  public String billProducts()
  {
    return billProducts;
  }

  @JsonSetter( "BillProducts" )
  public Agreement billProducts( String billProducts )
  {
    this.billProducts = billProducts;

    return this;
  }

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss" )
  @JsonGetter( "BillStartDate" )
  public Date billStartDate()
  {
    return billStartDate;
  }

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss" )
  @JsonSetter( "BillStartDate" )
  public Agreement billStartDate( final Date billStartDate )
  {
    this.billStartDate = billStartDate;

    return this;
  }

  @JsonGetter( "BillTermsId" )
  public Integer billTermsId()
  {
    return billTermsId;
  }

  @JsonSetter( "BillTermsId" )
  public Agreement billTermsId( Integer billTermsId )
  {
    this.billTermsId = billTermsId;

    return this;
  }

  @JsonGetter( "BillTime" )
  public String billTime()
  {
    return billTime;
  }

  @JsonSetter( "BillTime" )
  public Agreement billTime( String billTime )
  {
    this.billTime = billTime;

    return this;
  }

  @JsonGetter( "BillToAddressId" )
  public Integer billToAddressId()
  {
    return billToAddressId;
  }

  @JsonSetter( "BillToAddressId" )
  public Agreement billToAddressId( Integer billToAddressId )
  {
    this.billToAddressId = billToAddressId;

    return this;
  }

  @JsonGetter( "BillToCompanyId" )
  public Integer billToCompanyId()
  {
    return billToCompanyId;
  }

  @JsonSetter( "BillToCompanyId" )
  public Agreement billToCompanyId( Integer billToCompanyId )
  {
    this.billToCompanyId = billToCompanyId;

    return this;
  }

  @JsonGetter( "CompHourlyRate" )
  public Double compHourlyRate()
  {
    return compHourlyRate;
  }

  @JsonSetter( "CompHourlyRate" )
  public Agreement compHourlyRate( Double compHourlyRate )
  {
    this.compHourlyRate = compHourlyRate;

    return this;
  }

  @JsonGetter( "CompLimitAmount" )
  public Double compLimitAmount()
  {
    return compLimitAmount;
  }

  @JsonSetter( "CompLimitAmount" )
  public Agreement compLimitAmount( Double compLimitAmount )
  {
    this.compLimitAmount = compLimitAmount;

    return this;
  }

  @JsonGetter( "CompanyId" )
  public Integer companyId()
  {
    return companyId;
  }

  @JsonSetter( "CompanyId" )
  public Agreement companyId( Integer companyId )
  {
    this.companyId = companyId;

    return this;
  }

  @JsonGetter( "ContactId" )
  public Integer contactId()
  {
    return contactId;
  }

  @JsonSetter( "ContactId" )
  public Agreement contactId( Integer contactId )
  {
    this.contactId = contactId;

    return this;
  }

  @JsonGetter( "CustomerPO" )
  public String customerPo()
  {
    return customerPo;
  }

  @JsonSetter( "CustomerPO" )
  public Agreement customerPo( String customerPo )
  {
    this.customerPo = customerPo;

    return this;
  }

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss" )
  @JsonGetter( "DateCancelled" )
  public Date dateCancelled()
  {
    return dateCancelled;
  }

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss" )
  @JsonSetter( "DateCancelled" )
  public Agreement dateCancelled( final Date dateCancelled )
  {
    this.dateCancelled = dateCancelled;

    return this;
  }

  @JsonGetter( "DepartmentId" )
  public Integer departmentId()
  {
    return departmentId;
  }

  @JsonSetter( "DepartmentId" )
  public Agreement departmentId( Integer departmentId )
  {
    this.departmentId = departmentId;

    return this;
  }

  @JsonGetter( "EmployeeCompNotExceed" )
  public String employeeCompNotExceed()
  {
    return employeeCompNotExceed;
  }

  @JsonSetter( "EmployeeCompNotExceed" )
  public Agreement employeeCompNotExceed( String employeeCompNotExceed )
  {
    this.employeeCompNotExceed = employeeCompNotExceed;

    return this;
  }

  @JsonGetter( "EmployeeCompRate" )
  public String employeeCompRate()
  {
    return employeeCompRate;
  }

  @JsonSetter( "EmployeeCompRate" )
  public Agreement employeeCompRate( String employeeCompRate )
  {
    this.employeeCompRate = employeeCompRate;

    return this;
  }

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss" )
  @JsonGetter( "EndDate" )
  public Date endDate()
  {
    return endDate;
  }

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss" )
  @JsonSetter( "EndDate" )
  public Agreement endDate( final Date endDate )
  {
    this.endDate = endDate;

    return this;
  }

  @JsonGetter( "ExpiredDays" )
  public Integer expiredDays()
  {
    return expiredDays;
  }

  @JsonSetter( "ExpiredDays" )
  public Agreement expiredDays( Integer expiredDays )
  {
    this.expiredDays = expiredDays;

    return this;
  }

  @JsonGetter( "InternalNotes" )
  public String internalNotes()
  {
    return internalNotes;
  }

  @JsonSetter( "InternalNotes" )
  public Agreement internalNotes( String internalNotes )
  {
    this.internalNotes = internalNotes;

    return this;
  }

  @JsonGetter( "InvoiceDescription" )
  public String invoiceDescription()
  {
    return invoiceDescription;
  }

  @JsonSetter( "InvoiceDescription" )
  public Agreement invoiceDescription( String invoiceDescription )
  {
    this.invoiceDescription = invoiceDescription;

    return this;
  }

  @JsonGetter( "InvoiceTemplateId" )
  public Integer invoiceTemplateId()
  {
    return invoiceTemplateId;
  }

  @JsonSetter( "InvoiceTemplateId" )
  public Agreement invoiceTemplateId( Integer invoiceTemplateId )
  {
    this.invoiceTemplateId = invoiceTemplateId;

    return this;
  }

  @JsonGetter( "InvoicingCycle" )
  public String invoicingCycle()
  {
    return invoicingCycle;
  }

  @JsonSetter( "InvoicingCycle" )
  public Agreement invoicingCycle( String invoicingCycle )
  {
    this.invoicingCycle = invoicingCycle;

    return this;
  }

  @JsonGetter( "Limit" )
  public Integer limit()
  {
    return limit;
  }

  @JsonSetter( "Limit" )
  public Agreement limit( Integer limit )
  {
    this.limit = limit;

    return this;
  }

  @JsonGetter( "LocationId" )
  public Integer locationId()
  {
    return locationId;
  }

  @JsonSetter( "LocationId" )
  public Agreement locationId( Integer locationId )
  {
    this.locationId = locationId;

    return this;
  }

  @JsonGetter( "OpportunityId" )
  public Integer opportunityId()
  {
    return opportunityId;
  }

  @JsonSetter( "OpportunityId" )
  public Agreement opportunityId( Integer opportunityId )
  {
    this.opportunityId = opportunityId;

    return this;
  }

  @JsonGetter( value = "ParentAgreementId" )
  public Integer parentAgreementId()
  {
    return parentAgreementId;
  }

  @JsonGetter( value = "ParentAgreementId" )
  public Agreement parentAgreementId( Integer parentAgreementId )
  {
    this.parentAgreementId = parentAgreementId;

    return this;
  }

  @JsonGetter( "PeriodType" )
  public String periodType()
  {
    return periodType;
  }

  @JsonSetter( "PeriodType" )
  public Agreement periodType( String periodType )
  {
    this.periodType = periodType;

    return this;
  }

  @JsonGetter( "ProjectTypeId" )
  public Integer projectTypeId()
  {
    return projectTypeId;
  }

  @JsonSetter( "ProjectTypeId" )
  public Agreement projectTypeId( Integer projectTypeId )
  {
    this.projectTypeId = projectTypeId;

    return this;
  }

  @JsonGetter( "ProrateFirstBill" )
  public Double prorateFirstBill()
  {
    return prorateFirstBill;
  }

  @JsonSetter( "ProrateFirstBill" )
  public Agreement prorateFirstBill( Double prorateFirstBill )
  {
    this.prorateFirstBill = prorateFirstBill;

    return this;
  }

  @JsonGetter( "ReasonCancelled" )
  public String reasonCancelled()
  {
    return reasonCancelled;
  }

  @JsonSetter( "ReasonCancelled" )
  public Agreement reasonCancelled( String reasonCancelled )
  {
    this.reasonCancelled = reasonCancelled;

    return this;
  }

  @JsonGetter( "SlaId" )
  public Integer slaId()
  {
    return slaId;
  }

  @JsonSetter( "SlaId" )
  public Agreement slaId( Integer slaId )
  {
    this.slaId = slaId;

    return this;
  }

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss" )
  @JsonGetter( "StartDate" )
  public Date startDate()
  {
    return startDate;
  }

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss" )
  @JsonSetter( "StartDate" )
  public Agreement startDate( final Date startDate )
  {
    this.startDate = startDate;

    return this;
  }

  @JsonGetter( "SubContractCompanyId" )
  public Integer subContractCompanyId()
  {
    return subContractCompanyId;
  }

  @JsonSetter( "SubContractCompanyId" )
  public Agreement subContractCompanyId( Integer subContractCompanyId )
  {
    this.subContractCompanyId = subContractCompanyId;

    return this;
  }

  @JsonGetter( "SubContractContactId" )
  public Integer subContractContactId()
  {
    return subContractContactId;
  }

  @JsonSetter( "SubContractContactId" )
  public Agreement subContractContactId( Integer subContractContactId )
  {
    this.subContractContactId = subContractContactId;

    return this;
  }

  @JsonGetter( "TaxCodeId" )
  public Integer taxCodeId()
  {
    return taxCodeId;
  }

  @JsonSetter( "TaxCodeId" )
  public Agreement taxCodeId( Integer taxCodeId )
  {
    this.taxCodeId = taxCodeId;

    return this;
  }

  @JsonGetter( "WorkOrder" )
  public String workOrder()
  {
    return workOrder;
  }

  @JsonSetter( "WorkOrder" )
  public Agreement workOrder( String workOrder )
  {
    this.workOrder = workOrder;

    return this;
  }

  @JsonGetter( "WorkRoleId" )
  public Integer workRoleId()
  {
    return workRoleId;
  }

  @JsonSetter( "WorkRoleId" )
  public Agreement workRoleId( Integer workRoleId )
  {
    this.workRoleId = workRoleId;

    return this;
  }

  @JsonGetter( "WorkTypeId" )
  public Integer workTypeId()
  {
    return workTypeId;
  }

  @JsonSetter( "WorkTypeId" )
  public Agreement workTypeId( Integer workTypeId )
  {
    this.workTypeId = workTypeId;

    return this;
  }

  @JsonGetter( "AllowOverrruns" )
  public Boolean allowOverruns()
  {
    return allowOverruns;
  }

  @JsonSetter( "AllowOverrruns" )
  public Agreement allowOverruns( Boolean allowOverruns )
  {
    this.allowOverruns = allowOverruns;

    return this;
  }

  @JsonGetter( "ApplicationUnlimitedFlag" )
  public Boolean applicationUnlimited()
  {
    return applicationUnlimited;
  }

  @JsonSetter( "ApplicationUnlimitedFlag" )
  public Agreement applicationUnlimited( Boolean applicationUnlimited )
  {
    this.applicationUnlimited = applicationUnlimited;

    return this;
  }

  @JsonGetter( "BillOneTimeFlag" )
  public Boolean billOneTime()
  {
    return billOneTime;
  }

  @JsonSetter( "BillOneTimeFlag" )
  public Agreement billOneTime( Boolean billOneTime )
  {
    this.billOneTime = billOneTime;

    return this;
  }

  @JsonGetter( "BillableExpenseInvoice" )
  public Boolean billableExpenseInvoice()
  {
    return billableExpenseInvoice;
  }

  @JsonSetter( "BillableExpenseInvoice" )
  public Agreement billableExpenseInvoice( Boolean billableExpenseInvoice )
  {
    this.billableExpenseInvoice = billableExpenseInvoice;

    return this;
  }

  @JsonGetter( "BillableProductInvoice" )
  public Boolean billableProductInvoice()
  {
    return billableProductInvoice;
  }

  @JsonSetter( "BillableProductInvoice" )
  public Agreement billableProductInvoice( Boolean billableProductInvoice )
  {
    this.billableProductInvoice = billableProductInvoice;

    return this;
  }

  @JsonGetter( "BillableTimeInvoice" )
  public Boolean billableTimeInvoice()
  {
    return billableTimeInvoice;
  }

  @JsonSetter( "BillableTimeInvoice" )
  public Agreement billableTimeInvoice( Boolean billableTimeInvoice )
  {
    this.billableTimeInvoice = billableTimeInvoice;

    return this;
  }

  @JsonGetter( "BottomComment" )
  public Boolean bottomComment()
  {
    return bottomComment;
  }

  @JsonSetter( "BottomComment" )
  public Agreement bottomComment( Boolean bottomComment )
  {
    this.bottomComment = bottomComment;

    return this;
  }

  @JsonGetter( "CancelledFlag" )
  public Boolean cancelled()
  {
    return cancelled;
  }

  @JsonSetter( "CancelledFlag" )
  public Agreement cancelled( Boolean cancelled )
  {
    this.cancelled = cancelled;

    return this;
  }

  @JsonGetter( "CarryOverUnused" )
  public Boolean carryOverUnused()
  {
    return carryOverUnused;
  }

  @JsonSetter( "CarryOverUnused" )
  public Agreement carryOverUnused( Boolean carryOverUnused )
  {
    this.carryOverUnused = carryOverUnused;

    return this;
  }

  @JsonGetter( "ChargeToFirm" )
  public Boolean chargeToFirm()
  {
    return chargeToFirm;
  }

  @JsonSetter( "ChargeToFirm" )
  public Agreement chargeToFirm( Boolean chargeToFirm )
  {
    this.chargeToFirm = chargeToFirm;

    return this;
  }

  @JsonGetter( "CoverAgreementExpense" )
  public Boolean coverAgreementExpense()
  {
    return coverAgreementExpense;
  }

  @JsonSetter( "CoverAgreementExpense" )
  public Agreement coverAgreementExpense( Boolean coverAgreementExpense )
  {
    this.coverAgreementExpense = coverAgreementExpense;

    return this;
  }

  @JsonGetter( "CoverAgreementProduct" )
  public Boolean coverAgreementProduct()
  {
    return coverAgreementProduct;
  }

  @JsonSetter( "CoverAgreementProduct" )
  public Agreement coverAgreementProduct( Boolean coverAgreementProduct )
  {
    this.coverAgreementProduct = coverAgreementProduct;

    return this;
  }

  @JsonGetter( "CoverAgreementTime" )
  public Boolean coverAgreementTime()
  {
    return coverAgreementTime;
  }

  @JsonSetter( "CoverAgreementTime" )
  public Agreement coverAgreementTime( Boolean coverAgreementTime )
  {
    this.coverAgreementTime = coverAgreementTime;

    return this;
  }

  @JsonGetter( "CoverSalesTax" )
  public Boolean coverSalesTax()
  {
    return coverSalesTax;
  }

  @JsonSetter( "CoverSalesTax" )
  public Agreement coverSalesTax( Boolean coverSalesTax )
  {
    this.coverSalesTax = coverSalesTax;

    return this;
  }

  @JsonGetter( "ExpireWhenZero" )
  public Boolean expireWhenZero()
  {
    return expireWhenZero;
  }

  @JsonSetter( "ExpireWhenZero" )
  public Agreement expireWhenZero( Boolean expireWhenZero )
  {
    this.expireWhenZero = expireWhenZero;

    return this;
  }

  @JsonGetter( "NoEndingDateFlag" )
  public Boolean noEndingDate()
  {
    return noEndingDate;
  }

  @JsonSetter( "NoEndingDateFlag" )
  public Agreement noEndingDate( Boolean noEndingDate )
  {
    this.noEndingDate = noEndingDate;

    return this;
  }

  @JsonGetter( "OneTimeFlag" )
  public Boolean oneTime()
  {
    return oneTime;
  }

  @JsonSetter( "OneTimeFlag" )
  public Agreement oneTime( Boolean oneTime )
  {
    this.oneTime = oneTime;

    return this;
  }

  @JsonGetter( "RestrictDepartmentFlag" )
  public Boolean restrictDepartment()
  {
    return restrictDepartment;
  }

  @JsonSetter( "RestrictDepartmentFlag" )
  public Agreement restrictDepartment( final Boolean restrictDepartment )
  {
    this.restrictDepartment = restrictDepartment;

    return this;
  }

  @JsonGetter( "RestrictDownPayment" )
  public Boolean restrictDownPayment()
  {
    return restrictDownPayment;
  }

  @JsonSetter( "RestrictDownPayment" )
  public Agreement restrictDownPayment( Boolean restrictDownPayment )
  {
    this.restrictDownPayment = restrictDownPayment;

    return this;
  }

  @JsonGetter( "RestrictLocationFlag" )
  public Boolean restrictLocation()
  {
    return restrictLocation;
  }

  @JsonSetter( "RestrictLocationFlag" )
  public Agreement restrictLocation( Boolean restrictLocation )
  {
    this.restrictLocation = restrictLocation;

    return this;
  }

  @JsonGetter( "Taxable" )
  public Boolean taxable()
  {
    return taxable;
  }

  @JsonSetter( "Taxable" )
  public Agreement taxable( Boolean taxable )
  {
    this.taxable = taxable;

    return this;
  }

  @JsonGetter( "TopComment" )
  public Boolean topComment()
  {
    return topComment;
  }

  @JsonSetter( "TopComment" )
  public Agreement topComment( Boolean topComment )
  {
    this.topComment = topComment;

    return this;
  }
}
