package com.inheritance.figure;

public class Rectangle extends Figure {

    public Rectangle(int l, int b){
        super(l,b);
    }

    public void printData(){
        System.out.println("Rectangle Area "+this.area());
    }
}
