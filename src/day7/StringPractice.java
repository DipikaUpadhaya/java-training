package day7;

import java.util.Locale;
import java.util.logging.Logger;

public class StringPractice {
    public static void main(String[] args) {
        String name= new String("Dipika Upadhaya");
        String name1= "RAMESH";

        System.out.println(name);
        System.out.println(name1);

        String lowercase= "RAMESH".toLowerCase(); //name1.toLowercase();
        System.out.println(lowercase);

        String sub=name.substring(2); //return value from index 2 to upward
        Logger.getGlobal().info(sub);

        String s1= name.substring(1,9); // return value within the begin index and end index
        Logger.getGlobal().info(s1);

        String firstname=name.substring(0,6);
        Logger.getGlobal().info(firstname);

        String lastname= name.substring(6,15);
        Logger.getGlobal().info(lastname);

        String fullname= firstname.concat(lastname);
        Logger.getGlobal().info(fullname);
        Logger.getGlobal().info(String.valueOf(name.length()));

        String time= 2+ 9 + "AM";
        String time1= "AM"+ 9 +2;
        Logger.getGlobal().info(time); //first add two int and combine
        Logger.getGlobal().info(time1); //first find string so assume all string

        String joinExample= String.join("/", "S", "L", "XL", "XXL");
        System.out.println(joinExample);

        String s= "    ";
        System.out.println(s.length());
        System.out.println(s.isBlank());
        System.out.println(s.isEmpty());


    }
}
