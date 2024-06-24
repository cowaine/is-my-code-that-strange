package com.cowaine.coalong.chapter04.ex03;

import java.util.Collections;
import java.util.List;

public class States {

    final List<StateType> stateTypes;

    public States(StateType stateType) {
        this.stateTypes = Collections.singletonList(stateType);
    }

    void add(StateType stateType) {
        stateTypes.add(stateType);
    }
}
