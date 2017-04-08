package com.vaibhav.playingwithjava;

import com.vaibhav.playingwithjava.Enemy;

/**
 * Created by imac on 9/04/17.
 */
public class Vampire extends Enemy {
    public Vampire(String name) {
        super(name, 20, 3);
    }

    @Override
    public void takeDamage(int damage) {
        int damageDone = damage / 2;
        super.takeDamage(damageDone);
    }
}
