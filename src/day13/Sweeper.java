package day13;

public class Sweeper extends Employee{
    // cannot extends executive because executive is made final(Constant)
    //cannot extends manager class as well because it is also sealed

    public Sweeper(String name, int age, double salary) {
        super(name, age, salary);
    }


}
