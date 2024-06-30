package com.cowaine.corock.chapter06.customer;

public class ReturnRateRule implements ExcellentCustomerRule {

    @Override
    public boolean ok(final PurchaseHistory history) {
        return history.getReturnRate() <= 0.001f;
    }

}
