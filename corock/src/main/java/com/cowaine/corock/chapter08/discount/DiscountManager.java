package com.cowaine.corock.chapter08.discount;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class DiscountManager {

    private final List<Product> discountProducts;
    private int totalPrice;

    /**
     * 상품 추가하기
     *
     * @param product         상품
     * @param productDiscount 상품 할인 정보
     * @return 추가에 성공하면 true
     * @implSpec
     * 다음을 실행한다.
     *
     * <ul>
     *     <li>올바른 상품인지 확인한다.</li>
     *     <li><code>getDiscountPrice</code> 로 할인 가격을 계산한다.</li>
     *     <li><code>productDiscount.canDiscount</code> 를 확인하여 할인 가능한 경우에는 할인 가격을 모두 더하고,
     *         할인이 불가능한 경우에는 원래 상품 가격을 모두 더한다.</li>
     *     <li>가격 총합이 상한가인 200,000원 이내인 경우, 상품 리스트에 추가한다.</li>
     * </ul>
     */
    boolean add(Product product, ProductDiscount productDiscount) {
        if (product.getId() < 0) {
            throw new IllegalArgumentException();
        }
        if (product.getName().isEmpty()) {
            throw new IllegalArgumentException();
        }
        if (product.getPrice() < 0) {
            throw new IllegalArgumentException();
        }
        if (product.getId() != productDiscount.getId()) {
            throw new IllegalArgumentException();
        }

        int discountPrice = getDiscountPrice(product.getPrice());

        int tmp;
        if (productDiscount.canDiscount()) {
            tmp = totalPrice + discountPrice;
        } else {
            tmp = totalPrice + product.getPrice();
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
     *
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
