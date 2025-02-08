package com.cowaine.coalong.chapter06;

public interface Shape {
    String name(); // 이름
    int costMagicPoint(); // 매직포인트 소비량
    int attackPower(); // 공격력
    int costTechnicalPoint(); // 테크니컬포인트 소비량

    double area();
}
