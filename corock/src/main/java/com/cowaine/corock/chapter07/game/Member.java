package com.cowaine.corock.chapter07.game;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
public class Member {

    @Setter
    public int hitPoint;

    private final States states;

    public boolean containsState(StateType stateType) {
        return states.containsState(stateType);
    }

    public void addState(StateType stateType) {
        states.add(stateType);
    }

    public void removeState(StateType stateType) {
        boolean removed = states.remove(stateType);
    }

}
