package IteratorDesignPattern;

/**
 * Class that creates an item for the wishlist
 * @author Eleanor Barry
 */

public class Item {

    private String title;
    private String description;
    private double price;

    /**
     * Constructor for Item class
     * @param title       name of item
     * @param description explanation of the item
     * @param price       the cost of the item
     */
    public Item(String title, String description, double price) {
        this.title = title;
        this.description = description;
        this.price = price;
    }

    /**
     * Method that returns the variables of the item in a String
     * @return String of the variables of the class
     */
    public String toString() {
        return "***** " + title + " *****" + description + "Price: $" + price;
    }

    /**
     * Method that returns the price of the item
     * @return double that is the price of the item
     */
    public double getPrice() {
        return price;
    }

    /**
     * Method that prints out the title, description, and price of the item
     */
    public void print() {
        System.out.println();
        System.out.println("***** " + title + " *****");
        System.out.println(description);
        System.out.println("Price: $" + price);
    }

}
