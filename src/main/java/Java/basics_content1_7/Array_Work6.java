package Java.basics_content1_7;

import java.util.Scanner;

public class Array_Work6 {
    public static void main(String[] args) {

        test3();
    }

    /*
    斐波那契数列
     */
    public static void test1(){

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int left = 1;
        int right = 1;
        int temp = 1;
        for (int i = 1; i <= num;i++){
            System.out.println(temp);
            //将右边的值赋予左边 将左右相加值赋予右边
            temp = right;
            right = left + right;
            left = temp;
        }
    }

    /*
    数组
     */
    public static void test2(){
        int[] arr1 = new int[]{1,2,3,4,5};

        int[] arr2 = new int[arr1.length];

        //只是将arr1的地址值赋给了arr2 不是数组复制
        //int[] arr2 ;
        //arr2 = arr1;

        //1.*****复制数组*****
        for(int i = 0;i < arr1.length;i++){
            arr2[i] = arr1[i];
        }

        //2.*****数组反转*****
        for (int i = 0;i < arr1.length/2;i++){
            arr1[i] = arr1[i] ^ arr1[arr1.length-1-i];
            arr1[arr1.length-1-i] = arr1[i] ^ arr1[arr1.length-1-i];
            arr1[i] = arr1[i] ^ arr1[arr1.length-1-i];
        }

        //3.*****数组查找  二分查找法 1.先排序 2.查找*****
        //详见test3()方法

        //4.数组遍历
        for(int res : arr2){
            System.out.println(res);
        }
    }

    /*
    数组查找 二分法/线性查找
     */
    public static void test3(){
        int[] arr3 = new int[]{1,-1,2,3,7,4,0};
        //第一种:线性查找 遍历查找
        int find_num = 7;
        int res = 0;
        for (int i = 0;i < arr3.length;i++){
            if (arr3[i] == find_num){
                System.out.println("位置为"+i);
                break;
            }
        }

        //二分查找法 1.先排序 2.查找
        //1.冒泡排序
        for (int i = 0;i < arr3.length-1;i++){
            for (int j = 0;j < arr3.length-1-i;j++){
                if (arr3[j]<arr3[j+1]){
                    arr3[j] =arr3[j] ^ arr3[j+1];
                    arr3[j+1] =arr3[j] ^ arr3[j+1];
                    arr3[j] =arr3[j] ^ arr3[j+1];
                }
            }
        }

        //2.二分查找
        int left = 0;//数组头下标
        int right = arr3.length-1;//数组尾下标
        while (left<=right){
            int middle = (left+right)/2;
            if (arr3[middle] > find_num){
                left = middle+1;
            }else if (arr3[middle] < find_num){
                right = middle-1;
            }else {
                res = middle;
                break;
            }
        }
        System.out.println(res);
    }
}
