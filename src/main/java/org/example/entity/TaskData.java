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

    public Set<Task> getUnion(Set<Task>...tasks) {
        Set<Task> unionSet = new HashSet<>();
        for (Set<Task> task : tasks) {
            unionSet.addAll(task);
        }
       return unionSet;
    }

    public Set<Task> getIntersection(Set<Task> task1, Set<Task> task2) {
        Set<Task> copyTask1 = new HashSet<>(task1);
        copyTask1.retainAll(task2) ;
        return copyTask1;
    }


    public Set<Task> getDifferences(Set<Task> task1, Set<Task> task2) {
        task1.removeAll(task2);
        return task1;
    }

    public Set<Task> getUnassignedTasks() {
        return unassignedTasks;
    }

    public Set<Task> getMultipleAssignedTasks() {
        Set<Task> allTasks = getUnion(annsTasks, bobsTasks, carolsTasks);
        Set<Task> duplicate = new HashSet<>();
        for (Task task : allTasks) {
            if (    (annsTasks.contains(task) &&bobsTasks.contains(task)) ||
                    (annsTasks.contains(task) && carolsTasks.contains(task)) ||
                    (bobsTasks.contains(task) && carolsTasks.contains(task))
            ) {
                duplicate.add(task);
            }
        }
        return duplicate;
    }


}
