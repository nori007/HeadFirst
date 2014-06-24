package game.mediator;

/**
 * Created by nori on 2014. 6. 23..
 */
public class Hunting {
    public static void main(String[] args){
        Manager manager = new Manager();
        Human human = new Human(manager);
        Elf elf = new Elf(manager);
        Monster monster = new Monster(manager);

        manager.setHumanHP(100);
        manager.setMonsterHP(200);
        manager.setElfHP(80);

    }
}
