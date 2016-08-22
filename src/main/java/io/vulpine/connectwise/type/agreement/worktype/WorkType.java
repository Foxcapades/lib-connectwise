package io.vulpine.connectwise.type.agreement.worktype;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.vulpine.connectwise.type.agreement.BillableOption;
import io.vulpine.connectwise.type.agreement.RateType;

import java.util.Date;

@SuppressWarnings( "unused" )
@JacksonXmlRootElement( localName = "GetAgreementWorkTypeResult" )
public class WorkType extends _Common
{
  @JacksonXmlProperty( localName = "LocationId" )
  protected int LocationId;

  @JacksonXmlProperty( localName = "RateType" )
  protected RateType RateType;

  @JacksonXmlProperty( localName = "Rate" )
  protected double Rate;

  @JacksonXmlProperty( localName = "EffectiveDate" )
  protected Date EffectiveDate;

  @JacksonXmlProperty( localName = "EndingDate" )
  protected Date EndingDate;

  @JacksonXmlProperty( localName = "BillTime" )
  protected BillableOption BillTime;

  @JacksonXmlProperty( localName = "HoursMin" )
  protected double HoursMin;

  @JacksonXmlProperty( localName = "HoursMax" )
  protected double HoursMax;

  @JacksonXmlProperty( localName = "AddressId" )
  protected int AddressId;

  public int getLocationId ()
  {
    return LocationId;
  }

  public void setLocationId ( int locationId )
  {
    LocationId = locationId;
  }

  public double getRate ()
  {
    return Rate;
  }

  public void setRate ( double rate )
  {
    Rate = rate;
  }

  public Date getEffectiveDate ()
  {
    return EffectiveDate;
  }

  public void setEffectiveDate ( Date effectiveDate )
  {
    EffectiveDate = effectiveDate;
  }

  public Date getEndingDate ()
  {
    return EndingDate;
  }

  public void setEndingDate ( Date endingDate )
  {
    EndingDate = endingDate;
  }

  public double getHoursMin ()
  {
    return HoursMin;
  }

  public void setHoursMin ( double hoursMin )
  {
    HoursMin = hoursMin;
  }

  public double getHoursMax ()
  {
    return HoursMax;
  }

  public void setHoursMax ( double hoursMax )
  {
    HoursMax = hoursMax;
  }

  public int getAddressId ()
  {
    return AddressId;
  }

  public void setAddressId ( int addressId )
  {
    AddressId = addressId;
  }

  public RateType getRateType ()
  {
    return RateType;
  }

  public void setRateType ( RateType rateType )
  {
    RateType = rateType;
  }

  public BillableOption getBillTime ()
  {
    return BillTime;
  }

  public void setBillTime ( BillableOption billTime )
  {
    BillTime = billTime;
  }
}
