package com.geopagos.app.shapes;

public class Rectangle implements Shape {

    private final Double base;
    private final Double height;

    public Rectangle(Double base, Double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public Double getBase() {
        return this.base;
    }

    @Override
    public Double getHeight() {
        return this.height;
    }

    @Override
    public Double getDiameter() {
        return null;
    }

    @Override
    public Double getSurface() {
        return this.base * this.height;
    }

    @Override
    public ShapeType getShapeType() {
        return ShapeType.RECTANGLE;
    }

}
