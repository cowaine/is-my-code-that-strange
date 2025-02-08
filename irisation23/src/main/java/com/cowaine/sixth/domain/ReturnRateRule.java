package com.cowaine.sixth.domain;

public class ReturnRateRule implements ExcellentCustomerRule {
    @Override
    public boolean ok(PurchaseHistory history) {
        return history.returnRate() <= 0.001;
    }
}
