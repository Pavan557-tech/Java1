package com.inheritance.box;

public class BoxWeight extends Box {
    int weight;


    public BoxWeight(int height, int widht, int depth, int weight){
        super(height,widht,depth);
        this.depth = depth;

    }


    public void printBoxData(){
        System.out.println("Volume = "+this.volume());
        System.out.println("Weight = "+this.weight);

    }
}
