package com.cowaine.corock.chapter09;

import com.cowaine.corock.chapter09.customer.Customer;
import com.cowaine.corock.chapter09.game.Level;
import com.cowaine.corock.chapter09.game.Member;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

@Slf4j
public class Book {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, ClassNotFoundException,
            InvocationTargetException, NoSuchMethodException, InstantiationException {

        Book.p191();
        Book.pp194To197();
        Book.p201();
        Book.pp202To203();
    }

    private static void p191() {
        // 레이블 문자열, 표시 색(RGB), 최대 문자 수
        String title = "타이틀,255,250,240,64";
    }

    private static void pp194To197() {
        Member member = new Member();
        member.showBodyEquipment();
    }

    private static void p201() throws NoSuchFieldException, IllegalAccessException {
        Level level = Level.initialize();
        log.info("Level: {}", level.getValue());

        Field field = Level.class.getDeclaredField("value");
        field.setAccessible(true);
        field.setInt(level, 999);

        log.info("Level: {}", level.getValue());
    }

    private static void pp202To203() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        String packageName = "com.cowaine.corock.chapter09.customer";
        String className = "Customer";
        Customer customer = (Customer) generateInstance(packageName, className);

        log.info("Customer: {}", customer);
    }

    /**
     * 클래스 이름을 지정해서 인스턴스를 생성한다.
     *
     * @param packageName 패키지 이름
     * @param className   인스턴스를 생성할 클래스 이름
     * @return 지정한 클래스의 인스턴스
     * @throws ClassNotFoundException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    static Object generateInstance(String packageName, String className) throws ClassNotFoundException,
            NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        String fillName = packageName + "." + className;
        Class<?> clazz = Class.forName(fillName);
        Constructor<?> constructor = clazz.getDeclaredConstructor();

        return constructor.newInstance();
    }

}
