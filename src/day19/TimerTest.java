package day19;

import javax.swing.*;
import java.awt.event.ActionListener;

public class TimerTest {
    public static void main(String[] args) {
       // Timer timer= new Timer(1000, new ActionListener());//actionlistener objects cannot create here
        // so we implements actionlistener in another class called TimePrinter
        //timeprinter's object is actionlistener's object cause it implements actionlistener
        //this all is done cause we cannot make interface objects directly

        Timer timer= new Timer(1000, new TimePrinter());// delay 1000 means in every 1 sec,
        // object of TimePrinter call actionperformed method

        timer.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

