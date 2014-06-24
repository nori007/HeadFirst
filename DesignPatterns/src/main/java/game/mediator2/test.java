package game.mediator2;

/**
 * Created by nori on 2014. 6. 24..
 */
public class test {

    public static void main(String[] args) {
        Mediator mediator = new MediatorImpl();
        User monster = new Monster(mediator, "monster", 200);
        User elf = new Elf(mediator, "elf", 100);
        User human = new Human(mediator, "human", 120);

        mediator.addUser(monster);
        mediator.addUser(elf);
        mediator.addUser(human);

        elf.changeHP(80);
        human.changeHP(110);

    }
}
