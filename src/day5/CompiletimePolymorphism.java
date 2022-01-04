package day5;

public class CompiletimePolymorphism {
    public void addition(int a, int b){
        int temp= a+b;
        System.out.println(temp);
    }
    public void addition(int a, int b, int c){  // by changing no of parameters
        int temp= a+b+c;
        System.out.println(temp);
    }
    public void addition(float a, float b){  // by changing datatype of arguments
        System.out.println(a+b);

    }

    public static void main(String[] args) {
        CompiletimePolymorphism p= new CompiletimePolymorphism();
        p.addition(20, 30);
        p.addition(20, 30, 40);
        p.addition(20.5f, 30.5f );
    }
}
