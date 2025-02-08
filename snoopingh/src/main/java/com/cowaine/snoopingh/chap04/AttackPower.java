package com.cowaine.snoopingh.chap04;

public class AttackPower {
     static final int MIN = 0;
     int value;

     AttackPower(int value) {
         if (value < MIN) {
             throw new IllegalArgumentException();
         }

         this.value = value;
     }

//     void reinforce(int increment) {
//         value += increment;
//     }

//    void disable() {
//        value = MIN;
//    }

    // 부수 효과 : 외부 상태를 변경하는 것

    AttackPower reinforce(final AttackPower increment) {
         return new AttackPower(this.value + increment.value);
    }

    AttackPower disable() {
         return new AttackPower(MIN);
    }
}
