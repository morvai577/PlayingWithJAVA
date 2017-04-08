package com.vaibhav.playingwithjava;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Troll uglyTroll = new Troll("Ugly Troll");
        uglyTroll.showInfo();
        uglyTroll.takeDamage(30);

        System.out.println();

        Vampire vlad = new Vampire("Vlad");
        vlad.showInfo();
        vlad.takeDamage(8);
        vlad.showInfo();
    }

}
