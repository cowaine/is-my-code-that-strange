package com.cowaine.corock.chapter01;

class MemoryStateManager {
    private int intValue01;

    void changeIntValue01(int changeValue) {
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