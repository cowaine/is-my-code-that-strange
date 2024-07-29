package com.cowaine.corock.chapter14.mystery;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MoneyManagerTest {

    @Test
    void testCharacterization() {
        // int actual = MoneyManager.calc(1000, false);
        // assertEquals(0, actual);

        // int actual = MoneyManager.calc(1000, false);
        // assertEquals(1000, actual);

        // int actual = MoneyManager.calc(2000, false);
        // int actual = MoneyManager.calc(3000, false);
        // int actual = MoneyManager.calc(1000, true);
        // int actual = MoneyManager.calc(2000, true);
        int actual = MoneyManager.calc(3000, true);
        assertEquals(3300, actual);
    }

}
