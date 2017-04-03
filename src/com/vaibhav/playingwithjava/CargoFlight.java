package com.vaibhav.playingwithjava;

/**
 * Created by imac on 2/04/17.
 */
public class CargoFlight extends Flight {

    //Fields
    private int maxCargoSpace;
    private int usedCargoSpace = 0;
    private int value = 20; // Overrides base class field

    //Final Fields
    static final int NUMBEROFCREW = 20; // Can't be changed

    //Getters
    public int getMaxCargoSpace(){
        return maxCargoSpace;
    }

    public int getUsedCargoSpace(){
        return usedCargoSpace;
    }

    //Setters
    public void setMaxCargoSpace(int maxCargoSpace){
        this.maxCargoSpace = maxCargoSpace;
    }

    public void setUsedCargoSpace(int usedCargoSpace){
        this.usedCargoSpace = usedCargoSpace;
    }

    //Constructors
    public CargoFlight () {}

    public CargoFlight (int maxCargoSpace){
        setMaxCargoSpace(maxCargoSpace);
        System.out.println("Maximum capacity of plane is: " + maxCargoSpace);
        System.out.println("Value of value field is: " + value);
        System.out.println("Value of getSeats is: " + getSeats());
    }


    // Methods
    private boolean hasCargoSpace(int size){
        return usedCargoSpace + size <= maxCargoSpace;
    }

    @Override
    public int getSeats() {return 40;} //Overrides base class method


}
