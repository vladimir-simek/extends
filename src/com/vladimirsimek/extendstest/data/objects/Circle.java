package com.vladimirsimek.extendstest.data.objects;

public class Circle extends Object {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.setArea(countArea(radius));
        this.setPerimeter(countPerimeter(radius));
    }

    public double countPerimeter(double radius) {
        return 2 * 3.14 * radius;
    }

    public double countArea(double radius) {
        return (3.14) * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
