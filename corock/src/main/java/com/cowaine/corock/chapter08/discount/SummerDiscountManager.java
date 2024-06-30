package com.cowaine.corock.chapter08.discount;

import lombok.RequiredArgsConstructor;

/**
 * @implSpec
 * 여름 할인 사양은 다음과 같다.
 *
 * <ul>
 *     <li>상품 하나당 3,000원 할인</li>
 *     <li>최대 300,000원까지 상품 추가 가능</li>
 * </ul>
 */
@Deprecated(forRemoval = true)
@RequiredArgsConstructor
public class SummerDiscountManager {

    private DiscountManager discountManager;

    /**
     * 상품 추가하기
     *
     * @param product 상품
     * @return 추가에 성공하면 true
     * @implSpec
     * 다음과 같이 실행된다.
     *
     * <ul>
     *     <li>올바른 상품인지 확인합니다.</li>
     *     <li>할인 금액이 일반 할인과 마찬가지로 3,000원까지이므로, <code>getDiscountPrice</code> 로 할인 가격을 계산합니다.</li>
     *     <li><code>productDiscount.canDiscount</code> 를 확인하여 할인 가능한 경우, 할인 가격을 모두 더합니다.
     *         할인 불가능한 경우, 원래 상품 가격을 모두 더합니다.</li>
     *     <li>가격 총합이 상한가인 300,000원 이내인 경우, 상품 리스트에 추가합니다.</li>
     * </ul>
     */
    @Deprecated(forRemoval = true)
    boolean add(Product product) {
        // TODO: SummerDiscountManager.add 메서드에 가격 확인 로직이 없어서 음수 가격의 상품을 여름 할인에 추가할 수 있게 됨.

        if (product.getId() < 0) {
            throw new IllegalArgumentException();
        }
        if (product.getName().isEmpty()) {
            throw new IllegalArgumentException();
        }

        int tmp;

        /*
         * 할인 대상 상품으로 설정했는데, 할인이 되지 않음.
         * ProductDiscount.canDiscount 와 Product.canDiscount 를 서로 헷갈려서 잘못 사용했음.
         */
        if (product.canDiscount()) {
            tmp = discountManager.getTotalPrice() + discountManager.getDiscountPrice(product.getPrice());
        } else {
            tmp = discountManager.getTotalPrice() + product.getPrice();
        }
        if (tmp <= 300000) {
            discountManager.setTotalPrice(tmp);
            discountManager.getDiscountProducts().add(product);
            return true;
        } else {
            return false;
        }
    }

}
