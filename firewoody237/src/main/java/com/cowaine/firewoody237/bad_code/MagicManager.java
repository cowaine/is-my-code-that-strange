package com.cowaine.firewoody237.bad_code;

public class MagicManager {
    String getName(MagicType magicType) {
        // 비슷한 switch문이 여러군데 쓰이기 시작한다.
        // MagicType이 추가되는 등 요구사항이 변경되었을 때 수정이 누락될 수 있다.
        // 단일 책임 선택의 원칙이 지켜지지 않고있다. (여러군데서 코드를 수정한다.)
        // 인터페이스 활용 가능
        String name = "";

        switch(magicType) {
            case fire:
                name = "파이어";
                break;
            case water:
                name = "워터";
                break;
        }
        return name;
    }
}
