package com.inheritance.figure;

public class Square extends Figure {

    public Square(int s){
        super(s,s);
    }


    public int area(){

        return this.length*this.breadth;
    }

    public void printPI(){
        System.out.println("Hello");
    }


}
