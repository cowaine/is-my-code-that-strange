package com.cowaine.sunset0.chapter10;

public class Tmp {


    //10.7 의미를 알 수 없는 tmp 변수들
    public int tmpMethod() {
        int tmp1 = 1;
        int tmp2 = 2;
        int tmp4 = 4;
        int tmp6 = 6;

        int tmp3 = tmp1 - tmp2;
        if (tmp3 < tmp4) {
            tmp3 = tmp4;

        }
        int tmp5 = tmp3 * tmp6;
        return tmp5;
    }
}
