# 주석: 유지 보수와 변경의 정확성을 높이는 주석 작성 방법

## 내용이 낡은 주석
- 개발이 진행되면서 코드는 계속 바뀌고, 결국 주석의 설명이 맞지않는 지점이 온다.
- 코드에 비해 주석을 유지보수하는 것은 매우 어렵다.
- 주석이 구현 시점과 멀어질수록, 주석은 거짓말을 할 가능성이 높다.
- 코드의 동작을 그대로 기술한 주석은, 코드를 변경해야 할 때마다 주석도 변경해야 하므로 언젠가 괴리가 생긴다.

## 주석 때문에 이름을 대충 짓는 예
```java
// 수면, 마비, 혼란, 석화, 사망 이외의 상황에서 행동 가능
boolean isNotSleepingAndIsNotParalyzedAndIsNotConfusedAndIsNotStoneAndIsNotDead() {
    if (states.contains(StateType.sleeping) ||
        states.contains(StateType.parayzed) ||
        states.contains(StateType.confused) ||
        states.contains(StateType.stone) ||
        states.contains(StateType.dead)) {
        return false;
    }
    
    return true;
}
```
- 의도를 전달하기 힘든 메서드에는 의미를 다시 설명하는 주석을 달기 쉽다.

## 의도와 사양 변경 시 주의 사항을 읽는 이에게 전달하기
- 코드는 유지 보수할 때와 사양을 변경할 때 읽힌다.
  - 코드를 유지 보수할 때 : "이 로직은 어떤 의도를 갖고 움직이는가?"
  - 사양을 변경할 때 : "안전하게 변경하려면 무엇을 주의해야 하는가?"

## 주석 규칙
- 로직을 변경할 때는 반드시 주석도 함께 변경해야 함
- 로직의 내용을 단순하게 설명하기만 하는 주석은 달지 않음
- 가독성이 나쁜 로직에 설명을 추가하는 주석은 달지 않음. 대신 로직의 가독성을 높여야 함
- 로직의 의도와 사양을 변경할 때 주의할 점을 주석으로 달아야 함

## 문서 주석
- 문서 주석이란 특정 형식에 맞춰 주석을 작성하면, API 문서를 생성해 주거나 코드 에디터에서 주석의 내용을 팝업으로 표시해주는 기능
- IntelliJ의 경우 메뉴에서 `Tools > Generate JavaDoc`을 선택하면 API 문서를 html로 출력할 수 있음
