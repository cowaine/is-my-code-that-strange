package com.cowaine.coalong.chapter06;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Rectangle implements Shape {
    private final double width;
    private final double height;

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
        return width * height;
    }
}
