package day9;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.logging.Logger;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

      // System.out.println("Enter the integer value : ");
      // int integer=scanner.nextInt();
      //  Logger.getGlobal().info(String.valueOf(integer));

       // System.out.println("Enter the value in double: ");
      // double double1=scanner.nextDouble();
      // Logger.getGlobal().info(String.valueOf(double1));

        //System.out.println("Enter the firstname: ");
        //String character= scanner.next(); // doesnot return value after white spaces
        //Logger.getGlobal().info(String.valueOf(character));

        //System.out.println("Enter the fullname: ");
       //String sentence=scanner.nextLine();
       //Logger.getGlobal().info(String.valueOf(sentence));

       double a=50;
       double  b=120;
       double result= a/b;
        System.out.println(result);
        System.out.println(String.format("%8.2f",result));



    }
}
