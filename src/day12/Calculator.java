package day12;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter first number: ");
//        int a=input.nextInt();
//        System.out.println("Enter second number: ");
//        int b=input.nextInt();
//        System.out.println("Enter the operator : ");
//        String operator= input.next();
//
//        System.out.println("");
//        int result;
//        if(operator.equals("+")){
//             result= a+b;
//        }else if(operator.equals("-")){
//             result= a-b;
//        }else if(operator.equals("*")){
//             result= a*b;
//        }else if(operator.equals("/")){
//             result=a/b;
//        }else{
//             result= 0;
//        }
//        System.out.println("The result is : "+ result);

        double n1,n2, result;
        char op;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the first number: ");
        n1= input.nextDouble();
        System.out.println("Enter the second number: ");
        n2= input.nextDouble();
        System.out.println("Enter the operator (+ or - or * or /)");
        op=input.next().charAt(0);

        switch(op){
            case '+' -> {
                result = n1+n2;
                System.out.println("The result of two number after addition is: "+result);
                break;
            }
            case '-' -> {
                result= n1-n2;
                System.out.println("The result of two number after subtraction is: "+result);
                break;
            }
            case '*' -> {
                result= n1*n2;
                System.out.println("The result of two number after multiplication is: "+result);
                break;
            }
            case '/' -> {
                result= n1/n2;
                System.out.println("The result of two number after division is: "+result);
                break;
            }
            default -> {
                System.out.println("Invalid operator");
                break;
            }
        }
    }
}
