package com.vaibhav.playingwithjava;

public class Main {

    public static void main(String[] args) {

        int a = 20;
        int b = 0;
        int c = 5;

        try{
            int d = a / b;
        } catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();

        } finally {
            System.out.println("Program End!");
        }
    }
}
