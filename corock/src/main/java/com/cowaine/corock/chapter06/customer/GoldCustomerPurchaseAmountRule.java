package com.cowaine.corock.chapter06.customer;

public class GoldCustomerPurchaseAmountRule implements ExcellentCustomerRule {

    @Override
    public boolean ok(final PurchaseHistory history) {
        return 1000000 <= history.getTotalAmount();
    }

}
