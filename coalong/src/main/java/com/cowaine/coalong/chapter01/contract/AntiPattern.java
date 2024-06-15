package com.cowaine.coalong.chapter01.contract;

import java.math.BigDecimal;

public class AntiPattern {

    // (초기화되지 않은 상태)쓰레기 객체
    void trashObject() {
        ContractAmount amount = new ContractAmount();
        System.out.println(amount.salesTaxRate.toString());
    }

    // 잘못된 값 할당
    void wrongValue() {
        ContractAmount amount = new ContractAmount();
        amount.salesTaxRate = new BigDecimal("-0.1");
    }

}
