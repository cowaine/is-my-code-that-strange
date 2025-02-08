package com.cowaine.corock.chapter08.order;

import com.cowaine.corock.chapter08.discount.Product;

import java.time.ZonedDateTime;
import java.util.List;

public class Order {

    /**
     * 주문 ID
     */
    public int orderId;

    /**
     * 주문자 ID
     */
    public int customerId;

    /**
     * 주문 내역
     */
    public List<Product> products;

    /**
     * 주문 일자
     */
    public ZonedDateTime orderTime;

    /**
     * 주문 상태
     */
    public OrderState orderState;

    /**
     * 예약 ID
     */
    public int reservationId;

    /**
     * 예약 일자
     */
    public ZonedDateTime reservationDateTime;

    /**
     * 발송지
     */
    public String deliveryDestination;

    // ... 여타 수많은 인스턴스 변수는 생략

}
