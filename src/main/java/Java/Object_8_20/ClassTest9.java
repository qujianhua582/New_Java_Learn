package Java.Object_8_20;

/*
 * 类中方法的使用
 * 方法声明: 权限修饰符 返回值类型 方法名(形参){
 *              方法体();
 *          }
 */
public class ClassTest9 {
    public static void main(String[] args) {

        Show show = new Show();
        Student student = new Student();
        //赋值
        student.name = "qujianhua";

        show.make(student);
        show.make(new Student()); //匿名对象 只能使用一次

    }
}

class Show{
    public void make(Student stu){
        System.out.println(stu.name);
        stu.make();
    }
}


class Student {
    String name;

    public void make(){
        System.out.println(name + " make love");
    }
}