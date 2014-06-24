package game.observer;

/**
 * Created by nori on 2014. 6. 23..
 */
public class Hunting {
    public static void main(String[] args){
        Monster monster = new Monster();
        Human human = new Human(monster);
        Elf elf = new Elf(monster);


        monster.setHPChanged(50);
        monster.setHPChanged(30);

    }
}
