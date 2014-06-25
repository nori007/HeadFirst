package game.mediator3;

import com.headfirst.ex6.*;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by nori on 2014. 6. 25..
 */
public class BtnSearch extends JButton implements Command{
    IMediator med;

    BtnSearch(ActionListener al, IMediator m) {
        super("Search");
        addActionListener(al);
        med = m;
        med.registerSearch(this);
    }

    public void execute() {
        med.search();
    }
}
