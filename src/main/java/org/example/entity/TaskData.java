package org.example.entity;

import java.util.Set;

public class TaskData {
    Set<Task>  annsTasks;
    Set<Task> bobsTasks ;
    Set<Task>  carolsTasks;
    Set<Task>  unassignedTasks ;

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks, Set<Task> unassignedTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
        this.unassignedTasks = unassignedTasks;
    }
}
