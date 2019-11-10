package com.jpworkstyle.bizplan.domain.type;

import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

@EqualsAndHashCode
public class Money {

    private BigDecimal amount;

    public Money(String value) {
        this.amount = new BigDecimal(value);
    }

    public Money(long value) {
        this.amount = new BigDecimal(value);
    }

    private Money(BigDecimal value) {
        this.amount = value;
    }

    public Money add(Money money) {
        BigDecimal result = amount.add(money.amount);
        return new Money(result);
    }

    @Override
    public String toString() {
        return amount.toString();
    }

    @Deprecated
    Money() {
    }
}
