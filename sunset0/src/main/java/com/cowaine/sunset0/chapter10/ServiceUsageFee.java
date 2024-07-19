package com.cowaine.sunset0.chapter10;

//단순히 '요금'이 아니라 서비스 사용료, 판매 수수료율 클래스로 나눌 수 있다.
public class ServiceUsageFee {
    final int amount;

    /**
     * @param amount 요금 금액
     */
    private ServiceUsageFee(final int amount) throws IllegalAccessException {
        if (amount < 0) {
            throw new IllegalAccessException("금액은 0 이상의 값을 지정하세요");
        }
        this.amount = amount;
    }

    /**
     * 서비스 사용료 확정하기
     * @param salePrice 판매 가격
     * @param saleCommissionRate 판매 수수료율
     * @return 서비스 사용료
     * @throws IllegalAccessException
     */
    static ServiceUsageFee determine(final SalePrice salePrice, final SaleCommissionRate saleCommissionRate) throws IllegalAccessException {
        int amount = (int) (salePrice.amount * saleCommissionRate.value);
        return new ServiceUsageFee(amount);
    }


    public static class SalePrice {
        public int amount;
    }

    public static class SaleCommissionRate {
        public int value;
    }
}
