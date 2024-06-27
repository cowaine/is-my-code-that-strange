package com.cowaine.coalong.chapter06;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Rectangle {
    private final double width;
    private final double height;

    double area() {
        return width * height;
    }
}