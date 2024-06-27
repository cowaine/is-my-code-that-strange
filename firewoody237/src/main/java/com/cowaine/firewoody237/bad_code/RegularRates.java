package com.cowaine.firewoody237.bad_code;

public class RegularRates implements HotelRates {

    @Override
    public Money free() {
        return new Money(70000);
    }
}
