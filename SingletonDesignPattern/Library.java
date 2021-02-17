package SingletonDesignPattern;

import java.util.*;

public class Library {

    private HashMap<String,Integer> books;
    private static Library library;

    private Library(){
        books = new HashMap<String,Integer>();
        // library?
        System.out.println("Creating our Library. Time to begin reading.");
    }

    public static Library getInstance(){
        if(library == null){
            System.out.println("");
            library = new Library();
        }
        return library;
    }

    public boolean checkoutBook(String bookName){
        if(books.containsKey(bookName)){
            if(books.get(bookName) > 1){
                books.put(bookName, books.get(bookName) - 1);
            } else {
                books.remove(bookName);
            }
            System.out.println(bookName + " was successfully checked out");
            return true;
        } else{
            System.out.println("Sorry " + bookName + " is not in stock");
            return false;
        }
    }

    public void checkInBook(String bookName, int numToAdd){
        if(books.containsKey(bookName)){
            books.put(bookName, books.get(bookName) + numToAdd);
        } else {
            books.put(bookName, numToAdd);
        }
        System.out.println(bookName + " was added to the library");
    }

    public void displayBooks(){
        for (Map.Entry<String,Integer> entry : books.entrySet()) {
            System.out.println("- " + entry.getKey() + ", copies: " + entry.getValue());
            
          }
    }

}

