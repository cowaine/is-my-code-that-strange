package com.cowaine.firewoody237.bad_code;

public interface HotelRates {
    // 성수기처럼 수요가 높은 기간에 숙박비를 높게하려면, 조건 분기가 필요 해진다.
    // 리스코프 치환 원칙을 위배한다.('기반 자료형을 하위 자료형으로 변경해도, 코드는 문제없이 동작해야 한다.')
    Money free();
}
