package com.cowaine.sunset0.chapter5;

import java.math.BigDecimal;


//범용 처리 클래스
public class Common {

    //세금 포함 금액 계산하기
    static BigDecimal calcAmountIncludingTax(BigDecimal amountExcludingTax, BigDecimal taxRate) {
        return amountExcludingTax.multiply(taxRate);
    }
}
