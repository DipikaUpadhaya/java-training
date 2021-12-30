package day4;

public class BankAccount {
    String accNum;
    String accName;
    double balance;

    public String getAccNum() {
        return accNum;
    }

    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    //withdrawl
    public static void withdrawl(BankAccount wd){
        wd.setBalance(wd.getBalance()-1000);
    }

    //deposit
    public static void deposit(BankAccount dp){
        dp.setBalance(dp.getBalance()+ 1500);
        //System.out.println("After deposit Current balance in Account2 : "+dp.getBalance());
    }

   //transfer
    public static void transfer(BankAccount fromA1, BankAccount toA2){
        fromA1.setBalance(fromA1.getBalance()-500);
        toA2.setBalance(toA2.getBalance()+500);
    }
}
