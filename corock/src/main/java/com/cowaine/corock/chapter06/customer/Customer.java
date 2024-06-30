package com.cowaine.corock.chapter06.customer;

public class Customer {

    /**
     * 골드 회원인지 판정한다.
     *
     * @param history 구매 이력
     * @return 골드 회원이라면 true
     */
    public boolean isGoldCustomer(PurchaseHistory history) {
        if (1000000 <= history.getTotalAmount()) {
            if (10 <= history.getPurchaseFrequencyPerMonth()) {
                if (history.getReturnRate() <= 0.001) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 실버 회원인지 판정한다.
     *
     * @param history 구매 이력
     * @return 실버 회원이라면 true
     */
    public boolean isSilverCustomer(PurchaseHistory history) {
        if (10 <= history.getPurchaseFrequencyPerMonth()) {
            if (history.getReturnRate() <= 0.001f) {
                return true;
            }
        }
        return false;
    }

}
