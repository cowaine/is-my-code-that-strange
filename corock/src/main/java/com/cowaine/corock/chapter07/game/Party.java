package com.cowaine.corock.chapter07.game;

import java.util.ArrayList;
import java.util.List;

public class Party {

    private final List<Member> members;

    public Party() {
        this.members = new ArrayList<>();
    }

    // (...)

    void add(final Member newMember) {
        members.add(newMember);
    }

}
