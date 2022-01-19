package day11;

import day4.BankAccount;

public class ArrayPractice {
    public static void main(String[] args) {

        int[] a={1, 3, 5, 7, 9};
        System.out.println(a[0]);
      //  System.out.println(a[5]); //out of array length

        String[] names={"ram","shyam", "hari","mohan"};
        System.out.println(names.length); //print length of array names

        for(int i=0; i< names.length; i++){
            System.out.println(names[i]);
        }
// enhanced for loop
//        for (String name : names) {
//            System.out.println(name);
//        }
              
        // creating array of class Bankaccount
        BankAccount[] accounts = {new BankAccount(), new BankAccount(), new BankAccount()};


    }

}
