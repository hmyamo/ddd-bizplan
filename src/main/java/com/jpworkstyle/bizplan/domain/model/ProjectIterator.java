package com.jpworkstyle.bizplan.domain.model;

import java.util.Iterator;

public class ProjectIterator implements Iterator<Task> {
    private Project project;
    private int position;

    ProjectIterator(Project project) {
       this.project = project;
       position = 0;
    }

    @Override
    public boolean hasNext() {
        return project.numberOfTasks() > position;
    }

    @Override
    public Task next() {
        Task task = project.getTaskAt(position);
        position++;
        return task;
    }
}
