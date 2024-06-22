package com.cowaine.firewoody237.bad_code;

import java.math.BigDecimal;

public class Common {

    static BigDecimal calcAmountIncludingTax(BigDecimal amountExcludingTax, BigDecimal taxRate) {
        return amountExcludingTax.add(taxRate);
    }

    static void createOrder(String productName) {
        System.out.println("ordered!");
    }
}
