package DecoratorDesignPattern;

/**
 * Class that adds rims to the vehicle through VehicleDecorator
 * @author Eleanor Barry
 */

public class Rims extends VehicleDecorator {
    Vehicle vehicle;

    /**
     * Constructor method
     * @param vehicle vechicle that is having rims added
     */
    public Rims(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    /**
     * Method that returns a string of the vehicle description
     * @return a string description of the vehicle
     */
    public String toString() {
        return vehicle.toString() + ", cool rims";
    }

    /**
     * Method that returns the cost of the vehicle + previous add ons and rims
     * @return a double that is the full cost of the vehicle
     */
    public double getCost() {
        return vehicle.getCost() + 200;
    }

}
