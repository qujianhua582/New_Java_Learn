package Java.Method_48_52;

import java.util.Arrays;

/**
 * System.in 标准输入流
 * System.out 标准输出流
 * System.err 错误输出流
 *
 */
public class SystemMethod49 {
    public static void main(String[] args) {
        //返回当前系统时间与格林尼治时间的毫秒差值
        System.currentTimeMillis();

        //调用垃圾回收器 不是调用后就立即清理
        System.gc();

        //退出java程序 非零状态码表示异常终止
        System.exit(0);

        //将指定数组中的指定位置和长度的内容复制到目标数组的指定位置
        // (指定数组,指定开始位置,目标数组,目标指定位置,移动的长度)
        int[] a = new int[]{1,2,3,4};
        int[] b = new int[5];
        System.arraycopy(a,0,b,0,4);
        System.out.println(Arrays.toString(b));

        arrayCopy();
    }
    /**
     * 使用System.arraycopy()移除自身元素
     */
    public static void arrayCopy(){
        int[] a = new int[]{1,2,3,4};

        //移除 2 需要把 3,4 往前移动
        System.arraycopy(a,2,a,1,2);
        a[a.length-1] = 0; //将最后一位设为0

        System.out.println(Arrays.toString(a)); //[1,3,4,0]  因为长度不可变

    }
}
