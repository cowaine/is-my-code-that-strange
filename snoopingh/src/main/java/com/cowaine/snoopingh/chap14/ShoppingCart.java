package com.cowaine.snoopingh.chap14;

import java.util.ArrayList;
import java.util.List;

// 장바구니
// 이상적인 구조의 클래스 기본 형태를 어느정도 잡기
public class ShoppingCart {

    final List<Product> products;

    ShoppingCart() {
        products = new ArrayList<>();
    }

    private ShoppingCart(List<Product> products) {
        this.products = products;
    }

    ShoppingCart add(final Product product) {
        final List<Product> adding = new ArrayList<>(products);
        adding.add(product);
        return new ShoppingCart(adding);
    }
}
