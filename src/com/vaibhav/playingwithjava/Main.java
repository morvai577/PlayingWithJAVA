package com.vaibhav.playingwithjava;

public class Main {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        int counter = 0;

        while (a < b){
            counter += 1;
            System.out.println("While runs: " + counter + " times.");
            a++;
        }

        /*
        counter = 0;

        do {
            counter += 1;
            a++;
            System.out.println("Do While runs: " + counter + " times.");
        } while (a < b);

        */

        counter = 0;

        for (int c = 0; c < 5; c++){
            counter += 1;
            System.out.println("For loop runs: " + counter + " times.");
        }

        counter = 0;

        int[] array = {10, 20, 30, 40, 50};

        for(int currentVal: array){
            counter += 1;
            System.out.println("Foreach loop runs: " + counter + " times.");
        }
    }
}
