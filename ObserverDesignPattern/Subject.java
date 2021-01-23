package ObserverDesignPattern;

/**
 * Interface for subject object
 * @author Eleanor Barry
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers(int strokes, int par);
}
