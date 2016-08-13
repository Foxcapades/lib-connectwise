package io.vulpine.connectwise.type.agreement.board;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.vulpine.connectwise.type.agreement.AbstractSubAgreement;

public class BoardDefault extends AbstractSubAgreement
{
  @JacksonXmlProperty( localName = "BoardId" )
  protected int boardId;

  @JacksonXmlProperty( localName = "ServiceTypeId" )
  protected int serviceTypeId;

  @JacksonXmlProperty( localName = "DefaultFlag" )
  protected boolean Default;

  public int getBoardId ()
  {
    return boardId;
  }

  public void setBoardId ( int boardId )
  {
    this.boardId = boardId;
  }

  public int getServiceTypeId ()
  {
    return serviceTypeId;
  }

  public void setServiceTypeId ( int serviceTypeId )
  {
    this.serviceTypeId = serviceTypeId;
  }

  public boolean isDefault ()
  {
    return Default;
  }

  public void setDefault ( boolean aDefault )
  {
    Default = aDefault;
  }
}
