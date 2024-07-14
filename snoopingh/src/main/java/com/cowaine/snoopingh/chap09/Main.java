package com.cowaine.snoopingh.chap09;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws Exception {
        // 데드코드
        // YAGNI 원칙 (You aren't gonna need it)
        // 매직 넘버
        // 문자열 자료형에 대한 집착
        // 전역 변수 (= 거대 데이터 클래스)
        // null 문제 -> null 안전 자료형 : Optional / @NonNull, @Nullable
        // 예외를 catch 하고서 무시하는 코드
        // 메타 프로그래밍
        // 기술 중심 패키징 지양 (원래 용도와 다른 로직들이 섞이기 쉬움, ex.MVC 패턴)
        // -> 비즈니스 개념을 기준으로 폴더를 구분하는 것이 좋다

        // 샘플 코드 복사해서 붙여넣기
        // 은 탄환

//        Member member = new Member();
//        member.totalDefence();

        Level level = Level.initialize();
        System.out.println("Level : " + level.value);

        Field field = Level.class.getDeclaredField("value");
        field.setAccessible(true);
        field.setInt(level, 999);

        System.out.println("Level : " + level.value);
    }
}
