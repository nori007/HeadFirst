package game.mediator2;


import java.util.ArrayList;

/**
 * Created by nori on 2014. 6. 24..
 */
public class MediatorImpl implements Mediator {

    private ArrayList<User> users;

    public MediatorImpl(){
        this.users = new ArrayList();
    }

    @Override
    public void addUser(User user){
        this.users.add(user);
    }

    @Override
    public void changeHP(float hp, User user) {
        for(int i = 0; i < users.size(); i++){
            users.get(i).receiveUser(user, hp);
        }
    }
}
