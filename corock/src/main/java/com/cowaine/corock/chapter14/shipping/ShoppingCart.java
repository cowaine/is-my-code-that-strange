package com.cowaine.corock.chapter14.shipping;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

// 장바구니
@Getter
public class ShoppingCart {

    private final List<Product> products;

    ShoppingCart() {
        this.products = new ArrayList<>();
    }

    private ShoppingCart(List<Product> products) {
        this.products = products;
    }

    ShoppingCart add(final Product product) {
        final List<Product> adding = new ArrayList<>(products);
        adding.add(product);
        return new ShoppingCart(adding);
    }

    public int totalPrice() {
        int amount = 0;
        for (Product each : products) {
            amount += each.getPrice();
        }
        return amount;
    }

}
