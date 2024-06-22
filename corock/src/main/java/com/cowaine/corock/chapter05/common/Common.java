package com.cowaine.corock.chapter05.common;

import com.cowaine.corock.chapter05.auth.User;
import com.cowaine.corock.chapter05.product.Product;

import java.math.BigDecimal;

/**
 * 범용 처리 클래스다.
 */
public class Common {

    // (...)

    /**
     * 세금 포함 금액을 계산한다.
     *
     * @param amountExcludingTax 세금 제외 금액
     * @param taxRate            세율
     * @return 세금 포함 금액
     */
    public static BigDecimal calcAmountIncludingTax(BigDecimal amountExcludingTax, BigDecimal taxRate) {
        return amountExcludingTax.multiply(taxRate);
    }

    /**
     * 사용자의 탈퇴 여부를 검증한다.
     *
     * @param user 사용자
     * @return 사용자가 이미 탈퇴했다면 true
     */
    public boolean hasResigned(User user) {
        return false;
    }

    /**
     * 상품을 주문한다.
     *
     * @param product 상품
     */
    public void createOrder(Product product) {
        // (...)
    }

    /**
     * 유효한 전화번호인지 검증한다.
     *
     * @param phoneNumber 전화번호
     * @return 유효한 전화번호라면 true
     */
    public static boolean isValidPhoneNumber(String phoneNumber) {
        return false;
    }

    /**
     * 할인율을 반영한 할인가를 반환한다.
     *
     * @param regularPrice 정가
     * @param discountRate 할인율
     * @return 할인가
     */
    int discountedPrice(int regularPrice, float discountRate) {
        if (regularPrice < 0) {
            throw new IllegalArgumentException();
        }

        if (discountRate < 0.0f) {
            throw new IllegalArgumentException();
        }

        return (int) (regularPrice * discountRate);
    }

}
