package day6;

import java.util.logging.Logger;

public class PredefinedClass {
    public static void main(String[] args) {
        double randomNumber= Math.random(); //random number from 0.1 to 1.0
        double rand=Math.random()*10 ; // random number from 1 to 10
        double ran= Math.random()*100; // random number from 10 to 100

        Logger.getGlobal().info(String.valueOf(randomNumber));

        System.out.println(randomNumber);
        System.out.println(rand);
        System.out.println(ran);

        double d= 4.4f;
       double ceilNumber= Math.ceil(d); //gives ceiling value of 4.4
       double floorNumber= Math.floor(d); //gives floor value of 4.4
      double roundNumber=  Math.round(d); // round off to the nearest number

        Logger.getGlobal().info(String.valueOf(ceilNumber));
        Logger.getGlobal().info(String.valueOf(floorNumber));
        Logger.getGlobal().info(String.valueOf(roundNumber));

        double e= 4.5f;
        double roundNum=  Math.round(e);
        Logger.getGlobal().info(String.valueOf(roundNum));


    }
}
