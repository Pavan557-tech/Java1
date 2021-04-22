package com.inheritance.test;

public class C extends B {
    int k=3;
    final String name;
    public C(){
        this.name = "f";
        System.out.println("Constructor of class C");

        System.out.println("k = "+k);
        System.out.println("super k = "+super.k);
    }

    public static void main(String[] args) {
        C c = new C();

    }
}
