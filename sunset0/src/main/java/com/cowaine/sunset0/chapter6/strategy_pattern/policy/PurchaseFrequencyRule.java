package com.cowaine.sunset0.chapter6.strategy_pattern.policy;

public class PurchaseFrequencyRule implements ExcellentCustomerRule{
    @Override
    public boolean ok(PurchaseHistory history) {
        return 10 <= history.purchaseFrequencyPerMonth;
    }
}
