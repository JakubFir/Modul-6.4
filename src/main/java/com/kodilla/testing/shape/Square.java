package com.kodilla.testing.shape;

import java.util.Objects;

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
    public int getField() {
    return 10;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return a == square.a && Objects.equals(shapeName, square.shapeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeName);
    }
}