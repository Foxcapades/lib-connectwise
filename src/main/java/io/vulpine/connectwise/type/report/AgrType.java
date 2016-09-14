package io.vulpine.connectwise.type.report;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.Date;

public class AgrType
{
  private int     id;
  private String  description;
  private boolean inactiveFlag;
  private int     owner_Level_RecID;
  private boolean oL_Restrict_Flag;
  private String  location;
  private int     billing_Unit_RecID;
  private boolean bU_Restrict_Flag;
  private String  busGroup;
  private String  updatedBy;
  private Date    lastUpdate;
  private String  timezone;
  private int     sR_Urgency_RecID;
  private int     aGR_Detail_Type_RecID;
  private int     billCycleId;
  private String  invoiceDescription;
  private double  billAmount;
  private boolean calc_Flag;
  private boolean oneTime;
  private int     activity_Class_RecID;
  private int     activity_Type_RecID;
  private boolean commentAtTop;
  private boolean commentAtBottom;
  private boolean tE_InvCust_Flag;
  private boolean eX_InvCust_Flag;
  private boolean iV_InvCust_Flag;
  private boolean tE_Billable_Flag;
  private boolean tE_Invoice_Flag;
  private boolean billableExpenseInvoice;
  private boolean eX_Invoice_Flag;
  private boolean iV_Billable_Flag;
  private boolean iV_Invoice_Flag;
  private boolean taxable;
  private double  tE_Amount;
  private boolean tE_UseBill_Flag;
  private boolean defaultFlag;
  private double  pP_Amount;
  private boolean applicationLimitUnlimited;
  private boolean availablePerOneTime;
  private String  applicationCycle;
  private boolean agreementCoversTime;
  private boolean agreementCoversExpenses;
  private boolean agreementCoversProducts;
  private boolean pP_Expire_Flag;
  private boolean carryOverUnused;
  private int     carryoverDays;
  private boolean allowOverruns;
  private int     overrunLimit;
  private boolean prepayment;
  private boolean preSuf_Flag;
  private String  invoice_PreSuf;
  private boolean restrict_DP_Flag;
  private int     billTermsId;
  private int     slaId;
  private String  tE_AmtOption;
  private boolean chargeToFirm;
  private String  cycleBasis_ID;
  private boolean coverSalesTax;
  private int     pM_Type_RecID;
  private boolean tE_UseRate_Flag;
  private boolean tE_UseAmt_Flag;
  private int     invTemplateId;
  private String  employeeCompRate;
  private double  compHourlyRate;
  private String  employeeCompNotExceed;
  private double  compLimitAmount;
  private boolean copyWorkRoles;
  private boolean copyWorkTypes;
  private String  detailTypeId;
  private int     invTemplateCustomId;

  @JsonSetter( "AGR_Detail_Type_RecID" )
  public void aGR_Detail_Type_RecID( final int aGR_Detail_Type_RecID )
  {
    this.aGR_Detail_Type_RecID = aGR_Detail_Type_RecID;
  }

  @JsonGetter( "AGR_Detail_Type_RecID" )
  public int aGR_Detail_Type_RecID()
  {
    return aGR_Detail_Type_RecID;
  }

  @JsonSetter( "Activity_Class_RecID" )
  public void activity_Class_RecID( final int activity_Class_RecID )
  {
    this.activity_Class_RecID = activity_Class_RecID;
  }

  @JsonGetter( "Activity_Class_RecID" )
  public int activity_Class_RecID()
  {
    return activity_Class_RecID;
  }

  @JsonSetter( "Activity_Type_RecID" )
  public void activity_Type_RecID( final int activity_Type_RecID )
  {
    this.activity_Type_RecID = activity_Type_RecID;
  }

  @JsonGetter( "Activity_Type_RecID" )
  public int activity_Type_RecID()
  {
    return activity_Type_RecID;
  }

  @JsonSetter( "Overrun_Flag" )
  public void allowOverruns( final boolean allowOverruns )
  {
    this.allowOverruns = allowOverruns;
  }

  @JsonGetter( "Overrun_Flag" )
  public boolean allowOverruns()
  {
    return allowOverruns;
  }

  @JsonSetter( "AppCycle_ID" )
  public void applicationCycle( final String applicationCycle )
  {
    this.applicationCycle = applicationCycle;
  }

  @JsonGetter( "AppCycle_ID" )
  public String applicationCycle()
  {
    return applicationCycle;
  }

  @JsonSetter( "PP_Unlimited_Flag" )
  public void applicationUnlimited( final boolean applicationLimitUnlimited )
  {
    this.applicationLimitUnlimited = applicationLimitUnlimited;
  }

  @JsonGetter( "PP_Unlimited_Flag" )
  public boolean applicationUnlimited()
  {
    return applicationLimitUnlimited;
  }

  @JsonGetter( "BL_InvTemplate_Custom_RecID" )
  public int bL_InvTemplate_Custom_RecID()
  {
    return invTemplateCustomId;
  }

  @JsonSetter( "BL_InvTemplate_Custom_RecID" )
  public void bL_InvTemplate_Custom_RecID( final int invTemplateCustomId )
  {
    this.invTemplateCustomId = invTemplateCustomId;
  }

  @JsonSetter( "BU_Restrict_Flag" )
  public void bU_Restrict_Flag( final boolean bU_Restrict_Flag )
  {
    this.bU_Restrict_Flag = bU_Restrict_Flag;
  }

  @JsonGetter( "BU_Restrict_Flag" )
  public boolean bU_Restrict_Flag()
  {
    return bU_Restrict_Flag;
  }

  @JsonSetter( "Bill_Amount" )
  public void billAmount( final double billAmount )
  {
    this.billAmount = billAmount;
  }

  @JsonGetter( "Bill_Amount" )
  public double billAmount()
  {
    return billAmount;
  }

  @JsonSetter( "Bill_Cycle_RecID" )
  public void billCycleId( final int billCycleId )
  {
    this.billCycleId = billCycleId;
  }

  @JsonGetter( "Bill_Cycle_RecID" )
  public int billCycleId()
  {
    return billCycleId;
  }

  @JsonSetter( "PP_One_Time_Flag" )
  public void billOneTime( final boolean availablePerOneTime )
  {
    this.availablePerOneTime = availablePerOneTime;
  }

  @JsonGetter( "PP_One_Time_Flag" )
  public boolean billOneTime()
  {
    return availablePerOneTime;
  }

  @JsonSetter( "Billing_Terms_RecID" )
  public void billTermsId( final int billTermsId )
  {
    this.billTermsId = billTermsId;
  }

  @JsonGetter( "Billing_Terms_RecID" )
  public int billTermsId()
  {
    return billTermsId;
  }

  @JsonSetter( "EX_Billable_Flag" )
  public void billableExpenseInvoice( final boolean billableExpenseInvoice )
  {
    this.billableExpenseInvoice = billableExpenseInvoice;
  }

  @JsonGetter( "EX_Billable_Flag" )
  public boolean billableExpenseInvoice()
  {
    return billableExpenseInvoice;
  }

  @JsonSetter( "Billing_Unit_RecID" )
  public void billing_Unit_RecID( final int billing_Unit_RecID )
  {
    this.billing_Unit_RecID = billing_Unit_RecID;
  }

  @JsonGetter( "Billing_Unit_RecID" )
  public int billing_Unit_RecID()
  {
    return billing_Unit_RecID;
  }

  @JsonGetter( "BottomComment_Flag" )
  public boolean bottomComment()
  {
    return commentAtBottom;
  }

  @JsonSetter( "BottomComment_Flag" )
  public void bottomComment( final boolean commentAtBottom )
  {
    this.commentAtBottom = commentAtBottom;
  }

  @JsonSetter( "BusGroup" )
  public void busGroup( final String busGroup )
  {
    this.busGroup = busGroup;
  }

  @JsonGetter( "BusGroup" )
  public String busGroup()
  {
    return busGroup;
  }

  @JsonSetter( "Calc_Flag" )
  public void calc_Flag( final boolean calc_Flag )
  {
    this.calc_Flag = calc_Flag;
  }

  @JsonGetter( "Calc_Flag" )
  public boolean calc_Flag()
  {
    return calc_Flag;
  }

  @JsonSetter( "PP_Carryover_Flag" )
  public void carryOverUnused( final boolean carryOverUnused )
  {
    this.carryOverUnused = carryOverUnused;
  }

  @JsonGetter( "PP_Carryover_Flag" )
  public boolean carryOverUnused()
  {
    return carryOverUnused;
  }

  @JsonSetter( "Charge_Firm_Flag" )
  public void chargeToFirm( final boolean chargeToFirm )
  {
    this.chargeToFirm = chargeToFirm;
  }

  @JsonGetter( "Charge_Firm_Flag" )
  public boolean chargeToFirm()
  {
    return chargeToFirm;
  }

  @JsonSetter( "Comp_Rate_Amount" )
  public void compHourlyRate( final double compHourlyRate )
  {
    this.compHourlyRate = compHourlyRate;
  }

  @JsonGetter( "Comp_Rate_Amount" )
  public double compHourlyRate()
  {
    return compHourlyRate;
  }

  @JsonSetter( "Comp_Limit_Amount" )
  public void compLimitAmount( final double compLimitAmount )
  {
    this.compLimitAmount = compLimitAmount;
  }

  @JsonGetter( "Comp_Limit_Amount" )
  public double compLimitAmount()
  {
    return compLimitAmount;
  }

  @JsonSetter( "Copy_Work_Roles_Flag" )
  public void copyWorkRoles( final boolean copyWorkRoles )
  {
    this.copyWorkRoles = copyWorkRoles;
  }

  @JsonGetter( "Copy_Work_Roles_Flag" )
  public boolean copyWorkRoles()
  {
    return copyWorkRoles;
  }

  @JsonSetter( "Copy_Work_Types_Flag" )
  public void copyWorkTypes( final boolean copyWorkTypes )
  {
    this.copyWorkTypes = copyWorkTypes;
  }

  @JsonGetter( "Copy_Work_Types_Flag" )
  public boolean copyWorkTypes()
  {
    return copyWorkTypes;
  }

  @JsonSetter( "PP_Expenses_Flag" )
  public void coverAgreementExpense( final boolean agreementCoversExpenses )
  {
    this.agreementCoversExpenses = agreementCoversExpenses;
  }

  @JsonGetter( "PP_Expenses_Flag" )
  public boolean coverAgreementExpense()
  {
    return agreementCoversExpenses;
  }

  @JsonSetter( "PP_Products_Flag" )
  public void coverAgreementProduct( final boolean agreementCoversProducts )
  {
    this.agreementCoversProducts = agreementCoversProducts;
  }

  @JsonGetter( "PP_Products_Flag" )
  public boolean coverAgreementProduct()
  {
    return agreementCoversProducts;
  }

  @JsonSetter( "PP_Time_Flag" )
  public void coverAgreementTime( final boolean agreementCoversTime )
  {
    this.agreementCoversTime = agreementCoversTime;
  }

  @JsonGetter( "PP_Time_Flag" )
  public boolean coverAgreementTime()
  {
    return agreementCoversTime;
  }

  @JsonSetter( "PP_Tax_Flag" )
  public void coverSalesTax( final boolean coverSalesTax )
  {
    this.coverSalesTax = coverSalesTax;
  }

  @JsonGetter( "PP_Tax_Flag" )
  public boolean coverSalesTax()
  {
    return coverSalesTax;
  }

  @JsonSetter( "CycleBasis_ID" )
  public void cycleBasis_ID( final String cycleBasis_ID )
  {
    this.cycleBasis_ID = cycleBasis_ID;
  }

  @JsonGetter( "CycleBasis_ID" )
  public String cycleBasis_ID()
  {
    return cycleBasis_ID;
  }

  @JsonSetter( "AGR_Default_Flag" )
  public void defaultFlag( final boolean defaultFlag )
  {
    this.defaultFlag = defaultFlag;
  }

  @JsonGetter( "AGR_Default_Flag" )
  public boolean defaultFlag()
  {
    return defaultFlag;
  }

  @JsonSetter( "AGR_Type_Desc" )
  public void description( final String description )
  {
    this.description = description;
  }

  @JsonGetter( "AGR_Type_Desc" )
  public String description()
  {
    return description;
  }

  @JsonSetter( "AGR_Detail_Type_ID" )
  public void detailTypeId( final String detailTypeId )
  {
    this.detailTypeId = detailTypeId;
  }

  @JsonGetter( "AGR_Detail_Type_ID" )
  public String detailTypeId()
  {
    return detailTypeId;
  }

  @JsonSetter( "EX_InvCust_Flag" )
  public void eX_InvCust_Flag( final boolean eX_InvCust_Flag )
  {
    this.eX_InvCust_Flag = eX_InvCust_Flag;
  }

  @JsonGetter( "EX_InvCust_Flag" )
  public boolean eX_InvCust_Flag()
  {
    return eX_InvCust_Flag;
  }

  @JsonSetter( "EX_Invoice_Flag" )
  public void eX_Invoice_Flag( final boolean eX_Invoice_Flag )
  {
    this.eX_Invoice_Flag = eX_Invoice_Flag;
  }

  @JsonGetter( "EX_Invoice_Flag" )
  public boolean eX_Invoice_Flag()
  {
    return eX_Invoice_Flag;
  }

  @JsonSetter( "Comp_Limit_Option" )
  public void employeeCompNotExceed( final String employeeCompNotExceed )
  {
    this.employeeCompNotExceed = employeeCompNotExceed;
  }

  @JsonGetter( "Comp_Limit_Option" )
  public String employeeCompNotExceed()
  {
    return employeeCompNotExceed;
  }

  @JsonSetter( "Comp_Rate_Option" )
  public void employeeCompRate( final String employeeCompRate )
  {
    this.employeeCompRate = employeeCompRate;
  }

  @JsonGetter( "Comp_Rate_Option" )
  public String employeeCompRate()
  {
    return employeeCompRate;
  }

  @JsonSetter( "Carryover_Days" )
  public void expiredDays( final int carryoverDays )
  {
    this.carryoverDays = carryoverDays;
  }

  @JsonGetter( "Carryover_Days" )
  public int expiredDays()
  {
    return carryoverDays;
  }

  @JsonSetter( "IV_Billable_Flag" )
  public void iV_Billable_Flag( final boolean iV_Billable_Flag )
  {
    this.iV_Billable_Flag = iV_Billable_Flag;
  }

  @JsonGetter( "IV_Billable_Flag" )
  public boolean iV_Billable_Flag()
  {
    return iV_Billable_Flag;
  }

  @JsonSetter( "IV_InvCust_Flag" )
  public void iV_InvCust_Flag( final boolean iV_InvCust_Flag )
  {
    this.iV_InvCust_Flag = iV_InvCust_Flag;
  }

  @JsonGetter( "IV_InvCust_Flag" )
  public boolean iV_InvCust_Flag()
  {
    return iV_InvCust_Flag;
  }

  @JsonSetter( "IV_Invoice_Flag" )
  public void iV_Invoice_Flag( final boolean iV_Invoice_Flag )
  {
    this.iV_Invoice_Flag = iV_Invoice_Flag;
  }

  @JsonGetter( "IV_Invoice_Flag" )
  public boolean iV_Invoice_Flag()
  {
    return iV_Invoice_Flag;
  }

  @JsonSetter( "AGR_Type_RecID" )
  public void id( final int id )
  {
    this.id = id;
  }

  @JsonGetter( "AGR_Type_RecID" )
  public int id()
  {
    return id;
  }

  @JsonGetter( "AGR_Inactive_Flag" )
  public boolean inactive()
  {
    return inactiveFlag;
  }

  @JsonSetter( "AGR_Inactive_Flag" )
  public void inactive( final boolean inactiveFlag )
  {
    this.inactiveFlag = inactiveFlag;
  }

  @JsonSetter( "Invoice_Desc" )
  public void invoiceDescription( final String invoiceDescription )
  {
    this.invoiceDescription = invoiceDescription;
  }

  @JsonGetter( "Invoice_Desc" )
  public String invoiceDescription()
  {
    return invoiceDescription;
  }

  @JsonSetter( "bl_invTemplate_recid" )
  public void invoiceTemplateId( final int invTemplateId )
  {
    this.invTemplateId = invTemplateId;
  }

  @JsonGetter( "bl_invTemplate_recid" )
  public int invoiceTemplateId()
  {
    return invTemplateId;
  }

  @JsonSetter( "Invoice_PreSuf" )
  public void invoice_PreSuf( final String invoice_PreSuf )
  {
    this.invoice_PreSuf = invoice_PreSuf;
  }

  @JsonGetter( "Invoice_PreSuf" )
  public String invoice_PreSuf()
  {
    return invoice_PreSuf;
  }

  @JsonSetter( "Last_Update" )
  public void lastUpdate( final Date lastUpdate )
  {
    this.lastUpdate = lastUpdate;
  }

  @JsonGetter( "Last_Update" )
  public Date lastUpdate()
  {
    return lastUpdate;
  }

  @JsonGetter( "Overrun_Limit" )
  public int limit()
  {
    return overrunLimit;
  }

  @JsonSetter( "Overrun_Limit" )
  public void limit( final int overrunLimit )
  {
    this.overrunLimit = overrunLimit;
  }

  @JsonSetter( "location" )
  public void location( final String location )
  {
    this.location = location;
  }

  @JsonGetter( "location" )
  public String location()
  {
    return location;
  }

  @JsonSetter( "OL_Restrict_Flag" )
  public void oL_Restrict_Flag( final boolean oL_Restrict_Flag )
  {
    this.oL_Restrict_Flag = oL_Restrict_Flag;
  }

  @JsonGetter( "OL_Restrict_Flag" )
  public boolean oL_Restrict_Flag()
  {
    return oL_Restrict_Flag;
  }

  @JsonSetter( "OneTime_Flag" )
  public void oneTime( final boolean oneTime )
  {
    this.oneTime = oneTime;
  }

  @JsonGetter( "OneTime_Flag" )
  public boolean oneTime()
  {
    return oneTime;
  }

  @JsonSetter( "Owner_Level_RecID" )
  public void owner_Level_RecID( final int owner_Level_RecID )
  {
    this.owner_Level_RecID = owner_Level_RecID;
  }

  @JsonGetter( "Owner_Level_RecID" )
  public int owner_Level_RecID()
  {
    return owner_Level_RecID;
  }

  @JsonSetter( "PM_Type_RecID" )
  public void pM_Type_RecID( final int pM_Type_RecID )
  {
    this.pM_Type_RecID = pM_Type_RecID;
  }

  @JsonGetter( "PM_Type_RecID" )
  public int pM_Type_RecID()
  {
    return pM_Type_RecID;
  }

  @JsonSetter( "PP_Amount" )
  public void pP_Amount( final double pP_Amount )
  {
    this.pP_Amount = pP_Amount;
  }

  @JsonGetter( "PP_Amount" )
  public double pP_Amount()
  {
    return pP_Amount;
  }

  @JsonSetter( "PP_Expire_Flag" )
  public void pP_Expire_Flag( final boolean pP_Expire_Flag )
  {
    this.pP_Expire_Flag = pP_Expire_Flag;
  }

  @JsonGetter( "PP_Expire_Flag" )
  public boolean pP_Expire_Flag()
  {
    return pP_Expire_Flag;
  }

  @JsonSetter( "PreSuf_Flag" )
  public void preSuf_Flag( final boolean preSuf_Flag )
  {
    this.preSuf_Flag = preSuf_Flag;
  }

  @JsonGetter( "PreSuf_Flag" )
  public boolean preSuf_Flag()
  {
    return preSuf_Flag;
  }

  @JsonGetter( "Prepay_Flag" )
  public boolean prepay_Flag()
  {
    return prepayment;
  }

  @JsonSetter( "Prepay_Flag" )
  public void prepayment( final boolean prepayment )
  {
    this.prepayment = prepayment;
  }

  @JsonSetter( "Restrict_DP_Flag" )
  public void restrict_DP_Flag( final boolean restrict_DP_Flag )
  {
    this.restrict_DP_Flag = restrict_DP_Flag;
  }

  @JsonGetter( "Restrict_DP_Flag" )
  public boolean restrict_DP_Flag()
  {
    return restrict_DP_Flag;
  }

  @JsonSetter( "SR_Urgency_RecID" )
  public void sR_Urgency_RecID( final int sR_Urgency_RecID )
  {
    this.sR_Urgency_RecID = sR_Urgency_RecID;
  }

  @JsonGetter( "SR_Urgency_RecID" )
  public int sR_Urgency_RecID()
  {
    return sR_Urgency_RecID;
  }

  @JsonGetter( "SR_SLA_RecID" )
  public int slaId()
  {
    return slaId;
  }

  @JsonSetter( "SR_SLA_RecID" )
  public void slaId( final int slaId )
  {
    this.slaId = slaId;
  }

  @JsonSetter( "TE_Amount" )
  public void tE_Amount( final double tE_Amount )
  {
    this.tE_Amount = tE_Amount;
  }

  @JsonGetter( "TE_Amount" )
  public double tE_Amount()
  {
    return tE_Amount;
  }

  @JsonSetter( "TE_AmtOption" )
  public void tE_AmtOption( final String tE_AmtOption )
  {
    this.tE_AmtOption = tE_AmtOption;
  }

  @JsonGetter( "TE_AmtOption" )
  public String tE_AmtOption()
  {
    return tE_AmtOption;
  }

  @JsonSetter( "TE_Billable_Flag" )
  public void tE_Billable_Flag( final boolean tE_Billable_Flag )
  {
    this.tE_Billable_Flag = tE_Billable_Flag;
  }

  @JsonGetter( "TE_Billable_Flag" )
  public boolean tE_Billable_Flag()
  {
    return tE_Billable_Flag;
  }

  @JsonSetter( "TE_InvCust_Flag" )
  public void tE_InvCust_Flag( final boolean tE_InvCust_Flag )
  {
    this.tE_InvCust_Flag = tE_InvCust_Flag;
  }

  @JsonGetter( "TE_InvCust_Flag" )
  public boolean tE_InvCust_Flag()
  {
    return tE_InvCust_Flag;
  }

  @JsonSetter( "TE_Invoice_Flag" )
  public void tE_Invoice_Flag( final boolean tE_Invoice_Flag )
  {
    this.tE_Invoice_Flag = tE_Invoice_Flag;
  }

  @JsonGetter( "TE_Invoice_Flag" )
  public boolean tE_Invoice_Flag()
  {
    return tE_Invoice_Flag;
  }

  @JsonSetter( "TE_UseAmt_Flag" )
  public void tE_UseAmt_Flag( final boolean tE_UseAmt_Flag )
  {
    this.tE_UseAmt_Flag = tE_UseAmt_Flag;
  }

  @JsonGetter( "TE_UseAmt_Flag" )
  public boolean tE_UseAmt_Flag()
  {
    return tE_UseAmt_Flag;
  }

  @JsonSetter( "TE_UseBill_Flag" )
  public void tE_UseBill_Flag( final boolean tE_UseBill_Flag )
  {
    this.tE_UseBill_Flag = tE_UseBill_Flag;
  }

  @JsonGetter( "TE_UseBill_Flag" )
  public boolean tE_UseBill_Flag()
  {
    return tE_UseBill_Flag;
  }

  @JsonSetter( "TE_UseRate_Flag" )
  public void tE_UseRate_Flag( final boolean tE_UseRate_Flag )
  {
    this.tE_UseRate_Flag = tE_UseRate_Flag;
  }

  @JsonGetter( "TE_UseRate_Flag" )
  public boolean tE_UseRate_Flag()
  {
    return tE_UseRate_Flag;
  }

  @JsonSetter( "Taxable_Flag" )
  public void taxable( final boolean taxable )
  {
    this.taxable = taxable;
  }

  @JsonGetter( "Taxable_Flag" )
  public boolean taxable()
  {
    return taxable;
  }

  @JsonSetter( "Time_Zone" )
  public void timezone( final String timezone )
  {
    this.timezone = timezone;
  }

  @JsonGetter( "Time_Zone" )
  public String timezone()
  {
    return timezone;
  }

  @JsonSetter( "TopComment_Flag" )
  public void topComment( final boolean commentAtTop )
  {
    this.commentAtTop = commentAtTop;
  }

  @JsonGetter( "TopComment_Flag" )
  public boolean topComment()
  {
    return commentAtTop;
  }

  @JsonSetter( "Updated_By" )
  public void updatedBy( final String updatedBy )
  {
    this.updatedBy = updatedBy;
  }

  @JsonGetter( "Updated_By" )
  public String updatedBy()
  {
    return updatedBy;
  }
}
