package Java.project1_java_3;

import java.util.Scanner;

public class Main_Java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int sum = 0;
        String detail = "属性\t金额\t当前账户余额\n";
        while (flag){
            String s = Util.show_content();
            char res = Util.xunhuan(s);

            switch (res){
                case '1':
                    System.out.println("-------收支明细-------");
                    System.out.println(detail);
                    System.out.println("---------------------");
                    break;
                case '2':
                    String content = Util.shouRu();
                    double money = Util.shouRu_JinE();
                    sum += money;
                    detail += content + "\t" + money + "\t" + sum + "\n";
                    System.out.println("登记成功");
                    break;
                case '3':
                    String content1 = Util.shouRu();
                    double money1 = Util.shouRu_JinE();
                    if (sum - money1 < 0){
                        System.out.println("账户余额不足!");
                        System.out.println("登记失败");
                    }else{
                        sum -= money1;
                        detail += content1 + "\t" + money1 + "\t" + sum + "\n";
                        System.out.println("登记成功");
                    }
                    break;
                case '4':
//                    System.out.println("Y/N?");
//                    String res2 = scanner.next();
//                    if (res2 == "Y")
                    System.exit('4');
            }
        }
    }
}
