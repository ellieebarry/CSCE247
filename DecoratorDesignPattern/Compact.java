package DecoratorDesignPattern;

/**
 * Class that creates a compact vehicle
 * @author Eleanor Barry
 */

public class Compact extends Vehicle {

    /**
     * Constructor method
     */
    public Compact() {
        this.description = "Compact";
    }

    /**
     * Returns car price
     * @return a double that is the cost of the vehicle
     */
    public double getCost() {
        return 15000.0;
    }
}
