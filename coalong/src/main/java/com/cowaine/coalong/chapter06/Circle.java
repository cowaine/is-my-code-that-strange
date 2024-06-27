package com.cowaine.coalong.chapter06;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Circle implements Shape {
    private final double radius;

    @Override
    public String name() {
        return null;
    }

    @Override
    public int costMagicPoint() {
        return 0;
    }

    @Override
    public int attackPower() {
        return 0;
    }

    @Override
    public int costTechnicalPoint() {
        return 0;
    }

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }
}
