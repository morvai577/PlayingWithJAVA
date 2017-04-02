package com.vaibhav.playingwithjava;

/**
 * Created by imac on 29/03/17.
 */
public class Flight {

    private int value;

    public int getValue(){return value;}

    public void setValue(int value){this.value = value;}

    public Flight(int value){
        this.value = value;
    }

    void swapNum(Flight i, Flight j){
        int k = i.getValue();
        i.setValue(j.getValue());
        j.setValue(k);
    }

    public void printFlightNumbers(int... flightNumber){
        System.out.println(flightNumber.toString());
    }

}
