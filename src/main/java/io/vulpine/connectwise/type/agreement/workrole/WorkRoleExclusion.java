package io.vulpine.connectwise.type.agreement.workrole;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@SuppressWarnings( "unused" )
@JacksonXmlRootElement( localName = "GetAgreementWorkRoleExclusionResult" )
public class WorkRoleExclusion extends AbstractWorkRole
{
  @JacksonXmlProperty( localName = "AddAllWorkRoles" )
  protected boolean AddAllWorkRoles;

  @JacksonXmlProperty( localName = "RemoveAllWorkRoles" )
  protected boolean RemoveAllWorkRoles;

  public boolean isAddAllWorkRoles ()
  {
    return AddAllWorkRoles;
  }

  public void setAddAllWorkRoles ( boolean addAllWorkRoles )
  {
    AddAllWorkRoles = addAllWorkRoles;
  }

  public boolean isRemoveAllWorkRoles ()
  {
    return RemoveAllWorkRoles;
  }

  public void setRemoveAllWorkRoles ( boolean removeAllWorkRoles )
  {
    RemoveAllWorkRoles = removeAllWorkRoles;
  }
}
