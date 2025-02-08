package com.cowaine.coalong.chapter14;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Product {
    private final int id;
    private final String name;
    private final int price;
}
