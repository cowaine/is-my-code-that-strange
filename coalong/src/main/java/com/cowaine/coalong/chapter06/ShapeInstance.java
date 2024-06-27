package com.cowaine.coalong.chapter06;

import lombok.RequiredArgsConstructor;

public class ShapeInstance {
    void showArea() {
        // Shape 인터페이스를 구현하는 Rectangle, Circle 모두를 할당할 수 있음.
        Shape shape = new Circle(10);
        System.out.println(shape.area()); // 원의 면적 출력
        shape = new Rectangle(20, 25);
        System.out.println(shape.area()); // 사각형의 면적 출력
    }
}
