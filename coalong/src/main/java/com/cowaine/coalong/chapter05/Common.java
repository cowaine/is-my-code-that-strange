package com.cowaine.coalong.chapter05;

import java.math.BigDecimal;

// 범용 처리 클래스
public class Common {
    // 세금 포함 금액 계산하기
    static BigDecimal calcAmountIncludingTax(BigDecimal amountExcludingTax, BigDecimal taxRAte) {
        return amountExcludingTax.multiply(taxRAte);
    }

    // 사용자가 이미 탈퇴했다면 true
    static boolean hasResigned(User user) {
        //TODO
        return false;
    }

    // 상품 주문하기
    static void createOrder(Product product) {
        //TODO
    }

    // 유효한 전화번호라면 true
    static boolean IsValidPhoneNumber(String phoneNumber) {
        //TODO
        return false;
    }
}
