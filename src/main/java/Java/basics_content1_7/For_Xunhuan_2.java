package Java.basics_content1_7;

import java.util.Scanner;

/*
for循环练习 打印图形
 */
public class For_Xunhuan_2 {
    public static void main(String[] args) {
     //   test1();
        int m = 0, n = 1;
        //while_test();
        //test2();
        //test3();
        //test4();
        //test5();
        //test6();
        //test7();
        test8();

    }

    /*水仙花*/
    public static void test1(){
        for (int i = 153; i < 154; i++){
            //百
            int bai = i/100;
            //十
            int shi = i/10%10;
            //个
            int ge = i%10;

            double sum = Math.pow(bai,3)+Math.pow(shi,3)+Math.pow(ge,3);
            if (sum==i){
                System.out.println(i);
            }
        }
    }

    /*while
     */
    public static void while_test(){
        int a = 1;
        while (a <= 10){
            System.out.println(a);
            a++;
        }
    }

    /*
    从键盘输入不确定个数的整数 判断正数和负数的个数 输入0结束循环
     */
    public static void test2(){
        Scanner scanner = new Scanner(System.in);

        int zheng_num = 0;
        int fu_num = 0;
        while (true){
            int a = scanner.nextInt();
            if (a < 0) {
                fu_num++;
            }else if (a == 0) {
                break;
            }else
                zheng_num++;
        }
        System.out.println("整数个数:"+zheng_num);
        System.out.println("负数个数:"+fu_num);
    }

    /*
    *
    * *
    * * *
    * * * *
    * * * * *
     */
    public static void test3(){
        for (int i = 1; i <= 5;i++){
            for (int j = 0;j < i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    /*
     *
     * *
     * * *
     * * * *
     * * * * *
     * * * *
     * * *
     * *
     *
     */
    public static void test4(){
        for (int i = 1; i <= 5;i++){
            for (int j = 0;j < i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }

        for (int i = 1; i <= 5;i++){
            for (int j = 4;j >= i;j--){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    /*
          *
         * *
        * * *
       * * * *
      * * * * *
       * * * *
        * * *
         * *
          *
     */
    public static void test5(){
        for (int i = 1; i <= 5;i++){
            //先打印空格
            for (int j = 4;j >= i;j--){
                System.out.print(" ");
            }
            //后打印 *
            for (int j = 0;j < i;j++){
                System.out.print(" *");
            }
            System.out.println("");
        }
        for (int i = 1; i <= 5;i++){
            for (int j = 0;j < i;j++){
                System.out.print(" ");
            }
            for (int j = 4;j >= i;j--){
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
    /*
        九九乘法表
         */
    public static void test6(){

        for (int i = 1;i <= 9;i++){
            for (int j = 1;j<=i;j++){
                System.out.print(j + "*" + i + "=" + j*i + " ");
            }
            System.out.println("");
        }
    }

    /*
    * * * * * * *
    * * *   * * *
    * *       * *
    *           *
    * *       * *
    * * *   * * *
    * * * * * * *
    1 1
    2 3
    3 5
     */
    public static void test7(){
        //打印第一行
        for (int i = 1;i <= 7;i++){
            System.out.print("* ");
        }
        System.out.println("");
        //上半部分
        for (int i = 1;i <= 3;i++){
            for (int j = 4;j > i;j--){
                System.out.print("* ");
            }
            //System.out.println("");
            for (int k = 1;k <= i*2-1;k++){
                System.out.print("  ");
            }
            for (int z = 4;z > i;z--){
                System.out.print("* ");
            }
            System.out.println("");
        }

        //下半部分
        for (int i = 1;i <= 2;i++){
            for (int j = 1;j <= i+1;j++){
                System.out.print("* ");
            }
            //System.out.println("");
            for (int k = 4;k <= k - (i*2-1);k--){
                System.out.print("  ");
            }
            //System.out.println("");
            for (int z = 1;z <= i+1;z++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        //打印最后一行
        for (int i = 1;i <= 7;i++){
            System.out.print("* ");
        }
    }

    /*
    跳出指定循环
     */
    public static void test8(){
        label: for (int i = 1;i <= 4;i++){
            for (int j = 1; j <= 10;j++){
                if (j % 4 == 0){
                    continue label;
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
