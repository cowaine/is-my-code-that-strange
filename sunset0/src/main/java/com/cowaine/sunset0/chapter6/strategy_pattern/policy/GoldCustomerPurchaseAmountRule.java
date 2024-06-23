package com.cowaine.sunset0.chapter6.strategy_pattern.policy;

public class GoldCustomerPurchaseAmountRule implements ExcellentCustomerRule{
    @Override
    public boolean ok(PurchaseHistory history) {
        return 100000 <= history.totalAmount;
    }
}
