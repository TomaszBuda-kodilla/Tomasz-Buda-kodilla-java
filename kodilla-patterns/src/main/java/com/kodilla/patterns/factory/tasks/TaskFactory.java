package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOP = "SHOP";
    public static final String PAINT = "PAINT";
    public static final String DRIVE = "DRIVE";

    public final Task makeTask(final String taskClass){
        switch (taskClass) {
            case SHOP:
                return new ShoppingTask("shopping", "shoes", 2.0);
            case PAINT:
                return new PaintingTask("painting", "red", "doors");
            case DRIVE:
                return new DrivingTask("driving", "to New York", "Ford Mustang");
            default:
                return null;
        }
    }
}

