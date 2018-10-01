package com.geopagos.app.shapes;

public class Triangle implements Shape {

    private final Double base;
    private final Double height;

    public Triangle(Double base, Double height) {
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
        return this.base * this.height / 2;
    }

    @Override
    public ShapeType getShapeType() {
        return ShapeType.TRIANGLE;
    }

}
