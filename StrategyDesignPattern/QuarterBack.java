/*
* Author: Eleanor Barry
* Date: 1/16/2021
* Creates a quarterback which is a type of player and sets its plays and name.
*/
package StrategyDesignPattern;

import java.util.Random;

public class QuarterBack extends Player {

    public QuarterBack(String name) {
        super(name);
        this.setOffenceBehavior();
        this.setDefenceBehavior();
    }

    /*
     * These methods set the offense and defense behavior for the player.
     */
    public void setOffenceBehavior() {
        Random rand = new Random();
        int r = rand.nextInt(2);
        if (r == 0) { // run
            this.offenceBehavior = new RunBehavior();
        } else { // pass
            this.offenceBehavior = new PassBehavior();
        }
    }

    public void setDefenceBehavior() {
        this.defenceBehavior = null;
    }

}
