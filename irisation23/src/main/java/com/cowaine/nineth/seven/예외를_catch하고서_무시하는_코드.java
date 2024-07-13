package com.cowaine.nineth.seven;

import com.cowaine.nineth.seven.domain.Product;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;

import java.util.List;

public class 예외를_catch하고서_무시하는_코드 {
    public static void main(String[] args) {
        List<Product> reservations = List.of(Product.of());

        try {
            reservations.add(Product.of());
        } catch (Exception e) {
            // 처리 안하면 문제가 생김
        }

        try {
            reservations.add(Product.of());
        } catch (IllegalArgumentException e) {
            // 오류를 보고하고, 로그에 기록
            reportError(e);

            // 상위 레이어에 오류와 관련된 통지 요구
            requestNotifyError("예약할 수 없는 상품입니다.");
        }
    }

    private static void reportError(IllegalArgumentException e) {
        System.out.println(e);
    }

    private static void requestNotifyError(String s) {
        throw new RuntimeException(s);
    }
}
