package FactoryDesignPattern;

/**
 * Class that calls calls Bike to create a type of Bike and to order a Bike
 * @author Eleanor Barry
 */

public class BikeStore extends Bike {

    /**
     * Method that orders a Bike of the String type
     * @param type the type of bike
     * @return the bike ordered
     */
    public Bike orderBike(String type) {
        return createBike(type);
    }

    /**
     * Method that creates a Bike of the String type
     * @param type the type of bike
     * @return the bike created
     */
    private Bike createBike(String type) {
        Bike bike;
        if (type.equals("tricycle")) {
            bike = new Tricycle();
        } else if (type.equals("strider")) {
            bike = new Strider();
        } else if (type.equals("kids bike")) {
            bike = new KidsBike();
        } else {
            bike = null;
        }
        bike.getPrice();
        return bike;
    }

}
