package day10;

public class LoopStatementPractice {
    public static void main(String[] args) {
        int i=1;

        //while loop
//        while(i<=15){
//            System.out.println(i);
//            i++;
//        }
//        System.out.println("Invalid entry");

        //do while loop ...do this and check the condition
        do{    // do while loop perform once even if the statement is not valid.e.g if we set i=16, it once print 16
            System.out.println(i);
            i++;
        }while(i<=15);

        //for loop

        for(int j=1; j<=15; j++){
            System.out.println(j);
        }
    }
}
