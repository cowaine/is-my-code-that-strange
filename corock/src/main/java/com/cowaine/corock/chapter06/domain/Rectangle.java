package com.cowaine.corock.chapter06.domain;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Rectangle {

    private final double width;
    private final double height;

    // (...)

    public double area() {
        return width * height;
    }

}
