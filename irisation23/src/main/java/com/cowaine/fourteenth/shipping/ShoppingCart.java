package com.cowaine.fourteenth.shipping;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

/**
 * 장바구니
 */
@Getter
public class ShoppingCart {

    private final List<Product> products;

    ShoppingCart() {
        this.products = new ArrayList<>();
    }

    private ShoppingCart(List<Product> products) {
        this.products = products;
    }

    /**
     * 장바구니에 상품을 추가한다.
     *
     * @param product 상품
     * @return 상품이 추가된 장바구니
     */
    ShoppingCart add(final Product product) {
        final List<Product> adding = new ArrayList<>(products);
        adding.add(product);
        return new ShoppingCart(adding);
    }

    /**
     * @return 상품 합계 금액
     */
    public int totalPrice() {
        int amount = 0;
        for (Product each : products) {
            amount += each.getPrice();
        }
        return amount;
    }

}
