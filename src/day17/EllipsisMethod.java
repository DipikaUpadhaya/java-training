package day17;

import java.util.logging.Logger;

public class EllipsisMethod {
    public static void main(String[] args) {
        add(5,55);
       add(10, 20, 30,50 );
        System.out.printf("%d,%d,%d,%d",2, 4, 6,8);
    }
//    public static void add(int a, int b){
//        int temp= a+b;
//        Logger.getGlobal().info(String.valueOf(temp));
//    }
//    public static void add(int a, int b, int c){
//        int temp= a+b+c;
//        Logger.getGlobal().info(String.valueOf(temp));
//    }
//in ellipsis we can pass arbitrary no of objects
    public static void add(int... values){ // these values be either arrays or arrayList
        Logger.getGlobal().info("using ellipsis 3 dot operation method");

       Logger.getGlobal().info(String.valueOf(values));
//        for (int value:values) {
//            Logger.getGlobal().info(String.valueOf(value));
//        }
        int temp=0;
        for(int value:values){
            temp+=value;
            Logger.getGlobal().info(String.valueOf(temp));
        }
    }
}
