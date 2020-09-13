package Java.Object_21_39;

/**
 * 非静态代码块  用法:[修饰符] class 类名 [extends 父类]{
 *                         {
 *                             非静态代码块
 *                         }
 *                  }
 * 静态代码块  用法:[修饰符] class 类名 [extends 父类]{
 *                      static{
 *                              静态代码块
 *                          }
 *                  }
 *
 * 注意:
 * ① 非静态代码块在初始化对象时默认被调用 每次初始化对象都会被调用一次  没new不执行 构造器也是没new不执行
 *    非静态代码块可以有多个,依次执行
 *    非静态代码块优先执行于构造器!!!
 *    非静态代码块与属性的赋值 谁在上面谁先执行(顺序执行) 但构造器最后执行
 *    如果子类继承父类,优先执行父类的非静态代码块/属性赋值,然后执行父类的构造器,再执子类的非静态代码块/属性赋值,然后执行子类的构造器
 *
 * ② 静态代码块在类被初始化时默认被调用,只在类初始化时调用一次,如果有多个,依次执行
 *    如果子类继承父类,优先执行父类的静态代码块/静态属性赋值,再执行父类构造器,再执子类的静态代码块/属性赋值,再执行子类构造器
 *
 *
 * 静态代码块 优先于 非静态代码块 执行
 *
 * ^^^ static关键字: ---静态修饰的属性和方法可以直接被 类名.调用  也可以用 对象名.调用---
 *    static 可以修饰内部类
 *  ① 静态属性在同一个类中是共享的!!! 多个对象被创建 静态属性共用
 *  ② 被static修饰的属性和方法存放在方法区
 *  ③ 静态方法中不可以出现this,super等关键字
 *  ④ 静态属性和方法的生命周期 = 类的生命周期   静态修饰属性在类被初始化的时候创建
 *  ⑤ 非静态属性和方法的生命周期 = 对象的生命周期
 *  ⑥ 静态方法不可以被重写
 *
 *  静态方法中无法调用非静态属性和方法 因为静态的创建时间早于非静态的创建时间 当静态被创建时,非静态还没有被创建,所以无法调用
 *  但非静态方法中可以调用静态方法
 *
 *
 *  如果局部变量与非静态属性重名 使用this.进行分开
 *  如果局部变量与静态属性重名 使用类名.进行分开  静态方法中不可以使用this super关键字
 */
public class StaticTest27 {
    public static void main(String[] args) {

        StaticTest staticTest = new StaticTest();
        StaticTest staticTest1 = new StaticTest();
        StaticTest2 staticTest2 = new StaticTest2();
        StaticTest2 staticTest3 = new StaticTest2();
        StaticTest3 staticTest4 = new StaticTest3();


        //static关键字使用测试
        staticTest2.setName("quji"); //对象名.调用
        StaticTest2.setName("qu"); //类名.调用
        staticTest4.test();
        staticTest3.setName("qujianhua"); //对象名.调用
        System.out.println(staticTest2.getName()); //"qujianhua"
        System.out.println(staticTest3.getName()); //"qujianhua"

        StaticTest4.test(); //静态方法调用一次 执行一次

        StaticTest4.show("qu");
    }
}


class StaticTest{
    public StaticTest() {
        System.out.println("构造器");
    }

    //非静态代码块
    {
        System.out.println("非静态代码块!!!");
    }
    public void test() {
        System.out.println("测试方法!");
    }
}

class StaticTest2{
    private static String name;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        StaticTest2.name = name;
    }

    //非静态代码块
    static {
        System.out.println("静态代码块!!!");
    }
}

class StaticTest3 extends StaticTest{
    public StaticTest3() {
        System.out.println("构造器");
    }

    //非静态代码块
    {
        System.out.println("非静态代码块!!!");
    }
    @Override
    public void test() {
        System.out.println("测试方法!");
    }
}

/**
 * 静态方法
 */
class StaticTest4{
    private static String name = "qujianhua";
    public static void test(){
        System.out.println("静态方法");
    }
    public static void show(String name){
        System.out.println(name);
        //System.out.println
        // (this.name); //静态不可以使用this.
        System.out.println(StaticTest4.name);
        StaticTest4.name = name;
        System.out.println(StaticTest4.name);
    }

    public StaticTest4() {
        System.out.println("无参构造!");
    }
}