package Java.Object_21_39;

public class WorkTest28 {
    public static void main(String[] args) {

        /**
         * 如果子类继承父类,优先执行父类的静态代码块/静态属性赋值
         * ,再执行子类的静态代码块/静态属性赋值
         * ,再执行父类构造器,再执行子类构造器
         */
        Son1 son1 = new Son1();//142356

    }
}

class Father1{
    static {
        System.out.println("①父类静态代码块");
    }
    {
        System.out.println("②父类非静态代码块");
    }
    public Father1(){
        System.out.println("③父类的无参构造");
    }
}

class Son1 extends Father1{
    static {
        System.out.println("④子类静态代码块");
    }
    {
        System.out.println("⑤子类非静态代码块");
    }
    public Son1(){
        System.out.println("⑥子类的无参构造");
    }
}