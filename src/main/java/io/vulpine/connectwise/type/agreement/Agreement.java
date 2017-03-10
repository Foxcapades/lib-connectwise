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
  private boolean allowOverruns;

  private boolean applicationUnlimited;

  private boolean billableExpenseInvoice;

  private boolean billableProductInvoice;

  private boolean billableTimeInvoice;

  private boolean billOneTime;

  private boolean bottomComment;

  private boolean cancelled;

  private boolean carryOverUnused;

  private boolean chargeToFirm;

  private boolean coverAgreementExpense;

  private boolean coverAgreementProduct;

  private boolean coverAgreementTime;

  private boolean coverSalesTax;

  private boolean expireWhenZero;

  private boolean noEndingDate;

  private boolean oneTime;

  private boolean restrictDepartment;

  private boolean restrictDownPayment;

  private boolean restrictLocation;

  private boolean taxable;

  private boolean topComment;

  private Date billStartDate;

  private Date dateCancelled;

  private Date endDate;

  private Date startDate;

  private double applicationLimit;

  private double billAmount;

  private double compHourlyRate;

  private double compLimitAmount;

  private double prorateFirstBill;

  private int agreementTypeId;

  private int billCycleId;

  private int billTermsId;

  private int billToAddressId;

  private int billToCompanyId;

  private int contactId;

  private int companyId;

  private int departmentId;

  private int expiredDays;

  private int invoiceTemplateId;

  private int limit;

  private int locationId;

  private int opportunityId;

  private int parentAgreementId;

  private int projectTypeId;

  private int slaId;

  private int subContractCompanyId;

  private int subContractContactId;

  private int taxCodeId;

  private int workRoleId;

  private int workTypeId;

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
  public int agreementTypeId()
  {
    return agreementTypeId;
  }

  @JsonSetter( "AgreementTypeId" )
  public Agreement agreementTypeId( int agreementTypeId )
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
  public double applicationLimit()
  {
    return applicationLimit;
  }

  @JsonSetter( "ApplicationLimit" )
  public Agreement applicationLimit( double applicationLimit )
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
  public double billAmount()
  {
    return billAmount;
  }

  @JsonSetter( "BillAmount" )
  public Agreement billAmount( double billAmount )
  {
    this.billAmount = billAmount;

    return this;
  }

  @JsonGetter( "BillCycleId" )
  public int billCycleId()
  {
    return billCycleId;
  }

  @JsonSetter( "BillCycleId" )
  public Agreement billCycleId( int billCycleId )
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
  public int billTermsId()
  {
    return billTermsId;
  }

  @JsonSetter( "BillTermsId" )
  public Agreement billTermsId( int billTermsId )
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
  public int billToAddressId()
  {
    return billToAddressId;
  }

  @JsonSetter( "BillToAddressId" )
  public Agreement billToAddressId( int billToAddressId )
  {
    this.billToAddressId = billToAddressId;

    return this;
  }

  @JsonGetter( "BillToCompanyId" )
  public int billToCompanyId()
  {
    return billToCompanyId;
  }

  @JsonSetter( "BillToCompanyId" )
  public Agreement billToCompanyId( int billToCompanyId )
  {
    this.billToCompanyId = billToCompanyId;

    return this;
  }

  @JsonGetter( "CompHourlyRate" )
  public double compHourlyRate()
  {
    return compHourlyRate;
  }

  @JsonSetter( "CompHourlyRate" )
  public Agreement compHourlyRate( double compHourlyRate )
  {
    this.compHourlyRate = compHourlyRate;

    return this;
  }

  @JsonGetter( "CompLimitAmount" )
  public double compLimitAmount()
  {
    return compLimitAmount;
  }

  @JsonSetter( "CompLimitAmount" )
  public Agreement compLimitAmount( double compLimitAmount )
  {
    this.compLimitAmount = compLimitAmount;

    return this;
  }

  @JsonGetter( "CompanyId" )
  public int companyId()
  {
    return companyId;
  }

  @JsonSetter( "CompanyId" )
  public Agreement companyId( int companyId )
  {
    this.companyId = companyId;

    return this;
  }

  @JsonGetter( "ContactId" )
  public int contactId()
  {
    return contactId;
  }

  @JsonSetter( "ContactId" )
  public Agreement contactId( int contactId )
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
  public int departmentId()
  {
    return departmentId;
  }

  @JsonSetter( "DepartmentId" )
  public Agreement departmentId( int departmentId )
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
  public int expiredDays()
  {
    return expiredDays;
  }

  @JsonSetter( "ExpiredDays" )
  public Agreement expiredDays( int expiredDays )
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
  public int invoiceTemplateId()
  {
    return invoiceTemplateId;
  }

  @JsonSetter( "InvoiceTemplateId" )
  public Agreement invoiceTemplateId( int invoiceTemplateId )
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
  public int limit()
  {
    return limit;
  }

  @JsonSetter( "Limit" )
  public Agreement limit( int limit )
  {
    this.limit = limit;

    return this;
  }

  @JsonGetter( "LocationId" )
  public int locationId()
  {
    return locationId;
  }

  @JsonSetter( "LocationId" )
  public Agreement locationId( int locationId )
  {
    this.locationId = locationId;

    return this;
  }

  @JsonGetter( "OpportunityId" )
  public int opportunityId()
  {
    return opportunityId;
  }

  @JsonSetter( "OpportunityId" )
  public Agreement opportunityId( int opportunityId )
  {
    this.opportunityId = opportunityId;

    return this;
  }

  @JsonGetter( value = "ParentAgreementId" )
  public int parentAgreementId()
  {
    return parentAgreementId;
  }

  @JsonGetter( value = "ParentAgreementId" )
  public Agreement parentAgreementId( int parentAgreementId )
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
  public int projectTypeId()
  {
    return projectTypeId;
  }

  @JsonSetter( "ProjectTypeId" )
  public Agreement projectTypeId( int projectTypeId )
  {
    this.projectTypeId = projectTypeId;

    return this;
  }

  @JsonGetter( "ProrateFirstBill" )
  public double prorateFirstBill()
  {
    return prorateFirstBill;
  }

  @JsonSetter( "ProrateFirstBill" )
  public Agreement prorateFirstBill( double prorateFirstBill )
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
  public int slaId()
  {
    return slaId;
  }

  @JsonSetter( "SlaId" )
  public Agreement slaId( int slaId )
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
  public int subContractCompanyId()
  {
    return subContractCompanyId;
  }

  @JsonSetter( "SubContractCompanyId" )
  public Agreement subContractCompanyId( int subContractCompanyId )
  {
    this.subContractCompanyId = subContractCompanyId;

    return this;
  }

  @JsonGetter( "SubContractContactId" )
  public int subContractContactId()
  {
    return subContractContactId;
  }

  @JsonSetter( "SubContractContactId" )
  public Agreement subContractContactId( int subContractContactId )
  {
    this.subContractContactId = subContractContactId;

    return this;
  }

  @JsonGetter( "TaxCodeId" )
  public int taxCodeId()
  {
    return taxCodeId;
  }

  @JsonSetter( "TaxCodeId" )
  public Agreement taxCodeId( int taxCodeId )
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
  public int workRoleId()
  {
    return workRoleId;
  }

  @JsonSetter( "WorkRoleId" )
  public Agreement workRoleId( int workRoleId )
  {
    this.workRoleId = workRoleId;

    return this;
  }

  @JsonGetter( "WorkTypeId" )
  public int workTypeId()
  {
    return workTypeId;
  }

  @JsonSetter( "WorkTypeId" )
  public Agreement workTypeId( int workTypeId )
  {
    this.workTypeId = workTypeId;

    return this;
  }

  @JsonGetter( "AllowOverruns" )
  public boolean allowOverruns()
  {
    return allowOverruns;
  }

  @JsonSetter( "AllowOverruns" )
  public Agreement allowOverruns( boolean allowOverruns )
  {
    this.allowOverruns = allowOverruns;

    return this;
  }

  @JsonGetter( "ApplicationUnlimitedFlag" )
  public boolean applicationUnlimited()
  {
    return applicationUnlimited;
  }

  @JsonSetter( "ApplicationUnlimitedFlag" )
  public Agreement applicationUnlimited( boolean applicationUnlimited )
  {
    this.applicationUnlimited = applicationUnlimited;

    return this;
  }

  @JsonGetter( "BillOneTimeFlag" )
  public boolean billOneTime()
  {
    return billOneTime;
  }

  @JsonSetter( "BillOneTimeFlag" )
  public Agreement billOneTime( boolean billOneTime )
  {
    this.billOneTime = billOneTime;

    return this;
  }

  @JsonGetter( "BillableExpenseInvoice" )
  public boolean billableExpenseInvoice()
  {
    return billableExpenseInvoice;
  }

  @JsonSetter( "BillableExpenseInvoice" )
  public Agreement billableExpenseInvoice( boolean billableExpenseInvoice )
  {
    this.billableExpenseInvoice = billableExpenseInvoice;

    return this;
  }

  @JsonGetter( "BillableProductInvoice" )
  public boolean billableProductInvoice()
  {
    return billableProductInvoice;
  }

  @JsonSetter( "BillableProductInvoice" )
  public Agreement billableProductInvoice( boolean billableProductInvoice )
  {
    this.billableProductInvoice = billableProductInvoice;

    return this;
  }

  @JsonGetter( "BillableTimeInvoice" )
  public boolean billableTimeInvoice()
  {
    return billableTimeInvoice;
  }

  @JsonSetter( "BillableTimeInvoice" )
  public Agreement billableTimeInvoice( boolean billableTimeInvoice )
  {
    this.billableTimeInvoice = billableTimeInvoice;

    return this;
  }

  @JsonGetter( "BottomComment" )
  public boolean bottomComment()
  {
    return bottomComment;
  }

  @JsonSetter( "BottomComment" )
  public Agreement bottomComment( boolean bottomComment )
  {
    this.bottomComment = bottomComment;

    return this;
  }

  @JsonGetter( "CancelledFlag" )
  public boolean cancelled()
  {
    return cancelled;
  }

  @JsonSetter( "CancelledFlag" )
  public Agreement cancelled( boolean cancelled )
  {
    this.cancelled = cancelled;

    return this;
  }

  @JsonGetter( "CarryOverUnused" )
  public boolean carryOverUnused()
  {
    return carryOverUnused;
  }

  @JsonSetter( "CarryOverUnused" )
  public Agreement carryOverUnused( boolean carryOverUnused )
  {
    this.carryOverUnused = carryOverUnused;

    return this;
  }

  @JsonGetter( "ChargeToFirm" )
  public boolean chargeToFirm()
  {
    return chargeToFirm;
  }

  @JsonSetter( "ChargeToFirm" )
  public Agreement chargeToFirm( boolean chargeToFirm )
  {
    this.chargeToFirm = chargeToFirm;

    return this;
  }

  @JsonGetter( "CoverAgreementExpense" )
  public boolean coverAgreementExpense()
  {
    return coverAgreementExpense;
  }

  @JsonSetter( "CoverAgreementExpense" )
  public Agreement coverAgreementExpense( boolean coverAgreementExpense )
  {
    this.coverAgreementExpense = coverAgreementExpense;

    return this;
  }

  @JsonGetter( "CoverAgreementProduct" )
  public boolean coverAgreementProduct()
  {
    return coverAgreementProduct;
  }

  @JsonSetter( "CoverAgreementProduct" )
  public Agreement coverAgreementProduct( boolean coverAgreementProduct )
  {
    this.coverAgreementProduct = coverAgreementProduct;

    return this;
  }

  @JsonGetter( "CoverAgreementTime" )
  public boolean coverAgreementTime()
  {
    return coverAgreementTime;
  }

  @JsonSetter( "CoverAgreementTime" )
  public Agreement coverAgreementTime( boolean coverAgreementTime )
  {
    this.coverAgreementTime = coverAgreementTime;

    return this;
  }

  @JsonGetter( "CoverSalesTax" )
  public boolean coverSalesTax()
  {
    return coverSalesTax;
  }

  @JsonSetter( "CoverSalesTax" )
  public Agreement coverSalesTax( boolean coverSalesTax )
  {
    this.coverSalesTax = coverSalesTax;

    return this;
  }

  @JsonGetter( "ExpireWhenZero" )
  public boolean expireWhenZero()
  {
    return expireWhenZero;
  }

  @JsonSetter( "ExpireWhenZero" )
  public Agreement expireWhenZero( boolean expireWhenZero )
  {
    this.expireWhenZero = expireWhenZero;

    return this;
  }

  @JsonGetter( "NoEndingDateFlag" )
  public boolean noEndingDate()
  {
    return noEndingDate;
  }

  @JsonSetter( "NoEndingDateFlag" )
  public Agreement noEndingDate( boolean noEndingDate )
  {
    this.noEndingDate = noEndingDate;

    return this;
  }

  @JsonGetter( "OneTimeFlag" )
  public boolean oneTime()
  {
    return oneTime;
  }

  @JsonSetter( "OneTimeFlag" )
  public Agreement oneTime( boolean oneTime )
  {
    this.oneTime = oneTime;

    return this;
  }

  @JsonGetter( "RestrictDepartmentFlag" )
  public boolean restrictDepartment()
  {
    return restrictDepartment;
  }

  @JsonSetter( "RestrictDepartmentFlag" )
  public Agreement restrictDepartment( final boolean restrictDepartment )
  {
    this.restrictDepartment = restrictDepartment;

    return this;
  }

  @JsonGetter( "RestrictDownPayment" )
  public boolean restrictDownPayment()
  {
    return restrictDownPayment;
  }

  @JsonSetter( "RestrictDownPayment" )
  public Agreement restrictDownPayment( boolean restrictDownPayment )
  {
    this.restrictDownPayment = restrictDownPayment;

    return this;
  }

  @JsonGetter( "RestrictLocationFlag" )
  public boolean restrictLocation()
  {
    return restrictLocation;
  }

  @JsonSetter( "RestrictLocationFlag" )
  public Agreement restrictLocation( boolean restrictLocation )
  {
    this.restrictLocation = restrictLocation;

    return this;
  }

  @JsonGetter( "Taxable" )
  public boolean taxable()
  {
    return taxable;
  }

  @JsonSetter( "Taxable" )
  public Agreement taxable( boolean taxable )
  {
    this.taxable = taxable;

    return this;
  }

  @JsonGetter( "TopComment" )
  public boolean topComment()
  {
    return topComment;
  }

  @JsonSetter( "TopComment" )
  public Agreement topComment( boolean topComment )
  {
    this.topComment = topComment;

    return this;
  }
}
