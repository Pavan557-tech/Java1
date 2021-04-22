package com.interface3;

public class Triangle implements Polygon{
    @Override
    public void getarea(int length,int breadth) {
        System.out.println("Area of Triangle is" +length*breadth/2);
    }
}
