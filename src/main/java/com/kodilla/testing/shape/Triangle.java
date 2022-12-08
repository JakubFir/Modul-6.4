package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String shapeName = "triangle";
    private int a;
    private int h;

    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public String getShapeName() {
        return this.shapeName = shapeName;
    }

    @Override
    public void getField() {

    }
}