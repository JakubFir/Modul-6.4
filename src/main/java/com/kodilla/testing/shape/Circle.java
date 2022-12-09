package com.kodilla.testing.shape;

import java.util.Objects;

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
    public int getField() {
        return 10;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return r == circle.r && Objects.equals(shapeName, circle.shapeName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(shapeName);
    }
}