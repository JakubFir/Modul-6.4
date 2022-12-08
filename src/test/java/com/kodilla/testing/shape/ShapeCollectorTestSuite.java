package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
@DisplayName("Shape Collector test suite")
public class ShapeCollectorTestSuite {
    ShapeCollector shapeCollector = new ShapeCollector();
    @Nested
    @DisplayName("Tests for list")
    class TestList {
        @Test
        void testAddFigure() {
            //Given
            Circle circle = new Circle(5);
            //When
            shapeCollector.addFigure(circle);
            //Then
            boolean result = shapeCollector.shapeList.contains(circle);
            Assertions.assertTrue(result);
        }

        @Test
        void testRemoveFigure() {
            //Given
            Square square = new Square(5);
            //When
            shapeCollector.addFigure(square);
            boolean result = shapeCollector.removeFigure(square);
            //Then
            Assertions.assertTrue(result);
        }
    }
    @Nested
    @DisplayName("Tests for displaying from list")
    class TestDisplayList {
        @Test
        void testGetFigure() {
            //Given
            Triangle triangle = new Triangle(5, 6);
            shapeCollector.addFigure(triangle);
            //When
            String result = shapeCollector.getFigure(0);
            //Then
            String expected = triangle.getShapeName();
            Assertions.assertEquals(expected, result);
        }
        @Test
        void testShowFigures() {
            //Given
            List<Shape> shapeList = Arrays.asList(new Triangle(2, 1), new Square(2), new Circle(1));
            //When
            String result = shapeCollector.showFigures(shapeList);
            //Then
            String expected = "trianglesquarecircle";
            Assertions.assertEquals(expected, result);
        }
    }

}