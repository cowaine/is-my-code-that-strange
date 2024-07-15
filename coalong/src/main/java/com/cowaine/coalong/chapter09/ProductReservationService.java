package com.cowaine.coalong.chapter09;

public class ProductReservationService {
    private final Product product;

    public ProductReservationService(Product product) {
        this.product = product;
    }

    void reserve(Reservation reservation) {
        try {
            reservation.add(product);
        } catch (IllegalArgumentException e) {
            // 오류를 보고하고, 로그에 기록
            reportError(e);
            // 상위 레이어에 오류와 관련된 통지 요구
            requestNotifyError("예약할 수 없는 상품입니다.");
        }
    }

    private void requestNotifyError(String s) {
        // TODO
    }

    private void reportError(IllegalArgumentException e) {
        // TODO
    }
}
