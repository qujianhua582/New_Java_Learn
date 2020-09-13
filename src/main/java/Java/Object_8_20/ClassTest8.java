package Java.Object_8_20;

/*
 * 类及类的成员: 成员变量(或属性),方法(函数,行为),构造器(构造方法),代码块,内部类
 *
 * 成员变量和局部变量的区别
 * 1.成员变量定义在class中,局部变量定义在方法内部(也包括main)或方法的形参中或构造器的形参或代码块的内部
 * 2.成员变量有默认的初始化值(整形 0,char \u0000....),局部变量没有默认初始化值
 * 3.成员变量可以使用public/private/protected/缺省修饰 局部变量不可以被修饰
 * 4.内存中加载的位置不同,成员变量在堆空间中 age=18, 局部变量声明在栈空间中
 */
public class ClassTest8 {
    public static void main(String[] args) {
        Person person = new Person();
        //赋值
        person.gender = '男';
        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.gender);
        person.eat();
        person.study();
    }

}

/*
 * 步骤:
 * 1. 创建类及提供类的成员:属性,方法
 * 2. 类的实例化
 * 3. 调用对象的相关结构:属性,方法
 * 注意: 如果创建一个类的多个对象,每个对象独立拥有一份类中声明的属性,修改对象a不会影响对象b
 */

class Person{
    //声明成员变量
    String name = "屈建华";
    int age = 23;
    char gender = '\t';

    //创建方法
    public void eat(){
        System.out.println("人吃饭");
    }
    public void study(){
        System.out.println("人学习");
    }

    public void make(String s){// s为局部变量
        int age = 18;
        System.out.println(s);
    }
}