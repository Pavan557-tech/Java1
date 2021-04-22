package com.interface2;

public class AnotherClient implements Callback{
    public void callback(int p){
        System.out.println("another version of callback");
        System.out.println("p squared is"+(p*p));
    }

}
