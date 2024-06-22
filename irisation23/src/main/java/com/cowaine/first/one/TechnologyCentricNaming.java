package com.cowaine.first.one;

public class TechnologyCentricNaming {
}

class MemoryStateManager {
    private int intValue01;
    private boolean flag02;
    void changeIntValue01(int changeValue) {
        intValue01 -= changeValue;
        updateState02Flag();
    }

    void updateState02Flag() {
        flag02 = !flag02;
    }
}

