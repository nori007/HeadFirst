package game.mediator2;

/**
 * Created by nori on 2014. 6. 24..
 */
public abstract class User {

    protected Mediator mediator;
    protected String name;
    protected float hp;

    protected User(Mediator mediator, String name, float hp) {
        this.mediator = mediator;
        this.name = name;
        this.hp = hp;
    }

    public abstract void changeHP(float hp);
    public abstract void receiveUser(User user, float hp);
}
