package day5;

public class Runtimepolymorphism {
    public static void main(String[] args) {
        Bank b;
        b= new NMBbank();
        System.out.println("The interest rate of NMB bank is : "+b.getInterestRate());
        b= new Nabilbank();
        System.out.println("The interest rate of Nabil bank is : "+b.getInterestRate());
        b= new NICbank();
        System.out.println("The interest rate of NIC bank is : "+ b.getInterestRate());

    }




}
