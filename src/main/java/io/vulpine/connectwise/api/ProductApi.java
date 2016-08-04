package io.vulpine.connectwise.api;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import io.vulpine.connectwise.api.product.DeleteProductRequest;
import io.vulpine.connectwise.api.product.FindProductRequest;
import io.vulpine.connectwise.api.request.Credentials;
import io.vulpine.connectwise.api.request.SoapEnvelope;
import io.vulpine.connectwise.api.request.CwRequest;
import io.vulpine.connectwise.data.product.Product;

import java.io.IOException;

public class ProductApi implements ConnectwiseSubApiInterface
{
  protected final ConnectwiseApi a;
  protected final Credentials    c;
  protected final XmlMapper      x;
  protected final static String api = "ProductApi.asmx";

  public ProductApi ( final ConnectwiseApi api, final Credentials c, final XmlMapper x )
  {
    this.a = api;
    this.c = c;
    this.x = x;
  }

  public void addOrUpdateProduct ()
  {
  }

  public void addProduct ()
  {
  }

  public DeleteProductRequest deleteProduct ()
  {
    return new DeleteProductRequest(c, x, this);
  }

  public FindProductRequest findProducts()
  {
    return new FindProductRequest(c, x, this);
  }

  public Product getProduct ()
  {
    return null;
  }

  public void getQuantityOnHand ()
  {
  }

  public void loadProduct ()
  {
  }

  public void updateProduct ()
  {
  }

  public void addOrUpdateProductPickedandShipped ()
  {
  }

  public void getProductPickedandShipped ()
  {
  }

  public void deleteProductPickedandShipped ()
  {
  }

  @Override
  public String send ( final CwRequest r ) throws IOException
  {
    return soap.matcher(a.send(
      a.c.getApiPath() + api,
      a.x.writeValueAsString(new SoapEnvelope(r))
    )).replaceAll("");
  }
}
