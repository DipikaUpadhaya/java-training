package day24;

import java.util.logging.Logger;

public class WildCardPractice {

    public static void main(String[] args) {
        Pair<Integer> pair= new Pair<>(1,12);
        Pair<Float> pair2 = new Pair<>(1f,2000f);
        Pair<String> pair3 = new Pair<>("name","ABC");

        //Logger.getGlobal().info(String.valueOf(pair));
        printThis(pair);
        printThis(pair2);
        printThis(pair3);
    }
    public static void printThis(Pair<?> pair){
        System.out.println(pair);

    }
}
