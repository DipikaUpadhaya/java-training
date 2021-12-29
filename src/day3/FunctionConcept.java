package day3;

public class FunctionConcept {
    public static void main(String[] args) {
        float a = 2;
        float b = 4;
        addition(a, b);
        subtraction(a, b);
        multiplication(a, b);
        division(a, b);

        int c = 20;
        int d = 30;
        addition(c, d);
        subtraction(c, d);
        multiplication(c, d);
        division(c, d);

        int e = 100;
        int f = 50;
        addition(e, f);
        subtraction(e, f);
        multiplication(e, f);
        division(e, f);
    }
        public static void addition(float x, float y){
            float z= x+y;
            System.out.println("The addition result of " + x +" + " +y + " is :" + z);
            System.out.println("");
        }
        public static void subtraction(float x, float y){
            float z= x-y;
            System.out.println("The subtraction result of " + x +" - " +y + " is :" + z);
            System.out.println("");
        }
        public static void multiplication(float x, float y){
            float z= x*y;
            System.out.println("The multiplication result of " + x +" * " +y + " is :" + z);
            System.out.println("");
        }
        public static void division(float x, float y){
            float z= x/y;
            System.out.println("The division result of " + x +" / " +y + " is :" + z);
            System.out.println("");
        }

}
