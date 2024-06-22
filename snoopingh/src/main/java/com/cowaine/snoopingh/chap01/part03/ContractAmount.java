package com.cowaine.snoopingh.chap01.part03;

import java.math.BigDecimal;

// 데이터밖에 없는 클래스 구조 (응집도가 낮음)
// 계약 금액
public class ContractAmount {
    public int amountIncludingTax;  // 세금 포함 금액
    public BigDecimal salesTaxRate; // 소비세율
}
