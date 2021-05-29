package com.vladimirsimek.extendstest;

import com.vladimirsimek.extendstest.data.objects.Rectangle;
import com.vladimirsimek.extendstest.data.objects.Square;

public class Main {

    public static void main(String[] args) {
        Logic.init();
        System.out.println("Area: " + Logic.getAverageArea());
        System.out.println("Perimeter: " + Logic.getAveragePerimeter());
    }
}
