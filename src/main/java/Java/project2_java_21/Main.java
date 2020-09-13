package Java.project2_java_21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Utils utils = new Utils();
        while (true){
            System.out.println("\t-----客户信息管理软件-----");
            System.out.println("\t\t   1.添加客户");
            System.out.println("\t\t   2.修改客户");
            System.out.println("\t\t   3.删除客户");
            System.out.println("\t\t   4.客户列表");
            System.out.println("\t\t   5.退出系统");
            int res = utils.xunhuanContent();
            switch(res){
                case 1:
                    utils.addCustomer();
                    break;
                case 2:
                    System.out.println("请输入需修改的客户编号:");
                    utils.changeCustomer();
                    break;
                case 3:
                    System.out.println("请输入需删除的客户编号:");
                    int ID = scanner.nextInt();
                    utils.deleteCustomer(ID);
                    break;
                case 4:
                    utils.showCustomer();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}
