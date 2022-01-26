package day15;

import java.util.logging.Logger;

public class ObjectClassTest {
    public static void main(String[] args) {
        Student student= new Student("abc", 1, 1);
        Student student1= new Student("abcd", 1, 1);

        Logger.getGlobal().info(String.valueOf(student));
        Logger.getGlobal().info(student1.toString());

        // these toString, equals, hashcode methods are from object class
        // these common methods are put on separate class called object which are mostly used, so it is extended by default
//        student.toString();
//        student.equals(0);
//        student.hashCode();

        boolean isEqual= student==student1;// return false although they are same because it doesnt use == for equity check
        Logger.getGlobal().info(String.valueOf(isEqual));

        boolean isEquals= student.equals(student1); // it also doesnot work without overriding equals&hashcode
        Logger.getGlobal().info(String.valueOf(isEquals));

        //for equity checking we have to generate/equals and hashcode method in student class

        // hashcode
        Logger.getGlobal().info(String.valueOf(student.hashCode()));
        Logger.getGlobal().info(String.valueOf(student1.hashCode()));
    }
}
