package com.cowaine.nineth.six.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@RequiredArgsConstructor
@Getter
public class Equipment {
    static final Equipment EMPTY = new Equipment("장비 없음", BigDecimal.ZERO, 0, 0);

    private final String name;
    private final BigDecimal price;
    private final int defencePoint;
    private final int magicDefencePoint;

    void printValue() {
        System.out.println(name);
        System.out.println(defencePoint);
        System.out.println(magicDefencePoint);
    }
}
