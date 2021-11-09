package Chapter8.Homework;

/**
 * @Auther: xhq
 * @Date: 2021-11-09 - 16:05
 * @Description: Chapter8.Homework
 * @version: 1.0
 */
public class Homework08 {
    public static void main(String[] args) {
//        CheckingAccount checkingAccount = new CheckingAccount(100);
//        System.out.println(checkingAccount.getBalance());
//
//        checkingAccount.deposit(100);
//        System.out.println(checkingAccount.getBalance());
//
//        checkingAccount.withdraw(50);
//        System.out.println(checkingAccount.getBalance());

        SavingAccount savingAccount = new SavingAccount(10000);
        savingAccount.deposit(1000);//11000
        savingAccount.withdraw(1000);//10000
        savingAccount.deposit(1000);//11000
        savingAccount.withdraw(1000);//9999
        System.out.println(savingAccount.getBalance());//9999

        savingAccount.earnMonthlyInterest();
        System.out.println(savingAccount.getBalance());//9999+r

        savingAccount.withdraw(1000);//9999+r-1000
        System.out.println(savingAccount.getBalance());

    }
}
class BankAccount{
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
class CheckingAccount extends BankAccount{
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount-1);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount+1);
    }
}
class SavingAccount extends BankAccount{
    private int count = 3;
    private double r = 0.01;

    public SavingAccount(double initialBalance) {
        super(initialBalance);
    }

    public void earnMonthlyInterest(){
        super.deposit(r*getBalance());
        count = 3;
    }

    @Override
    public void deposit(double amount) {
        if(count>0){
            super.deposit(amount);
            count--;
        }else{
            super.deposit(amount-1);
        }
    }

    @Override
    public void withdraw(double amount) {
        if(count>0){
            super.withdraw(amount);
            count--;
        }else{
            super.withdraw(amount+1);
        }
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public int getCount(){
        return count;
    }
}