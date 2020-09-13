package Java.Method_48_52;

import org.junit.Test;

import java.math.BigInteger;

/**
 * java.math 包
 * BigDecimal 与 BigInteger
 *
 * BigInteger 与 int , Integer 的区别
 *    int:基本数据类型
 *    Integer:包装数据类型
 *    BigInteger:不可变的任意精度的整数
 *
 * BigDecimal 与 double , Double的区别
 *    double:基本数据类型
 *    Double:包装数据类型
 *    BigDecimal:不可变的任意精度的浮点数
 *
 * BigInteger 和 BigDecimal 进行运输需通过方法!
 * add 加
 * subtract 减
 * multiply 乘
 * devide 除
 * pow 幂
 */
public class MathMethod51 {
    @Test
    public void test(){
        BigInteger bigInteger = new BigInteger("1234567893");
        BigInteger bigInteger1 = new BigInteger("123456789");

        //幂
        System.out.println(bigInteger.pow(1));

        //加
        System.out.println(bigInteger.add(bigInteger1));

        //减
        System.out.println(bigInteger.subtract(bigInteger1));

        //乘
        System.out.println(bigInteger.multiply(bigInteger1));

        //除 如果除不尽会报错
        System.out.println(bigInteger.divide(bigInteger1));

    }
}
