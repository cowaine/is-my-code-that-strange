package com.cowaine.sunset0.chapter4.reassignment;

public class Order {

    private static final int MAX_TOTAL_PRICE = 1000000;
    private int totalPrice;

    //4.4 매개변수 productPrice에 재할당하는 코드
    void addPrice(int productPrice) throws IllegalAccessException {
        productPrice = totalPrice + productPrice;
        if (MAX_TOTAL_PRICE < productPrice) {
            throw new IllegalAccessException("구매 상한 금액을 넘었습니다");
        }
    }

    //4.5 매개변수에 final을 붙여 불변으로 만들기
    void addPriceFinal(final int productPrice) throws IllegalAccessException {
        final int increasedTotalPrice = totalPrice + productPrice;
        if (MAX_TOTAL_PRICE < productPrice) {
            throw new IllegalAccessException("구매 상한 금액을 넘었습니다");
        }
    }
}
