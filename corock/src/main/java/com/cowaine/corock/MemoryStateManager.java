package com.cowaine.corock;

class MemoryStateManager {
    void changeIntValue01(int changeValue) {
        intValue01 -= changeValue;
        if (intValue01 < 0) {
            intValue01 = 0;
            updateState02Flag();
        }
    }
    ...
}