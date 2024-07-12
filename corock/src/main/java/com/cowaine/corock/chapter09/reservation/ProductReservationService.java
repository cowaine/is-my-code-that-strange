package com.cowaine.corock.chapter09.reservation;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProductReservationService {

    private final Reservations reservations;

    void reserve(Product product) {
        try {
            reservations.add(product);
        } catch (Exception e) {
        }
    }

}
