package day20;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

public class LambdaExpressionPractice {
    public static void main(String[] args) {

//        ActionListener actionListener= new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("At the tone, the time is "
//                        + Instant.ofEpochMilli(e.getWhen()));
//                Toolkit.getDefaultToolkit().beep();
//
//            }
//        };
        //In actionListener there is only one method(actionPerformed) so name is not compulsory to write
        // e is action event
        //-> is lambda expression
        //e-> block of code is put in object actionListener and we pass this object

//        ActionListener actionListener= e -> {
//            System.out.println("At the tone, the time is "
//                    + Instant.ofEpochMilli(e.getWhen()));
//            Toolkit.getDefaultToolkit().beep();
//
//        };

        // or we can write by passing block of code directly in place of new actionListener object
      Timer timer= new Timer(1000, e -> {
          System.out.println("At the tone, the time is "
                   + Instant.ofEpochMilli(e.getWhen()));
           Toolkit.getDefaultToolkit().beep();

      });
        timer.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
