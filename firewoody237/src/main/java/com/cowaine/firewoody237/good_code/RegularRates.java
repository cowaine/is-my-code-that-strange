package com.cowaine.firewoody237.good_code;

public class RegularRates implements HotelRates {

    @Override
    public Money free() {
        return new Money(70000);
    }

    @Override
    public Money busySeasonFree() {
        return free().add(new Money(30000));
    }
}
