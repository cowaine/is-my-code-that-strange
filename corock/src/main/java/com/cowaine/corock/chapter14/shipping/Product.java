package com.cowaine.corock.chapter14.shipping;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class Product {

    private final int id;
    private final String name;

    @Getter
    private final int price;

}
