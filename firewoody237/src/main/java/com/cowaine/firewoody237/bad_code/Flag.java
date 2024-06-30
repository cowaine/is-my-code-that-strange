package com.cowaine.firewoody237.bad_code;

public class Flag {

    void damage(boolean damageFlag) {
        // 플래그를 받으면 어떤일을 하는지 예측하기 힘들다
        // 가독성이 낮아지고 개발 생산성이 저하된다.
        // boolean이든 int든 둘다 동일하게 좋지 않다.
        if (damageFlag == true) {
            // logic
        } else {
            // logic
        }
    }
}
