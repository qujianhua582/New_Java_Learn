package Java.Object_8_20;

/**
 * this关键字  this代表此对象 谁调用 this就代表谁 可省略,如果形参和属性的变量名一致 必须使用this
 * 使用范围: 可以在方法内或构造器内使用this关键字
 * 就近原则 如果形参和属性的变量名一致 在方法中赋值使用就近原则 不会给属性赋值
 *
 * 在构造器中使用this调用重载的其他的构造器  this() 调用的无参的  this(age) 调用的是参数为age的构造器
 * 但是构造器不可以调用自己
 *
 * !!! 如果一个类有N个构造器,则最多使用N-1个this.构造器   构造器不可以循环调用
 *
 * !!! this调用构造器必须放在构造器的首行 否则报错 所以一个构造器只可以使用一个this调用构造器
 */
public class ThisTest18 {
    public static void main(String[] args) {

        Person5 person5 = new Person5(18);
        //person5.setAge(14);
        System.out.println(person5.getAge());
        person5.show();
    }
}


class Person5{
    private int age;

    public Person5() {
        System.out.println("无参构造器");
    }

    public Person5(int age) {
        this(); //调用无参构造器
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show(){
        System.out.println("啦啦啦~😝");
    }
}