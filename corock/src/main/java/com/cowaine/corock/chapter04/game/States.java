package com.cowaine.corock.chapter04.game;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class States {

    private final List<StateType> stateTypes;

    public void add(StateType stateType) {
        stateTypes.add(stateType);
    }

}
