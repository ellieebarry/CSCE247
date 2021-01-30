package DecoratorDesignPattern;

/**
 * Class that adds a decoration to the vehicle and extends vehicle
 * @author Eleanor Barry
 */

public abstract class VehicleDecorator extends Vehicle {
    /**
     * Abstract method that returns a string of the vehicle description
     */
    public abstract String toString();
}
