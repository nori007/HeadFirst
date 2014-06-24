package game.observer;

/**
 * Created by nori on 2014. 6. 23..
 */
public class Elf implements Observer, DisplayElemet{

    private float monsterHP;
    private Monster monster;

    public Elf(Monster monster) {
        this.monster = monster;
        monster.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Elf Display_MonsterHP: " + monsterHP);
    }

    @Override
    public void update(float monsterHP) {
        this.monsterHP = monsterHP;
        display();
    }
}
