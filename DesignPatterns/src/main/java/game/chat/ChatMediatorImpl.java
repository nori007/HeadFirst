package game.chat;


import java.util.ArrayList;

/**
 * Created by nori on 2014. 6. 24..
 */
public class ChatMediatorImpl implements  ChatMediator{

    private ArrayList<User> users;

    public ChatMediatorImpl(){
        this.users = new ArrayList();
    }

    @Override
    public void addUser(User user){
        this.users.add(user);
    }

    @Override
    public void sendMessage(String msg, User user) {
        for(User u : this.users){
            //message should not be received by the user sending it
            if(u != user){
                u.receive(msg);
            }
        }
    }
}
