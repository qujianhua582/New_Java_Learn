package Java.Object_8_20;

import java.util.Arrays;

/**
 * 方法的值传递
 */
public class WorkTest14 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,5,2,7,0};

        /**
         * 冒泡排序
         */
        for(int i = 0;i < arr.length-1;i++){
            for (int j = 0;j < arr.length-1-i;j++){
                //调用方法
                if (arr[j] > arr[j+1]){
                    //swap(arr,arr[j],arr[j+1]);//不会交换
                    swap2(arr,j,j+1);//会交换
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 两数位置交换
     */
    public static void swap(int[] arr,int i,int j){
        i = i ^ j;
        j = i ^ j;
        i = i ^ j;
    }

    public static void swap2(int[] arr,int i,int j){
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}
