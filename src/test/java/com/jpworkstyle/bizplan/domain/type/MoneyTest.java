package com.jpworkstyle.bizplan.domain.type;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MoneyTest {

    @Test
    void moneyTest() {
        Money money = new Money(1000);
        Assertions.assertEquals("1000", money.toString());
    }

    @Test
    void moneyEqualsTest() {
        Money money1 = new Money(1000);
        Money money2 = new Money("1000");
        Assertions.assertEquals(money1, money2);
    }

    @Test
    void moneyNotEqualsTest() {
        Money money1 = new Money(1000);
        Money money2 = new Money(1001);
        Assertions.assertNotEquals(money1, money2);
    }

    @Test
    void moneyAddTest() {
        Money money1 = new Money(1000);
        Money money2 = new Money(2000);
        Assertions.assertEquals(new Money(3000), money1.add(money2));
    }
}
