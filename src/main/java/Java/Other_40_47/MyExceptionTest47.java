package Java.Other_40_47;

import org.junit.Test;

/**
 * 自定义异常
 *
 * 自定义异常的对象 只能由 throw 手动抛出
 *
 * 要想自定义异常,必须继承 Throwable 或 它的子类
 *
 * Throwable子类:
 * ① Exception
 * ② Error
 */
public class MyExceptionTest47 {
    @Test
    public void test(){
        try {
            throw new MyException("自定义异常");
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}

class MyException extends Exception{
    //无参构造 不显示异常具体说明
    public MyException() {
    }

    ////有参构造 用于显示异常具体说明
    public MyException(String message) {
        super(message);
    }
}