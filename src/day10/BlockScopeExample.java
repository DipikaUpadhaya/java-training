package day10;

public class BlockScopeExample {
static int a =4; // after making static it can be used in other blocks as well
    public static void main(String[] args) {
        //int a= 4;
        System.out.println(a);
        {
            int b= 3;
            System.out.println(b); //b can be used only within this block
        }
       // System.out.println(b);
    }
}
