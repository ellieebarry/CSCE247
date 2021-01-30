package DecoratorDesignPattern;

/**
 * Class that creates a sedan vehicle
 * @author Eleanor Barry
 */

public class Sedan extends Vehicle {

    /**
     * Constructor method
     */
    public Sedan() {
        this.description = "Sedan";
    }

    /**
     * Returns car price
     * @return a double that is the cost of the vehicle
     */
    public double getCost() {
        return 20000.0;
    }
}
