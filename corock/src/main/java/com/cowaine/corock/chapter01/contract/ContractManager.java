package com.cowaine.corock.chapter01.contract;

import java.math.BigDecimal;

// 계약을 관리하는 클래스
public class ContractManager {
    public ContractAmount contractAmount;

    // 세금 포함 금액 계산
    public int calculateAmountIncludingTax(int amountExcludingTax, BigDecimal salesTaxRate) {
        BigDecimal multiplier = salesTaxRate.add(new BigDecimal("1.0"));
        BigDecimal amountIncludingTax = multiplier.multiply(new BigDecimal(amountExcludingTax));
        return amountIncludingTax.intValue();
    }

    // 계약 체결
    public void conclude() {
        int amountExcludingTax = 0;
        BigDecimal salesTaxRate = null;

        // 생략
        int amountIncludingTax = calculateAmountIncludingTax(amountExcludingTax, salesTaxRate);
        contractAmount = new ContractAmount();
        contractAmount.amountIncludingTax = amountIncludingTax;
        contractAmount.salesTaxRate = salesTaxRate;
        // 생략
    }
}