package com.vaibhav.playingwithjava;

/**
 * Created by macbookpro on 8/04/17.
 */
public class Weapon {
    private String name;
    private int damageInflicted;
    private int hitPoints;

    public Weapon( String name, int damageInflicted, int hitPoints){
        this.hitPoints = hitPoints;
        this.name = name;
        this.damageInflicted = damageInflicted;
    }

    public int getDamageInflicted() {
        return damageInflicted;
    }

    public void setDamageInflicted(int damageInflicted){
        this.damageInflicted = damageInflicted;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints){
        this.hitPoints = hitPoints;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
