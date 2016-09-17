package io.vulpine.connectwise.api.endpoints.invoice;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.vulpine.connectwise.api.common.ResponseData;
import io.vulpine.connectwise.type.invoice.Invoice;

public class GetInvoiceResponse extends ResponseData < Invoice >
{
  @JsonCreator
  public GetInvoiceResponse( @JsonProperty( "GetInvoiceResult" ) Invoice result )
  {
    super(result);
  }
}
