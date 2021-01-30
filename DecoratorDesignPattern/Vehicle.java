package DecoratorDesignPattern;

/**
 * Class that creates a vehicle
 * @author Eleanor Barry
 */

public abstract class Vehicle {
    protected String description;

    /**
     * Method that returns a string of the vehicle description
     * @return a string description of the vehicle
     */
    public String toString() {
        return description;
    }

    /**
     * Abstract method that returns a double that is the cost of the vehicle
     */
    public abstract double getCost();

}
