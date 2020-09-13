package Java.basics_content1_7;

import java.util.Arrays;

/*
 * Arrays工具类
 * 数组异常 NullPointerException 空指针异常
 * ArrayIndexOutOfBoundsException 数组下标越界异常
 */
public class Arrays_Utils7 {
    public static void main(String[] args) {
        int[] array = new int[]{1,3,2};
        int[] array2 = new int[]{1,2,3};

        //判断两个数组是否相同
        Arrays.equals(array,array2);//false

        //输出数组信息
        System.out.println(Arrays.toString(array));//[1,3,2]

        //填充数组 将数组原有的数组覆盖掉 全部填充一个值
        Arrays.fill(array2,4);
        System.out.println(Arrays.toString(array2));//[4,4,4]

        //排序 快排
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));//[1,2,3]

        //二分查找 数组必须是有序的
        System.out.println(Arrays.binarySearch(array,2));;//下标为 1415

        //拷贝一个数组的内容到另一个数组,如果新数组长度小于原数组 顺序拷贝
        int[] ints = Arrays.copyOf(array, 1);
        System.out.println(Arrays.toString(ints));

    }
}
