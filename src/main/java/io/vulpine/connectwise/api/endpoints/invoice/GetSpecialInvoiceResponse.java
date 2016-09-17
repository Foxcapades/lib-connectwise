package io.vulpine.connectwise.api.endpoints.invoice;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.vulpine.connectwise.api.common.ResponseData;
import io.vulpine.connectwise.type.invoice.SpecialInvoice;

public class GetSpecialInvoiceResponse extends ResponseData < SpecialInvoice >
{
  @JsonCreator
  public GetSpecialInvoiceResponse( @JsonProperty("GetSpecialInvoiceResult") SpecialInvoice result )
  {
    super(result);
  }
}
