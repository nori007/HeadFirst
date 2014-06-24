package game.mediator;

/**
 * Created by nori on 2014. 6. 24..
 */
public class Monster implements Colleague {

    private float monsterHP;
    private float humanHP;
    private float elfHP;
    private Manager manager;

    public Monster(Manager manager) {
        this.manager = manager;
        manager.registerObserver(this);
    }

    @Override
    public void updateMonster(float monsterHP) {
        this.monsterHP = monsterHP;
        System.out.println("Monster disPlay_MonsterHP: " + monsterHP);
    }

    @Override
    public void updateHuman(float humanHP) {
        this.humanHP = humanHP;
        System.out.println("Monster disPlay_HumanHP: " + humanHP);
    }

    @Override
    public void updateElf(float elfHP) {
        this.elfHP = elfHP;
        System.out.println("Monster disPlay_ElfHP: " + elfHP);
    }
}