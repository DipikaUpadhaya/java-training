package day14;

import java.util.logging.Logger;

//we cannot create objects of class person after making it abstract
public abstract class Person {
    private String name;

    //after making class abstract we have to make their methods also abstract
    //after making method abstract we didnot have to give details of implementation e.g logger
    public abstract void getDescription();
       // Logger.getGlobal().info("Description of Person");

    // we cannot make methods abstract if its class is not abstract

    public abstract void getAddress();

}
