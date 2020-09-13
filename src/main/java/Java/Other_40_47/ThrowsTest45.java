package Java.Other_40_47;

/**
 * 没有try catch 抛出异常,由调用者处理
 *
 * 语法格式:
 * [修饰符] 返回值类型 方法名([形参列表]) throws 异常列表 {}
 */
public class ThrowsTest45 {
    public static void main(String[] args) {
        try {
            System.out.println(divide());
        } catch (ArithmeticException e) {
            System.out.println("异常");
        }
    }

    public static int divide() throws ArithmeticException{
        return 9/0;
    }
}
