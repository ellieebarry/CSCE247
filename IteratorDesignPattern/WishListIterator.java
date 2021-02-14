package IteratorDesignPattern;

/**
 * Class that iterates through the wish list
 * @author Eleanor Barry
 */

public class WishListIterator implements Iterator {

    private Item[] items;
    private int position;

    /**
     * Construcot method for the WishListInterator
     * @param items of the wish list
     */
    public WishListIterator(Item[] items) {
        this.items = items;
        position = 0;
    }

    /**
     * Method that returns if there is another item in the wish list
     * @return a boolean of whether there is another item in the wish list
     */
    public boolean hasNext() {
        return (position < items.length && items[position] != null);
    }

    /**
     * Method that returns the item that is next in the wish list
     * @return Item that is next in the wish list
     */
    public Item next() {
        Item wishListItem = items[position];
        position++;
        return wishListItem;

    }

}
