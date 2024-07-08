package com.cowaine.firewoody237.one_to_six.bad_code;

public class ActorManager {

    // 매개 변수가 변경되었단 것을 외부에서 알기 어렵다.
    // 매개 변수를 출력으로 사용해 버리면, 메서드 내부의 로직을 확인해야 한다.(가독성 저하)
    void shift(Location location, int shiftX, int shiftY) {
        location.x += shiftX;
        location.y += shiftY;
    }

    static class Location {
        public int x;
        public int y;

        public Location(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
