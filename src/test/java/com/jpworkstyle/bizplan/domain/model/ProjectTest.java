package com.jpworkstyle.bizplan.domain.model;

import com.jpworkstyle.bizplan.domain.type.Money;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProjectTest {

    private Project project;
    private ProjectNumber number;

    @BeforeEach
    void setUp() {
        number = new ProjectNumber("ABC-123");
        project = new Project("My Project", number);
    }

    @Test
    void projectNameTest() {
        Assertions.assertEquals("My Project", project.name());
    }

    @Test
    void projectIdTest() {
        Assertions.assertEquals(36, project.id().length());
    }

    @Test
    void projectNumberTest() {
        Assertions.assertEquals(number, project.number());
    }

    @Test
    void projectSumTest() {
        Task task1 = new Task("task1", new Money(1000));
        Task task2 = new Task("task2", new Money(500));
        Task task3 = new Task("task2", new Money(800));
        project.add(task1);
        project.add(task2);
        project.add(task3);
        Money sum = project.sumOfAmount();
        Assertions.assertEquals(new Money(2300), sum);
    }
}
