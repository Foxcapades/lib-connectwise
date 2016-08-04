package io.vulpine.connectwise.data.agreement.workrole;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.vulpine.connectwise.data.agreement.AbstractSubAgreement;

@SuppressWarnings( "unused" )
abstract class AbstractWorkRole extends AbstractSubAgreement
{
  @JacksonXmlProperty( localName = "WorkRoleId" )
  protected int WorkRoleId;

  public int getWorkRoleId ()
  {
    return WorkRoleId;
  }

  public void setWorkRoleId ( int workRoleId )
  {
    WorkRoleId = workRoleId;
  }
}
