package SingletonDesignPattern;

import java.util.*;

public class Library {

    private HashMap<String,Integer> books;
    private static Library library;

    private Library(){
        books = new HashMap<String,Integer>();
        // library?
        System.out.println("Creating our Library. Time to begin reading");
    }

    public static Library getInstance(){
        if(library == null){
            System.out.println("");
            library = new Library();
        }
        return library;
    }

    public boolean checkoutBook(String bookName){
        

    }

    public void checkInBook(String bookName, int numToAdd){

        System.out.println(bookName + " was added to the library");
    }

    public void displaybooks(){
        System.out.println(library);
    }

}

