package com.cowaine.corock.chapter06.customer;

public class SilverCustomerPolicy {

    private final ExcellentCustomerPolicy policy;

    public SilverCustomerPolicy() {
        this.policy = new ExcellentCustomerPolicy();
        policy.add(new PurchaseFrequencyRule());
        policy.add(new ReturnRateRule());
    }

    /**
     * @param history 구매 이력
     * @return 규칙을 모두 만족하는 경우 true
     */
    public boolean complyWithAll(final PurchaseHistory history) {
        return policy.complyWithAll(history);
    }

}
