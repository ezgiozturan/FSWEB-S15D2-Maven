package org.example.entity;

import java.util.HashSet;
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

    public Set<Task> getTasks(String name) {
        switch (name.toLowerCase()) {
            case "ann":
                return annsTasks;
            case "bob":
                return bobsTasks;
            case "carol":
                return carolsTasks;
            case "all":
                return unassignedTasks;
            default:
                return new HashSet<>();
                
        }



    }
}
