package com.vaibhav.playingwithjava;

import java.util.ArrayList;

/**
 * Created by macbookpro on 8/04/17.
 */
public class Player {
    private String handleName;
    private int lives;
    private int level;
    private int score;
    private Weapon weapon;
    private ArrayList<loot> inventory; // Array list for storing multiple items in your loot

    public Player(){
        this("Unknown player");
    }

    public Player(String handle){
        this(handle, 1);
    }

    public Player(String handle, int startingLevel){
        setHandleName(handle);
        setLives(3);
        setLevel(startingLevel);
        setScore(0);
        inventory = new ArrayList<>();
    }

    public String getHandleName(){
        return handleName;
    }

    public void setHandleName(String handle){
        if(handle.length() < 3){
            System.out.println("The name " + handle + " is too short, must be 3 characters or more.");
            return;
        }
        this.handleName = handle;
        setDefaultWeapon();
    }

    private void setDefaultWeapon(){
        this.weapon = new Weapon("Sword", 10, 20);
    }

    public void setNameAndLevel(String name, int level){
        setHandleName(name);
        setLevel(level);
    }

    public int getLevel(){
        return level;
    }

    public void setLevel(int level){
        this.level = level;
    }

    public int getLives(){
        return lives;
    }

    public void setLives(int lives){
        this.lives = lives;
    }

    public int getScore(){
        return score;
    }

    public void setScore(int score){
        this.score = score;
    }

    public Weapon getWeapon(){
        return weapon;
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public ArrayList<loot> getInventory() {
        return inventory;
    }

    public void pickUpLoot(loot newLoot){
        inventory.add(newLoot);
    }

    public boolean dropLoot(loot dLoot){
        if (this.inventory.contains(dLoot)) {
            inventory.remove(dLoot);
            return true;
        }

        return false;

    }

    public void showInventory(){
        for(loot item: inventory){
            System.out.println(item.getName());
        }
        System.out.println("=====================================================");
    }
}
