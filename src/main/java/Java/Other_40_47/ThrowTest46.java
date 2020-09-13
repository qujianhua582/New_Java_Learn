package Java.Other_40_47;

import org.junit.Test;

/**
 * throw 用于主动抛出异常对象
 *
 * throws是在方法中抛出,throw是抛出new Exception("");
 *
 * 语法格式: throw 异常对象;
 *
 * try...catch可以替代return语句,后面的不会执行,但是没有返回结果,只能带回异常对象
 */
public class ThrowTest46 {
    @Test
    public void test(){
        throw new ArithmeticException("异常");
    }
}
