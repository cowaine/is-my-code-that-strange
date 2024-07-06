package com.cowaine.firewoody237.one_to_six.bad_code;

import java.util.List;

public class NoDemeter {

    Party party;

    // 메서드 체인
    // 요소의 사양이 조금이라도 변경되면, 해당 요소에 접근하고 있던 모든 코드를 확인하고 수정해야 한다.
    // 버그가 발생했다면 어디서 발생한 것인지 모든 코드를 확인해야 한다.
    void equipAmor(int memberId, String armor) {
        if (party.members.get(memberId).equipments.canChange()) {
            party.members.get(memberId).equipments.values.add(armor);
        }
    }

    static class Party {
        List<Member> members;
    }

    static class Member {
        String name;
        Equipments equipments;
    }

    static class Equipments {
        List<String> values;

        public boolean canChange() {
            System.out.println("can change");
            return true;
        }
    }
}
