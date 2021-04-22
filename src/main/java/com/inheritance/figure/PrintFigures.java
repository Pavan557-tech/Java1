package com.inheritance.figure;

public class PrintFigures {
    public static void printAreas(Figure[] figures) {
        for (int i = 0; i < figures.length; i++) {
            System.out.println("Figure Area " + figures[i].area());
        }
    }
}
