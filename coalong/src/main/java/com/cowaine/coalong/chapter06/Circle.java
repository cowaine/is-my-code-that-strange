package com.cowaine.coalong.chapter06;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Circle implements Shape {
    private final double radius;

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }
}
