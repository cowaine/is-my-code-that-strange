package com.cowaine.first.three;

import java.math.BigDecimal;

/**
 * 코드 1.5 데이터 밖에 없는 구조
 */
public class ContractAmount {
    public int amountIncludingTax; // 세금 포함 금액
    public int amountExcludingTax; // 세금 제외 금액
    public BigDecimal salesTaxRate; // 소비세율
}
