package game.chat;

/**
 * Created by nori on 2014. 6. 24..
 */
public interface ChatMediator {
    public void sendMessage(String msg, User user);

    void addUser(User user);
}
