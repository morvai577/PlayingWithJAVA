package com.vaibhav.playingwithjava;

/**
 * Created by imac on 28/03/17.
 */
public class Person {

    int defaultIncome = 0; // Field initialiser

    //Fields
    private int age;
    private char gender;
    private String name;

    //Accessors
    public int getAge(){
        return age;
    }

    public char getGender(){
        return gender;
    }

    //Setters
    public void setAge(int age){
        this.age = age;
    }

    public void setGender(char gender){
        this.gender = gender;
    }

    //Methods
    public int getIncome(int incomeBeforeTax, int taxRate){
        int value = incomeBeforeTax * taxRate;
        return value;
    }

    //This
    public boolean isOlder(Person p2){
        return this.age > p2.age;
    }

    //Constructor 1
    public Person() {}

    //Constructor 2
    public Person(String name){
        this.name = name;
        System.out.println("Hi " + this.name);
    }

}
