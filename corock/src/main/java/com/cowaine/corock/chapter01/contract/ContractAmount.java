package com.cowaine.corock.chapter01.contract;

import lombok.Getter;

import java.math.BigDecimal;

/**
 * 계약 금액 클래스다.
 */
public class ContractAmount {

    /**
     * 세금 포함 금액
     */
    private final int amountIncludingTax;

    /**
     * 소비세율
     */
    @Getter
    private final BigDecimal salesTaxRate;

    public ContractAmount(int amountIncludingTax, BigDecimal salesTaxRate) {
        if (salesTaxRate.compareTo(BigDecimal.ZERO) < 0) {
            // throw new IllegalArgumentException();
            // or
            salesTaxRate = BigDecimal.ZERO;
        }

        this.amountIncludingTax = amountIncludingTax;
        this.salesTaxRate = salesTaxRate;
    }

}
