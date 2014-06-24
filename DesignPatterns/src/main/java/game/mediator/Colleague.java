package game.mediator;

/**
 * Created by nori on 2014. 6. 23..
 */
public interface Colleague {
    public void updateMonster(float monsterHP);
    public void updateHuman(float humanHP);
    public void updateElf(float elfHP);
}
