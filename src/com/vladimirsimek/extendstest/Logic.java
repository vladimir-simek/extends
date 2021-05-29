package com.vladimirsimek.extendstest;

import com.vladimirsimek.extendstest.data.objects.Circle;
import com.vladimirsimek.extendstest.data.objects.Object;
import com.vladimirsimek.extendstest.data.objects.Rectangle;
import com.vladimirsimek.extendstest.data.objects.Square;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Logic {
    private static ArrayList<Object> objectArrayList;

    public static void init() {
        objectArrayList = new ArrayList<>();
        fill();
    }

    public static ArrayList<String> getInput() {
        ArrayList<String> input = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/vladimirsimek/Projects/JetBrains/IntelliJ/extends/src/com/vladimirsimek/extendstest/data/input.txt"));

            String line = bufferedReader.readLine();
            while (line != null) {
                input.add(line);
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return input;
    }

    public static ArrayList<Object> getObjectArrayList() {
        return objectArrayList;
    }

    public static void setObjectArrayList(ArrayList<Object> objectArrayList) {
        Logic.objectArrayList = objectArrayList;
    }

    public static double getAveragePerimeter() {
        double quantity = 0, sum = 0;

        for (int i = 0; i < objectArrayList.size(); i++, quantity++) {
            sum += getObjectArrayList().get(i).getPerimeter();

        }

        return sum / quantity;
    }

    public static double getAverageArea() {
        double quantity = 0, sum = 0;

        for (int i = 0; i < objectArrayList.size(); i++, quantity++) {
            sum = objectArrayList.get(i).getArea();
        }
        return sum / quantity;
    }

    public static void fill() {
        ArrayList<String> inputArrayList = getInput();


        for (String s : inputArrayList) {
            String[] currentLine = s.split(" ");

            if (currentLine[0].equals("S")) {
                objectArrayList.add(new Square((int) Float.parseFloat(currentLine[1])));
            }
            if (currentLine[0].equals("R")) {
                objectArrayList.add(new Rectangle((int) Float.parseFloat(currentLine[1]), (int) Float.parseFloat(currentLine[2])));
            }
            if (currentLine[0].equals("C")) {
                objectArrayList.add(new Circle((int) Float.parseFloat(currentLine[1])));
            }
        }
    }
}
