package com.geopagos.app.shapes;

public class Circle implements Shape {

    private final Double diameter;

    public Circle(Double diameter) {
        this.diameter = diameter;
    }

    @Override
    public Double getBase() {
        return null;
    }

    @Override
    public Double getHeight() {
        return null;
    }

    @Override
    public Double getDiameter() {
        return this.diameter;
    }

    @Override
    public Double getSurface() {
        Double radius = this.diameter / 2;
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public ShapeType getShapeType() {
        return ShapeType.CIRCLE;
    }
}
