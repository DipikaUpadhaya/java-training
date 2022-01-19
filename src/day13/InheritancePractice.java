package day13;

import java.util.logging.Logger;

public class InheritancePractice {
    public static void main(String[] args) {
        Employee employee= new Employee("ramesh",27, 50000);

        Manager manager= new Manager("vikram",40,100000, 2000);

        Executive executive= new Executive("Dipika",26, 200000, 50000, 100000);

        Logger.getGlobal().info(String.valueOf(executive.getSalary()));
        Logger.getGlobal().info(String.valueOf(employee.getSalary()));
        Logger.getGlobal().info(String.valueOf(manager.getSalary()));

        Logger.getGlobal().info(String.valueOf(employee));
        Logger.getGlobal().info(String.valueOf(manager));
        Logger.getGlobal().info(String.valueOf(executive));
    }
}
