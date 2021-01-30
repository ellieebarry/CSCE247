package DecoratorDesignPattern;

/**
 * Class that adds paint to the vehicle through VehicleDecorator
 * @author Eleanor Barry
 */

public class Paint extends VehicleDecorator {
    Vehicle vehicle;

    /**
     * Constructor method
     * @param vehicle the vehicle that paint is being added to
     */
    public Paint(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    /**
     * Method that returns a string of the vehicle description
     * @return a string description of the vehicle
     */
    public String toString() {
        return vehicle.toString() + ", fancy paint";
    }

    /**
     * Method that returns the cost of the vehicle + previous add ons and paint
     * @return a double that is the full cost of the vehicle
     */
    public double getCost() {
        return vehicle.getCost() + 150;
    }

}
