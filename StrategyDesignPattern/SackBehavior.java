/*
* Author: Eleanor Barry
* Date: 1/16/2021
* Sets SackBehavior in the interface DefenceBehavior.
*/
package StrategyDesignPattern;

public class SackBehavior implements DefenceBehavior {
    public String play() {
        return "Sack the quarterback";
    }
}
