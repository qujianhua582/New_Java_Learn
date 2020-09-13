package Java.Object_21_39;

/**
 * private 和 abstract 不能同时修饰方法
 * static 和 abstract 不能同时修饰方法
 * final 和 abstract 不能同时修饰方法
 */
public class WorkTest35 {
    public static void main(String[] args) {
        MyDate myDate = new MyDate("4","22","1999");
        SalariedEmployee salariedEmployee = new SalariedEmployee("001","qujianhua",myDate,14000d,21,21);
        System.out.println(salariedEmployee);
        System.out.println(salariedEmployee.earning());
    }
}


abstract class Employee{
    private String number;
    private String name;
    private MyDate birthday;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public Employee(String number, String name, MyDate birthday) {
        this.number = number;
        this.name = name;
        this.birthday = birthday;
    }

    public Employee() {
    }

    //挣多少钱
    abstract public double earning();

    @Override
    public String toString(){
        return "编号:"+number+",姓名:"+name+",生日:"+birthday.toDate();
    }
}

class MyDate{
    private String month;
    private String day;
    private String year;

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public MyDate(String month, String day, String year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public MyDate() {
    }

    public String toDate(){
        return year+"年"+month+"月"+day+"日";
    }
}

class SalariedEmployee extends Employee{
    private double monthSalary;
    private int workingDay;
    private int totalDays;


    public SalariedEmployee(String number, String name, MyDate birthday, double monthSalary, int workingDay, int totalDays) {
        super(number, name, birthday);
        this.monthSalary = monthSalary;
        this.workingDay = workingDay;
        this.totalDays = totalDays;
    }

    public SalariedEmployee(double monthSalary, int workingDay, int totalDays) {
        this.monthSalary = monthSalary;
        this.workingDay = workingDay;
        this.totalDays = totalDays;
    }

    public double getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(double monthSalary) {
        this.monthSalary = monthSalary;
    }

    public int getWorkingDay() {
        return workingDay;
    }

    public void setWorkingDay(int workingDay) {
        this.workingDay = workingDay;
    }

    public int getTotalDays() {
        return totalDays;
    }

    public void setTotalDays(int totalDays) {
        this.totalDays = totalDays;
    }

    @Override
    public double earning() {
        return monthSalary*workingDay/totalDays;
    }

    @Override
    public String toString() {
        return super.toString()+",月薪"+monthSalary+",本月出勤天数"+workingDay+",本月工作天数"+totalDays;
    }
}
