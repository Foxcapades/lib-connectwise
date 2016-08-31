/*
 * Copyright 2016 Elizabeth Harper
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package io.vulpine.connectwise.api.product;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.common.ApiDivision;
import io.vulpine.connectwise.api.def.SubApiInterface;
import io.vulpine.connectwise.api.product.addOrUpdate.*;
import io.vulpine.connectwise.api.common.Credentials;

public class ProductApi_AddOrUpdate extends ApiDivision
{
  public ProductApi_AddOrUpdate(
    final Credentials credentials,
    final XmlMapper mapper,
    final SubApiInterface api
  )
  {
    super(credentials, mapper, api);
  }

  public AddOrUpdatePriceBreak priceBreak()
  {
    this.logger.trace(this.getClass());
    return new AddOrUpdatePriceBreak();
  }

  public AddOrUpdatePricingDetail pricingDetail()
  {
    this.logger.trace(this.getClass());
    return new AddOrUpdatePricingDetail();
  }

  public AddOrUpdatePricingSchedule pricingSchedule()
  {
    this.logger.trace(this.getClass());
    return new AddOrUpdatePricingSchedule();
  }

  public AddOrUpdateProduct product()
  {
    this.logger.trace(this.getClass());
    return new AddOrUpdateProduct();
  }

  public AddOrUpdateProductPickedAndShipped productPickedAndShipped()
  {
    this.logger.trace(this.getClass());
    return new AddOrUpdateProductPickedAndShipped();
  }
}
