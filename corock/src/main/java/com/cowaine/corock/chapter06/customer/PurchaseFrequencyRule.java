package com.cowaine.corock.chapter06.customer;

public class PurchaseFrequencyRule implements ExcellentCustomerRule {

    @Override
    public boolean ok(final PurchaseHistory history) {
        return 10 <= history.getPurchaseFrequencyPerMonth();
    }

}
