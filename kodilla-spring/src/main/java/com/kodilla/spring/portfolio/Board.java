package com.kodilla.spring.portfolio;

public final class Board {
    final TaskList toDoList, inProgress, doneList;
    public Board(final TaskList toDoList, final TaskList inProgress, final TaskList doneList){
        this.toDoList = toDoList;
        this.inProgress = inProgress;
        this.doneList = doneList;
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgress() {
        return inProgress;
    }

    public TaskList getDoneList() {
        return doneList;
    }

    public void read(){
        System.out.println("This is elements of the toDo List: ");
        System.out.println("This is elements of the inProgress List : ");
        System.out.println("This is elements of the done List: ");
    }
}
