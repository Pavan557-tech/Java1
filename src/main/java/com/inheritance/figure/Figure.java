package com.inheritance.figure;

public  class Figure {
    int length;
    int breadth;

    public Figure(int l, int b){
        this.length = l;
        this.breadth = b;
    }

    public int area(){
        return length*breadth;
    }


    public void printDimensions(){
        System.out.println("Length = "+this.length+" \n Breadth = "+this.breadth);
    }

    public void printPI(){
        System.out.println("3.14");
    }

}
