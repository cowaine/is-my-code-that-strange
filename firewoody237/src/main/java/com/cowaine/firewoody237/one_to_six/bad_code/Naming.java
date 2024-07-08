package com.cowaine.firewoody237.one_to_six.bad_code;

public class Naming {

    // 의도를 알 수 없는 변수
    public int doSomething(int p1, int p2, int d1, int d2) {
        int d = 0;
        d = p1 + p2;
        d = d - ((d1 + d2) / 2);
        if (d < 0) {
            d = 0;
        }
        return d;
    }

    // 기술 중심 명명
    private static class MemoryStateManager {
        int intValue;
    }

    // 일련번호 명명
    private static class Class01 {
        private void method01() {}
        private void method02() {}
    }
}
