package Java.project2_java_21;

import java.util.ArrayList;
import java.util.Scanner;

public class Utils {
    private Scanner scanner = new Scanner(System.in);
    ArrayList<Customer> arrayList = new ArrayList();
    Customer customer;

    /**
     *
     * @return 返回输入的编号
     */
    public int xunhuanContent(){
        int res = -1;
        while (true){
            System.out.println("请选择(1-5):");
            res = scanner.nextInt();
            if (res != 1 && res != 2 && res != 3 && res != 4 && res != 5){
                System.out.println("输入有误,请重新输入!");
            } else {
                break;
            }
        }
        return res;
    }

    /**
     * 添加客户信息
     */
    public Customer addCustomer(){
        while (true){
            System.out.println("请输入添加的客户姓名:");
            String name = scanner.next();
            System.out.println("请输入添加的客户性别:");
            char gender = scanner.next().charAt(0);
            System.out.println("请输入添加的客户年龄:");
            int age = scanner.nextInt();
            System.out.println("请输入添加的客户电话:");
            String phone = scanner.next();
            System.out.println("请输入添加的客户邮箱:");
            String mailbox = scanner.next();
            customer = new Customer(name,gender,age,phone,mailbox);
            arrayList.add(customer);
            System.out.println("添加成功,是否继续添加客户信息? YES/NO");
            String again = scanner.next();
            if (again.equals("NO")){
                break;
            }else if (again.equals("YES")){

            }else
                System.out.println("输入有误!");
        }
        return customer;
    }

    /**
     * 修改客户信息
     */
    public void changeCustomer(){
        int id;
        boolean flag = false;
        while (true){
            id = scanner.nextInt();
            if (id-1 > arrayList.size() || id-1 < 0){
                System.out.println("输入有误");
            } else {
                //查找客户
                for (int i = 0; i < arrayList.size(); i++) {
                    if (id - 1 == i) {
                        flag = true;
                        break;
                    }
                }
            }
            //查询结果
            if (flag){
                System.out.println("-----查询结果如下-----");
                showCustomer();
                break;
            }else {
                System.out.println("未查询到结果,请重新输入:");
            }
        }

        String name = arrayList.get(id-1).getName();
        char gender = arrayList.get(id-1).getGender();
        int age = arrayList.get(id-1).getAge();
        String phone = arrayList.get(id-1).getPhone();
        String mailbox = arrayList.get(id-1).getMailbox();

        //进行修改
        boolean changFlag = true;
        while (changFlag) {
            System.out.println("请输入要修改的客户属性: -1退出");
            String cont = scanner.next();
            if (cont.equals("姓名")) {
                System.out.println("请输入修改后的姓名:");
                name = scanner.next();
            }else if (cont.equals("性别")) {
                System.out.println("请输入修改后的性别:");
                gender = scanner.next().charAt(0);
            }else if (cont.equals("年龄")) {
                System.out.println("请输入修改后的年龄:");
                age = scanner.nextInt();
            }else if (cont.equals("电话")) {
                System.out.println("请输入修改后的电话:");
                phone = scanner.next();
            }else if (cont.equals("邮箱")) {
                System.out.println("请输入修改后的邮箱:");
                mailbox = scanner.next();
            }else if (cont.equals("-1")){
                break;
            }
            System.out.println("确认修改? YES/NO");
            String a = scanner.next();
            if (a.equals("YES")){
                arrayList.get(id-1).setName(name);
                arrayList.get(id-1).setGender(gender);
                arrayList.get(id-1).setAge(age);
                arrayList.get(id-1).setPhone(phone);
                arrayList.get(id-1).setMailbox(mailbox);
            }else {
                System.out.println("修改失败");
            }
            System.out.println("修改成功!");
        }
    }

    /**
     * 删除客户信息
     */
    public void deleteCustomer(int id){
        boolean flag = false;
        latel:while (true){
            if (id-1 > arrayList.size() || id-1 < -1){
                System.out.println("输入有误");
            } else {
                //查找客户
                for (int i = 0; i < arrayList.size(); i++) {
                    if (id - 1 == i) {
                        flag = true;
                        break;
                    }
                }
            }
            //查询结果
            if (flag){
                System.out.println("-----查询结果如下-----");
                showCustomer();
                break latel;
            }else {
                System.out.println("未查询到结果,请重新输入:");
            }
            id = scanner.nextInt();
        }
        System.out.println("确认删除? YES/NO");
        String a = scanner.next();
        if (a.equals("YES")){
            arrayList.remove(id-1);
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败");
        }
    }
    /**
     * 展示客户信息
     */
    public void showCustomer(){
        System.out.println("编号\t姓名\t性别\t年龄\t电话\t邮箱");
        if (arrayList.size()==0){
            System.out.println("客户列表为空!");
        }
        for (int i = 0;i < arrayList.size();i++){
            System.out.println(i+1+"\t"+arrayList.get(i).getName()
                    +"\t"+arrayList.get(i).getGender()+"\t"+arrayList.get(i).getAge()
                    +"\t"+arrayList.get(i).getPhone()+"\t"+arrayList.get(i).getMailbox());
        }
    }
}
