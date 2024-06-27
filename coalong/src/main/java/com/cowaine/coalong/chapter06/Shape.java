package com.cowaine.coalong.chapter06;

import lombok.RequiredArgsConstructor;

public class Shape {
//    다른 자료형의 인스턴스는 할당할 수 없습니다. 컴파일 오류가 발생합니다.
//    또한 같은 이름의 메서드라도 사용할 수 없습니다.
//    Rectangle rectangle = new Circle(8);
//    rectangle.area();
}

@RequiredArgsConstructor
class Rectangle {
    private final double width;
    private final double height;

    double area() {
        return width * height;
    }
}

// 원
@RequiredArgsConstructor
class Circle {
    private final double radius;

    double area() {
        return radius * radius * Math.PI;
    }
}
