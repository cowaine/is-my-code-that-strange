package com.cowaine.corock.chapter06.customer;

/**
 * 우수 고객 규칙을 나타내는 인터페이스다.
 */
public interface ExcellentCustomerRule {

    /**
     * @param history 구매 이력
     * @return 조건을 만족하는 경우 true
     */
    boolean ok(final PurchaseHistory history);

}
