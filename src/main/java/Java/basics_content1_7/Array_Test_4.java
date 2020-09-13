package Java.basics_content1_7;

import java.util.Scanner;

/*
数组的定义和赋值 例题 和循环遍历  数组是存储在堆(heap)中 是一个连续存储 []]]]
 */
public class Array_Test_4 {
    public static void main(String[] args) {
        //test3();
        int[] array = new int[]{0,2,1,8,6,-1,13};

    }

    /*
    数组的定义方式和数组内容的赋值
     */
    public static void test1(){
        //第一种定义
        int[] array = new int[]{1,2,3,4};

        //第二种定义 只规定数组长度 不赋具体内容
        int[] array1 = new int[4];

        //数据长度确定后不可更改
        array[0] = 1;
    }
    /*
    不同类型数组的默认初始化值
     */
    public static void test2(){
        //int/byte/short/long 类型默认为0
        int[] int_t = new int[1];
        System.out.println(int_t[0]);

        //char 类型默认为\u0000
        char[] char_t = new char[1];
        System.out.println(char_t[0]);

        //boolean 类型默认为false  0表示false 1表示true
        boolean[] boolean_t = new boolean[1];
        System.out.println(boolean_t[0]);

        //String 引用类型默认为null
        String[] string_t = new String[1];
        System.out.println(string_t[0]);
    }
    /*
    键盘输入学生成绩 找出最高分 并输出学生成绩等级
     */
    public static void test3(){
        Scanner scanner = new Scanner(System.in);
        //输入学生人数
        System.out.print("请输入学生人数:");
        int student_num = scanner.nextInt();
        int num = 0;
        //存储学生姓名
        String[] names = new String[student_num];
        //存储学生成绩
        int[] scores = new int[student_num];
        //存储学生等级
        char[] grade = new char[student_num];

        while (true){
            System.out.print("请输入第" +(num+1) +"位学生的姓名:");
            names[num] = scanner.next();
            System.out.print("请输入第" +(num+1) +"位学生的成绩:");
            scores[num] = scanner.nextInt();
            num++;
            if (num == student_num){
                System.out.println("登记成功!即将返回统计结果~");
                break;
            }
        }

        //取最高分
        int max_score = 0;
        //记录最高成绩的下标值
        int index = 0;
        for (int i = 0;i < student_num;i++) {
            for (int j = 0; j < student_num; j++) {
                if (scores[j] >= max_score) {
                    max_score = scores[j];
                    index = j;
                }
            }
            if (scores[i]>=max_score-10){
                grade[i] = 'A';
            }else if (scores[i]>=max_score-20){
                grade[i] = 'B';
            }else if (scores[i]>=max_score-30){
                grade[i] = 'C';
            }else
                grade[i] = 'D';
        }

        System.out.println("最高分的学生"+names[index]+",成绩是"+scores[index]);
        //输出
        for (int i = 0;i < student_num;i++) {
            System.out.println("学生"+names[i]+"的成绩是"+scores[i]+",等级是:"+grade[i]);
        }
    }
}
