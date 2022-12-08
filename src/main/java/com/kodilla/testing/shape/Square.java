package com.kodilla.testing.shape;

public class Square implements Shape {
    private String shapeName = "square";
    private int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public String getShapeName() {
        return this.shapeName = shapeName;
    }

    @Override
    public void getField() {

    }
}