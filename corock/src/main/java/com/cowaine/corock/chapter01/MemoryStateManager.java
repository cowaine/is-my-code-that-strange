package com.cowaine.corock.chapter01;

public class MemoryStateManager {

    private int intValue01;

    public void changeIntValue01(int changeValue) {
        intValue01 -= changeValue;
        if (intValue01 < 0) {
            intValue01 = 0;
            updateState02Flag();
        }
    }

    private void updateState02Flag() {
        // (...)
    }

}
