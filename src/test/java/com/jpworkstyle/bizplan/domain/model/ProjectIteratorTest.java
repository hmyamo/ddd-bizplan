package com.jpworkstyle.bizplan.domain.model;

import com.jpworkstyle.bizplan.domain.type.Money;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ProjectIteratorTest {

    @Test
    @DisplayName("ProjectIteratorをテスト")
    void projectIteratorTest() {
        Project project = new Project("MyProject", new ProjectNumber("ABC"));
        Task task1 = new Task("task1", new Money(1000));
        Task task2 = new Task("task2", new Money(500));
        project.add(task1);
        project.add(task2);
        ProjectIterator iterator = project.iterator();
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals(task1, iterator.next());
        Assertions.assertTrue(iterator.hasNext());

        Task nextTask = iterator.next();
        Assertions.assertEquals(task2, nextTask);
        Assertions.assertNotEquals(task1, nextTask);

        Assertions.assertFalse(iterator.hasNext());
    }
}
