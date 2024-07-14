package com.cowaine.corock.chapter10.amount;

/**
 * 서비스 사용료
 */
class ServiceUsageFee {

    final int amount;

    /**
     * @param amount 요금 금액
     */
    private ServiceUsageFee(final int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("금액은 0 이상의 값을 지정하세요.");
        }
        this.amount = amount;
    }

    /**
     * 서비스 사용료 확정하기
     *
     * @param salesPrice          판매 가격
     * @param salesCommissionRate 판매 수수료율
     * @return 서비스 사용료
     */
    static ServiceUsageFee determine(final SalesPrice salesPrice, final SalesCommissionRate salesCommissionRate) {
        int amount = (int) (salesPrice.amount * salesCommissionRate.value);
        return new ServiceUsageFee(amount);
    }

}
