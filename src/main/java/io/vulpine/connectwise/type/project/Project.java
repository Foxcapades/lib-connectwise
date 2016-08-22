package io.vulpine.connectwise.type.project;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.vulpine.connectwise.type.CwObject;

import java.util.Date;

@SuppressWarnings( "unused" )
public class Project extends CwObject
{

  @JacksonXmlProperty(localName = "ProjectName")
  protected String projectName;

  @JacksonXmlProperty(localName = "CompanyId")
  protected int companyId;

  @JacksonXmlProperty(localName = "AddressId")
  protected int addressId;

  @JacksonXmlProperty(localName = "OpportunityId")
  protected int opportunityId;

  @JacksonXmlProperty(localName = "ContactId")
  protected int contactId;

  @JacksonXmlProperty(localName = "ProjectManagerId")
  protected int projectManagerId;

  @JacksonXmlProperty(localName = "ProjectTypeId")
  protected int projectTypeId;

  @JacksonXmlProperty(localName = "BillingMethodIdentifier")
  protected BillMethod billingMethodIdentifier;

  @JacksonXmlProperty(localName = "EstimatedRevenue")
  protected double estimatedRevenue;

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
  @JacksonXmlProperty(localName = "EstimatedStart")
  protected Date estimatedStart;

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
  @JacksonXmlProperty(localName = "EstimatedEnd")
  protected Date estimatedEnd;

  @JacksonXmlProperty(localName = "EstimatedHours")
  protected double estimatedHours;

  @JacksonXmlProperty(localName = "Status")
  protected String status;

  @JacksonXmlProperty(localName = "TimeApproverId")
  protected int timeApproverId;

  @JacksonXmlProperty(localName = "ExpenseApproverId")
  protected int expenseApproverId;

  @JacksonXmlProperty(localName = "BudgetFlag")
  protected boolean budgetFlag;

  @JacksonXmlProperty(localName = "BillingRateOption")
  protected String billingRateOption;

  @JacksonXmlProperty(localName = "HourlyRate")
  protected double hourlyRate;

  @JacksonXmlProperty(localName = "BillingAmount")
  protected double billingAmount;

  @JacksonXmlProperty(localName = "BillTime")
  protected BillFlag billTime;

  @JacksonXmlProperty(localName = "BillExpenses")
  protected BillFlag billExpenses;

  @JacksonXmlProperty(localName = "BillProducts")
  protected BillFlag billProducts;

  @JacksonXmlProperty(localName = "BillableTimeInvoice")
  protected boolean billableTimeInvoice;

  @JacksonXmlProperty(localName = "BillableExpenseInvoice")
  protected boolean billableExpenseInvoice;

  @JacksonXmlProperty(localName = "BillableProductInvoice")
  protected boolean billableProductInvoice;

  @JacksonXmlProperty(localName = "Downpayment")
  protected double downpayment;

  @JacksonXmlProperty(localName = "AgreementId")
  protected int agreementId;

  @JacksonXmlProperty(localName = "BillingAttention")
  protected String billingAttention;

  @JacksonXmlProperty(localName = "ProjectBoardId")
  protected int projectBoardId;

  @JacksonXmlProperty(localName = "CustomerPO")
  protected String customerPO;

  @JacksonXmlProperty(localName = "RestrictDownPayment")
  protected boolean restrictDownPayment;

  @JacksonXmlProperty(localName = "BillProjectAfterClosed")
  protected boolean billProjectAfterClosed;

  @JacksonXmlProperty(localName = "BillUnapprovedTimeAndExpense")
  protected boolean billUnapprovedTimeAndExpense;

  @JacksonXmlProperty(localName = "ProjectTemplateId")
  protected int projectTemplateId;

  public String getProjectName ()
  {
    return projectName;
  }

  public void setProjectName ( final String projectName )
  {
    this.projectName = projectName;
  }

  public int getCompanyId ()
  {
    return companyId;
  }

  public void setCompanyId ( final int companyId )
  {
    this.companyId = companyId;
  }

  public int getAddressId ()
  {
    return addressId;
  }

  public void setAddressId ( final int addressId )
  {
    this.addressId = addressId;
  }

  public int getOpportunityId ()
  {
    return opportunityId;
  }

  public void setOpportunityId ( final int opportunityId )
  {
    this.opportunityId = opportunityId;
  }

  public int getContactId ()
  {
    return contactId;
  }

  public void setContactId ( final int contactId )
  {
    this.contactId = contactId;
  }

  public int getProjectManagerId ()
  {
    return projectManagerId;
  }

  public void setProjectManagerId ( final int projectManagerId )
  {
    this.projectManagerId = projectManagerId;
  }

  public int getProjectTypeId ()
  {
    return projectTypeId;
  }

  public void setProjectTypeId ( final int projectTypeId )
  {
    this.projectTypeId = projectTypeId;
  }

  public BillMethod getBillingMethodIdentifier ()
  {
    return billingMethodIdentifier;
  }

  public void setBillingMethodIdentifier ( final BillMethod billingMethodIdentifier )
  {
    this.billingMethodIdentifier = billingMethodIdentifier;
  }

  public double getEstimatedRevenue ()
  {
    return estimatedRevenue;
  }

  public void setEstimatedRevenue ( final double estimatedRevenue )
  {
    this.estimatedRevenue = estimatedRevenue;
  }

  public Date getEstimatedStart ()
  {
    return estimatedStart;
  }

  public void setEstimatedStart ( final Date estimatedStart )
  {
    this.estimatedStart = estimatedStart;
  }

  public Date getEstimatedEnd ()
  {
    return estimatedEnd;
  }

  public void setEstimatedEnd ( final Date estimatedEnd )
  {
    this.estimatedEnd = estimatedEnd;
  }

  public double getEstimatedHours ()
  {
    return estimatedHours;
  }

  public void setEstimatedHours ( final double estimatedHours )
  {
    this.estimatedHours = estimatedHours;
  }

  public String getStatus ()
  {
    return status;
  }

  public void setStatus ( final String status )
  {
    this.status = status;
  }

  public int getTimeApproverId ()
  {
    return timeApproverId;
  }

  public void setTimeApproverId ( final int timeApproverId )
  {
    this.timeApproverId = timeApproverId;
  }

  public int getExpenseApproverId ()
  {
    return expenseApproverId;
  }

  public void setExpenseApproverId ( final int expenseApproverId )
  {
    this.expenseApproverId = expenseApproverId;
  }

  public boolean isBudgetFlag ()
  {
    return budgetFlag;
  }

  public void setBudgetFlag ( final boolean budgetFlag )
  {
    this.budgetFlag = budgetFlag;
  }

  public String getBillingRateOption ()
  {
    return billingRateOption;
  }

  public void setBillingRateOption ( final String billingRateOption )
  {
    this.billingRateOption = billingRateOption;
  }

  public double getHourlyRate ()
  {
    return hourlyRate;
  }

  public void setHourlyRate ( final double hourlyRate )
  {
    this.hourlyRate = hourlyRate;
  }

  public double getBillingAmount ()
  {
    return billingAmount;
  }

  public void setBillingAmount ( final double billingAmount )
  {
    this.billingAmount = billingAmount;
  }

  public BillFlag getBillTime ()
  {
    return billTime;
  }

  public void setBillTime ( final BillFlag billTime )
  {
    this.billTime = billTime;
  }

  public BillFlag getBillExpenses ()
  {
    return billExpenses;
  }

  public void setBillExpenses ( final BillFlag billExpenses )
  {
    this.billExpenses = billExpenses;
  }

  public BillFlag getBillProducts ()
  {
    return billProducts;
  }

  public void setBillProducts ( final BillFlag billProducts )
  {
    this.billProducts = billProducts;
  }

  public boolean isBillableTimeInvoice ()
  {
    return billableTimeInvoice;
  }

  public void setBillableTimeInvoice ( final boolean billableTimeInvoice )
  {
    this.billableTimeInvoice = billableTimeInvoice;
  }

  public boolean isBillableExpenseInvoice ()
  {
    return billableExpenseInvoice;
  }

  public void setBillableExpenseInvoice ( final boolean billableExpenseInvoice )
  {
    this.billableExpenseInvoice = billableExpenseInvoice;
  }

  public boolean isBillableProductInvoice ()
  {
    return billableProductInvoice;
  }

  public void setBillableProductInvoice ( final boolean billableProductInvoice )
  {
    this.billableProductInvoice = billableProductInvoice;
  }

  public double getDownpayment ()
  {
    return downpayment;
  }

  public void setDownpayment ( final double downpayment )
  {
    this.downpayment = downpayment;
  }

  public int getAgreementId ()
  {
    return agreementId;
  }

  public void setAgreementId ( final int agreementId )
  {
    this.agreementId = agreementId;
  }

  public String getBillingAttention ()
  {
    return billingAttention;
  }

  public void setBillingAttention ( final String billingAttention )
  {
    this.billingAttention = billingAttention;
  }

  public int getProjectBoardId ()
  {
    return projectBoardId;
  }

  public void setProjectBoardId ( final int projectBoardId )
  {
    this.projectBoardId = projectBoardId;
  }

  public String getCustomerPO ()
  {
    return customerPO;
  }

  public void setCustomerPO ( final String customerPO )
  {
    this.customerPO = customerPO;
  }

  public boolean isRestrictDownPayment ()
  {
    return restrictDownPayment;
  }

  public void setRestrictDownPayment ( final boolean restrictDownPayment )
  {
    this.restrictDownPayment = restrictDownPayment;
  }

  public boolean isBillProjectAfterClosed ()
  {
    return billProjectAfterClosed;
  }

  public void setBillProjectAfterClosed ( final boolean billProjectAfterClosed )
  {
    this.billProjectAfterClosed = billProjectAfterClosed;
  }

  public boolean isBillUnapprovedTimeAndExpense ()
  {
    return billUnapprovedTimeAndExpense;
  }

  public void setBillUnapprovedTimeAndExpense ( final boolean billUnapprovedTimeAndExpense )
  {
    this.billUnapprovedTimeAndExpense = billUnapprovedTimeAndExpense;
  }

  public int getProjectTemplateId ()
  {
    return projectTemplateId;
  }

  public void setProjectTemplateId ( final int projectTemplateId )
  {
    this.projectTemplateId = projectTemplateId;
  }
}
