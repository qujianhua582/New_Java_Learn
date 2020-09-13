package Java.Object_8_20;

import java.util.Scanner;

public class WorkTest20 {
    public static void main(String[] args) {
        Customer customer = new Customer("建华","屈");
        Account account = new Account(1000,2000,0.00123);

        customer.setAccount(account);

        account.deposit(200);
        account.withdraw(100);

        System.out.println(customer.getLastName()+customer.getFirstName()+account.getBalance());


        Account[] accounts = new Account[100];
        accounts[0] = new Account(1,10,0.1);
        accounts[1] = new Account(2,0,0.1);
        accounts[2] = new Account(3,199,0.1);
        Scanner scanner = new Scanner(System.in);
        int index = -1;
        int count = 0; //记录错误次数
        boolean flag = false;
        System.out.println("请输入ID:");
        latel:while (true){
            while (true){
                if (count==4){
                    System.out.println("错误次数已达上限,此账号不可登录");
                    System.exit(0);
                }
                int ID = scanner.nextInt();
                if (ID > accounts.length-1 || accounts[ID-1].getId()!=ID){
                    count++;
                    System.out.println("ID错误!请重新输入");
                    System.out.println("剩余重试次数:"+(4-count));
                } else {
                    index = ID-1;
                    break;
                }
            }

            while (true) {
                System.out.println("请输入操作:");
                String content = scanner.next();
                if (content.equals("存钱")) {
                    System.out.println("请输入存钱金额:");
                    int amount = scanner.nextInt();
                    accounts[index].deposit(amount);
                } else if (content.equals("取钱")) {
                    System.out.println("请输入取款金额:");
                    int amount = scanner.nextInt();
                    accounts[index].withdraw(amount);
                } else if (content.equals("查询")) {
                    System.out.println("当前余额为:" + accounts[index].getBalance());
                }
                if (content.equals("取卡")) {
                    break latel;
                }
            }
        }

    }
}

class Account{

    //账号id
    private int id;

    //账号余额
    private double balance;

    //年利率
    private double annualInterestRate;

    //构造方法
    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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


    //取钱的方法
    public void withdraw(double amount){
        if (amount > this.balance){
            System.out.println("余额不足,您当前的余额剩余:"+this.balance);
        }else {
            balance -= amount;
        }
    }
    //存钱的方法
    public void deposit(double amount){
        balance += amount;
    }
}

class Customer{
    //名
    private String firstName;
    //姓
    private String lastName;
    //账户
    private Account account;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}