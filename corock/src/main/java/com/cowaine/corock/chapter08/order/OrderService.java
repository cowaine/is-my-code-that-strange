package com.cowaine.corock.chapter08.order;

import com.cowaine.corock.chapter08.discount.Product;

import java.util.List;

class OrderService {

    // (...)

    @Deprecated(forRemoval = true)
    private int calcDiscountPrice(int price) {
        // 할인 가격 계산 로직
        return 0;
    }

    @Deprecated(forRemoval = true)
    private List<Product> getProductBrowsingHistory(int userId) {
        // 최근 본 상품 리스트를 확인하는 로직
        return null;
    }

}
