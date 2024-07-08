# 컬렉션: 중첩을 제거하는 구조화 테크닉

## 이미 존재하는 기능을 다시 구현하지 말기

- 이미 마련되어있는 `Collection` 전용 메서드들이 많다.
- 이런 메서드들을 알고 있으면, 복잡한 로직을 직접 구현하지 않아도 된다.
- **네모난 바퀴의 재발명** : 이미 존재하는 것보다 좋지 못한 결과물을 만들어 내는 것

## 반복 처리 내부의 조건 분기 중첩
- 상황 : `for`문 안에 다양한 조건 중첩문이 있는 경우

### 조기 Continue로 해결 + 조기 Break로 해결
```java
for (Member member : members) {
    if (member.hitPoint == 0) continue;
    
    if (member.hitPoint < 0) break;
    
    ...
}
```

## 응집도가 낮은 컬렉션 처리
- 컬렉션을 쓰다보면, 여기저기 중복된 로직이 사용되고 있을 수도 있다.
- 겉모습만 다른 중복코드도 발생한다.
- 이와 같이 컬렉션을 사용하며 응집도가 낮아질 수 있다.

### 컬렉션 처리의 캡슐화
- 일급 컬렉션(First Class Collection)을 사용하여 관련 로직을 캡슐화 할 수 있다.
- 일급 컬렉션의 구성 요소
  - 컬렉션 자료형의 인스턴스 변수
  - 컬렉션 자료형의 인스턴스 변수에 잘못된 값이 할당되지 않게 막고, 정상적으로 조작하는 메서드

```java
import java.util.ArrayList;

class Party {
    private final List<Member> members;

    Party() {
        members = new ArrayList<>();
    }
    
    Party(List<Member> adding) {
        this.members = adding;
    }
    
    // 원래 멤버를 변화시키지 않게하여 부수효과 제거
    Party add(final Member newMember) {
        List<Member> adding = new ArrayList<>(members);
        members.add(newMember);
        return new Party(adding);
    }
}
```

### 외부로 전달할 때 컬렉션의 변경 막기
- 외부로 컬렉션을 전달하면 외부에서 컬렉션을 마음대로 조작할 수 있다.
- `unmodifiableList()`를 활용할 수 있다.
  - 컬렉션에 요소를 추가하거나 제거할 수 없다.
  - `unmodifiableList`의 고민해볼 자료: [링크](https://colabear754.tistory.com/185)

```java
class Party {
    List<Member> members;
    ...
    
    List<Member> members() {
        return members.unmodifiableList();
    }
}
```
