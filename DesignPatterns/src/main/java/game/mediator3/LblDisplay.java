package game.mediator3;

import javax.swing.*;
import java.awt.*;

/**
 * Created by nori on 2014. 6. 25..
 */
public class LblDisplay extends JLabel{
    IMediator med;

    LblDisplay(IMediator m) {
        super("Just start...");
        med = m;
        med.registerDisplay(this);
        setFont(new Font("Arial", Font.BOLD, 24));
    }
}
