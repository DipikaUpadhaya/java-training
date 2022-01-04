package day5;

public class Singlelevel {
    public static void main(String[] args) {
        Derived d= new Derived(); //Base d= new Derived();

        d.parentClass();
       d.childClass();          // ((Derived) d).childClass();


    }
}
