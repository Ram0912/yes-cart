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

package org.yes.cart.impl {

[Bindable]
[RemoteClass(alias="org.yes.cart.domain.dto.impl.PriceListDTOImpl")]

public class PriceListDTOImpl {
    
    public var skuPriceId:Number = 0;

    public var regularPrice:Number;

    public var salePrice:Number;

    public var salefrom:Date;

    public var saleto:Date;

    public var minimalPrice:Number;

    public var quantity:Number;

    public var currency:String;

    public var skuCode:String;

    public var skuName:String;

    public var shopCode:String;

    public var tag:String;

    public var pricingPolicy:String;

    public function PriceListDTOImpl() {
    }


    public function toString():String {
        return "PriceListDtoImpl{skuPriceId=" + String(skuPriceId) +
               ",regularPrice=" + String(regularPrice) +
               ",minimalPrice=" + String(minimalPrice) +
               ",salePrice=" + String(salePrice) +
               ",salefrom=" + String(salefrom) +
               ",saleto=" + String(saleto) +
               ",skuCode=" + skuCode +
               ",shopId=" + shopCode +
               ",quantity=" + String(quantity) +
               ",currency=" + String(currency) +
               ",skuName=" + String(skuName) +
               ",tag=" + String(tag) +
               ",pricingPolicy=" + String(pricingPolicy) + "}";
    }
}
}