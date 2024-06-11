package com.cowaine.sunset0.chapter1;

import java.math.BigDecimal;

//ContractManager에 작성된 금액 계산 조직
public class ContractManager {
    public ContractAmount contractAmount;
    private int amountExcludingTax = 100000;
    private BigDecimal salesTaxRate = BigDecimal.valueOf(20);

    // 세금 포함 금액 계산
    public int calculateAmountIncludingTax(int amountExcludingTax, BigDecimal salesTaxRate) {
        BigDecimal multiplier = salesTaxRate.add (new BigDecimal ("1.0"));
        BigDecimal amountIncludingTax =
                multiplier.multiply(new BigDecimal (amountExcludingTax)) ;
        return amountIncludingTax.intValue();
    }

    // 계약 체결
    public void conclude( ) {
        // 생략
        int amountIncludingTax = calculateAmountIncludingTax(amountExcludingTax, salesTaxRate);
        contractAmount = new ContractAmount();
        contractAmount.amountIncludingTax = amountIncludingTax;
        contractAmount.salesTaxRate = salesTaxRate;
        // 생략
    }

    public static void main(String[] args) {
        //쓰레기 객체
        ContractAmount amount = new ContractAmount();
        //BigDecimal은 따로 초기화하지 않으면 null이 들어간다.
        System.out.println(amount.salesTaxRate.toString());

        //잘못된 값이 들어가는 경우
        amount.salesTaxRate = new BigDecimal("-0.1");
    }
}
