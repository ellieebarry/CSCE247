/*
* Author: Eleanor Barry
* Date: 1/16/2021
* Sets RunBehavior in the interface OffenceBehavior.
*/
package StrategyDesignPattern;

import java.util.Random;

public class RunBehavior implements OffenceBehavior{
    public String play(){
        String p;
        Random rand = new Random();
        int r = rand.nextInt(4);
        if(r == 0){ // drive
                p = "drive(up the gut)";
        } else if(r == 1){ // draw
            p = "draw";
        } else if(r == 2){ // pitch
            p = "pitch";
        } else { // reverse
            p = "reverse";
        }
        return "runs a " + p;
    }
}
