package Java.Object_21_39;

/**
 * 多态
 *
 * 按父类编译,按子类运行
 * 多态的条件:
 * ① 必须是继承关系
 * 父类类名 名称 = new 子类类名();  子类转父类 小转大无需强制转换
 *
 * 大转小需要进行强制转换
 *
 * instanceof 判断是否可以强制类型转换
 * 用法: 父类 instanceof 子类, 返回值为true/false
 */
public class PolymorphismTest25 {
    public static void main(String[] args) {

        Person2 person2 = new Student2(); //小转大 子类转父类 按父类编译,按子类运行
        person2.show(); //子类的方法 按父类编译,按子类运行
        //person2.eat(); 编译报错,编译时父类中没有此方法,此方法在子类中
        person2.dance();
        System.out.println(person2 instanceof Student2);

        //
        Test test = new Test();
        Student2 student2 = new Student2();
        Student3 student3 = new Student3();
        test.test(student2);
        test.test(student3);
    }
}


class Person2{
    public void show(){
        System.out.println("父类的方法");
    }
    public void dance(){
        System.out.println("父类在跳");
    }
}

class Student2 extends Person2{
    public void show(){
        System.out.println("子类1的方法");
    }

    public void eat(){
        System.out.println("子类在唱");
    }
}

class Student3 extends Person2{
    public void show(){
        System.out.println("子类2的方法");
    }
}

class Test{
    public void test(Person2 person2){
        if (person2 instanceof Student2){
            Student2 student = (Student2) person2; //强制类型转换
            student.show();
        }else if (person2 instanceof Student3){
            Student3 student3 = (Student3) person2; //强制类型转换
            student3.show();
        }else
            System.out.println("啥也不是~");
    }
}