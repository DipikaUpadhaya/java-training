package day7;

import java.time.LocalDate;
import java.util.logging.Logger;

public class Employee {
    private String name;
    private double salary;
    private int age;
    private LocalDate joiningDate;

    public Employee(){
        System.out.println("This is default constructor");
        Logger.getGlobal().info("Empty or default constructor is called");
    }

    public Employee(String name, double salary, int age){
        this.name=name;
        this.salary=salary;
        this.age=age;

        System.out.println(name);
        System.out.println(salary);
        System.out.println(age);
    }

    public Employee(String name, double salary,  int age, LocalDate joiningDate){
        this(name, salary, age);
        this.joiningDate=joiningDate;

        System.out.println(name);
        Logger.getGlobal().info(name);

        Logger.getGlobal().info(String.valueOf(salary));
        System.out.println(salary);

        System.out.println(age);
        System.out.println(joiningDate);


    }
}
