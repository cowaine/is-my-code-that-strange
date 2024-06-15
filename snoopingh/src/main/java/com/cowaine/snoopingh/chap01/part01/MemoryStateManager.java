package com.cowaine.snoopingh.chap01.part01;

public class MemoryStateManager {
    
    private int intValue01;

    // 기술 중심 명명
    void changeIntValue01(int changeValue) {
        intValue01 -= changeValue;
        if (intValue01 < 0) {
            intValue01 = 0;
            updateState02Flag();
        }
    }

    private void updateState02Flag() {
    }
}
