package com.vaibhav.playingwithjava;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p3 = new Person("Harry Potter");
        double p3income = p3.getIncome(60000,0.115);
        System.out.println(p3income);
        System.out.println(p1.getName());
        p1.setName("Bob");
        System.out.println(p1.getName());

    }
}
