package day10;

public class ConditionalStatementPractice {

    public static void main(String[] args) {
        int sales= 300;
       int target= 250;
        int  bonus = 0;
        if(sales>=2*target){
            bonus=1000;
            System.out.println("Your Performance is Excellent ");
        }else if(sales>=1.5*target){
            bonus=500;
            System.out.println("Your performance is fine ");
        }else if(sales>=target){
            bonus= 100;
            System.out.println("Your performance is satisfactory ");
        }else{
            System.out.println("You are fired.");
        }
        System.out.println("you get bonus of : "+bonus);

    }
}
