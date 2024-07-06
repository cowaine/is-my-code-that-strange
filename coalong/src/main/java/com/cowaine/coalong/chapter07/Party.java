package com.cowaine.coalong.chapter07;

import java.util.ArrayList;
import java.util.List;

public class Party {
    private final List<Member> members;

    Party(List<Member> newMembers) {
        members = new ArrayList<Member>(newMembers);
    }

    Party add(final Member newMember) {
        List<Member> adding = new ArrayList<>(members);
        adding.add(newMember);
        return new Party(adding);
    }
}
