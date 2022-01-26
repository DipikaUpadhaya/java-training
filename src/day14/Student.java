package day14;

import java.util.logging.Logger;

public class Student extends Person{

    @Override
    public void getDescription() {
        Logger.getGlobal().info("Description of Student");
    }

    //if any class extends the abstract class then it must implement the methods of that abstract class
    @Override
    public void getAddress() {
        Logger.getGlobal().info("Address of Student.");

    }
}
