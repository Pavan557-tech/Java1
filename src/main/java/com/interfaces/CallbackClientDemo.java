package com.interfaces;

public class CallbackClientDemo {
    public static void main(String[] args) {
        CallbackClient client = new CallbackClient() {
            public int callback() {
                return 0;
            }
        };

    }
}
