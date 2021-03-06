/*
 * Copyright 2009 Denys Pavlov, Igor Azarnyi
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package org.yes.cart.service.domain;

import org.yes.cart.domain.dto.ProductSearchResultDTO;
import org.yes.cart.domain.entity.Product;
import org.yes.cart.domain.entity.ProductAvailabilityModel;
import org.yes.cart.domain.entity.ProductSku;

/**
 * Availability strategy allows to determine if this product is eligible for
 * purchase. It is mostly used to support "AddToCart", "Preorder" buttons
 * and additional inventory related messaging.
 *
 * User: denispavlov
 * Date: 13-04-06
 * Time: 1:07 PM
 */
public interface ProductAvailabilityStrategy {


    /**
     *
     * @param shopId shop PK
     * @param product product
     * @return availability of this product
     */
    ProductAvailabilityModel getAvailabilityModel(final long shopId, final Product product);

    /**
     *
     * @param shopId shop PK
     * @param product product
     * @return availability of this product
     */
    ProductAvailabilityModel getAvailabilityModel(final long shopId, final ProductSearchResultDTO product);

    /**
     *
     * @param shopId shop PK
     * @param sku product sku
     * @return availability of this sku
     */
    ProductAvailabilityModel getAvailabilityModel(final long shopId, final ProductSku sku);

    /**
     *
     * @param shopId shop PK
     * @param skuCode SKU code (not product code)
     * @return availability of this sku
     */
    ProductAvailabilityModel getAvailabilityModel(final long shopId, final String skuCode);


}
