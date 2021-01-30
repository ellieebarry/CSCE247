package DecoratorDesignPattern;

/**
 * Class that creates a sports car vehicle
 * @author Eleanor Barry
 */

public class SportsCar extends Vehicle {

    /**
     * Constructor method
     */
    public SportsCar() {
        this.description = "Sports Car";
    }

    /**
     * Returns car price
     * @return a double that is the cost of the vehicle
     */
    public double getCost() {
        return 30000.0;
    }
}
