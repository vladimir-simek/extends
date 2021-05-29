package com.vladimirsimek.extendstest.data.objects;

public class Rectangle extends Object{
    private double length;
    private double height;

    public Rectangle(double length, double height){
        this.length = length;
        this.height = height;
        this.setPerimeter(countPerimeter(length, height));
        this.setVolume(countVolume(length, height));
    }

    public double countVolume(double length, double height) {
        double volume = length * height;
        return (volume*volume);
    }

    public double countPerimeter(double length, double height) {
        return length + length + height + height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
