package com.inheritance.box;

public class BoxDemo {
    public static void main(String[] args) {
        BoxWeight boxWeight = new BoxWeight(1,2,3,4);
        boxWeight.printBoxData();


        ColorBox colorBox = new ColorBox(1,2,3,"Black");
        colorBox.printBoxData();


    }
}