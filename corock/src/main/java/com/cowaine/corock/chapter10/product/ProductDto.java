package com.cowaine.corock.chapter10.product;

class ProductDto {

    final String name;
    final int price;
    final String productCode;

    ProductDto(final String name, final int price, final String productCode) {
        this.name = name;
        this.price = price;
        this.productCode = productCode;
    }

}
