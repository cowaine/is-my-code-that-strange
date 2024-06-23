package com.cowaine.sunset0.chapter6.strategy_pattern.policy;

public class ReturnRateRule implements ExcellentCustomerRule{
    @Override
    public boolean ok(PurchaseHistory history) {
        return history.returnRate <= 0.001;
    }

}
