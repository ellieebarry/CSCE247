/*
* Author: Eleanor Barry
* Date: 1/16/2021
* Sets BlockBehavior in the interface DefenceBehavior.
*/
package StrategyDesignPattern;

import java.util.Random;

public class BlockBehavior implements DefenceBehavior {
    public String play() {
        String p;
        Random rand = new Random();
        int r = rand.nextInt(4);
        if (r == 0) { // kick
            p = "kick";
        } else if (r == 1) { // punt
            p = "punt";
        } else if (r == 2) { // pass
            p = "pass";
        } else { // catch
            p = "catch";
        }
        return "block a " + p;
    }
}
