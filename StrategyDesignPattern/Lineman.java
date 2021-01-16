/*
* Author: Eleanor Barry
* Date: 1/16/2021
* Creates a lineman which is a type of player and sets its plays and name.
*/
package StrategyDesignPattern;

import java.util.Random;

public class Lineman extends Player {
    public Lineman(String name) {
        super(name);
        this.setOffenceBehavior();
        this.setDefenceBehavior();
    }

    /*
     * These methods set the offense and defense behavior for the player.
     */
    public void setOffenceBehavior() {
        this.offenceBehavior = new OBlockBehavior();
    }

    public void setDefenceBehavior() {
        Random rand = new Random();
        int r = rand.nextInt(3);
        if (r == 0) { // block
            this.defenceBehavior = new BlockBehavior();
        } else if (r == 1) { // strip
            this.defenceBehavior = new StripBehavior();
        } else { // sack
            this.defenceBehavior = new SackBehavior();
        }
    }

}