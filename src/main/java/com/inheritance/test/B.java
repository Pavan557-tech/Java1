package com.inheritance.test;

public class B extends A {
    int k =2;
    public B(){
        super("str");
        System.out.println("Constructor of class B");
        System.out.println("k = "+k);
        System.out.println("super k = "+super.k);
    }
}
