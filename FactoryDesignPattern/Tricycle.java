package FactoryDesignPattern;

/**
 * Class that creates a Tricycle Bike and sets the variables of it
 * @author Eleanor Barry
 */

public class Tricycle extends Bike {

    /**
     * Constructor method that sets the variables for a tricycle
     */
    public Tricycle() {
        this.name = "Tricycle";
        this.price = 54.95;
        this.numWheels = 3;
        this.hasPedals = true;
        this.hasTrainingWheels = false;
        this.createBike();
    }

}
