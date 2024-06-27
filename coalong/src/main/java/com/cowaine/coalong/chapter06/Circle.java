package com.cowaine.coalong.chapter06;


import lombok.RequiredArgsConstructor;

// 원
@RequiredArgsConstructor
public class Circle {
    private final double radius;

    double area() {
        return radius * radius * Math.PI;
    }
}
