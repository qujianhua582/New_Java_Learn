package Java.basics_content1_7;

import java.util.Scanner;
/*
基本运算符  if/else  switch/case
 */
public class HelloWorld_1 {
    int a = 0;
    public static void main(String [] args){
        System.out.println("HelloWorld!");
        jiaJia_YunSuan();
        //byte 表示长度为-128~127之间 1个字节
        //short 表示长度为-2的15次方~2的15次方-1之间  2个字节
        //int 表示长度为-2的31次方~2的31次方-1之间 4个字节
        //long 表示长度为-2的63次方~2的63次方-1之间 8个字节
        //\t 标识制表符 \r回车 \n换行
        int a = 0;
        int b = 0 ;
        byte c = (byte) b;

        //random 是double类型 需要强转  *90 表示  [0,90)   +10表示 [10,100)
        int random = (int) (Math.random()*90 + 10);
        System.out.println(random);

        //三元运算符取最大值
        System.out.println(a > b ? a:b);
        //多元运算符
        System.out.println((a > b) ? "否" : ((b > a) ? "是" : "否"));


        /*int score = new Scanner(System.in).nextInt();
        if (score == 100){
            System.out.println("BWM");
        }else if (score>80 && score<=90){
            System.out.println("iphoneX");
        }else if (score>60 && score<=80){
            System.out.println("iPad");
        }else
            System.out.println("滚去学习~");

        Scanner scanner = new Scanner(System.in);
        int score2 = scanner.nextInt();
        a = 100;
        System.out.println(score>score2 ? '是' : '否');

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1 < num2 && num2 < num3) {
            System.out.println(num1+" "+num2+" "+num3);
        }else if (num1 <= num3 && num3 <= num2){
            System.out.println(num1+" "+num3+" "+num2);
        }else if (num2 <= num1 && num1 <= num3){
            System.out.println(num2+" "+num1+" "+num3);
        }else if (num2 <= num3 && num3 <= num1){
            System.out.println(num2+" "+num3+" "+num1);
        }else if (num3 <= num1 && num1 <= num2){
            System.out.println(num3+" "+num1+" "+num2);
        }else if (num3 <= num2 && num2 <= num1){
            System.out.println(num3+" "+num1+" "+num1);
        }else
            System.out.println("三数相等");

        if(a==b)
            System.out.println("");
        System.out.println("");*/

        int x=4;
        int y=1;
         if(x>2){
             if (y>2)
                 System.out.println("...");
                 System.out.println("???");

         }else
             System.out.println("$$$");

        Scanner scanner = new Scanner(System.in);
        /*int z = scanner.nextInt();
        double d = scanner.nextDouble();*/
        //*-----调用狗方法
        //dogAge(z);
        //*-----调用结婚方法
        //jieHun(z,d,scanner.nextBoolean());

        //jiaJia_YunSuan();
        //switch_Case('b');
        year_Mon_Day();
    }

    /*判断狗相当于人类的年龄
     */
    public static void dogAge(int z){
        if (z <= 0){
            System.out.println("请重新输入~"+"\n");
            Scanner scanner = new Scanner(System.in);
            dogAge(scanner.nextInt());
        }else if(z==1){
            System.out.println("狗相当于人类的年龄:"+10.5);
        }else if(z==2){
            System.out.println("狗相当于人类的年龄:"+10.5*z);
        }else
            System.out.println("狗相当于人类的年龄:"+((z-2)*4+2*10.5));
    }

    /*结婚
     */
    public static void jieHun(int a,double b,boolean c){
        if (a >= 180 && b >= 10000000 && c == true){
            System.out.println("嫁");
        } else if (a >= 180 || b >= 10000000 || c == true) {
            System.out.println("嫁吧");
        }else if (!(a >= 180) && !(b >= 10000000) && !(c == true)){
            System.out.println("不嫁");
        }
    }

    /*运算符 ++a 和 a++
     */
    public static void jiaJia_YunSuan(){
        boolean x = true;
        boolean y = false;

        //逻辑&需要判断&符号左边和右边的两个条件，
        //而短路&&，如果&&符号左边的是真，才会判断右边；如果&&符号左边为假，则走else。
        //逻辑|需要判断|符号左边和右边的两个条件，
        //而短路||，如果||符号左边的是假，才会判断右边；如果||符号左边为真，则走else。
        short z = 40;

        //先比较后计算 为true z=41    赋值为false 右边为false 不进入括号
        if ((z++==40)&&(y=false)){
            z++;
        }
        //赋值为true 左边为true 右边不执行 进入括号
        if ((x=true)||(++z==43)){
            z++;
        }
        System.out.println(z);

    }

    public static void switch_Case(char a){
        //switch()中的表达式只能是 byte short int char String 枚举
        switch (a){
            case 'a':
                System.out.println("A");
                //如果不加break跳出  一旦匹配成功 会一路向下执行其他的(即使不满足其余case)
                break;
            case 'b':
                System.out.println("B");
                break;
            case 'c':
                System.out.println("C");
                break;
            default:
                System.out.println("other");
        }
    }

    /*判断输入的年月日是当年的第几天*/
    public static void year_Mon_Day(){
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        int sum_day = 0;

        switch (month){
            case 12:
                //加上个月的天数
                sum_day += 30;
            case 11:
                sum_day += 31;
            case 10:
                sum_day += 30;
            case 9:
                sum_day += 30;
            case 8:
                sum_day += 31;
            case 7:
                sum_day += 30;
            case 6:
                sum_day += 31;
            case 5:
                sum_day += 30;
            case 4:
                sum_day += 31;
            case 3:
                //(可以被4整除 并且不能被100整除) 或者 (能被400整除) 这两个条件中的一个都是闰年
                if ((year%4==0 && year%100!=0)||(year%400==0)){
                    //闰年2月29天 平年2月28天
                    sum_day += day = 29;
                }else
                    sum_day += day = 28;
            case 2:
                sum_day += 31;
            case 1:
                sum_day += day;
                System.out.println(sum_day);
        }
    }
}
