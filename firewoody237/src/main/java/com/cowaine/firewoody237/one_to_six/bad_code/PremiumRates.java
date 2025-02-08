package com.cowaine.firewoody237.one_to_six.bad_code;

public class PremiumRates implements HotelRates {
    @Override
    public Money free() {
        return new Money(120000);
    }
}
