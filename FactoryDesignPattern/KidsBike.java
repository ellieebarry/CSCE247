package FactoryDesignPattern;

/**
 * Class that creates a KidsBike Bike and sets the variables of it
 * @author Eleanor Barry
 */

public class KidsBike extends Bike {

    /**
     * Constructor method that sets the variables for a kids bike
     */
    public KidsBike() {
        this.name = "Kids Bike";
        this.price = 80.99;
        this.numWheels = 2;
        this.hasPedals = true;
        this.hasTrainingWheels = true;
        this.createBike();
    }

}
