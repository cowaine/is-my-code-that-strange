package com.cowaine.corock.chapter05.cart;

import com.cowaine.corock.chapter05.product.Product;
import com.cowaine.corock.chapter05.util.Logger;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DefaultCartService implements CartService {

    private final Cart shoppingCart;

    @Override
    public void add(Product product) {
        try {
            shoppingCart.add(product);
        } catch (IllegalArgumentException e) {
            // report 는 로그 출력 전용 static 메서드
            Logger.report("문제가 발생했습니다. 장바구니에 상품을 추가할 수 없습니다.");
        }
    }

}
