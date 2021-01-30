package DecoratorDesignPattern;

/**
 * Class that adds sound system to the vehicle through VehicleDecorator
 * @author Eleanor Barry
 */

public class SoundSystem extends VehicleDecorator {

    Vehicle vehicle;

    public SoundSystem(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    /**
     * Method that returns a string of the vehicle description
     * @return a string description of the vehicle
     */
    public String toString() {
        return vehicle.toString() + ", awesome sound";
    }

    /**
     * Method that returns the cost of the vehicle + previous add ons and sound system
     * @return a double that is the full cost of the vehicle
     */
    public double getCost() {
        return vehicle.getCost() + 350;
    }

}
