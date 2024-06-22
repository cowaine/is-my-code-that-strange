package com.cowaine.first.three;

import java.math.BigDecimal;

/**
 * 코드 1.6 ContractManager에 작성된 금액 계산 로직
 */
public class ContractManager {
    public ContractAmount contractAmount;

    // 세금 포함 금액 계산
    public int calculateAmountInCludingTax(int amountExcludingTax, BigDecimal salesTaxRate) {
        BigDecimal multiplier = salesTaxRate.add(new BigDecimal("1.0"));
        BigDecimal amountIncludingTax = multiplier.multiply(new BigDecimal(amountExcludingTax));

        return amountIncludingTax.intValue();
    }

    // 계약 체결
    public void conclude() {
        int amountExcludingTax = contractAmount.amountExcludingTax;
        BigDecimal salesTaxRate = contractAmount.salesTaxRate;

        int amountInCludingTax = calculateAmountInCludingTax(amountExcludingTax, salesTaxRate);
        contractAmount = new ContractAmount();
        contractAmount.amountIncludingTax = amountInCludingTax;
        contractAmount.salesTaxRate = salesTaxRate;
    }
}
