package com.cowaine.sunset0.chapter7;

import com.cowaine.sunset0.chapter4.use_immutability_variability.StateType;

public class Member {
    public int hitPoint;
    public int id;

    public boolean containState(StateType stateType) {
        return false;
    }

    public void addState(StateType stateType) {

    }

    public void removeState(StateType stateType) {

    }

    public boolean hasTeamAttackSucceeded() {
        return false;
    }

    public int attack() {
        return 1;
    }

    public boolean isAlive() {
        return false;
    }
}
