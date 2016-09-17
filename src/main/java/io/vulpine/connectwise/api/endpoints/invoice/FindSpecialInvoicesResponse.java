package io.vulpine.connectwise.api.endpoints.invoice;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.vulpine.connectwise.api.common.ResponseData;
import io.vulpine.connectwise.type.invoice.FoundSpecialInvoice;

import java.util.List;

public class FindSpecialInvoicesResponse extends ResponseData < List< FoundSpecialInvoice > >
{
  @JsonCreator
  public FindSpecialInvoicesResponse( @JsonProperty("FindSpecialInvoicesResult") List < FoundSpecialInvoice > result )
  {
    super(result);
  }
}
