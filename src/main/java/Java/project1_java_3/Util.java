package Java.project1_java_3;

import java.util.Scanner;

public class Util {
    private static Scanner scanner = new Scanner(System.in);

    /*
    菜单栏展示内容
     */
    public static String show_content(){
        System.out.println("----------菜单栏----------");
        System.out.println("\t   1.收支明细");
        System.out.println("\t   2.填写收入");
        System.out.println("\t   3.填写支出");
        System.out.println("\t   4.退出系统");
        System.out.print("请输入指令:");
        String s = scanner.next();
        return s;
    }

    /*
    循环判断 如果输入的第一个字母不是1234中的一个 提示输入有误
     */
    public static char xunhuan(String s){
        //获取输入字符串的第一个字母
        char s1 = s.charAt(0);

        while(true){
            if (s1 != '1' && s1 != '2' && s1 != '3' && s1 != '4'){
                System.out.println("输入有误,请重新输入:");
                s1 = show_content().charAt(0);
            }else break;
        }
        return s1;
    }

    /*
    收入支出的具体内容
     */
    public static String shouRu(){
        double sum = 0;
        System.out.println("属性:");
        String s1 = scanner.next();
        return s1;
    }
    /*
    收入支出的具体金额
     */
    public static double shouRu_JinE(){
        double sum = 0;
        System.out.println("金额:");
        Double d1 = scanner.nextDouble();
        while (true){
            if (d1 < 0){
                System.out.println("输入有误,请重新输入:");
                d1 = scanner.nextDouble();
            }else break;
        }
        return d1;
    }
}
