package game.observer;

import com.headfirst.ex2_1.Subject;

import java.util.ArrayList;

/**
 * Created by nori on 2014. 6. 23..
 */
public class Monster implements Subject{
    private ArrayList observers;
    private float monsterHP;
    public Monster() {
       observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        observers.remove(i);
    }

    @Override
    public void notifyObserver() {
        for(int i = 0; i < observers.size(); i++){
            Observer observer = (Observer) observers.get(i);
            observer.update(monsterHP);
        }
    }

    public void HPChanged(){
        notifyObserver();
    }

    public void setHPChanged(float monsterHP){
        this.monsterHP = monsterHP;

        HPChanged();
    }
}
