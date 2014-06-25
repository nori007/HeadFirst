package game.mediator3;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by nori on 2014. 6. 25..
 */
public class BtnView extends JButton implements Command{
    IMediator med;

    BtnView(ActionListener al, IMediator m) {
        super("View");
        addActionListener(al);
        med = m;
        med.registerView(this);
    }

    public void execute() {
        med.view();
    }
}
