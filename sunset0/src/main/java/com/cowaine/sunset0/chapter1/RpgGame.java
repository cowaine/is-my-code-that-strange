package com.cowaine.sunset0.chapter1;

import lombok.NoArgsConstructor;


public class RpgGame {

    private Magic magic = new Magic();
    private Member member = new Member();


    //여러번 중첩된 로직
    public void startMagic() {
        //살아있는지 확인
        if (0 < member.hitPoint) {
            //움직일 수 있는지 확인
            if (member.canAct()) {
                //매직 포인트에 여유가 있는지 확인
                if (magic.costMagicPoint <= member.magicPoint) {
                    member.consumeMagicPoint(magic.costMagicPoint);
                    member.chant(magic);
                }
            }
        }
    }


    @NoArgsConstructor
    private class Member {
        private int hitPoint;
        private int magicPoint;


        private boolean canAct() {
            return true;
        }

        private void chant(Magic magic) {
            System.out.println("마법 발동 중..");
        }

        private void consumeMagicPoint(int costMagicPoint) {
            this.magicPoint -= costMagicPoint;
        }
    }

    private class Magic {
        private int costMagicPoint = 20;
    }
}
