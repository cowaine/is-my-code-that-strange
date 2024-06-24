package com.cowaine.corock.chapter06.domain;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Circle {

    private final double radius;

    // (...)

    public double area() {
        return radius * radius * Math.PI;
    }

}
