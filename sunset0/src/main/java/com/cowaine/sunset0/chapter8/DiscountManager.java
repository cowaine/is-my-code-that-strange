package com.cowaine.sunset0.chapter8;

import java.util.List;

// 8.1 상품 할인과 관련된 클래스
public class DiscountManager {

    List<Product> discountProducts;
    private int totalPrice;


    /**
     * 상품 추가하기
     * @param product 상품
     * @param productDiscount 상품 할인 정보
     * @return 추가에 성공하면 true
     */
    boolean add(Product product, ProductDiscount productDiscount) throws IllegalAccessException {
        if (product.id < 0) {
            throw new IllegalAccessException();
        }
        if (product.name.isEmpty()) {
            throw new IllegalAccessException();
        }
        if (product.price < 0) {
            throw new IllegalAccessException();
        }
        if (product.id != productDiscount.id) {
            throw new IllegalAccessException();
        }

        int discountPrice = getDiscountPrice(product.price);

        int tmp;
        if (productDiscount.canDiscount) {
            tmp = totalPrice + discountPrice;
        } else {
            tmp = totalPrice + product.price;
        }

        if (tmp <= 200000) {
            totalPrice = tmp;
            discountProducts.add(product);
            return true;
        } else {
            return false;
        }
    }

    /**
     * 할인 가격 확인하기
     * @param price 상품 가격
     * @return 할인 가격
     */
    private int getDiscountPrice(int price) {
        int discountPrice = price - 3000;
        if (discountPrice < 0) {
            discountPrice = 0;
        }
        return discountPrice;
    }
}
