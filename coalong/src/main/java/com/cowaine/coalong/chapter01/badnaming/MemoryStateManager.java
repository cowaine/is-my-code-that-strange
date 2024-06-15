package com.cowaine.coalong.chapter01.badnaming;

public class MemoryStateManager {
    int intValue01;

    void changeIntValue01(int changeValue) {
        intValue01 -= changeValue;
        if(intValue01 < 0) {
            intValue01 = 0;
            updateState02Flg();
        }
    }

    void updateState02Flg() {
    }
}
