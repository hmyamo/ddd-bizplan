package com.jpworkstyle.bizplan.domain.model;

import lombok.*;
import lombok.experimental.Accessors;

@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class ProjectNumber {

    @Getter
    @Accessors(fluent = true)
    private String number;

    @Deprecated
    ProjectNumber() {
    }
}
