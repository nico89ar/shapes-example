package com;

import com.geopagos.app.shapes.Shape;
import com.geopagos.app.shapes.ShapeFactory;
import com.geopagos.app.shapes.ShapeType;

import java.util.ArrayList;
import java.util.List;

public class ShapesApplication {

    public static void main(String[] args) {

        List<Shape> shapeList = new ArrayList<>();

        shapeList.add(ShapeFactory.getShape(ShapeType.TRIANGLE));
        shapeList.add(ShapeFactory.getShape(ShapeType.RECTANGLE));
        shapeList.add(ShapeFactory.getShape(ShapeType.CIRCLE));

        for(Shape shape : shapeList) {
            System.out.println("Shape: " + shape.getShapeType());
            System.out.println("Base: " + shape.getBase());
            System.out.println("Height: " + shape.getHeight());
            System.out.println("Diameter: " + shape.getDiameter());
            System.out.println("Surface: " + shape.getSurface());
            System.out.println("---");
        }
    }
}
