package com.geopagos.app.shapes;

public class ShapeFactory {

    private static final double BASE = 5;
    private static final double HEIGHT = 10;
    private static final double DIAMETER = 7;

    public static Shape getShape(ShapeType shapeType) {

        switch (shapeType) {
            case CIRCLE:
                return new Circle(DIAMETER);
            case RECTANGLE:
                return new Rectangle(BASE, HEIGHT);
            case TRIANGLE:
                return new Triangle(BASE, HEIGHT);
        }
        return null;
    }
}
