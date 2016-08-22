package io.vulpine.connectwise.type.agreement.worktype;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@SuppressWarnings( "unused" )
@JacksonXmlRootElement( localName = "GetAgreementWorkTypeExclusionResult" )
public class WorkTypeExclusion extends _Common
{
  @JacksonXmlProperty( localName = "AddAllWorkTypes" )
  protected boolean AddAllWorkTypes;

  @JacksonXmlProperty( localName = "RemoveAllWorkTypes" )
  protected boolean RemoveAllWorkTypes;

  public boolean isAddAllWorkTypes ()
  {
    return AddAllWorkTypes;
  }

  public void setAddAllWorkTypes ( boolean addAllWorkTypes )
  {
    AddAllWorkTypes = addAllWorkTypes;
  }

  public boolean isRemoveAllWorkTypes ()
  {
    return RemoveAllWorkTypes;
  }

  public void setRemoveAllWorkTypes ( boolean removeAllWorkTypes )
  {
    RemoveAllWorkTypes = removeAllWorkTypes;
  }
}
