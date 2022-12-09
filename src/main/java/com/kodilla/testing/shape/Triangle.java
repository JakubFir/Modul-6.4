package com.kodilla.testing.shape;

import java.util.Objects;

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
    public int getField() {
        return 10;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return a == triangle.a && h == triangle.h && Objects.equals(shapeName, triangle.shapeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(h);
    }
}