package ObserverDesignPattern;

import java.util.*;

/**
 * Class that creates a golfer that implements subject
 * @author Eleanor Barry
 */
public class Golfer implements Subject {

    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private String name;

    /**
     * Constructor for class
     * @param name of golfer
     */
    public Golfer(String name) {
        this.name = name;
        // this.enterScore(int strokes, int par);
    }

    /**
     * Method to register observer
     * @param observer to be added
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Method to remove observer
     * @param observer to be deleted
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Method to notify all observers registered
     * @param strokes that the golfer took
     * @param par     of the hole
     */
    public void notifyObservers(int strokes, int par) {
        for (Observer observer : observers) {
            observer.update(strokes, par);
        }
    }

    /**
     * Method to call notifyObservers
     * @param strokes that the golfer took
     * @param par     of the hole
     */
    public void enterScore(int strokes, int par) {
        notifyObservers(strokes, par);
    }

    /**
     * returns the golfers name
     * @return the strong of golfers name
     */
    public String getName() {
        return name;
    }

}
