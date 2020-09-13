package Java.Object_21_39;

/**
 * abstracrt: 抽象的  修饰符      可以修饰 类(内部类/外部类),方法
 *
 * 格式:     [修饰符] abstract class 类名 [extends 父类]{
 *                  [修饰符] abstract  返回值类型  方法名(形参列表);
 *          }
 *
 * 为什么使用?
 * 当在父类中,发现某些方法无法给出具体的实现,具体的实现应该在子类中实现,那么可以将父类中的方法设计为"抽象方法"
 * 三角形,圆形,长方形求面积,周长
 *
 * 包含抽象方法到的类必须是抽象类,所以类也必须使用abstract进行修饰
 *
 * 抽象类无法new对象  只能由子类继承然后new对象
 *
 * 抽象类中可以有属性,方法,构造器
 * 抽象类不能new对象为什么有构造器呢? 构造器是为了给子类继承使用的
 *
 *
 *
 */
public class AbstractTest34 {
    public static void main(String[] args) {
        Son3 son3 = new Son3();
        son3.test();
    }
}


abstract class Person3{
    private String name = "youdiantouyun";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract public void test();
}

class Son3 extends Person3{

    @Override
    public void test() {
        System.out.println(this.getName());
        System.out.println(super.getName());
        System.out.println("子类实现抽象父类的方法体");
    }
}