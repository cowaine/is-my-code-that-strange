package com.cowaine.sunset0.chapter9;

//9.11 장비하지 않음을 null이 아닌 방법으로 표현하기
public class EquipmentRefactor {

    static final EquipmentRefactor EMPTY = new EquipmentRefactor(0);

    int defence;

    public EquipmentRefactor(int defence) {
        this.defence = defence;
    }
}
