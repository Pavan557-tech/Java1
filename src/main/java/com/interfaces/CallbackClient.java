package com.interfaces;

public class CallbackClient implements Callback,Callback2  {

    public void print(){
        System.out.println("Hello");
    }

    public int callback() {

        try{
            System.out.printf("hello");
            return 0;
        } finally {
            System.out.printf("In Finally");
        }
    }

    public void callback(int i) {

    }
}
