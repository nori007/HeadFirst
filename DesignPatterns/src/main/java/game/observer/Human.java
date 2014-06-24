package game.observer;

/**
 * Created by nori on 2014. 6. 23..
 */
public class Human implements Observer, DisplayElemet{

    private float monsterHP;
    private Monster monster;

    public Human(Monster monster) {
        this.monster = monster;
        monster.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Human disPlay_MonsterHP: " + monsterHP);
    }

    @Override
    public void update(float monsterHP) {
        this.monsterHP = monsterHP;
        display();
    }
}
