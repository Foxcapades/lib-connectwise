package io.vulpine.connectwise.api;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import io.vulpine.connectwise.api.product.delete.DeleteProduct;
import io.vulpine.connectwise.api.product.find.FindProducts;
import io.vulpine.connectwise.api.request.Credentials;
import io.vulpine.connectwise.api.request.SoapEnvelope;
import io.vulpine.connectwise.api.request.CwRequest;
import io.vulpine.connectwise.type.product.Product;

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

  public DeleteProduct deleteProduct ()
  {
    return new DeleteProduct(c, x, this);
  }

  public FindProducts findProducts()
  {
    return new FindProducts(c, x, this);
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
