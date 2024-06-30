package com.cowaine.corock.chapter07.game;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Objects;

@RequiredArgsConstructor
@Getter
public class States {

    private final List<StateType> stateTypes;

    public void add(StateType stateType) {
        stateTypes.add(stateType);
    }

    public boolean containsState(StateType stateType) {
        return stateTypes.stream().anyMatch(state -> Objects.equals(stateType, state));
    }

    public boolean remove(StateType stateType) {
        return stateTypes.remove(stateType);
    }

}
