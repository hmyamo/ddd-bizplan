package com.jpworkstyle.bizplan.domain.model;

import com.jpworkstyle.bizplan.domain.type.Money;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

@ToString
public class Project {

    @Getter
    @Accessors(fluent = true)
    private String id;

    @Getter
    @Accessors(fluent = true)
    private String name;

    @Getter
    @Accessors(fluent = true)
    private ProjectNumber number;

    private List<Task> tasks = new ArrayList<>();

    public Project(String name, ProjectNumber number) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.number = number;
    }

    public void add(Task task) {
        tasks.add(task);
    }

    public int numberOfTasks() {
        return tasks.size();
    }

    Task getTaskAt(int position) {
        return tasks.get(position);
    }

    public Money sumOfAmount() {
        ProjectIterator iterator = iterator();

        Money sum = new Money(0);
        while (iterator.hasNext()) {
            Task task = iterator.next();
            sum = sum.add(task.amount());
        }
        return sum;
    }

    public ProjectIterator iterator() {
        return new ProjectIterator(this);
    }

    @Deprecated
    Project() {
    }
}
