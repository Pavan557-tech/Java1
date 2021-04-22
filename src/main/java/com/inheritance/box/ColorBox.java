package com.inheritance.box;

public class ColorBox extends Box {
    String color;

    public ColorBox(int height, int width, int depth, String color){
        super(height, width, depth);
        this.color = color;
    }

    public void printBoxData(){
        System.out.println("Volume = "+this.volume());
        System.out.println("Color = "+this.color);
    }
}
