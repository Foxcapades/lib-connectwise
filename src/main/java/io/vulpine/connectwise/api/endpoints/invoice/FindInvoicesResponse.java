package io.vulpine.connectwise.api.endpoints.invoice;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.vulpine.connectwise.api.common.ResponseData;
import io.vulpine.connectwise.type.invoice.FoundInvoice;

import java.util.List;

public class FindInvoicesResponse extends ResponseData < List< FoundInvoice > >
{
  @JsonCreator
  public FindInvoicesResponse( @JsonProperty("FindInvoicesResult") List < FoundInvoice > result )
  {
    super(result);
  }
}
