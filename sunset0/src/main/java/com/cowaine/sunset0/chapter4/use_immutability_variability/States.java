package com.cowaine.sunset0.chapter4.use_immutability_variability;

import java.util.ArrayList;
import java.util.List;

public class States {

    private List<StateType> stateTypeList = new ArrayList<>();

    public void add(StateType stateType) {
        stateTypeList.add(stateType);
    }
}
