package game.observer;

/**
 * Created by nori on 2014. 6. 23..
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
