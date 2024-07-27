package com.cowaine.coalong.chapter14;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
// 장바구니
public class ShoppingCart {
    final List<Product> products;

    ShoppingCart() {
        products = new ArrayList<Product>();
    }

    private ShoppingCart(List<Product> products) {
        this.products = products;
    }

    ShoppingCart add(final Product product) {
        final List<Product> adding = new ArrayList<>(products);
        adding.add(product);
        return new ShoppingCart(adding);
    }

    /**
     * @return 상품 합계 금액
     */
    int totalPrice() {
        int amount = 0;
        for (Product each : products) {
            amount += each.getPrice();
        }
        return amount;
    }
}
