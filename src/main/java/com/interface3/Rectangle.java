package com.interface3;

public class Rectangle implements Polygon{

    @Override
    public void getarea(int length, int breadth) {
        System.out.println(" area of rectangle is " +length*breadth);
    }
}
