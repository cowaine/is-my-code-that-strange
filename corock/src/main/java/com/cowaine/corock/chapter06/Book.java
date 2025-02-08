package com.cowaine.corock.chapter06;

import com.cowaine.corock.chapter06.customer.Customer;
import com.cowaine.corock.chapter06.customer.ExcellentCustomerPolicy;
import com.cowaine.corock.chapter06.customer.GoldCustomerPolicy;
import com.cowaine.corock.chapter06.customer.GoldCustomerPurchaseAmountRule;
import com.cowaine.corock.chapter06.customer.PurchaseFrequencyRule;
import com.cowaine.corock.chapter06.customer.PurchaseHistory;
import com.cowaine.corock.chapter06.customer.ReturnRateRule;
import com.cowaine.corock.chapter06.customer.SilverCustomerPolicy;
import com.cowaine.corock.chapter06.domain.Circle;
import com.cowaine.corock.chapter06.domain.Rectangle;
import com.cowaine.corock.chapter06.domain.Shape;
import com.cowaine.corock.chapter06.game.DamageType;
import com.cowaine.corock.chapter06.game.Fire;
import com.cowaine.corock.chapter06.game.HealthCondition;
import com.cowaine.corock.chapter06.game.HellFire;
import com.cowaine.corock.chapter06.game.HitPointDamage;
import com.cowaine.corock.chapter06.game.Lightning;
import com.cowaine.corock.chapter06.game.Magic;
import com.cowaine.corock.chapter06.game.MagicPointDamage;
import com.cowaine.corock.chapter06.game.MagicType;
import com.cowaine.corock.chapter06.game.Member;
import com.cowaine.corock.chapter06.game.Skill;
import com.cowaine.corock.chapter06.hotel.HotelRates;
import com.cowaine.corock.chapter06.hotel.Money;
import com.cowaine.corock.chapter06.hotel.PremiumRates;
import com.cowaine.corock.chapter06.hotel.RegularRates;
import lombok.extern.slf4j.Slf4j;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

@Slf4j
public class Book {

    public static void main(String[] args) {
        Book.pp92To93();
        Book.pp101To103();
        Book.pp103To104();
        Book.pp109To115();
        Book.pp118To119();
        Book.p121();
        Book.pp122To123();
        Book.p125();
        Book.pp126To127();
        Book.pp130To132();
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

    private static void p121() {
        ExcellentCustomerPolicy goldCustomerPolicy = new ExcellentCustomerPolicy();
        goldCustomerPolicy.add(new GoldCustomerPurchaseAmountRule());
        goldCustomerPolicy.add(new PurchaseFrequencyRule());
        goldCustomerPolicy.add(new ReturnRateRule());

        log.info("골드 회원 여부: {}", goldCustomerPolicy.complyWithAll(new PurchaseHistory(500_000, 10, 0.001f)));
    }

    private static void pp122To123() {
        PurchaseHistory purchaseHistory = new PurchaseHistory(500_000, 10, 0.001f);

        GoldCustomerPolicy goldCustomerPolicy = new GoldCustomerPolicy();
        SilverCustomerPolicy silverCustomerPolicy = new SilverCustomerPolicy();

        log.info("골드 회원 여부: {}", goldCustomerPolicy.complyWithAll(purchaseHistory));
        log.info("실버 회원 여부: {}", silverCustomerPolicy.complyWithAll(purchaseHistory));
    }

    private static void p125() {
        HotelRates hotelRates = new RegularRates();

        Money busySeasonFee = null;
        if (hotelRates instanceof RegularRates) {
            busySeasonFee = hotelRates.fee().add(new Money(30000));
        } else if (hotelRates instanceof PremiumRates) {
            busySeasonFee = hotelRates.fee().add(new Money(50000));
        }

        log.info("busySeasonFee: {}", busySeasonFee.getAmount());
    }

    private static void pp126To127() {
        HotelRates hotelRates = new RegularRates();

        // 성수기 요금 자료형 판정 로직이 필요 없어진 상태
        Money busySeasonFee = hotelRates.busySeasonFee();

        log.info("busySeasonFee: {}", busySeasonFee.getAmount());
    }

    private static void pp130To132() {
        Member member = new Member(300, 999, 100, 40, 1, 4, 4, 4, Collections.emptyMap());
        HitPointDamage hitPointDamage = new HitPointDamage(member);
        MagicPointDamage magicPointDamage = new MagicPointDamage(member);

        Skill skill = new Skill(Map.of(DamageType.HIT_POINT, hitPointDamage, DamageType.MAGIC_POINT, magicPointDamage));
        skill.applyDamage(DamageType.MAGIC_POINT, 30);

        log.info("member: {}", member);
    }

}
