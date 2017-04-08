package com.vaibhav.playingwithjava;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Player tim = new Player("Tom Smith", 8);

        Weapon myAx = new Weapon("Goldshine Axe", 15, 50);
        tim.setWeapon(myAx);

        loot redPotion = new loot("Red Potion", lootType.POTION, 7);
        tim.pickUpLoot(redPotion);
        tim.pickUpLoot(new loot("+3 Chest Armour", lootType.ARMOUR,80));
        tim.pickUpLoot(new loot("Ring of Protection +2", lootType.RING,40));
        tim.pickUpLoot(new loot("Invisibility Potion", lootType.POTION,35));

        tim.showInventory(); // Show player's inventory

        boolean wasDeleted = tim.dropLoot(redPotion);
        System.out.println(wasDeleted);
        tim.showInventory();

    }

}
