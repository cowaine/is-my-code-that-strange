package com.cowaine.coalong.chapter10;

public class ProductDto {
    final String name;
    final int price;
    final String productCode;

    ProductDto(final String name, final int price, final String productCode) {
        this.name = name;
        this.price = price;
        this.productCode = productCode;
    }
}
