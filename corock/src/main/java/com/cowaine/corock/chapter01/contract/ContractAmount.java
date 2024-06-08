package com.cowaine.corock.chapter01.contract;

import java.math.BigDecimal;

// 계약 금액
public class ContractAmount {
    public int amountIncludingTax;      // 세금 포함 금액
    public BigDecimal salesTaxRate;     // 소비세율
}