package com.cowaine.firewoody237.bad_code;

public class BadIf {
    public String useMagic(int hitPoint, boolean canAct) {
        // 중첩된 조건문은 가독성을 크게 떨어뜨린다.
        // 1. 중괄호의 스콥을 가늠하기 힘들다.
        // 2. 가독성이 나빠 생산성을 저하시킨다.
        // 조기 리턴으로 해결
        if (0 < hitPoint) {
            if (canAct) {
                return "use magic";
            }
        }
        return "";
    }

    public void checkHealth(int health) {
        // else문은 가독성을 저하시킨다.
        // 조기 리턴으로 해결
        if (health == 0) {

        } else if (health < 10) {

        } else if (health < 20) {

        } else {

        }
    }
}
