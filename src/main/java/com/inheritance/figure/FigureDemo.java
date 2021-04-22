package com.inheritance.figure;

public abstract class FigureDemo {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10,20);

        Triangle triangle = new Triangle(10,20);


        Figure[] figures = new Figure[2];
        figures[0] = rectangle;
        figures[1] = triangle;

        PrintFigures.printAreas(figures);

    }





}
