/*
* Author: Eleanor Barry
* Date: 1/16/2021
* Creates a receiver which is a type of player and sets its plays and name.
*/
package StrategyDesignPattern;

public class Receiver extends Player {

    public Receiver(String name) {
        super(name);
        this.setOffenceBehavior();
        this.setDefenceBehavior();
    }

    /*
     * These methods set the offense and defense behavior for the player.
     */
    public void setOffenceBehavior() {
        this.offenceBehavior = new ReceiverBehavior();
    }

    public void setDefenceBehavior() {
        this.defenceBehavior = null;
    }

}
