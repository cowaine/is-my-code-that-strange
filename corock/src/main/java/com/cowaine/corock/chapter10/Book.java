package com.cowaine.corock.chapter10;

import com.cowaine.corock.chapter10.amount.SalesCommissionRate;
import com.cowaine.corock.chapter10.amount.SalesPrice;
import com.cowaine.corock.chapter10.amount.ServiceUsageFee;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Book {

    public static void main(String[] args) {
        SalesPrice salesPrice = new SalesPrice(59_900);
        SalesCommissionRate salesCommissionRate = new SalesCommissionRate(0.078);
        log.info("ServiceUsageFee: {}", ServiceUsageFee.determine(salesPrice, salesCommissionRate));
    }

}
