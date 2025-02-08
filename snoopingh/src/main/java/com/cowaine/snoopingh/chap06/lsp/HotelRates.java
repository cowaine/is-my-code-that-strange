package com.cowaine.snoopingh.chap06.lsp;

// 리스코프 치환 원칙 : 기반 자료형(인터페이스)을 하위 자료형(구현체)으로 변경해도, 코드는 문제없이 동작해야 한다.
// 조건 분기를 써야 하는 상황에는 일단 인터페이스 설계를 떠올리자!
public interface HotelRates {
    Money fee();
    Money busySeasonFee();
}
