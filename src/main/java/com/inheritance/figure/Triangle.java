package com.inheritance.figure;

public class Triangle extends Figure {

    public Triangle(int l, int b){
        super(l,b);
    }

    public void printData(){
        System.out.println("Triangle Area "+this.area());
    }

    public int area(){
        return length*breadth/2;
    }
}
