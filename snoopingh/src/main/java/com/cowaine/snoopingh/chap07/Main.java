package com.cowaine.snoopingh.chap07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        List<String> unmodifiableList = Collections.unmodifiableList(list);

        System.out.println("원본 : " + list);
        System.out.println("Unmodifiable : " + unmodifiableList);

        list.set(0, "AA");

        System.out.println("수정한 원본 : " + list);
        System.out.println("Unmodifiable : " + unmodifiableList);

        unmodifiableList.add("D");


//        List<String> immutableList = List.of(list); > 불변
//        System.out.println(immutableList);

        /*
            Collections.unmodifiableList() 는 원본리스트를 통해 변경이 여전히 가능하기 때문에 본질적으로는 불변이 아님.
            읽기 전용 뷰를 생성하는 개념
         */
    }
}
