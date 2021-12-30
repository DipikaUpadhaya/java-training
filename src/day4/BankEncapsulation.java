package day4;

import java.sql.SQLOutput;

public class BankEncapsulation {
    public static void main(String[] args) {
        BankAccount account1= new BankAccount();
        account1.setAccName("ABC");
        account1.setAccNum("1234");
        account1.setBalance(5000);

        BankAccount account2= new BankAccount();
        account2.setAccName("XYZ");
        account2.setAccNum("4321");
        account2.setBalance(2500);

        System.out.println("-----Before Transaction-----");
        System.out.println("Initial balance in Account1 : "+account1.getBalance());
        System.out.println("Initial balance in Account2 : "+ account2.getBalance());
        System.out.println(" ");

        System.out.println("-----After Withdrawl-----");
        account1.withdrawl(account1);
        account2.withdrawl(account2);
        System.out.println("After withdrawl Current balance in Account1 : "+account1.getBalance());
        System.out.println("After withdrawl Current balance in Account2 : "+account2.getBalance());
        System.out.println(" ");

        System.out.println("-----After deposit-----");
        account1.deposit(account1);
        account2.deposit(account2);
        System.out.println("After deposit Current balance in Account1 : "+account1.getBalance());
        System.out.println("After deposit Current balance in Account2 : "+account2.getBalance());
        System.out.println(" ");

        System.out.println("-----After transfer-----");
        account1.transfer(account1, account2);
        //account2.transfer(account1, account2);
        System.out.println("After transfer current balance in Account1 : "+account1.getBalance());
        System.out.println("After transfer operation current balance in Account2 : "+account2.getBalance());
        System.out.println(" ");


    }
}
