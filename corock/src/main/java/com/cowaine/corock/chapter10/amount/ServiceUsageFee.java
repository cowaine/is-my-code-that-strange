package com.cowaine.corock.chapter10.amount;

import lombok.ToString;

/**
 * 서비스 사용료다.
 */
@ToString
public class ServiceUsageFee {

    private final int amount;

    private ServiceUsageFee(final int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("금액은 0 이상의 값을 지정하세요.");
        }

        this.amount = amount;
    }

    /**
     * 서비스 사용료를 확정한다.
     *
     * @param salesPrice          판매 가격
     * @param salesCommissionRate 판매 수수료율
     * @return 서비스 사용료
     */
    public static ServiceUsageFee determine(final SalesPrice salesPrice,
                                            final SalesCommissionRate salesCommissionRate) {
        int amount = (int) (salesPrice.getAmount() * salesCommissionRate.getValue());
        return new ServiceUsageFee(amount);
    }

}
