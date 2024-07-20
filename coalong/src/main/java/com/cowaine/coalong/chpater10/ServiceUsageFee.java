package com.cowaine.coalong.chpater10;

public class ServiceUsageFee {
    final int amount;

    /**
     * @param amount 요금 금액
     */
    public ServiceUsageFee(final int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("금액은 0 이상의 값을 지정하세요.");
        }
        this.amount = amount;
    }

    static ServiceUsageFee determine(final SalesPrice salesPrice,
                                     final SalesCommissionRate salesCommissionRate) {
        int amount = (int)(salesPrice.amount * salesCommissionRate.value);
        return new ServiceUsageFee(amount);
    }
}
