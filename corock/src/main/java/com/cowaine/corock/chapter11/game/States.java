package com.cowaine.corock.chapter11.game;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Objects;

@RequiredArgsConstructor
public class States {

    private final List<StateType> stateTypes;

    public boolean contains(StateType stateType) {
        return stateTypes.stream().anyMatch(state -> Objects.equals(stateType, state));
    }

}
