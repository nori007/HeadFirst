package game.chat;

/**
 * Created by nori on 2014. 6. 24..
 */
public abstract class User {

    protected ChatMediator mediator;
    protected String name;

    protected User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String msg);

    public abstract void receive(String msg);
}
