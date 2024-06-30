package com.cowaine.corock.chapter08.discount;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Product {

    private final int id;
    private final String name;
    private final int price;

}
