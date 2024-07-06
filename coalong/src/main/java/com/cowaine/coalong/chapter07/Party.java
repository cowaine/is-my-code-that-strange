package com.cowaine.coalong.chapter07;

import java.util.ArrayList;
import java.util.List;

public class Party {
    private final List<Member> members;

    Party() {
        members = new ArrayList<Member>();
    }

    void add(final Member member) {
        members.add(member);
    }
}
