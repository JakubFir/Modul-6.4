package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String DRIVINGTASK = "DRIVINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String SHOPPINGTASK = "SHOPPINGTASK";

    public final Task makeTask(final String taskName) {
        return switch (taskName) {
            case DRIVINGTASK -> new DrivingTask("Driving task", "katowice", "car");
            case PAINTINGTASK -> new PaintingTask("Painting task", "red", "wall");
            case SHOPPINGTASK -> new ShoppingTask("Shopping task", "shoes", 1);
            default -> null;
        };
    }

}
