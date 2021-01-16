/*
* Author: Eleanor Barry
* Date: 1/16/2021
* Sets OBlockBehavior in the interface OffenceBehavior.
*/
package StrategyDesignPattern;

public class OBlockBehavior implements OffenceBehavior{
    public String play(){
        return "block defenders";
    }
}
