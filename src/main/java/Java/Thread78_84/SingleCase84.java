package Java.Thread78_84;

/**
 * 单例模式 私有化构造器,使外界不能随意创建对象,将创建对象赋值给静态的属性,以便于使用类调用
 *
 * 两者方式:
 *  ① 饿汉式: 不管用没用到,先new 对象
 *  ② 懒汉式: 只有使用到的时候才创建对象(需要锁)
 */
public class SingleCase84 {
    public static void main(String[] args) {
        //饿汉式
        Hungry hungry = Hungry.hungry;
        Hungry2 hungry2 = Hungry2.HUNGRY;


        //懒汉式
        Lazy lazy = Lazy.getInstance();
    }
}


/**
 * 饿汉式 一
 */
class Hungry {
    public static Hungry hungry = new Hungry();

    private Hungry() {}
}

/**
 * 饿汉式 二 枚举构造器默认是私有  属性也是静态的常量
 */
enum Hungry2 {
    HUNGRY;
}

class Lazy {
    private static Lazy lazy;

    private Lazy() {}

    public synchronized static Lazy getInstance(){
        if (lazy == null){
            lazy = new Lazy();
        }
        return lazy;
    }
}