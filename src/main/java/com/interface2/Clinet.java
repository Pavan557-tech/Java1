package com.interface2;

public class Clinet implements Callback {
    public void callback(int p){
        System.out.printf("callback called with" +p);
    }
    void nonIfaceMeth(){
        System.out.println("classes that implement interfaces " +"may also define other members, too.");
    }
}
