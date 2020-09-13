package Java.Method_48_52;

import static java.lang.Math.PI;

/**
 * java.lang.Math 包
 * Math类
 */
public class MathMethod50 {
    public static void main(String[] args) {
        //π
        System.out.println(PI);

        //四舍五入  3
        System.out.println(Math.round(3.1415));

        //向上取整 4
        System.out.println(Math.ceil(3.1415));

        //向下取整 3
        System.out.println(Math.floor(3.1415));

        //取绝对值
        System.out.println(Math.abs(-10));

        //取两个数字的最大值
        System.out.println(Math.max(1,3));

        //取两个数字的最小值
        System.out.println(Math.min(1,3));

        //随机值 [0-1) 的随机值
        System.out.println(Math.random());
        System.out.println((int)(Math.random()*100+1));

        //次方 次幂
        System.out.println(Math.pow(2,3));
    }
}
