package game.mediator3;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by nori on 2014. 6. 25..
 */
public class BtnBook extends JButton implements Command{
    IMediator med;

    BtnBook(ActionListener al, IMediator m) {
        super("Book");
        addActionListener(al);
        med = m;
        med.registerBook(this);
    }

    public void execute() {
        med.book();
    }
}
