package Java.Object_21_39;

public class WorkTest24 {
    public static void main(String[] args) {
        Account account = new Account("11223344",20000,0.045);
        account.withdraw(30000);
        System.out.println(account.getBalance());
        account.withdraw(2500);
        System.out.println(account.getBalance());
        account.deposit(3000);
        System.out.println(account.getBalance());
        System.out.println(account.getMonthlyInterest()*100+"%");

        //第二题
        CheckAccount checkAccount = new CheckAccount("11223344",20000,0.045,5000);
        checkAccount.withdraw(5000);
        System.out.println("余额:"+checkAccount.getBalance()+",可透支:"+checkAccount.getOverdraft());
        checkAccount.withdraw(18000);
        System.out.println("余额:"+checkAccount.getBalance()+",可透支:"+checkAccount.getOverdraft());
        checkAccount.withdraw(3000);
        System.out.println("余额:"+checkAccount.getBalance()+",可透支:"+checkAccount.getOverdraft());
        checkAccount.deposit(1000);
        System.out.println("余额:"+checkAccount.getBalance()+",可透支:"+checkAccount.getOverdraft());
        checkAccount.withdraw(5000);
        System.out.println("余额:"+checkAccount.getBalance()+",可透支:"+checkAccount.getOverdraft());
    }
}

class Account{
    private String id;
    private double balance;
    private double annualInterestRate;

    public Account() {
    }

    public Account(String id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    //每月利益
    public double getMonthlyInterest(){
        return annualInterestRate/12;
    }

    //取钱
    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("余额不足");
        }else {
            balance -= amount;
        }
    }

    //存钱
    public void deposit(double amount){
        balance += amount;
    }
}

class CheckAccount extends Account{
    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    private double overdraft;


    public CheckAccount(double overdraft) {
        this.overdraft = overdraft;
    }

    public CheckAccount(String id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double amount){
        if (amount <= getBalance()){
            setBalance(getBalance() - amount);
        }else if (amount-getBalance()<=overdraft){
            overdraft -= (amount-getBalance());
            setBalance(0);
        }else
        System.out.println("过度透支");
    }
}