package com.cowaine.coalong.chapter09;

public class ProductReservationService {
    private final Product product;

    public ProductReservationService(Product product) {
        this.product = product;
    }

    void reserve(Reservation reservation) {
        try {
            reservation.add(product);
        } catch (Exception e) {
        }
    }
}
