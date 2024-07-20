package com.cowaine.coalong.chapter11;

import com.cowaine.coalong.chapter07.StateType;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class States {
    private final List<StateType> stateTypes;

    public boolean contains(StateType stateType) {
        if (stateTypes.contains(stateType)) {
            return true;
        }
        return false;
    }
}
