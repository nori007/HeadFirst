package game.mediator;

/**
 * Created by nori on 2014. 6. 23..
 */
public interface Mediator {
    public void registerObserver(Colleague o);
    public void removeObserver(Colleague o);
    public void notifyObserver();
}
