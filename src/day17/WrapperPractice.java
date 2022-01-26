package day17;

import java.util.ArrayList;
import java.util.logging.Logger;

public class WrapperPractice {
    public static void main(String[] args) {
        ArrayList<Integer> integers= new ArrayList<>();
        integers.add(3);
        Logger.getGlobal().info(integers.toString());

        integers.get(0);
        Logger.getGlobal().info(integers.toString());

        int integer= integers.get(0);
        Logger.getGlobal().info(String.valueOf(integer));

        //Type conversion  between String to primitive data types using ParseInt
        String data="510";
        int intData=Integer.parseInt(data);
        Logger.getGlobal().info(String.valueOf(intData));

        double doubleData=Double.parseDouble(data);
        Logger.getGlobal().info(String.valueOf(doubleData));

        String decimalData= "23.23";

        float floatData= Float.parseFloat(decimalData);
        Logger.getGlobal().info(String.valueOf(floatData));



    }
}
