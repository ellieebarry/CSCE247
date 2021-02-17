package SingletonDesignPattern;

import java.util.*;

/**
 * Class that creates a library of books
 * @author Eleanor Barry
 */

public class Library {

    private HashMap<String, Integer> books;
    private static Library library;

    /**
     * Constructor method that sets books up as a HashMap and prints that the
     * library is being created.
     */
    private Library() {
        books = new HashMap<String, Integer>();
        System.out.println("Creating our Library. Time to begin reading.");
    }

    /**
     * Method that returns the library and sets up the library if it is null.
     * @return a Library of books
     */
    public static Library getInstance() {
        if (library == null) {
            System.out.println("");
            library = new Library();
        }
        return library;
    }

    /**
     * Method to remove one copy of that book from the library.
     * @param bookName String that is the value of the book being removed
     * @return Boolean of whether the book could be checked out or not
     */
    public boolean checkoutBook(String bookName) {
        if (books.containsKey(bookName)) {
            if (books.get(bookName) > 0) {
                books.put(bookName, books.get(bookName) - 1);
                System.out.println(bookName + " was successfully checked out");
                return true;
            } else {
                System.out.println("Sorry " + bookName + " is not in stock");
                return false;
            }
        } else {
            return false;
        }
    }

    /**
     * Method to add a copy of a book to the library.
     * @param bookName String that is the value of the book
     * @param numToAdd Integer that is the key to add to the original key of the
     *                 value.
     */
    public void checkInBook(String bookName, int numToAdd) {
        if (books.containsKey(bookName)) {
            books.put(bookName, books.get(bookName) + numToAdd);
        } else {
            books.put(bookName, numToAdd);
        }
        System.out.println(bookName + " was added to the library");
    }

    /**
     * Method that goes through the library and prints the key and value of each book.
     */
    public void displayBooks() {
        System.out.println();
        System.out.println("Inventory:");
        for (Map.Entry<String, Integer> entry : books.entrySet()) {
            System.out.println("- " + entry.getKey() + ", copies: " + entry.getValue());

        }
    }

}
