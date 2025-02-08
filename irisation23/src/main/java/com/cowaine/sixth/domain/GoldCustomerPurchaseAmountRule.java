package com.cowaine.sixth.domain;

public class GoldCustomerPurchaseAmountRule implements ExcellentCustomerRule {
    @Override
    public boolean ok(PurchaseHistory history) {
        return 10000000 <= history.getTotalAmount();
    }
}
