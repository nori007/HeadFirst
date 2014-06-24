package game.mediator2;

/**
 * Created by nori on 2014. 6. 24..
 */
public class Elf extends User{

    public Elf(Mediator mediator, String name, float hp) {
        super(mediator, name, hp);
    }

    @Override
    public void changeHP(float hp) {
        mediator.changeHP(hp, this);
    }

    @Override
    public void receiveUser(User user, float hp) {
        System.out.println("ElfDisPlay");
        System.out.println(user.name + ": " + hp);
        System.out.println("=========================");
    }
}
