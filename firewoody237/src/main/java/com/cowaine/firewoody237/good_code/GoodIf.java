package com.cowaine.firewoody237.good_code;

public class GoodIf {

    public String useMagic(int hitPoint, boolean canAct) {
        // 조기리턴
        // 조건로직과 실행로직을 분리할 수 있다.
        // 로직을 추가하는 것 또한 간단 해 진다.
        if (hitPoint >= 0) {
            return "";
        }

        if (canAct) {
            return "use magic";
        }
        return "";
    }
}
