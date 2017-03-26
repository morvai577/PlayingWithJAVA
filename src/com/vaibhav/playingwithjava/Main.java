package com.vaibhav.playingwithjava;

public class Main {

    public static void main(String[] args) {
        int a = 23;
        int b = 47;

        int result = a < b ? a + b : 0;

        System.out.println(result);

        int c = 50;

        if(a < b) {
            System.out.println("a is less than b");
        }

        if(a < c) {
            System.out.println("a is less than c");
        }
    }
}
