package com.vladimirsimek.extendstest.data.objects;

public class Triangle extends Object {
    private double height;
    private double a;
    private double b;
    private double c;

    public Triangle(double height, double a, double b, double c) {
        this.height = height;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double countPerimeter(double a, double b, double c) {
        return a+b+c;
    }

    public double countArea() {
        return 0;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
