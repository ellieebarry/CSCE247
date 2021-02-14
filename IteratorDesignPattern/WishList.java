package IteratorDesignPattern;

/**
 * Class that creates a wish list of items
 * @author Eleanor Barry
 */

public class WishList {
    private String name;
    private Item[] items;
    private int count;

    /**
     * Constructor method for the class
     * @param name of the item
     */
    public WishList(String name) {
        this.name = name;
        items = new Item[5];
        count = 0;
    }

    /**
     * Method that adds an item to the wish list
     * @param title       name of the item
     * @param description explanation of the item
     * @param price       cost of the item
     */
    public void addItem(String title, String description, double price) {
        if (count == items.length) {
            items = growArray(items);
        }
        items[count] = new Item(title, description, price);
        count++;
    }

    /**
     * Method that creates and iterator for the wish list
     * @return the new wishListIterator
     */
    public WishListIterator createIterator() {
        return new WishListIterator(items);
    }

    /**
     * Method that returns the total cost of all items in the wish list
     * @return double that is the total cost of all items in the list
     */
    public double getTotalCost() {
        double totalCost = 0.0;
        for (int i = 0; i < count; i++) {
            totalCost += items[i].getPrice();
        }
        return totalCost;
    }

    /**
     * Method that doubles the size of the array
     * @param items in the wish list
     * @return an array that is double the length with the items in it
     */
    private Item[] growArray(Item[] items) {
        Item[] temp = new Item[items.length * 2];
        for (int i = 0; i < items.length; i++) {
            temp[i] = items[i];
        }
        return temp;
    }

}
