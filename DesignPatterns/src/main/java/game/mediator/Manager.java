package game.mediator;

import java.util.ArrayList;

/**
 * Created by nori on 2014. 6. 23..
 */
public class Manager implements Mediator {
    private ArrayList observers;
    private float monsterHP;
    private float humanHP;
    private float elfHP;

    public Manager() {
       observers = new ArrayList();
    }

    @Override
    public void registerObserver(Colleague o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Colleague o) {
        int i = observers.indexOf(o);
        observers.remove(i);
    }

    @Override
    public void notifyObserver() {
        for(int i = 0; i < observers.size(); i++){
            Colleague colleague = (Colleague) observers.get(i);
            colleague.updateMonster(monsterHP);
            colleague.updateMonster(humanHP);
            colleague.updateMonster(elfHP);
        }
    }

    public void HPChanged(){
        notifyObserver();
    }

    public void setMonsterHP(float monsterHP){
        this.monsterHP = monsterHP;
        HPChanged();
    }

    public void setHumanHP(float humanHP){
        this.humanHP = humanHP;
        HPChanged();
    }

    public void setElfHP(float elfHP){
        this.elfHP = elfHP;
        HPChanged();
    }
}
