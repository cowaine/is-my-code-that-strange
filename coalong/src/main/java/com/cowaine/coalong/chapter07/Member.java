package com.cowaine.coalong.chapter07;

import java.util.List;

public class Member {
    public int hitPoint;
    public List<StateType> stateTypeList;

    public boolean containsState(StateType stateType) {
        return stateTypeList.stream().anyMatch(state -> state.equals(stateType));
    }

    public void addState(StateType stateType) {
        stateTypeList.add(stateType);
    }

    public void removeState(StateType stateType) {
        stateTypeList.remove(stateType);
    }
}
