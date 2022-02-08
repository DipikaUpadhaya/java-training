package day23;

public class GenericClassPractice {

    public static void main(String[] args) {
        Pair<String, String> pair= new Pair<>("name","Dipika");

        Pair<Integer, Integer> pair1= new Pair<>(1, 1);

        Pair<Float, Float> pair2= new Pair<>(2.4f, 5.6f);
        Pair<Integer, String> pair3= new Pair<>(20, "age");
        Pair <String, Double>pair4= new Pair("salary", 5000.500);

        System.out.println(pair);
         System.out.println(pair1);
        System.out.println(pair2);
       System.out.println(pair3);
        System.out.println(pair4);
    }
}
