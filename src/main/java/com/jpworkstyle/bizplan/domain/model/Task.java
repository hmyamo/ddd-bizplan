package com.jpworkstyle.bizplan.domain.model;

import com.jpworkstyle.bizplan.domain.type.Money;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@AllArgsConstructor
public class Task {

    @Getter
    @Accessors(fluent = true)
    private String name;

    @Getter
    @Setter
    @Accessors(fluent = true)
    private Money amount;

    @Deprecated
    Task() {
    }
}
