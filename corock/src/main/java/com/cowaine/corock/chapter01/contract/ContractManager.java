package com.cowaine.corock.chapter01.contract;

import java.math.BigDecimal;

/**
 * 계약을 관리하는 매니저 클래스다.
 */
public class ContractManager {

    private ContractAmount contractAmount;

    /**
     * 세금을 포함한 금액을 계산한다.
     *
     * @param amountExcludingTax 세금 제외 금액
     * @param salesTaxRate       소비세율
     * @return 세금 포함 금액
     */
    public int calculateAmountIncludingTax(int amountExcludingTax, BigDecimal salesTaxRate) {
        BigDecimal multiplier = salesTaxRate.add(new BigDecimal("1.0"));
        BigDecimal amountIncludingTax = multiplier.multiply(new BigDecimal(amountExcludingTax));

        return amountIncludingTax.intValue();
    }

    /**
     * 계약을 체결한다.
     */
    public void conclude() {
        int amountExcludingTax = 0;
        BigDecimal salesTaxRate = null;

        // (...)

        int amountIncludingTax = calculateAmountIncludingTax(amountExcludingTax, salesTaxRate);
        contractAmount = new ContractAmount(amountIncludingTax, salesTaxRate);

        // (...)
    }

}
