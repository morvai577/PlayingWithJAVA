package com.vaibhav.playingwithjava;

public class Main {

    public static void main(String[] args) {
        Player tim = new Player("Tom Smith", 8);
        System.out.println(tim.getHandleName());
        System.out.println("Level: " + tim.getLevel());
        System.out.println("Lives: " + tim.getLives());

        Weapon timsWeapon = tim.getWeapon();
        System.out.println(timsWeapon.getName());

        Weapon myAx = new Weapon("Goldshine Axe", 15, 50);
        tim.setWeapon(myAx);
        System.out.println(tim.getWeapon().getName());
    }
}
