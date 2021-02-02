package FactoryDesignPattern;

/**
 * Class that creates a Strider Bike and sets the variables of it
 * @author Eleanor Barry
 */

public class Strider extends Bike {

    /**
     * Constructor method that sets the variables for a strider
     */
    public Strider() {
        this.name = "Strider";
        this.price = 65.99;
        this.numWheels = 2;
        this.hasPedals = false;
        this.hasTrainingWheels = false;
        this.createBike();
    }

}
