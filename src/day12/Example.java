package day12;

public class Example {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println("Multiplication table for "+i+" is:");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i+" * "+j+" = "+i * j);
                //System.out.println("2 * "+i+" = " +2*i);
            }
        }
    }
}
