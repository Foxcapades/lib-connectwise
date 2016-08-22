package io.vulpine.connectwise.type.agreement;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.vulpine.connectwise.type.CwObject;

import java.util.Date;

@SuppressWarnings( "unused" )
public class Agreement extends CwObject
{
  @JacksonXmlProperty ( localName = "AgreementTypeId" )
  protected int agreementTypeId;

  @JacksonXmlProperty ( localName = "AgreementName" )
  protected String agreementName;

  @JacksonXmlProperty ( localName = "ParentAgreementId" )
  @JsonProperty ( defaultValue = "-1" )
  protected int parentAgreementId;

  @JacksonXmlProperty ( localName = "CompanyId" )
  protected int companyId;

  @JacksonXmlProperty ( localName = "ContactId" )
  protected int contactId;

  @JacksonXmlProperty ( localName = "CustomerPO" )
  protected String customerPo;

  @JacksonXmlProperty ( localName = "LocationId" )
  protected int locationId;

  @JacksonXmlProperty ( localName = "DepartmentId" )
  protected int departmentId;

  @JacksonXmlProperty ( localName = "RestrictLocationFlag" )
  protected boolean restrictLocation;

  @JacksonXmlProperty ( localName = "RestrictDepartmentFlag" )
  protected boolean restrictDepartment;

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
  @JacksonXmlProperty ( localName = "StartDate" )
  protected Date startDate;

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
  @JacksonXmlProperty ( localName = "EndDate" )
  protected Date endDate;

  @JacksonXmlProperty ( localName = "NoEndingDateFlag" )
  protected boolean noEndingDate;

  @JacksonXmlProperty ( localName = "OpportunityId" )
  protected int opportunityId;

  @JacksonXmlProperty ( localName = "CancelledFlag" )
  protected boolean cancelled;

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
  @JacksonXmlProperty ( localName = "DateCancelled" )
  protected Date dateCancelled;

  @JacksonXmlProperty ( localName = "ReasonCancelled" )
  protected String reasonCancelled;

  @JacksonXmlProperty ( localName = "SlaId" )
  protected int slaId;

  @JacksonXmlProperty ( localName = "SubContractCompanyId" )
  protected int subContractCompanyId;

  @JacksonXmlProperty ( localName = "SubContractContactId" )
  protected int subContractContactId;

  @JacksonXmlProperty ( localName = "WorkOrder" )
  protected String workOrder;

  @JacksonXmlProperty ( localName = "InternalNotes" )
  protected String internalNotes;

  @JacksonXmlProperty ( localName = "ApplicationUnits" )
  protected String applicationUnits;

  @JacksonXmlProperty ( localName = "ApplicationLimit" )
  protected double applicationLimit;

  @JacksonXmlProperty ( localName = "ApplicationCycle" )
  protected String applicationCycle;

  @JacksonXmlProperty ( localName = "PeriodType" )
  protected String periodType;

  @JacksonXmlProperty ( localName = "ApplicationUnlimitedFlag" )
  protected boolean applicationUnlimited;

  @JacksonXmlProperty ( localName = "OneTimeFlag" )
  protected boolean oneTime;

  @JacksonXmlProperty ( localName = "CoverAgreementTime" )
  protected boolean coverAgreementTime;

  @JacksonXmlProperty ( localName = "CoverAgreementProduct" )
  protected boolean coverAgreementProduct;

  @JacksonXmlProperty ( localName = "CoverAgreementExpense" )
  protected boolean coverAgreementExpense;

  @JacksonXmlProperty ( localName = "CoverSalesTax" )
  protected boolean coverSalesTax;

  @JacksonXmlProperty ( localName = "CarryOverUnused" )
  protected boolean carryOverUnused;

  @JacksonXmlProperty ( localName = "AllowOverruns" )
  protected boolean allowOverruns;

  @JacksonXmlProperty ( localName = "ExpiredDays" )
  protected int expiredDays;

  @JacksonXmlProperty ( localName = "Limit" )
  protected int limit;

  @JacksonXmlProperty ( localName = "ExpireWhenZero" )
  protected boolean expireWhenZero;

  @JacksonXmlProperty ( localName = "ChargeToFirm" )
  protected boolean chargeToFirm;

  @JacksonXmlProperty ( localName = "EmployeeCompRate" )
  protected String employeeCompRate;

  @JacksonXmlProperty ( localName = "EmployeeCompNotExceed" )
  protected String employeeCompNotExceed;

  @JacksonXmlProperty ( localName = "CompHourlyRate" )
  protected double compHourlyRate;

  @JacksonXmlProperty ( localName = "CompLimitAmount" )
  protected double compLimitAmount;

  @JacksonXmlProperty ( localName = "BillCycleId" )
  protected int billCycleId;

  @JacksonXmlProperty ( localName = "BillOneTimeFlag" )
  protected boolean billOneTime;

  @JacksonXmlProperty ( localName = "BillTermsId" )
  protected int billTermsId;

  @JacksonXmlProperty ( localName = "InvoicingCycle" )
  protected String invoicingCycle;

  @JacksonXmlProperty ( localName = "BillToCompanyId" )
  protected int billToCompanyId;

  @JacksonXmlProperty ( localName = "BillToAddressId" )
  protected int billToAddressId;

  @JacksonXmlProperty ( localName = "BillAmount" )
  protected double billAmount;

  @JacksonXmlProperty ( localName = "Taxable" )
  protected boolean taxable;

  @JacksonXmlProperty ( localName = "ProrateFirstBill" )
  protected double prorateFirstBill;

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
  @JacksonXmlProperty ( localName = "BillStartDate" )
  protected Date billStartDate;

  @JacksonXmlProperty ( localName = "TaxCodeId" )
  protected int taxCodeId;

  @JacksonXmlProperty ( localName = "RestrictDownPayment" )
  protected boolean restrictDownPayment;

  @JacksonXmlProperty ( localName = "InvoiceDescription" )
  protected String invoiceDescription;

  @JacksonXmlProperty ( localName = "TopComment" )
  protected boolean topComment;

  @JacksonXmlProperty ( localName = "BottomComment" )
  protected boolean bottomComment;

  @JacksonXmlProperty ( localName = "WorkRoleId" )
  protected int workRoleId;

  @JacksonXmlProperty ( localName = "WorkTypeId" )
  protected int workTypeId;

  @JacksonXmlProperty ( localName = "ProjectTypeId" )
  protected int projectTypeId;

  @JacksonXmlProperty ( localName = "InvoiceTemplateId" )
  protected int invoiceTemplateId;

  @JacksonXmlProperty ( localName = "BillTime" )
  protected String billTime;

  @JacksonXmlProperty ( localName = "BillExpenses" )
  protected String billExpenses;

  @JacksonXmlProperty ( localName = "BillProducts" )
  protected String billProducts;

  @JacksonXmlProperty ( localName = "BillableTimeInvoice" )
  protected boolean billableTimeInvoice;

  @JacksonXmlProperty ( localName = "BillableExpenseInvoice" )
  protected boolean billableExpenseInvoice;

  @JacksonXmlProperty ( localName = "BillableProductInvoice" )
  protected boolean billableProductInvoice;

  public int getAgreementTypeId ()
  {
    return agreementTypeId;
  }

  public void setAgreementTypeId ( int agreementTypeId )
  {
    this.agreementTypeId = agreementTypeId;
  }

  public String getAgreementName ()
  {
    return agreementName;
  }

  public void setAgreementName ( String agreementName )
  {
    this.agreementName = agreementName;
  }

  public int getParentAgreementId ()
  {
    return parentAgreementId;
  }

  public void setParentAgreementId ( int parentAgreementId )
  {
    this.parentAgreementId = parentAgreementId;
  }

  public int getCompanyId ()
  {
    return companyId;
  }

  public void setCompanyId ( int companyId )
  {
    this.companyId = companyId;
  }

  public int getContactId ()
  {
    return contactId;
  }

  public void setContactId ( int contactId )
  {
    this.contactId = contactId;
  }

  public String getCustomerPo ()
  {
    return customerPo;
  }

  public void setCustomerPo ( String customerPo )
  {
    this.customerPo = customerPo;
  }

  public int getLocationId ()
  {
    return locationId;
  }

  public void setLocationId ( int locationId )
  {
    this.locationId = locationId;
  }

  public int getDepartmentId ()
  {
    return departmentId;
  }

  public void setDepartmentId ( int departmentId )
  {
    this.departmentId = departmentId;
  }

  public boolean isRestrictLocation ()
  {
    return restrictLocation;
  }

  public void setRestrictLocation ( boolean restrictLocation )
  {
    this.restrictLocation = restrictLocation;
  }

  public boolean isRestrictDepartment ()
  {
    return restrictDepartment;
  }

  public void setRestrictDepartment ( boolean restrictDepartment )
  {
    this.restrictDepartment = restrictDepartment;
  }

  public Date getStartDate ()
  {
    return startDate;
  }

  public void setStartDate ( Date startDate )
  {
    this.startDate = startDate;
  }

  public Date getEndDate ()
  {
    return endDate;
  }

  public void setEndDate ( Date endDate )
  {
    this.endDate = endDate;
  }

  public boolean isNoEndingDate ()
  {
    return noEndingDate;
  }

  public void setNoEndingDate ( boolean noEndingDate )
  {
    this.noEndingDate = noEndingDate;
  }

  public int getOpportunityId ()
  {
    return opportunityId;
  }

  public void setOpportunityId ( int opportunityId )
  {
    this.opportunityId = opportunityId;
  }

  public boolean isCancelled ()
  {
    return cancelled;
  }

  public void setCancelled ( boolean cancelled )
  {
    this.cancelled = cancelled;
  }

  public Date getDateCancelled ()
  {
    return dateCancelled;
  }

  public void setDateCancelled ( Date dateCancelled )
  {
    this.dateCancelled = dateCancelled;
  }

  public String getReasonCancelled ()
  {
    return reasonCancelled;
  }

  public void setReasonCancelled ( String reasonCancelled )
  {
    this.reasonCancelled = reasonCancelled;
  }

  public int getSlaId ()
  {
    return slaId;
  }

  public void setSlaId ( int slaId )
  {
    this.slaId = slaId;
  }

  public int getSubContractCompanyId ()
  {
    return subContractCompanyId;
  }

  public void setSubContractCompanyId ( int subContractCompanyId )
  {
    this.subContractCompanyId = subContractCompanyId;
  }

  public int getSubContractContactId ()
  {
    return subContractContactId;
  }

  public void setSubContractContactId ( int subContractContactId )
  {
    this.subContractContactId = subContractContactId;
  }

  public String getWorkOrder ()
  {
    return workOrder;
  }

  public void setWorkOrder ( String workOrder )
  {
    this.workOrder = workOrder;
  }

  public String getInternalNotes ()
  {
    return internalNotes;
  }

  public void setInternalNotes ( String internalNotes )
  {
    this.internalNotes = internalNotes;
  }

  public String getApplicationUnits ()
  {
    return applicationUnits;
  }

  public void setApplicationUnits ( String applicationUnits )
  {
    this.applicationUnits = applicationUnits;
  }

  public double getApplicationLimit ()
  {
    return applicationLimit;
  }

  public void setApplicationLimit ( double applicationLimit )
  {
    this.applicationLimit = applicationLimit;
  }

  public String getApplicationCycle ()
  {
    return applicationCycle;
  }

  public void setApplicationCycle ( String applicationCycle )
  {
    this.applicationCycle = applicationCycle;
  }

  public String getPeriodType ()
  {
    return periodType;
  }

  public void setPeriodType ( String periodType )
  {
    this.periodType = periodType;
  }

  public boolean isApplicationUnlimited ()
  {
    return applicationUnlimited;
  }

  public void setApplicationUnlimited ( boolean applicationUnlimited )
  {
    this.applicationUnlimited = applicationUnlimited;
  }

  public boolean isOneTime ()
  {
    return oneTime;
  }

  public void setOneTime ( boolean oneTime )
  {
    this.oneTime = oneTime;
  }

  public boolean isCoverAgreementTime ()
  {
    return coverAgreementTime;
  }

  public void setCoverAgreementTime ( boolean coverAgreementTime )
  {
    this.coverAgreementTime = coverAgreementTime;
  }

  public boolean isCoverAgreementProduct ()
  {
    return coverAgreementProduct;
  }

  public void setCoverAgreementProduct ( boolean coverAgreementProduct )
  {
    this.coverAgreementProduct = coverAgreementProduct;
  }

  public boolean isCoverAgreementExpense ()
  {
    return coverAgreementExpense;
  }

  public void setCoverAgreementExpense ( boolean coverAgreementExpense )
  {
    this.coverAgreementExpense = coverAgreementExpense;
  }

  public boolean isCoverSalesTax ()
  {
    return coverSalesTax;
  }

  public void setCoverSalesTax ( boolean coverSalesTax )
  {
    this.coverSalesTax = coverSalesTax;
  }

  public boolean isCarryOverUnused ()
  {
    return carryOverUnused;
  }

  public void setCarryOverUnused ( boolean carryOverUnused )
  {
    this.carryOverUnused = carryOverUnused;
  }

  public boolean isAllowOverruns ()
  {
    return allowOverruns;
  }

  public void setAllowOverruns ( boolean allowOverruns )
  {
    this.allowOverruns = allowOverruns;
  }

  public int getExpiredDays ()
  {
    return expiredDays;
  }

  public void setExpiredDays ( int expiredDays )
  {
    this.expiredDays = expiredDays;
  }

  public int getLimit ()
  {
    return limit;
  }

  public void setLimit ( int limit )
  {
    this.limit = limit;
  }

  public boolean isExpireWhenZero ()
  {
    return expireWhenZero;
  }

  public void setExpireWhenZero ( boolean expireWhenZero )
  {
    this.expireWhenZero = expireWhenZero;
  }

  public boolean isChargeToFirm ()
  {
    return chargeToFirm;
  }

  public void setChargeToFirm ( boolean chargeToFirm )
  {
    this.chargeToFirm = chargeToFirm;
  }

  public String getEmployeeCompRate ()
  {
    return employeeCompRate;
  }

  public void setEmployeeCompRate ( String employeeCompRate )
  {
    this.employeeCompRate = employeeCompRate;
  }

  public String getEmployeeCompNotExceed ()
  {
    return employeeCompNotExceed;
  }

  public void setEmployeeCompNotExceed ( String employeeCompNotExceed )
  {
    this.employeeCompNotExceed = employeeCompNotExceed;
  }

  public double getCompHourlyRate ()
  {
    return compHourlyRate;
  }

  public void setCompHourlyRate ( double compHourlyRate )
  {
    this.compHourlyRate = compHourlyRate;
  }

  public double getCompLimitAmount ()
  {
    return compLimitAmount;
  }

  public void setCompLimitAmount ( double compLimitAmount )
  {
    this.compLimitAmount = compLimitAmount;
  }

  public int getBillCycleId ()
  {
    return billCycleId;
  }

  public void setBillCycleId ( int billCycleId )
  {
    this.billCycleId = billCycleId;
  }

  public boolean isBillOneTime ()
  {
    return billOneTime;
  }

  public void setBillOneTime ( boolean billOneTime )
  {
    this.billOneTime = billOneTime;
  }

  public int getBillTermsId ()
  {
    return billTermsId;
  }

  public void setBillTermsId ( int billTermsId )
  {
    this.billTermsId = billTermsId;
  }

  public String getInvoicingCycle ()
  {
    return invoicingCycle;
  }

  public void setInvoicingCycle ( String invoicingCycle )
  {
    this.invoicingCycle = invoicingCycle;
  }

  public int getBillToCompanyId ()
  {
    return billToCompanyId;
  }

  public void setBillToCompanyId ( int billToCompanyId )
  {
    this.billToCompanyId = billToCompanyId;
  }

  public int getBillToAddressId ()
  {
    return billToAddressId;
  }

  public void setBillToAddressId ( int billToAddressId )
  {
    this.billToAddressId = billToAddressId;
  }

  public double getBillAmount ()
  {
    return billAmount;
  }

  public void setBillAmount ( double billAmount )
  {
    this.billAmount = billAmount;
  }

  public boolean isTaxable ()
  {
    return taxable;
  }

  public void setTaxable ( boolean taxable )
  {
    this.taxable = taxable;
  }

  public double getProrateFirstBill ()
  {
    return prorateFirstBill;
  }

  public void setProrateFirstBill ( double prorateFirstBill )
  {
    this.prorateFirstBill = prorateFirstBill;
  }

  public Date getBillStartDate ()
  {
    return billStartDate;
  }

  public void setBillStartDate ( Date billStartDate )
  {
    this.billStartDate = billStartDate;
  }

  public int getTaxCodeId ()
  {
    return taxCodeId;
  }

  public void setTaxCodeId ( int taxCodeId )
  {
    this.taxCodeId = taxCodeId;
  }

  public boolean isRestrictDownPayment ()
  {
    return restrictDownPayment;
  }

  public void setRestrictDownPayment ( boolean restrictDownPayment )
  {
    this.restrictDownPayment = restrictDownPayment;
  }

  public String getInvoiceDescription ()
  {
    return invoiceDescription;
  }

  public void setInvoiceDescription ( String invoiceDescription )
  {
    this.invoiceDescription = invoiceDescription;
  }

  public boolean isTopComment ()
  {
    return topComment;
  }

  public void setTopComment ( boolean topComment )
  {
    this.topComment = topComment;
  }

  public boolean isBottomComment ()
  {
    return bottomComment;
  }

  public void setBottomComment ( boolean bottomComment )
  {
    this.bottomComment = bottomComment;
  }

  public int getWorkRoleId ()
  {
    return workRoleId;
  }

  public void setWorkRoleId ( int workRoleId )
  {
    this.workRoleId = workRoleId;
  }

  public int getWorkTypeId ()
  {
    return workTypeId;
  }

  public void setWorkTypeId ( int workTypeId )
  {
    this.workTypeId = workTypeId;
  }

  public int getProjectTypeId ()
  {
    return projectTypeId;
  }

  public void setProjectTypeId ( int projectTypeId )
  {
    this.projectTypeId = projectTypeId;
  }

  public int getInvoiceTemplateId ()
  {
    return invoiceTemplateId;
  }

  public void setInvoiceTemplateId ( int invoiceTemplateId )
  {
    this.invoiceTemplateId = invoiceTemplateId;
  }

  public String getBillTime ()
  {
    return billTime;
  }

  public void setBillTime ( String billTime )
  {
    this.billTime = billTime;
  }

  public String getBillExpenses ()
  {
    return billExpenses;
  }

  public void setBillExpenses ( String billExpenses )
  {
    this.billExpenses = billExpenses;
  }

  public String getBillProducts ()
  {
    return billProducts;
  }

  public void setBillProducts ( String billProducts )
  {
    this.billProducts = billProducts;
  }

  public boolean isBillableTimeInvoice ()
  {
    return billableTimeInvoice;
  }

  public void setBillableTimeInvoice ( boolean billableTimeInvoice )
  {
    this.billableTimeInvoice = billableTimeInvoice;
  }

  public boolean isBillableExpenseInvoice ()
  {
    return billableExpenseInvoice;
  }

  public void setBillableExpenseInvoice ( boolean billableExpenseInvoice )
  {
    this.billableExpenseInvoice = billableExpenseInvoice;
  }

  public boolean isBillableProductInvoice ()
  {
    return billableProductInvoice;
  }

  public void setBillableProductInvoice ( boolean billableProductInvoice )
  {
    this.billableProductInvoice = billableProductInvoice;
  }
}
