package com.cowaine.corock.chapter14.shipping;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class Product {

    final int id;
    final String name;

    @Getter
    final int price;

}
