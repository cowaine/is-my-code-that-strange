package com.cowaine.coalong.chapter06;

import lombok.RequiredArgsConstructor;

public class ShapeInstance {
    void showArea(Object shape) {
        if (shape instanceof Rectangle) {
            System.out.println(((Rectangle) shape).area());
        }
        if (shape instanceof Circle) {
            System.out.println(((Circle) shape).area());
        }
        // ...
        Rectangle rectangle = new Rectangle(8, 12);
        showArea(rectangle); // 사각형의 면적을 출력합니다.
    }
}
