/*
* Author: Eleanor Barry
* Date: 1/16/2021
* Sets StripBehavior in the interface DefenceBehavior.
*/
package StrategyDesignPattern;

public class StripBehavior implements DefenceBehavior{
    public String play(){
        return "Strip a ball from runners hands";
    }
}
