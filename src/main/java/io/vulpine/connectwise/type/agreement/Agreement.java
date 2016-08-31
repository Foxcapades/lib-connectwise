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
package io.vulpine.connectwise.type.agreement;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.vulpine.connectwise.type.ConnectwiseCommon;

import java.util.Date;

@SuppressWarnings( "unused" )
public class Agreement extends ConnectwiseCommon
{
  @JacksonXmlProperty( localName = "AgreementTypeId" )
  protected int agreementTypeId;

  @JacksonXmlProperty( localName = "AgreementName" )
  protected String agreementName;

  @JacksonXmlProperty( localName = "ParentAgreementId" )
  @JsonProperty( defaultValue = "-1" )
  protected int parentAgreementId;

  @JacksonXmlProperty( localName = "CompanyId" )
  protected int companyId;

  @JacksonXmlProperty( localName = "ContactId" )
  protected int contactId;

  @JacksonXmlProperty( localName = "CustomerPO" )
  protected String customerPo;

  @JacksonXmlProperty( localName = "LocationId" )
  protected int locationId;

  @JacksonXmlProperty( localName = "DepartmentId" )
  protected int departmentId;

  @JacksonXmlProperty( localName = "RestrictLocationFlag" )
  protected boolean restrictLocation;

  @JacksonXmlProperty( localName = "RestrictDepartmentFlag" )
  protected boolean restrictDepartment;

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss" )
  @JacksonXmlProperty( localName = "StartDate" )
  protected Date startDate;

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss" )
  @JacksonXmlProperty( localName = "EndDate" )
  protected Date endDate;

  @JacksonXmlProperty( localName = "NoEndingDateFlag" )
  protected boolean noEndingDate;

  @JacksonXmlProperty( localName = "OpportunityId" )
  protected int opportunityId;

  @JacksonXmlProperty( localName = "CancelledFlag" )
  protected boolean cancelled;

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss" )
  @JacksonXmlProperty( localName = "DateCancelled" )
  protected Date dateCancelled;

  @JacksonXmlProperty( localName = "ReasonCancelled" )
  protected String reasonCancelled;

  @JacksonXmlProperty( localName = "SlaId" )
  protected int slaId;

  @JacksonXmlProperty( localName = "SubContractCompanyId" )
  protected int subContractCompanyId;

  @JacksonXmlProperty( localName = "SubContractContactId" )
  protected int subContractContactId;

  @JacksonXmlProperty( localName = "WorkOrder" )
  protected String workOrder;

  @JacksonXmlProperty( localName = "InternalNotes" )
  protected String internalNotes;

  @JacksonXmlProperty( localName = "ApplicationUnits" )
  protected String applicationUnits;

  @JacksonXmlProperty( localName = "ApplicationLimit" )
  protected double applicationLimit;

  @JacksonXmlProperty( localName = "ApplicationCycle" )
  protected String applicationCycle;

  @JacksonXmlProperty( localName = "PeriodType" )
  protected String periodType;

  @JacksonXmlProperty( localName = "ApplicationUnlimitedFlag" )
  protected boolean applicationUnlimited;

  @JacksonXmlProperty( localName = "OneTimeFlag" )
  protected boolean oneTime;

  @JacksonXmlProperty( localName = "CoverAgreementTime" )
  protected boolean coverAgreementTime;

  @JacksonXmlProperty( localName = "CoverAgreementProduct" )
  protected boolean coverAgreementProduct;

  @JacksonXmlProperty( localName = "CoverAgreementExpense" )
  protected boolean coverAgreementExpense;

  @JacksonXmlProperty( localName = "CoverSalesTax" )
  protected boolean coverSalesTax;

  @JacksonXmlProperty( localName = "CarryOverUnused" )
  protected boolean carryOverUnused;

  @JacksonXmlProperty( localName = "AllowOverruns" )
  protected boolean allowOverruns;

  @JacksonXmlProperty( localName = "ExpiredDays" )
  protected int expiredDays;

  @JacksonXmlProperty( localName = "Limit" )
  protected int limit;

  @JacksonXmlProperty( localName = "ExpireWhenZero" )
  protected boolean expireWhenZero;

  @JacksonXmlProperty( localName = "ChargeToFirm" )
  protected boolean chargeToFirm;

  @JacksonXmlProperty( localName = "EmployeeCompRate" )
  protected String employeeCompRate;

  @JacksonXmlProperty( localName = "EmployeeCompNotExceed" )
  protected String employeeCompNotExceed;

  @JacksonXmlProperty( localName = "CompHourlyRate" )
  protected double compHourlyRate;

  @JacksonXmlProperty( localName = "CompLimitAmount" )
  protected double compLimitAmount;

  @JacksonXmlProperty( localName = "BillCycleId" )
  protected int billCycleId;

  @JacksonXmlProperty( localName = "BillOneTimeFlag" )
  protected boolean billOneTime;

  @JacksonXmlProperty( localName = "BillTermsId" )
  protected int billTermsId;

  @JacksonXmlProperty( localName = "InvoicingCycle" )
  protected String invoicingCycle;

  @JacksonXmlProperty( localName = "BillToCompanyId" )
  protected int billToCompanyId;

  @JacksonXmlProperty( localName = "BillToAddressId" )
  protected int billToAddressId;

  @JacksonXmlProperty( localName = "BillAmount" )
  protected double billAmount;

  @JacksonXmlProperty( localName = "Taxable" )
  protected boolean taxable;

  @JacksonXmlProperty( localName = "ProrateFirstBill" )
  protected double prorateFirstBill;

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss" )
  @JacksonXmlProperty( localName = "BillStartDate" )
  protected Date billStartDate;

  @JacksonXmlProperty( localName = "TaxCodeId" )
  protected int taxCodeId;

  @JacksonXmlProperty( localName = "RestrictDownPayment" )
  protected boolean restrictDownPayment;

  @JacksonXmlProperty( localName = "InvoiceDescription" )
  protected String invoiceDescription;

  @JacksonXmlProperty( localName = "TopComment" )
  protected boolean topComment;

  @JacksonXmlProperty( localName = "BottomComment" )
  protected boolean bottomComment;

  @JacksonXmlProperty( localName = "WorkRoleId" )
  protected int workRoleId;

  @JacksonXmlProperty( localName = "WorkTypeId" )
  protected int workTypeId;

  @JacksonXmlProperty( localName = "ProjectTypeId" )
  protected int projectTypeId;

  @JacksonXmlProperty( localName = "InvoiceTemplateId" )
  protected int invoiceTemplateId;

  @JacksonXmlProperty( localName = "BillTime" )
  protected String billTime;

  @JacksonXmlProperty( localName = "BillExpenses" )
  protected String billExpenses;

  @JacksonXmlProperty( localName = "BillProducts" )
  protected String billProducts;

  @JacksonXmlProperty( localName = "BillableTimeInvoice" )
  protected boolean billableTimeInvoice;

  @JacksonXmlProperty( localName = "BillableExpenseInvoice" )
  protected boolean billableExpenseInvoice;

  @JacksonXmlProperty( localName = "BillableProductInvoice" )
  protected boolean billableProductInvoice;

  public int getAgreementTypeId()
  {
    this.logger.trace(this.getClass());
    return agreementTypeId;
  }

  public void setAgreementTypeId( int agreementTypeId )
  {
    this.logger.trace(this.getClass(), agreementTypeId);
    this.agreementTypeId = agreementTypeId;
  }

  public String getAgreementName()
  {
    this.logger.trace(this.getClass());
    return agreementName;
  }

  public void setAgreementName( String agreementName )
  {
    this.logger.trace(this.getClass(), agreementName);
    this.agreementName = agreementName;
  }

  public int getParentAgreementId()
  {
    this.logger.trace(this.getClass());
    return parentAgreementId;
  }

  public void setParentAgreementId( int parentAgreementId )
  {
    this.logger.trace(this.getClass(), parentAgreementId);
    this.parentAgreementId = parentAgreementId;
  }

  public int getCompanyId()
  {
    this.logger.trace(this.getClass());
    return companyId;
  }

  public void setCompanyId( int companyId )
  {
    this.logger.trace(this.getClass(), companyId);
    this.companyId = companyId;
  }

  public int getContactId()
  {
    this.logger.trace(this.getClass());
    return contactId;
  }

  public void setContactId( int contactId )
  {
    this.logger.trace(this.getClass(), contactId);
    this.contactId = contactId;
  }

  public String getCustomerPo()
  {
    this.logger.trace(this.getClass());
    return customerPo;
  }

  public void setCustomerPo( String customerPo )
  {
    this.logger.trace(this.getClass(), customerPo);
    this.customerPo = customerPo;
  }

  public int getLocationId()
  {
    this.logger.trace(this.getClass());
    return locationId;
  }

  public void setLocationId( int locationId )
  {
    this.logger.trace(this.getClass(), locationId);
    this.locationId = locationId;
  }

  public int getDepartmentId()
  {
    this.logger.trace(this.getClass());
    return departmentId;
  }

  public void setDepartmentId( int departmentId )
  {
    this.logger.trace(this.getClass(), departmentId);
    this.departmentId = departmentId;
  }

  public boolean isRestrictLocation()
  {
    this.logger.trace(this.getClass());
    return restrictLocation;
  }

  public void setRestrictLocation( boolean restrictLocation )
  {
    this.logger.trace(this.getClass(), restrictLocation);
    this.restrictLocation = restrictLocation;
  }

  public boolean isRestrictDepartment()
  {
    this.logger.trace(this.getClass());
    return restrictDepartment;
  }

  public void setRestrictDepartment( final boolean restrictDepartment )
  {
    this.logger.trace(this.getClass(), restrictDepartment);
    this.restrictDepartment = restrictDepartment;
  }

  public Date getStartDate()
  {
    this.logger.trace(this.getClass());
    return new Date(startDate.getTime());
  }

  public void setStartDate( final Date startDate )
  {
    this.logger.trace(this.getClass(), new Date(startDate.getTime()));
    this.startDate = new Date(startDate.getTime());
  }

  public Date getEndDate()
  {
    this.logger.trace(this.getClass());
    return new Date(endDate.getTime());
  }

  public void setEndDate( final Date endDate )
  {
    this.logger.trace(this.getClass(), new Date(endDate.getTime()));
    this.endDate = new Date(endDate.getTime());
  }

  public boolean isNoEndingDate()
  {
    this.logger.trace(this.getClass());
    return noEndingDate;
  }

  public void setNoEndingDate( boolean noEndingDate )
  {
    this.logger.trace(this.getClass(), noEndingDate);
    this.noEndingDate = noEndingDate;
  }

  public int getOpportunityId()
  {
    this.logger.trace(this.getClass());
    return opportunityId;
  }

  public void setOpportunityId( int opportunityId )
  {
    this.logger.trace(this.getClass(), opportunityId);
    this.opportunityId = opportunityId;
  }

  public boolean isCancelled()
  {
    this.logger.trace(this.getClass());
    return cancelled;
  }

  public void setCancelled( boolean cancelled )
  {
    this.logger.trace(this.getClass(), cancelled);
    this.cancelled = cancelled;
  }

  public Date getDateCancelled()
  {
    this.logger.trace(this.getClass());
    return new Date(dateCancelled.getTime());
  }

  public void setDateCancelled( final Date dateCancelled )
  {
    this.logger.trace(this.getClass(), new Date(dateCancelled.getTime()));
    this.dateCancelled = new Date(dateCancelled.getTime());
  }

  public String getReasonCancelled()
  {
    this.logger.trace(this.getClass());
    return reasonCancelled;
  }

  public void setReasonCancelled( String reasonCancelled )
  {
    this.logger.trace(this.getClass(), reasonCancelled);
    this.reasonCancelled = reasonCancelled;
  }

  public int getSlaId()
  {
    this.logger.trace(this.getClass());
    return slaId;
  }

  public void setSlaId( int slaId )
  {
    this.logger.trace(this.getClass(), slaId);
    this.slaId = slaId;
  }

  public int getSubContractCompanyId()
  {
    this.logger.trace(this.getClass());
    return subContractCompanyId;
  }

  public void setSubContractCompanyId( int subContractCompanyId )
  {
    this.logger.trace(this.getClass(), subContractCompanyId);
    this.subContractCompanyId = subContractCompanyId;
  }

  public int getSubContractContactId()
  {
    this.logger.trace(this.getClass());
    return subContractContactId;
  }

  public void setSubContractContactId( int subContractContactId )
  {
    this.logger.trace(this.getClass(), subContractContactId);
    this.subContractContactId = subContractContactId;
  }

  public String getWorkOrder()
  {
    this.logger.trace(this.getClass());
    return workOrder;
  }

  public void setWorkOrder( String workOrder )
  {
    this.logger.trace(this.getClass(), workOrder);
    this.workOrder = workOrder;
  }

  public String getInternalNotes()
  {
    this.logger.trace(this.getClass());
    return internalNotes;
  }

  public void setInternalNotes( String internalNotes )
  {
    this.logger.trace(this.getClass(), internalNotes);
    this.internalNotes = internalNotes;
  }

  public String getApplicationUnits()
  {
    this.logger.trace(this.getClass());
    return applicationUnits;
  }

  public void setApplicationUnits( String applicationUnits )
  {
    this.logger.trace(this.getClass(), applicationUnits);
    this.applicationUnits = applicationUnits;
  }

  public double getApplicationLimit()
  {
    this.logger.trace(this.getClass());
    return applicationLimit;
  }

  public void setApplicationLimit( double applicationLimit )
  {
    this.logger.trace(this.getClass(), applicationLimit);
    this.applicationLimit = applicationLimit;
  }

  public String getApplicationCycle()
  {
    this.logger.trace(this.getClass());
    return applicationCycle;
  }

  public void setApplicationCycle( String applicationCycle )
  {
    this.logger.trace(this.getClass(), applicationCycle);
    this.applicationCycle = applicationCycle;
  }

  public String getPeriodType()
  {
    this.logger.trace(this.getClass());
    return periodType;
  }

  public void setPeriodType( String periodType )
  {
    this.logger.trace(this.getClass(), periodType);
    this.periodType = periodType;
  }

  public boolean isApplicationUnlimited()
  {
    this.logger.trace(this.getClass());
    return applicationUnlimited;
  }

  public void setApplicationUnlimited( boolean applicationUnlimited )
  {
    this.logger.trace(this.getClass(), applicationUnlimited);
    this.applicationUnlimited = applicationUnlimited;
  }

  public boolean isOneTime()
  {
    this.logger.trace(this.getClass());
    return oneTime;
  }

  public void setOneTime( boolean oneTime )
  {
    this.logger.trace(this.getClass(), oneTime);
    this.oneTime = oneTime;
  }

  public boolean isCoverAgreementTime()
  {
    this.logger.trace(this.getClass());
    return coverAgreementTime;
  }

  public void setCoverAgreementTime( boolean coverAgreementTime )
  {
    this.logger.trace(this.getClass(), coverAgreementTime);
    this.coverAgreementTime = coverAgreementTime;
  }

  public boolean isCoverAgreementProduct()
  {
    this.logger.trace(this.getClass());
    return coverAgreementProduct;
  }

  public void setCoverAgreementProduct( boolean coverAgreementProduct )
  {
    this.logger.trace(this.getClass(), coverAgreementProduct);
    this.coverAgreementProduct = coverAgreementProduct;
  }

  public boolean isCoverAgreementExpense()
  {
    this.logger.trace(this.getClass());
    return coverAgreementExpense;
  }

  public void setCoverAgreementExpense( boolean coverAgreementExpense )
  {
    this.logger.trace(this.getClass(), coverAgreementExpense);
    this.coverAgreementExpense = coverAgreementExpense;
  }

  public boolean isCoverSalesTax()
  {
    this.logger.trace(this.getClass());
    return coverSalesTax;
  }

  public void setCoverSalesTax( boolean coverSalesTax )
  {
    this.logger.trace(this.getClass(), coverSalesTax);
    this.coverSalesTax = coverSalesTax;
  }

  public boolean isCarryOverUnused()
  {
    this.logger.trace(this.getClass());
    return carryOverUnused;
  }

  public void setCarryOverUnused( boolean carryOverUnused )
  {
    this.logger.trace(this.getClass(), carryOverUnused);
    this.carryOverUnused = carryOverUnused;
  }

  public boolean isAllowOverruns()
  {
    this.logger.trace(this.getClass());
    return allowOverruns;
  }

  public void setAllowOverruns( boolean allowOverruns )
  {
    this.logger.trace(this.getClass(), allowOverruns);
    this.allowOverruns = allowOverruns;
  }

  public int getExpiredDays()
  {
    this.logger.trace(this.getClass());
    return expiredDays;
  }

  public void setExpiredDays( int expiredDays )
  {
    this.logger.trace(this.getClass(), expiredDays);
    this.expiredDays = expiredDays;
  }

  public int getLimit()
  {
    this.logger.trace(this.getClass());
    return limit;
  }

  public void setLimit( int limit )
  {
    this.logger.trace(this.getClass(), limit);
    this.limit = limit;
  }

  public boolean isExpireWhenZero()
  {
    this.logger.trace(this.getClass());
    return expireWhenZero;
  }

  public void setExpireWhenZero( boolean expireWhenZero )
  {
    this.logger.trace(this.getClass(), expireWhenZero);
    this.expireWhenZero = expireWhenZero;
  }

  public boolean isChargeToFirm()
  {
    this.logger.trace(this.getClass());
    return chargeToFirm;
  }

  public void setChargeToFirm( boolean chargeToFirm )
  {
    this.logger.trace(this.getClass(), chargeToFirm);
    this.chargeToFirm = chargeToFirm;
  }

  public String getEmployeeCompRate()
  {
    this.logger.trace(this.getClass());
    return employeeCompRate;
  }

  public void setEmployeeCompRate( String employeeCompRate )
  {
    this.logger.trace(this.getClass(), employeeCompRate);
    this.employeeCompRate = employeeCompRate;
  }

  public String getEmployeeCompNotExceed()
  {
    this.logger.trace(this.getClass());
    return employeeCompNotExceed;
  }

  public void setEmployeeCompNotExceed( String employeeCompNotExceed )
  {
    this.logger.trace(this.getClass(), employeeCompNotExceed);
    this.employeeCompNotExceed = employeeCompNotExceed;
  }

  public double getCompHourlyRate()
  {
    this.logger.trace(this.getClass());
    return compHourlyRate;
  }

  public void setCompHourlyRate( double compHourlyRate )
  {
    this.logger.trace(this.getClass(), compHourlyRate);
    this.compHourlyRate = compHourlyRate;
  }

  public double getCompLimitAmount()
  {
    this.logger.trace(this.getClass());
    return compLimitAmount;
  }

  public void setCompLimitAmount( double compLimitAmount )
  {
    this.logger.trace(this.getClass(), compLimitAmount);
    this.compLimitAmount = compLimitAmount;
  }

  public int getBillCycleId()
  {
    this.logger.trace(this.getClass());
    return billCycleId;
  }

  public void setBillCycleId( int billCycleId )
  {
    this.logger.trace(this.getClass(), billCycleId);
    this.billCycleId = billCycleId;
  }

  public boolean isBillOneTime()
  {
    this.logger.trace(this.getClass());
    return billOneTime;
  }

  public void setBillOneTime( boolean billOneTime )
  {
    this.logger.trace(this.getClass(), billOneTime);
    this.billOneTime = billOneTime;
  }

  public int getBillTermsId()
  {
    this.logger.trace(this.getClass());
    return billTermsId;
  }

  public void setBillTermsId( int billTermsId )
  {
    this.logger.trace(this.getClass(), billTermsId);
    this.billTermsId = billTermsId;
  }

  public String getInvoicingCycle()
  {
    this.logger.trace(this.getClass());
    return invoicingCycle;
  }

  public void setInvoicingCycle( String invoicingCycle )
  {
    this.logger.trace(this.getClass(), invoicingCycle);
    this.invoicingCycle = invoicingCycle;
  }

  public int getBillToCompanyId()
  {
    this.logger.trace(this.getClass());
    return billToCompanyId;
  }

  public void setBillToCompanyId( int billToCompanyId )
  {
    this.logger.trace(this.getClass(), billToCompanyId);
    this.billToCompanyId = billToCompanyId;
  }

  public int getBillToAddressId()
  {
    this.logger.trace(this.getClass());
    return billToAddressId;
  }

  public void setBillToAddressId( int billToAddressId )
  {
    this.logger.trace(this.getClass(), billToAddressId);
    this.billToAddressId = billToAddressId;
  }

  public double getBillAmount()
  {
    this.logger.trace(this.getClass());
    return billAmount;
  }

  public void setBillAmount( double billAmount )
  {
    this.logger.trace(this.getClass(), billAmount);
    this.billAmount = billAmount;
  }

  public boolean isTaxable()
  {
    this.logger.trace(this.getClass());
    return taxable;
  }

  public void setTaxable( boolean taxable )
  {
    this.logger.trace(this.getClass(), taxable);
    this.taxable = taxable;
  }

  public double getProrateFirstBill()
  {
    this.logger.trace(this.getClass());
    return prorateFirstBill;
  }

  public void setProrateFirstBill( double prorateFirstBill )
  {
    this.logger.trace(this.getClass(), prorateFirstBill);
    this.prorateFirstBill = prorateFirstBill;
  }

  public Date getBillStartDate()
  {
    this.logger.trace(this.getClass());
    return new Date(billStartDate.getTime());
  }

  public void setBillStartDate( final Date billStartDate )
  {
    this.logger.trace(this.getClass(), new Date(billStartDate.getTime()));
    this.billStartDate = new Date(billStartDate.getTime());
  }

  public int getTaxCodeId()
  {
    this.logger.trace(this.getClass());
    return taxCodeId;
  }

  public void setTaxCodeId( int taxCodeId )
  {
    this.logger.trace(this.getClass(), taxCodeId);
    this.taxCodeId = taxCodeId;
  }

  public boolean isRestrictDownPayment()
  {
    this.logger.trace(this.getClass());
    return restrictDownPayment;
  }

  public void setRestrictDownPayment( boolean restrictDownPayment )
  {
    this.logger.trace(this.getClass(), restrictDownPayment);
    this.restrictDownPayment = restrictDownPayment;
  }

  public String getInvoiceDescription()
  {
    this.logger.trace(this.getClass());
    return invoiceDescription;
  }

  public void setInvoiceDescription( String invoiceDescription )
  {
    this.logger.trace(this.getClass(), invoiceDescription);
    this.invoiceDescription = invoiceDescription;
  }

  public boolean isTopComment()
  {
    this.logger.trace(this.getClass());
    return topComment;
  }

  public void setTopComment( boolean topComment )
  {
    this.logger.trace(this.getClass(), topComment);
    this.topComment = topComment;
  }

  public boolean isBottomComment()
  {
    this.logger.trace(this.getClass());
    return bottomComment;
  }

  public void setBottomComment( boolean bottomComment )
  {
    this.logger.trace(this.getClass(), bottomComment);
    this.bottomComment = bottomComment;
  }

  public int getWorkRoleId()
  {
    this.logger.trace(this.getClass());
    return workRoleId;
  }

  public void setWorkRoleId( int workRoleId )
  {
    this.logger.trace(this.getClass(), workRoleId);
    this.workRoleId = workRoleId;
  }

  public int getWorkTypeId()
  {
    this.logger.trace(this.getClass());
    return workTypeId;
  }

  public void setWorkTypeId( int workTypeId )
  {
    this.logger.trace(this.getClass(), workTypeId);
    this.workTypeId = workTypeId;
  }

  public int getProjectTypeId()
  {
    this.logger.trace(this.getClass());
    return projectTypeId;
  }

  public void setProjectTypeId( int projectTypeId )
  {
    this.logger.trace(this.getClass(), projectTypeId);
    this.projectTypeId = projectTypeId;
  }

  public int getInvoiceTemplateId()
  {
    this.logger.trace(this.getClass());
    return invoiceTemplateId;
  }

  public void setInvoiceTemplateId( int invoiceTemplateId )
  {
    this.logger.trace(this.getClass(), invoiceTemplateId);
    this.invoiceTemplateId = invoiceTemplateId;
  }

  public String getBillTime()
  {
    this.logger.trace(this.getClass());
    return billTime;
  }

  public void setBillTime( String billTime )
  {
    this.logger.trace(this.getClass(), billTime);
    this.billTime = billTime;
  }

  public String getBillExpenses()
  {
    this.logger.trace(this.getClass());
    return billExpenses;
  }

  public void setBillExpenses( String billExpenses )
  {
    this.logger.trace(this.getClass(), billExpenses);
    this.billExpenses = billExpenses;
  }

  public String getBillProducts()
  {
    this.logger.trace(this.getClass());
    return billProducts;
  }

  public void setBillProducts( String billProducts )
  {
    this.logger.trace(this.getClass(), billProducts);
    this.billProducts = billProducts;
  }

  public boolean isBillableTimeInvoice()
  {
    this.logger.trace(this.getClass());
    return billableTimeInvoice;
  }

  public void setBillableTimeInvoice( boolean billableTimeInvoice )
  {
    this.logger.trace(this.getClass(), billableTimeInvoice);
    this.billableTimeInvoice = billableTimeInvoice;
  }

  public boolean isBillableExpenseInvoice()
  {
    this.logger.trace(this.getClass());
    return billableExpenseInvoice;
  }

  public void setBillableExpenseInvoice( boolean billableExpenseInvoice )
  {
    this.logger.trace(this.getClass(), billableExpenseInvoice);
    this.billableExpenseInvoice = billableExpenseInvoice;
  }

  public boolean isBillableProductInvoice()
  {
    this.logger.trace(this.getClass());
    return billableProductInvoice;
  }

  public void setBillableProductInvoice( boolean billableProductInvoice )
  {
    this.logger.trace(this.getClass(), billableProductInvoice);
    this.billableProductInvoice = billableProductInvoice;
  }
}
