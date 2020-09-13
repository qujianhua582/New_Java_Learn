package Java.Other_40_47;

/**
 * 异常   所有异常的父类是 java.lang.Throwable
 *
 * Thorwable的直接子类:
 * ① Error: 用于合理的应用程序不应该试图捕获的严重问题
 * ② Exception
 *     又分为两大类:
 *     ① RuntimeException运行时异常: 除了RuntimeException类型和他的子类属于运行时异常
 *          凡是运行时异常,编译器不会强制要求加try catch或throws
 *          常见的: NullPointerException(空指针异常)
 *                 ArrayIndexOutOfBoundException(数组下标越界)
 *                 ClassCastException(类型转型异常)
 *                 ArithmeticException(算术异常)
 *
 *     ② 编译时异常: 除了运行时异常,剩下全部是编译时异常
 *          凡是编译时异常,编译器会强制要求加try catch或throws 之一,否则编译不通过
 *          FileNotFoundException 文件找不到
 *          InterruptedException 线程中断打扰的异常
 *
 *
 * Java代码如果出现异常,会在这句代码停下来
 *
 * 使用try{
 *          ...
 *       }catch{
 *         ...
 *       }
 * 如果可以使用tyr...catch捕获,java代码会从try catch后面的代码开始继续往下运行
 * 如果没有捕获,会检测上级(调用者)是否有try...catch,如果捕获,会从上级try catch后面的代码开始运行
 * 如果上级没有捕获,程序会挂
 */
public class ExceptionTest43 {
    public static void main(String[] args) {
        //eTest1(); //没有try catch 出现异常
        eTest2();
        try {
            eTest3();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("运行");


        //NullPointerException 运行时异常 编译器没有强制加try 或 throws
        String s = null;
        System.out.println(s.length());

        //编译时异常, 必须使用,否则编译不通过
        //Thread.sleep(1000);
    }

    public static void eTest1(){
        int a = 0;
        int b = 0;

        System.out.println(a/b); //没有try catch 出现异常 下面代码不会执行
        System.out.println("出现异常");
    }

    public static void eTest2(){
        int a = 0;
        int b = 0;

        try {
            System.out.println(a/b); //有try catch 出现异常, 但下面代码仍会执行
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("出现异常,仍会执行");
    }

    public static void eTest3(){
        int a = 0;
        int b = 0;

        System.out.println(a/b); //没有try catch 出现异常 下面代码不会执行,但调用者有try catch 程序不会挂

        System.out.println("出现异常,仍会执行");
    }
}
