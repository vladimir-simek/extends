package com.vladimirsimek.extendstest.data.objects;

public class Circle extends Object {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.setArea(countArea(radius));
        this.setPerimeter(countPerimeter(radius));
    }

    public double countPerimeter(double radius) {
        return 2 * 3.14159265359 * radius;
    }

    public double countArea(double radius) {
        return 3.14159265359 * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return 2*getRadius();
    }
}
