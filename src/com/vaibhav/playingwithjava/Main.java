package com.vaibhav.playingwithjava;

public class Main {

    public static void main(String[] args) {

        Flight val1 = new Flight(10);
        Flight val2 = new Flight(20);

        System.out.println("Flight 1 value is: " + val1.getValue());
        System.out.println("Flight 2 value is: " + val2.getValue());


        val1.swapNum(val1, val2);

        System.out.println("Flight 1 value is: " + val1.getValue());
        System.out.println("Flight 2 value is: " + val2.getValue());



    }
}
