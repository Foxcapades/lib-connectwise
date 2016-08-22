package io.vulpine.connectwise.type.agreement.workrole;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.vulpine.connectwise.type.agreement.RateType;

import java.util.Date;

@SuppressWarnings( "unused" )
@JacksonXmlRootElement( localName = "GetAgreementWorkRoleResult" )
public class WorkRole extends _Common
{
  @JacksonXmlProperty( localName = "LocationId" )
  protected int LocationId;

  @JacksonXmlProperty( localName = "RateType" )
  protected RateType RateType;

  @JacksonXmlProperty( localName = "Rate" )
  protected double Rate;

  @JacksonXmlProperty( localName = "LimitTo" )
  protected double LimitTo;

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
  @JacksonXmlProperty( localName = "EffectiveDate" )
  protected Date EffectiveDate;

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
  @JacksonXmlProperty( localName = "EndingDate" )
  protected Date EndingDate;

  public int getLocationId ()
  {
    return LocationId;
  }

  public void setLocationId ( int locationId )
  {
    LocationId = locationId;
  }

  public RateType getRateType ()
  {
    return RateType;
  }

  public void setRateType ( RateType rateType )
  {
    RateType = rateType;
  }

  public double getRate ()
  {
    return Rate;
  }

  public void setRate ( double rate )
  {
    Rate = rate;
  }

  public double getLimitTo ()
  {
    return LimitTo;
  }

  public void setLimitTo ( double limitTo )
  {
    LimitTo = limitTo;
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
}
