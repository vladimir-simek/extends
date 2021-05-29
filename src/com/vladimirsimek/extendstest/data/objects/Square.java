package com.vladimirsimek.extendstest.data.objects;

public class Square extends Object{
    private double size;

    public Square(double size) {
        this.size = size;
        this.setPerimeter(countPerimeter(size));
        this.setArea(countArea(size));
    }

    public double countArea(double size) {
        return (size*size)*(size*size);
    }

    public double countPerimeter(double size) {
        return 4*size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
