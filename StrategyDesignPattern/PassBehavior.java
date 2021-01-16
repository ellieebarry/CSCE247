/*
* Author: Eleanor Barry
* Date: 1/16/2021
* Sets PassBehavior in the interface OffenceBehavior.
*/
package StrategyDesignPattern;

import java.util.Random;

public class PassBehavior implements OffenceBehavior {
    public String play() {
        String p;
        Random rand = new Random();
        int r = rand.nextInt(5);
        if (r == 0) { // slant route
            p = "slant route";
        } else if (r == 1) { // out route
            p = "out route";
        } else if (r == 2) { // seem route
            p = "seem route";
        } else if (r == 3) { // screen pass
            p = "screen pass";
        } else { // hail mary
            p = "hail mary";
        }
        return "throws a " + p;
    }
}
