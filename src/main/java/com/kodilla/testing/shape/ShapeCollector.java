package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapeList = new ArrayList<>();

    public List<Shape> getShapeList() {
        return this.shapeList;
    }

    public void addFigure(Shape shape){
        shapeList.add(shape);
    }
     boolean removeFigure(Shape shape) {
        boolean result = false;
        if(shapeList.contains(shape)){
            shapeList.remove(shape);
            result = true;
        }
        return result;
    }
    public Shape getFigure(int n){
       Shape shape = shapeList.get(n);
        return shape;
    }
    public String showFigures(List<Shape> shapes){
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < shapes.size(); i++){
            sb.append(shapes.get(i).getShapeName());
        }
        String result = sb.toString();
        return result;
    }
}