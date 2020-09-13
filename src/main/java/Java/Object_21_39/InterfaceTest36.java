package Java.Object_21_39;

/**
 * 接口
 * 格式 [权限修饰符] [extends 父类] interface 接口名 {
 *
 * }
 *
 * 接口中的成员?
 * JDK1.8之前
 * ① 全局的静态的常量: public static final
 * ② 公共的抽象的方法: public avstract
 *
 *
 * 接口之中没有构造器,不可以创建对象
 *
 * 接口是用来被实现的   implements
 * 格式 [权限修饰符] class [extends 父类] implements 接口[们] {}
 *
 * 特点:
 * ① 实现类实现接口,必须重写接口中的所有方法,否则这个类必须是抽象类
 * ② 一个类可以同时实现多个接口
 * ③ 接口不能创建对象
 * ④ 接口可以与继承同时使用  但是继承需要放在实现前  class extends 父类 implements 接口们{}
 * ⑤ 接口与实现类的构成多态  接口 接口名 = new 实现类();
 * ⑥ 接口与接口之间可以多继承     接口C extends 接口A,接口B{}
 */
public class InterfaceTest36 {
    public static void main(String[] args) {

        Person5 p = new Person5();
        p.eat();
        p.dance();
    }
}

//接口
interface Eat{
    void eat();
}

interface Dance{
    void dance();
}

//实现接口
class Person5 implements Eat,Dance{

    @Override
    public void eat() {
        System.out.println("吃");
    }

    @Override
    public void dance() {
        System.out.println("跳");
    }
}