package com.cowaine.sunset0.chapter1;

public class MemoryStateManager {
    private int intValue01;

    //의미 없는 메서드명, 변수명
    void changeIntValue01(int changeValue) {
        intValue01 = changeValue;
        if (intValue01 < 0) {
            intValue01 = 0;
            updateState02Flag();
        }
    }

    private void updateState02Flag() {
    }
}
