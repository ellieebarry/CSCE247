package ObserverDesignPattern;

public interface Subject {
    public void registerObserver(Obeserver observer);
    public void removeObserver(Observer observer);
    public void notifyObservers(int strokes, int par);
}
