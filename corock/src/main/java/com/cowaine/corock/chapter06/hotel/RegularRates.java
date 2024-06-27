package com.cowaine.corock.chapter06.hotel;

public class RegularRates implements HotelRates {

    @Override
    public Money fee() {
        return new Money(70000);
    }

}
