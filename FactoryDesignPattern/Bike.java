package FactoryDesignPattern;

/**
 * Class that creates a Bike and creates the variables for it
 * @author Eleanor Barry
 */

public abstract class Bike {

    protected String name;
    protected Double price;
    protected int numWheels;
    protected boolean hasPedals;
    protected boolean hasTrainingWheels;

    /**
     * Method to call others methods to create the bike
     */
    public void createBike() {
        createFrame();
        addWheels();
        addPedals();
    }

    /**
     * Method that prints that the bike frame is being assembled
     */
    private void createFrame() {
        System.out.println("Assembling " + name + " frame");
    }

    /**
     * Method that adds wheels to the bike if the type of bike has them
     */
    private void addWheels() {
        if (numWheels == 0) {
            return;
        }
        System.out.println("Adding " + numWheels + " wheels(s)");
        if (!hasTrainingWheels) {
            return;
        }
        System.out.println("Adding training wheels");
    }

    /**
     * Method that adds pedals to the bike if the type of bike has them
     */
    private void addPedals() {
        if (!hasPedals) {
            return;
        }
        System.out.println("Adding pedals");
    }

    /**
     * Method that returns the price of the bike
     */
    public void getPrice() {
        System.out.println("Price: $" + price);
    }

}
