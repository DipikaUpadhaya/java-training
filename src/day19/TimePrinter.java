package day19;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;
import java.util.logging.Logger;

//timeprinter ISa(implements) actionlistener
public class TimePrinter implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Logger.getGlobal().info("Action Performed method called in every 1 second by the object of TimePrinter");
//        System.out.println("At the tone, the time is "
//                + Instant.ofEpochMilli(e.getWhen()));
//        Toolkit.getDefaultToolkit().beep();
    }
}
