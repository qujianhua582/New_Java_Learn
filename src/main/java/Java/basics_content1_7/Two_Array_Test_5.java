package Java.basics_content1_7;

/*
二维数组定义 和 赋值  二维数组中分配内存空间后([3][3])默认为地址值 不分配内存空间[3][0] 默认为null
                   内部数组不赋值 默认值为该类型对应的值
---杨辉三角---
 */
public class Two_Array_Test_5 {
    public static void main(String[] args) {
        //定义
        //第一种 静态 后面写具体内容 就不可以写具体长度
        int[][] array = new int[][]{{1,2,3},{4,5},{6,7,8,9}};

        //第二种 动态
        int[][] array2 = new int[4][2]; //长度为3的数组中每个值是长度为2的数组
        int[][] array3 = new int[3][];  //长度为3的数组中每个值是长度不定的数组

        //赋值
        array[0][0] = 10; //给数组的第一位的数组中的第一位赋值为10
        System.out.println(array[0][0]); //10
        //给内部数组动态初始化
        array2[0] = new int[2];
        //给数组的第三位赋值为一个数组
        array3[2] = new int[]{1,2,3,4};
        System.out.println(array3[2][0]); //1

        //在内存空间中array2指向一个地址值 这个地址的的每一位都指向另一个地址值
        //array2 -> []]]]]]]->[]]]]
        //栈stack -> 堆heap -> 堆

        //二维数组长度
        System.out.println(array.length); //3
        System.out.println(array2.length); //4
        //内部长度
        System.out.println(array2[2].length);//2
        System.out.println("*************");
        test4();

    }

    /*
    二维数组的遍历
     */
    public static void test1(){
        int[][] array = new int[][]{{1,2,3},{4,5},{6,7,8,9}};

        for (int i = 0; i <= array.length-1;i++){
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
    /*
    二维数组的默认初始值
     */
    public static void test2(){
        int[][] array = new int[2][];
        System.out.println(array); //地址值 [[I@61bbe9ba 一个[表一维 [[表二维
        System.out.println(array[0]);//null
        // System.out.println(array[0][0]); //报错

        int[][] array2 = new int[2][3];
        System.out.println(array2); //地址值 [[I@610455d6
        System.out.println(array2[0]);//地址值 [I@511d50c0
        System.out.println(array2[0][0]);// int-0   char-\u0000 ......
    }

    /*
    杨辉三角
     */
    public static void test4(){
        //定义二维数组
        int[][] array = new int[10][];
        //为二维数组分配内存空间
        for(int i = 0;i < array.length;i++){
            //第一行的二维数组内部长度为1  第十行为10
            array[i] = new int[i+1];
        }

        //赋值
        for(int i = 0;i < array.length;i++){
            //每行开头 1
            array[i][0] = 1;
            //每行结尾 1
            array[i][i] = 1;

            //第三行才开始赋其他值
            if (i >= 2){
                //赋值列数的范围要大于第一列小于最后一列
                for (int j = 1; j < i;j++){
                    //中间值 为当前数值对应上一行的的当前列的值 + 当前数值对应上一行的数值的前一列的值
                    array[i][j] = array[i-1][j] + array[i-1][j-1];
                }
            }
        }

        //遍历
        for (int i = 0; i <= array.length-1;i++){
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(" "+array[i][j]);
            }
            System.out.println("");
        }
    }
}
