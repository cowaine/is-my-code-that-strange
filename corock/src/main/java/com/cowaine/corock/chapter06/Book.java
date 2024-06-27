package com.cowaine.corock.chapter06;

import com.cowaine.corock.chapter06.customer.Customer;
import com.cowaine.corock.chapter06.customer.ExcellentCustomerPolicy;
import com.cowaine.corock.chapter06.customer.GoldCustomerPurchaseAmountRule;
import com.cowaine.corock.chapter06.customer.PurchaseFrequencyRule;
import com.cowaine.corock.chapter06.customer.PurchaseHistory;
import com.cowaine.corock.chapter06.customer.ReturnRateRule;
import com.cowaine.corock.chapter06.domain.Circle;
import com.cowaine.corock.chapter06.domain.Rectangle;
import com.cowaine.corock.chapter06.domain.Shape;
import com.cowaine.corock.chapter06.game.Fire;
import com.cowaine.corock.chapter06.game.HealthCondition;
import com.cowaine.corock.chapter06.game.HellFire;
import com.cowaine.corock.chapter06.game.Lightning;
import com.cowaine.corock.chapter06.game.Magic;
import com.cowaine.corock.chapter06.game.MagicType;
import com.cowaine.corock.chapter06.game.Member;
import lombok.extern.slf4j.Slf4j;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

@Slf4j
public class Book {

    public static void main(String[] args) {
        // Book.pp92To93();
        // Book.pp101To103();
        // Book.pp103To104();
        // Book.pp109To115();
        // Book.pp118To119();

        ExcellentCustomerPolicy goldCustomerPolicy = new ExcellentCustomerPolicy();
        goldCustomerPolicy.add(new GoldCustomerPurchaseAmountRule());
        goldCustomerPolicy.add(new PurchaseFrequencyRule());
        goldCustomerPolicy.add(new ReturnRateRule());

        log.info("골드 회원 여부: {}", goldCustomerPolicy.complyWithAll(new PurchaseHistory(500_000, 10, 0.001f)));
    }

    private static void pp92To93() {
        Member member = new Member(20, 100, 0, 10, 1, 4, 4, 4, Collections.emptyMap());
        HealthCondition healthCondition = HealthCondition.from(member);
        log.info("Member's health condition: {}", healthCondition);
    }

    private static void pp101To103() {
        Rectangle rectangle = new Rectangle(4.0, 3.0);
        Circle circle = new Circle(0.2);

        log.info("The area of a rectangle: {}, the area of a circle: {}", rectangle.area(), circle.area());

        // 다른 자료형의 인스턴스는 할당할 수 없습니다. 컴파일 오류가 발생합니다.
        // 또한 같은 이름의 메서드라도 사용할 수 없습니다.
        // Rectangle rectangle = new Circle(8);
        // rectangle.area();

        Book.showArea(new Rectangle(8, 12));
    }

    private static void showArea(Object shape) {
        if (shape instanceof Rectangle) {
            log.info("The area of a rectangle: {}", ((Rectangle) shape).area());
        }

        if (shape instanceof Circle) {
            log.info("The area of a circle: {}", ((Circle) shape).area());
        }
    }

    private static void pp103To104() {
        Shape shape = new Circle(10.0);
        log.info("The area of a shape: {}", shape.area());

        shape = new Rectangle(20.0, 25.0);
        log.info("The area of a shape: {}", shape.area());
    }

    private static void pp109To115() {
        Map<MagicType, Magic> magics = new EnumMap<>(MagicType.class);

        Member member = new Member(100, 999, 50, 25, 1, 4, 4, 4, magics);

        // (...)

        final Fire fire = new Fire(member);
        final Lightning lightning = new Lightning(member);
        final HellFire hellFire = new HellFire(member);

        magics.put(MagicType.FIRE, fire);
        magics.put(MagicType.LIGHTNING, lightning);
        magics.put(MagicType.HELL_FIRE, hellFire);

        // 마법 공격력 변경하기
        log.info("Member's magic attack: {}", member.magicAttack(MagicType.HELL_FIRE));
    }

    private static void pp118To119() {
        Customer customer = new Customer();
        PurchaseHistory purchaseHistory = new PurchaseHistory(500_000, 10, 0.001f);

        log.info("골드 회원 여부: {}", customer.isGoldCustomer(purchaseHistory));
        log.info("실버 회원 여부: {}", customer.isSilverCustomer(purchaseHistory));
    }

}
