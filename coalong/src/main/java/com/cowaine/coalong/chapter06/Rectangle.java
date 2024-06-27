package com.cowaine.coalong.chapter06;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Rectangle implements Shape {
    private final double width;
    private final double height;

    @Override
    public double area() {
        return width * height;
    }
}
