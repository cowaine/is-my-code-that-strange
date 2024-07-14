package com.cowaine.corock.chapter10.game;

import com.cowaine.corock.chapter10.common.StateType;
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
