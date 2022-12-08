package com.kodilla.testing.shape;

public class Circle implements Shape {
    private String shapeName = "circle";
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public String getShapeName() {
        return this.shapeName = shapeName;
    }

    @Override
    public void getField() {

    }
}