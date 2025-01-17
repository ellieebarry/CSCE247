/*
* Author: Eleanor Barry
* Date: 1/16/2021
* Creates a class called player and sets its variables and methods.
*/
package StrategyDesignPattern;

public abstract class Player {

    protected String name;
    private boolean defense;
    protected DefenceBehavior defenceBehavior;
    protected OffenceBehavior offenceBehavior;

    public Player(String name) {
        this.name = name;
    }

    public abstract void setDefenceBehavior();

    public abstract void setOffenceBehavior();

    /*
     * Method that determines if the player is playing
     */
    public String play() {
        if (defense) {
            if (this.defenceBehavior == null) {
                return "not playing";
            } else {
                return this.defenceBehavior.play();
            }
        } else if (this.offenceBehavior == null) {
            return "not playing";
        } else {
            return this.offenceBehavior.play();
        }
    }

    public void turnover() {
        this.defense = !defense;
    }
}
