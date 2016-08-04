package io.vulpine.connectwise.data.agreement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@SuppressWarnings( "unused" )
@JacksonXmlRootElement( localName = "AgreementFindResult" )
public class FoundAgreement extends Agreement
{
  @JacksonXmlProperty( localName = "BoardId" )
  protected int BoardId;

  @JacksonXmlProperty( localName = "BoardDefaultFlag" )
  protected boolean BoardDefault;

  @JacksonXmlProperty( localName = "ServiceTypeId" )
  protected int ServiceTypeId;

  public int getBoardId ()
  {
    return BoardId;
  }

  public void setBoardId ( int boardId )
  {
    BoardId = boardId;
  }

  public boolean isBoardDefault ()
  {
    return BoardDefault;
  }

  public void setBoardDefault ( boolean boardDefault )
  {
    BoardDefault = boardDefault;
  }

  public int getServiceTypeId ()
  {
    return ServiceTypeId;
  }

  public void setServiceTypeId ( int serviceTypeId )
  {
    ServiceTypeId = serviceTypeId;
  }
}
